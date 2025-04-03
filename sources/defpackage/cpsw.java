package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpsw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cpsz b;
    final /* synthetic */ fcek c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpsw(cpsz cpszVar, fcek fcekVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cpszVar;
        this.c = fcekVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpsw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
        fcek fcekVar = this.c;
        this.a = 1;
        String m = esun.m();
        ests estsVar = new ests(4, m);
        esun esunVar = (esun) cpszVar.a;
        Object j = esunVar.j(estsVar, new esuc(esunVar, m, fcekVar, estsVar, null), this);
        return j == ffhhVar ? ffhhVar : j;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cpsw(this.b, this.c, ffguVar);
    }
}
