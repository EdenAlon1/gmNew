package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpta extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dptb b;
    final /* synthetic */ lkr c;
    final /* synthetic */ dpvw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpta(dptb dptbVar, lkr lkrVar, dpvw dpvwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dptbVar;
        this.c = lkrVar;
        this.d = dpvwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpta) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dptb dptbVar = this.b;
            if (!dptbVar.g) {
                lkr lkrVar = this.c;
                atl atlVar = atl.a;
                atlVar.getClass();
                dptbVar.e(lkrVar, atlVar);
                this.b.g = true;
            }
            dptb dptbVar2 = this.b;
            dpvw dpvwVar = this.d;
            this.a = 1;
            if (dptbVar2.c.h(dpvwVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpta(this.b, this.c, this.d, ffguVar);
    }
}
