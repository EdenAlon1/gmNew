package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fuv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ gmk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fuv(gmk gmkVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = gmkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fuv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            gmk gmkVar = this.b;
            this.a = 1;
            if (gmkVar.e(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new fuv(this.b, ffguVar);
    }
}
