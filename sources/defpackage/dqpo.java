package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqpo implements ffji {
    final /* synthetic */ ListenableFuture a;

    public dqpo(ListenableFuture listenableFuture) {
        this.a = listenableFuture;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.a.cancel(false);
        return ffcu.a;
    }
}
