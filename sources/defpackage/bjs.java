package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bjs extends bjv implements Runnable {
    volatile ListenableFuture a;
    private bjq c;
    private final BlockingQueue d = new LinkedBlockingQueue(1);
    private final CountDownLatch e = new CountDownLatch(1);
    private ListenableFuture f;

    public bjs(bjq bjqVar, ListenableFuture listenableFuture) {
        this.c = bjqVar;
        ksw.h(listenableFuture);
        this.f = listenableFuture;
    }

    private static final void d(Future future, boolean z) {
        if (future != null) {
            future.cancel(z);
        }
    }

    @Override // defpackage.bjv, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2 = false;
        if (!super.cancel(z)) {
            return false;
        }
        while (true) {
            try {
                this.d.put(Boolean.valueOf(z));
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        d(this.f, z);
        d(this.a, z);
        return true;
    }

    @Override // defpackage.bjv, java.util.concurrent.Future
    public final Object get() {
        if (!isDone()) {
            ListenableFuture listenableFuture = this.f;
            if (listenableFuture != null) {
                listenableFuture.get();
            }
            this.e.await();
            ListenableFuture listenableFuture2 = this.a;
            if (listenableFuture2 != null) {
                listenableFuture2.get();
            }
        }
        return super.get();
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object take;
        boolean z = false;
        try {
            try {
                try {
                    ListenableFuture a = this.c.a(bkj.h(this.f));
                    this.a = a;
                    if (isCancelled()) {
                        BlockingQueue blockingQueue = this.d;
                        while (true) {
                            try {
                                take = blockingQueue.take();
                                break;
                            } catch (InterruptedException unused) {
                                z = true;
                            } catch (Throwable th) {
                                if (z) {
                                    Thread.currentThread().interrupt();
                                }
                                throw th;
                            }
                        }
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                        a.cancel(((Boolean) take).booleanValue());
                        this.a = null;
                    } else {
                        a.b(new bjr(this, a), bjb.a());
                    }
                } catch (Throwable th2) {
                    this.c = null;
                    this.f = null;
                    this.e.countDown();
                    throw th2;
                }
            } catch (CancellationException unused2) {
                cancel(false);
            } catch (ExecutionException e) {
                c(e.getCause());
            }
        } catch (Error e2) {
            c(e2);
        } catch (UndeclaredThrowableException e3) {
            c(e3.getCause());
        } catch (Exception e4) {
            c(e4);
        }
        this.c = null;
        this.f = null;
        this.e.countDown();
    }

    @Override // defpackage.bjv, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        if (!isDone()) {
            if (timeUnit != TimeUnit.NANOSECONDS) {
                j = TimeUnit.NANOSECONDS.convert(j, timeUnit);
                timeUnit = TimeUnit.NANOSECONDS;
            }
            ListenableFuture listenableFuture = this.f;
            if (listenableFuture != null) {
                long nanoTime = System.nanoTime();
                listenableFuture.get(j, timeUnit);
                j -= Math.max(0L, System.nanoTime() - nanoTime);
            }
            CountDownLatch countDownLatch = this.e;
            long nanoTime2 = System.nanoTime();
            if (countDownLatch.await(j, timeUnit)) {
                j -= Math.max(0L, System.nanoTime() - nanoTime2);
                ListenableFuture listenableFuture2 = this.a;
                if (listenableFuture2 != null) {
                    listenableFuture2.get(j, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return super.get(j, timeUnit);
    }
}
