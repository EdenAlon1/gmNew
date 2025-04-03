package defpackage;

import android.os.Trace;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fijq extends UploadDataSink {
    public final AtomicInteger a = new AtomicInteger(3);
    public final Executor b;
    public final filt c;
    public ByteBuffer d;
    public long e;
    public long f;
    public int g;
    private final Executor h;

    public fijq(Executor executor, Executor executor2, UploadDataProvider uploadDataProvider) {
        this.h = new fijp(this, executor);
        this.b = executor2;
        this.c = new filt(uploadDataProvider);
    }

    private final void j(final Runnable runnable, final String str) {
        new fiev("JavaUploadDataSinkBase#executeOnExecutor ".concat(str));
        try {
            this.b.execute(new Runnable() { // from class: fijn
                @Override // java.lang.Runnable
                public final void run() {
                    new fiev("JavaUploadDataSinkBase#executeOnExecutor " + str + " running callback");
                    try {
                        runnable.run();
                        Trace.endSection();
                    } catch (Throwable th) {
                        try {
                            Trace.endSection();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            });
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    protected abstract int a(ByteBuffer byteBuffer);

    protected abstract Runnable b(fiky fikyVar);

    protected abstract Runnable c(fiky fikyVar);

    public final void d(final fiky fikyVar, final String str) {
        try {
            new fiev(a.t(str, "Cronet JavaUploadDataSinkBase#executeOnUploadExecutor "));
            try {
                this.h.execute(new Runnable() { // from class: fijk
                    @Override // java.lang.Runnable
                    public final void run() {
                        new fiev("Cronet JavaUploadDataSinkBase#executeOnUploadExecutor " + str + " running callback");
                        try {
                            fijq.this.c(fikyVar).run();
                            Trace.endSection();
                        } catch (Throwable th) {
                            try {
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                });
                Trace.endSection();
            } finally {
            }
        } catch (RejectedExecutionException e) {
            g(e);
        }
    }

    protected abstract void e();

    protected abstract void f();

    protected abstract void g(Throwable th);

    public final void h() {
        d(new fiky() { // from class: fijl
            @Override // defpackage.fiky
            public final void a() {
                final fijq fijqVar = fijq.this;
                fijqVar.c.read(fijqVar, fijqVar.d);
                fijqVar.b.execute(new Runnable() { // from class: fiji
                    @Override // java.lang.Runnable
                    public final void run() {
                        fijq.this.g++;
                    }
                });
            }
        }, "readFromProvider");
    }

    public final void i() {
        j(b(new fiky() { // from class: fijm
            @Override // defpackage.fiky
            public final void a() {
                fijq fijqVar = fijq.this;
                fijqVar.f();
                fijqVar.a.set(0);
                fijqVar.h();
            }
        }), "startRead");
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onReadError(Exception exc) {
        g(exc);
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onReadSucceeded(final boolean z) {
        if (this.a.compareAndSet(0, 2)) {
            j(b(new fiky() { // from class: fijo
                @Override // defpackage.fiky
                public final void a() {
                    fijq fijqVar = fijq.this;
                    long j = fijqVar.e;
                    if (j != -1 && j - fijqVar.f < fijqVar.d.remaining()) {
                        fijqVar.g(new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", Long.valueOf(fijqVar.f + fijqVar.d.remaining()), Long.valueOf(fijqVar.e))));
                        return;
                    }
                    boolean z2 = z;
                    if (fijqVar.d.remaining() == 0 && !z2) {
                        fijqVar.g(new IllegalStateException("Bytes read can't be zero except for last chunk!"));
                        return;
                    }
                    long a = fijqVar.f + fijqVar.a(fijqVar.d);
                    fijqVar.f = a;
                    long j2 = fijqVar.e;
                    if (a >= j2) {
                        if (j2 == -1) {
                            if (z2) {
                                j2 = -1;
                            }
                        }
                        if (j2 == -1) {
                            fijqVar.e();
                            return;
                        } else if (j2 == a) {
                            fijqVar.e();
                            return;
                        } else {
                            fijqVar.g(new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", Long.valueOf(fijqVar.f), Long.valueOf(fijqVar.e))));
                            return;
                        }
                    }
                    fijqVar.a.set(0);
                    fijqVar.h();
                }
            }), "onReadSucceeded");
            return;
        }
        throw new IllegalStateException("onReadSucceeded() called when not awaiting a read result; in state: " + this.a.get());
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindError(Exception exc) {
        g(exc);
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindSucceeded() {
        if (this.a.compareAndSet(1, 2)) {
            i();
            return;
        }
        throw new IllegalStateException("onRewindSucceeded() called when not awaiting a rewind; in state: " + this.a.get());
    }
}
