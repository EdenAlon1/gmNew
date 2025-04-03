package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fum extends ffkk implements ffjm {
    final /* synthetic */ fvn a;
    final /* synthetic */ ffjm b;
    final /* synthetic */ ffjn c;
    final /* synthetic */ float d;
    final /* synthetic */ float e;
    final /* synthetic */ boolean f;
    final /* synthetic */ idh g;
    final /* synthetic */ long h;
    final /* synthetic */ long i;
    final /* synthetic */ float j;
    final /* synthetic */ float k;
    final /* synthetic */ ffjm l;
    final /* synthetic */ ffjn m;
    final /* synthetic */ ffjn n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fum(fvn fvnVar, ffjm ffjmVar, ffjn ffjnVar, float f, float f2, boolean z, idh idhVar, long j, long j2, float f3, float f4, ffjm ffjmVar2, ffjn ffjnVar2, ffjn ffjnVar3) {
        super(2);
        this.a = fvnVar;
        this.b = ffjmVar;
        this.c = ffjnVar;
        this.d = f;
        this.e = f2;
        this.f = z;
        this.g = idhVar;
        this.h = j;
        this.i = j2;
        this.j = f3;
        this.k = f4;
        this.l = ffjmVar2;
        this.m = ffjnVar2;
        this.n = ffjnVar3;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            fvn fvnVar = this.a;
            ffjm ffjmVar = this.b;
            hpn d = hpx.d(-1925397081, new fui(this.c, this.d), hfdVar);
            hpn d2 = hpx.d(-1354167738, new fuj(this.a, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m), hfdVar);
            hpn d3 = hpx.d(-782938395, new fuk(this.n, this.a), hfdVar);
            boolean D = hfdVar.D(this.a);
            fvn fvnVar2 = this.a;
            Object f = hfdVar.f();
            if (D || f == hfc.a) {
                f = new ful(fvnVar2);
                hfdVar.y(f);
            }
            fvm.c(ffjmVar, d, d2, d3, (ffix) f, fvnVar.a, hfdVar, 3504);
        }
        return ffcu.a;
    }
}
