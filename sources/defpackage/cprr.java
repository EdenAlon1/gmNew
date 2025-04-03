package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cprr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cprv b;
    final /* synthetic */ esqm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cprr(cprv cprvVar, esqm esqmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cprvVar;
        this.c = esqmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cprr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cprv cprvVar = this.b;
        esqm esqmVar = this.c;
        this.a = 1;
        Object b = cprvVar.a.b(esqmVar, this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cprr(this.b, this.c, ffguVar);
    }
}
