package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzjj extends ffhv implements ffji {
    int a;
    final /* synthetic */ bzid b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzjj(bzid bzidVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = bzidVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        elfl c = ((bzgw) this.b.c.b()).c();
        this.a = 1;
        Object c2 = fgfz.c(c, this);
        return c2 == ffhhVar ? ffhhVar : c2;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new bzjj(this.b, (ffgu) obj).b(ffcu.a);
    }
}
