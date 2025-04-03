package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evox extends evlf {
    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ Object a(evpl evplVar) {
        if (evplVar.t() == 9) {
            evplVar.p();
            return null;
        }
        try {
            return Integer.valueOf(evplVar.c());
        } catch (NumberFormatException e) {
            throw new evlb(e);
        }
    }

    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ void b(evpn evpnVar, Object obj) {
        if (((Number) obj) == null) {
            evpnVar.j();
        } else {
            evpnVar.k(r4.intValue());
        }
    }
}
