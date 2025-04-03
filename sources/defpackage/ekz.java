package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ekz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ elb b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekz(elb elbVar, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = elbVar;
        this.c = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ekz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elb elbVar = this.b;
            int i2 = this.c;
            eks eksVar = elbVar.b;
            this.a = 1;
            if (eksVar.f(i2, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ekz(this.b, this.c, ffguVar);
    }
}
