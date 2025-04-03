package defpackage;

import java.math.BigDecimal;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evoe extends evlf {
    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ Object a(evpl evplVar) {
        if (evplVar.t() == 9) {
            evplVar.p();
            return null;
        }
        String j = evplVar.j();
        try {
            return evmv.a(j);
        } catch (NumberFormatException e) {
            throw new evlb(a.Q(j, evplVar, "Failed parsing '", "' as BigDecimal; at path "), e);
        }
    }

    @Override // defpackage.evlf
    public final /* synthetic */ void b(evpn evpnVar, Object obj) {
        evpnVar.l((BigDecimal) obj);
    }
}
