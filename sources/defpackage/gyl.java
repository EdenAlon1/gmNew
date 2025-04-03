package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gyl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ gzl b;
    final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gyl(gzl gzlVar, float f, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = gzlVar;
        this.c = f;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gyl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            gzl gzlVar = this.b;
            float f = this.c;
            this.a = 1;
            if (gzlVar.k(f, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new gyl(this.b, this.c, ffguVar);
    }
}
