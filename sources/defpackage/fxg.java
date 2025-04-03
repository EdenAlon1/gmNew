package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fxg extends ffkk implements ffjm {
    final /* synthetic */ glp a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;
    final /* synthetic */ ffjm d;
    final /* synthetic */ jpo e;
    final /* synthetic */ ffjm f;
    final /* synthetic */ ffjm g;
    final /* synthetic */ ffjm h;
    final /* synthetic */ float i = 32.0f;
    final /* synthetic */ ebe j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxg(glp glpVar, boolean z, boolean z2, ffjm ffjmVar, jpo jpoVar, ffjm ffjmVar2, ffjm ffjmVar3, ffjm ffjmVar4, float f, ebe ebeVar) {
        super(2);
        this.a = glpVar;
        this.b = z;
        this.c = z2;
        this.d = ffjmVar;
        this.e = jpoVar;
        this.f = ffjmVar2;
        this.g = ffjmVar3;
        this.h = ffjmVar4;
        this.j = ebeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            glp glpVar = this.a;
            boolean z = this.b;
            boolean z2 = this.c;
            fxi.a(this.d, this.e, !z ? glpVar.f : !z2 ? glpVar.b : glpVar.k, this.f, this.g, this.h, !z ? glpVar.g : !z2 ? glpVar.c : glpVar.l, !z ? glpVar.h : !z2 ? glpVar.d : glpVar.m, 32.0f, this.j, hfdVar, 0);
        }
        return ffcu.a;
    }
}
