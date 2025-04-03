package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekzz implements Runnable, elav {
    public elat a;
    private elat b;
    private final boolean c = efbd.h(Thread.currentThread());
    private boolean d;
    private boolean e;
    private boolean f;

    public ekzz(elat elatVar, boolean z) {
        this.f = false;
        this.a = elatVar;
        this.b = elatVar;
        this.f = z;
    }

    private final void c() {
        this.d = true;
        this.a.p(this.c && !this.e && efbd.g());
        this.a = null;
    }

    public final void a(erph erphVar) {
        b(erphVar.h());
    }

    public final void b(ListenableFuture listenableFuture) {
        if (this.d) {
            throw new IllegalStateException("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
        }
        if (this.e) {
            throw new IllegalStateException("Signal is already attached to future");
        }
        this.e = true;
        this.a.s();
        listenableFuture.b(this, erpp.a);
    }

    @Override // defpackage.elav, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        elat elatVar = this.b;
        try {
            this.b = null;
            if (!this.e) {
                if (this.d) {
                    throw new IllegalStateException("Span was already closed!");
                }
                c();
            }
            if (elatVar != null) {
                elatVar.close();
            }
            if (this.f) {
                ekyf.g(ekzt.a);
            }
        } catch (Throwable th) {
            if (elatVar != null) {
                try {
                    elatVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d || !this.e) {
            efbd.e(new Runnable() { // from class: ekzy
                @Override // java.lang.Runnable
                public final void run() {
                    throw new IllegalStateException("Span was closed by an invalid call to SpanEndSignal.run()");
                }
            });
        } else {
            c();
        }
    }
}
