package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evof extends evlf {
    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ Object a(evpl evplVar) {
        if (evplVar.t() == 9) {
            evplVar.p();
            return null;
        }
        String j = evplVar.j();
        try {
            return evmv.b(j);
        } catch (NumberFormatException e) {
            throw new evlb(a.Q(j, evplVar, "Failed parsing '", "' as BigInteger; at path "), e);
        }
    }

    @Override // defpackage.evlf
    public final /* synthetic */ void b(evpn evpnVar, Object obj) {
        evpnVar.l((BigInteger) obj);
    }
}
