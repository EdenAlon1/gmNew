package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpsx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cpsz b;
    final /* synthetic */ Iterable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpsx(cpsz cpszVar, Iterable iterable, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cpszVar;
        this.c = iterable;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpsx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cpsz cpszVar = this.b;
        Iterable iterable = this.c;
        this.a = 1;
        String m = esun.m();
        ests estsVar = new ests(4, m);
        esun esunVar = (esun) cpszVar.a;
        Object j = esunVar.j(estsVar, new esud(esunVar, m, iterable, estsVar, null), this);
        return j == ffhhVar ? ffhhVar : j;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cpsx(this.b, this.c, ffguVar);
    }
}
