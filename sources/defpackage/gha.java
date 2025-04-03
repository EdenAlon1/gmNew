package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gha extends ffhv implements ffjm {
    int a;
    final /* synthetic */ gmk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gha(gmk gmkVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = gmkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gha) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            gmk gmkVar = this.b;
            this.a = 1;
            if (gmkVar.g(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new gha(this.b, ffguVar);
    }
}
