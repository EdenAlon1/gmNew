package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzrl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ bzrm b;
    final /* synthetic */ bzsg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzrl(bzrm bzrmVar, bzsg bzsgVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = bzrmVar;
        this.c = bzsgVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzrl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        bzrm bzrmVar = this.b;
        bzsg bzsgVar = this.c;
        this.a = 1;
        Object k = bzrmVar.k(bzsgVar, this);
        return k == ffhhVar ? ffhhVar : k;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bzrl(this.b, this.c, ffguVar);
    }
}
