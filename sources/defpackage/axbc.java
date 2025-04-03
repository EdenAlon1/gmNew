package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axbc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ axbh b;
    final /* synthetic */ cjmw c;
    final /* synthetic */ azsu d;
    final /* synthetic */ avkl e;
    final /* synthetic */ cjmu f;
    final /* synthetic */ cjnz g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axbc(axbh axbhVar, cjmw cjmwVar, azsu azsuVar, avkl avklVar, cjmu cjmuVar, cjnz cjnzVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = axbhVar;
        this.c = cjmwVar;
        this.d = azsuVar;
        this.e = avklVar;
        this.f = cjmuVar;
        this.g = cjnzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axbc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cjmj cjmjVar = (cjmj) this.b.g.b();
            cjmw cjmwVar = this.c;
            azsu azsuVar = this.d;
            avkl avklVar = this.e;
            cjmu cjmuVar = this.f;
            cjnz cjnzVar = this.g;
            fjay a = cslr.a();
            a.getClass();
            this.a = 1;
            if (cjmh.a(cjmjVar, cjmwVar, azsuVar, avklVar, null, cjmuVar, cjnzVar, a, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new axbc(this.b, this.c, this.d, this.e, this.f, this.g, ffguVar);
    }
}
