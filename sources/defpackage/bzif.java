package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzif extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ bzid c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzif(bzid bzidVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = bzidVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzif) c((String) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        String str = (String) this.b;
        bzid bzidVar = this.c;
        this.a = 1;
        Object n = bzidVar.n(str, this);
        return n == ffhhVar ? ffhhVar : n;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        bzif bzifVar = new bzif(this.c, ffguVar);
        bzifVar.b = obj;
        return bzifVar;
    }
}
