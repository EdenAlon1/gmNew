package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dunh extends erqg implements errk {
    public volatile errk a;

    public dunh(ListenableFuture listenableFuture, errk errkVar) {
        super(listenableFuture);
        this.a = errkVar;
        listenableFuture.b(new Runnable() { // from class: dung
            @Override // java.lang.Runnable
            public final void run() {
                dunh.this.a.cancel(false);
            }
        }, erpp.a);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.a.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.a.getDelay(timeUnit);
    }
}
