package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhia implements Runnable {
    public volatile AtomicInteger a = new AtomicInteger(0);
    final /* synthetic */ fhid b;
    private final fhff c;

    public fhia(fhid fhidVar, fhff fhffVar) {
        this.b = fhidVar;
        this.c = fhffVar;
    }

    public final String a() {
        return this.b.b.a.c;
    }

    public final void b(ExecutorService executorService) {
        byte[] bArr = fhhl.a;
        try {
            try {
                executorService.execute(this);
            } catch (RejectedExecutionException e) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(e);
                this.b.e(interruptedIOException);
                this.c.a(interruptedIOException);
                this.b.a.c.c(this);
            }
        } catch (Throwable th) {
            this.b.a.c.c(this);
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        fhfu fhfuVar;
        String f = this.b.f();
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName("OkHttp ".concat(f));
        fhid fhidVar = this.b;
        try {
            fhidVar.e.e();
            boolean z = false;
            try {
                try {
                    try {
                        this.c.b(fhidVar.h());
                        fhfuVar = fhidVar.a.c;
                    } catch (IOException e) {
                        e = e;
                        z = true;
                        if (z) {
                            fhlc fhlcVar = fhlc.b;
                            String str = true != fhidVar.l ? "" : "canceled ";
                            fhlcVar.l(a.t(str + "call to " + fhidVar.f(), "Callback failure for "), 4, e);
                        } else {
                            this.c.a(e);
                        }
                        fhfuVar = fhidVar.a.c;
                        fhfuVar.c(this);
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        fhidVar.b();
                        if (!z) {
                            IOException iOException = new IOException(a.n(th, "canceled due to "));
                            ffbt.a(iOException, th);
                            this.c.a(iOException);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    fhidVar.a.c.c(this);
                    throw th2;
                }
            } catch (IOException e2) {
                e = e2;
            } catch (Throwable th3) {
                th = th3;
            }
            fhfuVar.c(this);
        } finally {
            currentThread.setName(name);
        }
    }
}
