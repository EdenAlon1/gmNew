package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pub extends ffkk implements ffji {
    final /* synthetic */ ppr a;
    final /* synthetic */ ListenableFuture b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pub(ppr pprVar, ListenableFuture listenableFuture) {
        super(1);
        this.a = pprVar;
        this.b = listenableFuture;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof pti) {
            this.a.i(((pti) th).a);
        }
        this.b.cancel(false);
        return ffcu.a;
    }
}
