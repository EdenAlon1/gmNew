package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahsm implements ffjm {
    final /* synthetic */ ahss a;
    final /* synthetic */ ffxx b;

    public ahsm(ahss ahssVar, ffxx ffxxVar) {
        this.a = ahssVar;
        this.b = ffxxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            boolean booleanValue = ((Boolean) hkt.b(this.a.a().e, false, null, hfdVar, 2).a()).booleanValue();
            fgdj fgdjVar = ((zcb) this.a.a().c.b()).g;
            hfdVar.v(-2076440358);
            hkx a = fgdjVar != null ? hkf.a(fgdjVar, hfdVar) : null;
            hfdVar.o();
            ahss ahssVar = this.a;
            hik hikVar = dnae.a;
            Object b = ahssVar.b.b();
            b.getClass();
            hfz.b(new hil[]{hikVar.c(b), aaof.a.c(this.a.a().f)}, hpx.d(2047796156, new ahsl(a, booleanValue, this.b), hfdVar), hfdVar, 56);
        }
        return ffcu.a;
    }
}
