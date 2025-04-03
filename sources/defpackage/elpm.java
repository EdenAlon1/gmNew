package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elpm implements Runnable {
    final Future a;
    final elpf b;

    public elpm(Future future, elpf elpfVar) {
        this.a = future;
        this.b = elpfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        try {
            Future future = this.a;
            if (!future.isDone()) {
                throw new IllegalStateException("future is expected to be done already.");
            }
            boolean z = false;
            while (true) {
                try {
                    obj = future.get();
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
            this.b.b(obj);
        } catch (Error e) {
            e = e;
            this.b.a(e);
        } catch (RuntimeException e2) {
            e = e2;
            this.b.a(e);
        } catch (ExecutionException e3) {
            e = e3;
            elpf elpfVar = this.b;
            Throwable cause = e.getCause();
            if (cause != null) {
                e = cause;
            }
            elpfVar.a(e);
        }
    }
}
