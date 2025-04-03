package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzht extends ffhv implements ffjm {
    int a;
    final /* synthetic */ bzhu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzht(bzhu bzhuVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = bzhuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzht) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elfl f = ((bzef) this.b.b.b()).f();
            f.getClass();
            this.a = 1;
            if (fgfz.c(f, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        this.b.a.f(18, fcek.a, "");
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bzht(this.b, ffguVar);
    }
}
