package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evon extends evlf {
    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ Object a(evpl evplVar) {
        if (evplVar.t() == 9) {
            evplVar.p();
            return null;
        }
        String j = evplVar.j();
        try {
            return UUID.fromString(j);
        } catch (IllegalArgumentException e) {
            throw new evlb(a.Q(j, evplVar, "Failed parsing '", "' as UUID; at path "), e);
        }
    }

    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ void b(evpn evpnVar, Object obj) {
        UUID uuid = (UUID) obj;
        evpnVar.m(uuid == null ? null : uuid.toString());
    }
}
