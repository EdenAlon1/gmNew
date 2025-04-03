package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fse extends ffhv implements ffjm {
    int a;
    final /* synthetic */ fsg b;
    final /* synthetic */ float c;
    final /* synthetic */ cxt d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fse(fsg fsgVar, float f, cxt cxtVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = fsgVar;
        this.c = f;
        this.d = cxtVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fse) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            fsg fsgVar = this.b;
            Float f = new Float(this.c);
            cxt cxtVar = this.d;
            this.a = 1;
            if (cxj.j(fsgVar.c, f, cxtVar, null, this, 12) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new fse(this.b, this.c, this.d, ffguVar);
    }
}
