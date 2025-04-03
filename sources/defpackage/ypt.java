package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ypt extends ffhv implements ffjm {
    int a;
    final /* synthetic */ yqb b;
    final /* synthetic */ xid c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ypt(yqb yqbVar, xid xidVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = yqbVar;
        this.c = xidVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ypt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            yqb yqbVar = this.b;
            xid xidVar = this.c;
            this.a = 1;
            obj = yqbVar.g(xidVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        dtbv dtbvVar = (dtbv) obj;
        if (ffkj.e(dtbvVar, this.b.q.c())) {
            this.b.t.set(false);
            return ffcu.a;
        }
        this.b.q.f(dtbvVar);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ypt(this.b, this.c, ffguVar);
    }
}
