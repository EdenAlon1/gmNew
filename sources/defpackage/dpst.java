package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpst extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dptb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpst(dptb dptbVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dptbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpst) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dptb dptbVar = this.b;
            dpgl dpglVar = dpgl.b;
            this.a = 1;
            if (dptbVar.c.f(dpglVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpst(this.b, ffguVar);
    }
}
