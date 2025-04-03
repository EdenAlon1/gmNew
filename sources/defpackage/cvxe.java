package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvxe extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cvxj b;
    final /* synthetic */ aoku c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvxe(cvxj cvxjVar, aoku aokuVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cvxjVar;
        this.c = aokuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvxe) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cvxj cvxjVar = this.b;
            aoku aokuVar = this.c;
            aqux aquxVar = (aqux) cvxjVar.g.a().c();
            this.a = 1;
            if (cvxjVar.f.a(aokuVar, aquxVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cvxe(this.b, this.c, ffguVar);
    }
}
