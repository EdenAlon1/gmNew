package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class drfr extends ffju implements ffji {
    public drfr(Object obj) {
        super(1, obj, drgb.class, "onNewRelatedSearches", "onNewRelatedSearches(Ljava/util/List;)Lkotlinx/coroutines/Job;", 8);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        list.getClass();
        drgb drgbVar = (drgb) this.b;
        int i = drgb.ay;
        dtcq dtcqVar = drgbVar.al;
        if (dtcqVar == null) {
            ffkj.c("relatedSearchesAdapter");
            dtcqVar = null;
        }
        ffqy.d(drgbVar.bF(), null, null, new drfv(list, drgbVar, dtcqVar, null), 3);
        return ffcu.a;
    }
}
