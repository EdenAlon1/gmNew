package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class spj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ spw b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public spj(ffgu ffguVar, spw spwVar) {
        super(2, ffguVar);
        this.b = spwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((spj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        sql sqlVar = (sql) this.b.i.b();
        this.a = 1;
        Object a = ffra.a(ekxi.a(sqlVar.a), new sqi(null, sqlVar), this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        spj spjVar = new spj(ffguVar, this.b);
        spjVar.c = obj;
        return spjVar;
    }
}
