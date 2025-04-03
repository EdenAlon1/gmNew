package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erqr {
    public final AtomicInteger c;
    public final ListenableFuture[] d;
    public boolean a = false;
    public boolean b = true;
    public volatile int e = 0;

    public erqr(ListenableFuture[] listenableFutureArr) {
        this.d = listenableFutureArr;
        this.c = new AtomicInteger(listenableFutureArr.length);
    }

    public final void a() {
        if (this.c.decrementAndGet() == 0 && this.a) {
            for (ListenableFuture listenableFuture : this.d) {
                if (listenableFuture != null) {
                    listenableFuture.cancel(this.b);
                }
            }
        }
    }
}
