package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dquk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dqur b;
    final /* synthetic */ dqus c;
    final /* synthetic */ dqul d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dquk(dqur dqurVar, dqus dqusVar, dqul dqulVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dqurVar;
        this.c = dqusVar;
        this.d = dqulVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dquk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dqur dqurVar = this.b;
            dqus dqusVar = this.c;
            this.a = 1;
            obj = dqurVar.a.a(dqusVar.a, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        dqof dqofVar = (dqof) obj;
        if (dqofVar == null) {
            dqofVar = this.c.a.a();
        }
        dqof dqofVar2 = this.d.w;
        if (dqofVar2 == null || !ffkj.e(dqofVar2, dqofVar)) {
            ffud ffudVar = this.d.u;
            if (ffudVar != null) {
                ffudVar.t(null);
            }
            dqul dqulVar = this.d;
            dqulVar.v = this.c.a;
            dqulVar.w = dqofVar;
            dqulVar.D();
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dquk(this.b, this.c, this.d, ffguVar);
    }
}
