package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gaa extends ffkk implements ffjm {
    final /* synthetic */ idh a;
    final /* synthetic */ fzr b;
    final /* synthetic */ float c;
    final /* synthetic */ ffjn d;
    final /* synthetic */ ffjm e;
    final /* synthetic */ ffjm f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gaa(idh idhVar, fzr fzrVar, float f, ffjn ffjnVar, ffjm ffjmVar, ffjm ffjmVar2) {
        super(2);
        this.a = idhVar;
        this.b = fzrVar;
        this.c = f;
        this.d = ffjnVar;
        this.e = ffjmVar;
        this.f = ffjmVar2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hvi u = ebs.u(ebs.j(hvi.e, 360.0f), 0.0f, 568.0f, 1);
            idh idhVar = this.a;
            fzr fzrVar = this.b;
            gpa.c(u, idhVar, fzrVar.a, 0L, this.c, 0.0f, null, hpx.d(-1706202235, new fzz(this.d, this.e, this.f), hfdVar), hfdVar, 104);
        }
        return ffcu.a;
    }
}
