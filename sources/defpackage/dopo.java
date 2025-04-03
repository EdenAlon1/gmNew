package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dopo implements ffjm {
    final /* synthetic */ ffjq a;
    final /* synthetic */ boolean b;
    final /* synthetic */ dwjy c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;
    final /* synthetic */ ffjn f;
    final /* synthetic */ gvs g;
    final /* synthetic */ ffjm h;
    final /* synthetic */ ffjm i;
    final /* synthetic */ fxz j;
    final /* synthetic */ ffji k;
    final /* synthetic */ ffjm l;

    public dopo(ffjq ffjqVar, boolean z, dwjy dwjyVar, boolean z2, boolean z3, ffjn ffjnVar, gvs gvsVar, ffjm ffjmVar, ffjm ffjmVar2, fxz fxzVar, ffji ffjiVar, ffjm ffjmVar3) {
        this.a = ffjqVar;
        this.b = z;
        this.c = dwjyVar;
        this.d = z2;
        this.e = z3;
        this.f = ffjnVar;
        this.g = gvsVar;
        this.h = ffjmVar;
        this.i = ffjmVar2;
        this.j = fxzVar;
        this.k = ffjiVar;
        this.l = ffjmVar3;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            ffjq ffjqVar = this.a;
            boolean z = this.b;
            dwjy dwjyVar = this.c;
            boolean z2 = this.d;
            dopp.c((donk) ffjqVar.a(Boolean.valueOf(z), dwjyVar, Boolean.valueOf(z2 && !this.b), Boolean.valueOf(this.e), hfdVar, 0), (dopq) this.f.a(dops.a(this.g), hfdVar, 0), (doos) this.h.a(hfdVar, 0), this.i, hfdVar, 0);
            fxz fxzVar = this.j;
            hfdVar.v(-1810839685);
            boolean D = hfdVar.D(this.k) | hfdVar.D(this.l);
            ffji ffjiVar = this.k;
            ffjm ffjmVar = this.l;
            Object f = hfdVar.f();
            if (D || f == hfc.a) {
                f = new dopn(ffjiVar, ffjmVar, null);
                hfdVar.y(f);
            }
            hfdVar.o();
            hgs.g(fxzVar, (ffjm) f, hfdVar);
        }
        return ffcu.a;
    }
}
