package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dquj extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ dqul c;
    final /* synthetic */ dqur d;
    final /* synthetic */ dqus e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dquj(dqul dqulVar, dqur dqurVar, dqus dqusVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = dqulVar;
        this.d = dqurVar;
        this.e = dqusVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dquj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            obj2 = this.a;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            dqul dqulVar = this.c;
            dqur dqurVar = this.d;
            dqus dqusVar = this.e;
            this.a = dqulVar;
            this.b = 1;
            Object a = dqurVar.a.a(dqusVar.a, this);
            if (a == ffhhVar) {
                return ffhhVar;
            }
            obj2 = dqulVar;
            obj = a;
        }
        dqof dqofVar = (dqof) obj;
        if (dqofVar == null) {
            dqqj dqqjVar = this.c.v;
            if (dqqjVar == null) {
                ffkj.c("emojiSet");
                dqqjVar = null;
            }
            dqofVar = dqqjVar.a();
        }
        int i = dqul.y;
        ((dqul) obj2).w = dqofVar;
        this.c.D();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dquj(this.c, this.d, this.e, ffguVar);
    }
}
