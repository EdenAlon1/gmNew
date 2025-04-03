package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eagh extends erqg implements errk {
    public volatile errk a;

    public eagh(ListenableFuture listenableFuture, errk errkVar) {
        super(listenableFuture);
        this.a = errkVar;
        listenableFuture.b(new Runnable() { // from class: eagg
            @Override // java.lang.Runnable
            public final void run() {
                eagh.this.a.cancel(false);
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
