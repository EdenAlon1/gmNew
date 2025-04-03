package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kfi extends ffkk implements ffji {
    final /* synthetic */ ListenableFuture a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfi(ListenableFuture listenableFuture) {
        super(1);
        this.a = listenableFuture;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.a.cancel(false);
        return ffcu.a;
    }
}
