package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpoe extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cpok b;
    final /* synthetic */ esro c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpoe(ffgu ffguVar, cpok cpokVar, esro esroVar) {
        super(2, ffguVar);
        this.b = cpokVar;
        this.c = esroVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpoe) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cpok cpokVar = this.b;
        esro esroVar = this.c;
        this.a = 1;
        Object f = cpokVar.a.f(esroVar.b, this);
        return f == ffhhVar ? ffhhVar : f;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cpoe cpoeVar = new cpoe(ffguVar, this.b, this.c);
        cpoeVar.d = obj;
        return cpoeVar;
    }
}
