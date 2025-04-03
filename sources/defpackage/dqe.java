package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dqe extends ffhv implements ffjm {
    int a;
    private /* synthetic */ Object b;

    public dqe(ffgu ffguVar) {
        super(2, ffguVar);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqe) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffsk ffskVar;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffskVar = (ffsk) this.b;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            ffskVar = (ffsk) this.b;
        }
        while (ffui.h(ffskVar.hT())) {
            dqd dqdVar = dqd.a;
            this.b = ffskVar;
            this.a = 1;
            if (hhj.c(dqdVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dqe dqeVar = new dqe(ffguVar);
        dqeVar.b = obj;
        return dqeVar;
    }
}
