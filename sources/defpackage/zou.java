package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zou extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cxj b;
    final /* synthetic */ hho c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zou(cxj cxjVar, hho hhoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cxjVar;
        this.c = hhoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zou) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cxj cxjVar = this.b;
            Object a = this.c.a();
            this.a = 1;
            if (cxj.j(cxjVar, a, null, null, this, 14) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new zou(this.b, this.c, ffguVar);
    }
}
