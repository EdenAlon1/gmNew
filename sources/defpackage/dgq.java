package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dgq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dgs b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgq(dgs dgsVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dgsVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dgq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dgs dgsVar = this.b;
            this.a = 1;
            if (dgsVar.b(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dgq(this.b, ffguVar);
    }
}
