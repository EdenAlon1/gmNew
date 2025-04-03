package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dquq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dqur b;
    final /* synthetic */ dqqj c;
    final /* synthetic */ dqul d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dquq(dqur dqurVar, dqqj dqqjVar, dqul dqulVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dqurVar;
        this.c = dqqjVar;
        this.d = dqulVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dquq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dqur dqurVar = this.b;
            dqqj dqqjVar = this.c;
            this.a = 1;
            obj = dqurVar.a.a(dqqjVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        dqof dqofVar = (dqof) obj;
        boolean isEmpty = this.c.i().isEmpty();
        if (dqofVar != null || isEmpty) {
            this.b.J(this.d);
        } else {
            dqur dqurVar2 = this.b;
            dqul dqulVar = this.d;
            dqurVar2.N(dqulVar, this.c, dqulVar.s);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dquq(this.b, this.c, this.d, ffguVar);
    }
}
