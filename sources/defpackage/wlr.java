package defpackage;

import defpackage.wls;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wlr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ wls.a b;
    final /* synthetic */ esgt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wlr(wls.a aVar, esgt esgtVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aVar;
        this.c = esgtVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wlr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            wls.a aVar = this.b;
            esgx b = esgx.b(this.c.c);
            if (b == null) {
                b = esgx.UNRECOGNIZED;
            }
            esgx esgxVar = b;
            dqiy dqiyVar = aVar.d;
            esgxVar.getClass();
            dqgm dqgmVar = dslv.aI;
            this.a = 1;
            if (dqiy.e(dqiyVar, esgxVar, dqgmVar, null, this, 12) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new wlr(this.b, this.c, ffguVar);
    }
}
