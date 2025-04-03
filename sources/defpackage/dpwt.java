package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpwt implements ffjm {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;
    final /* synthetic */ float d;
    final /* synthetic */ dpwl e;
    final /* synthetic */ dpwn f;

    public dpwt(boolean z, boolean z2, boolean z3, float f, dpwl dpwlVar, dpwn dpwnVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = f;
        this.e = dpwlVar;
        this.f = dpwnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hfdVar.v(-1114047740);
            if ((this.a && this.b) || this.c) {
                gkn.a(hvr.a(hvi.e, 1.0f), 0L, 0.0f, 0L, 0, 0.0f, hfdVar, 6, 62);
                hfdVar = hfdVar;
            }
            hfdVar.o();
            hvi a = hxz.a(hvr.a(hvi.e, 0.0f), this.d);
            dpwl dpwlVar = this.e;
            if (dpwlVar instanceof dpwk) {
                hfdVar.v(-175484518);
                igq a2 = jie.a(((dpwk) this.e).a, hfdVar, 0);
                dpwn dpwnVar = this.f;
                geq.a(a2, dpwnVar.a, a, ibw.d, hfdVar, 3072, 0);
                hfdVar.o();
            } else if (dpwlVar instanceof dpwj) {
                hfdVar.v(-175252328);
                dgx.b(new iax(((dpwj) this.e).a), this.f.a, a, null, null, hfdVar, 0, 248);
                hfdVar.o();
            } else {
                hfdVar.v(-175081704);
                hfdVar.o();
            }
        }
        return ffcu.a;
    }
}
