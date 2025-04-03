package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
final /* synthetic */ class ekej extends ffkh implements ffji {
    public ekej(Object obj) {
        super(1, obj, ekek.class, "getFromFallbackCacheOrImmediate", "getFromFallbackCacheOrImmediate(Lcom/google/apps/tiktok/experiments/FlagSnapshot;)Lcom/google/common/util/concurrent/ListenableFuture;", 0);
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        ejzx ejzxVar = (ejzx) obj;
        ejzxVar.getClass();
        ekek ekekVar = (ekek) this.g;
        ejzw ejzwVar = (ejzw) ejzx.a.createBuilder();
        ejzwVar.getClass();
        if (!ffkj.e(ejzxVar, ejzy.a(ejzwVar))) {
            return erqt.i(ejzxVar);
        }
        ListenableFuture a = ((effy) ekekVar.q.get()).a();
        a.getClass();
        return a;
    }
}
