package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class chxb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ chrv b;
    final /* synthetic */ chxc c;
    final /* synthetic */ fclq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chxb(chrv chrvVar, chxc chxcVar, fclq fclqVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = chrvVar;
        this.c = chxcVar;
        this.d = fclqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chxb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [chix, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        chrv chrvVar = this.b;
        ekzz f = eleg.f("GrpcProxies#getUserDataGrpcProxy");
        try {
            chrvVar.b.isPresent();
            emxf.m(true, "Module for UserDataGrpcProxyFactory not found");
            chiz a = chrvVar.b.get().a();
            f.close();
            fclq fclqVar = this.d;
            this.a = 1;
            Object a2 = ffra.a(ekxi.a(a.b), new chiy(null, a, fclqVar), this);
            return a2 == ffhhVar ? ffhhVar : a2;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new chxb(this.b, this.c, this.d, ffguVar);
    }
}
