package defpackage;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feyd implements Runnable {
    final /* synthetic */ CyclicBarrier a;
    final /* synthetic */ CountDownLatch b;

    public feyd(CyclicBarrier cyclicBarrier, CountDownLatch countDownLatch) {
        this.a = cyclicBarrier;
        this.b = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.await(1000L, TimeUnit.MILLISECONDS);
            this.b.await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (BrokenBarrierException | TimeoutException unused2) {
        }
    }
}
