package defpackage;

import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bki implements Runnable {
    final Future a;
    final bjt b;

    public bki(Future future, bjt bjtVar) {
        this.a = future;
        this.b = bjtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Future future = this.a;
            boolean isDone = future.isDone();
            Objects.toString(future);
            ksw.d(isDone, "Future was expected to be done, ".concat(String.valueOf(future)));
            this.b.b(bkj.h(future));
        } catch (Error e) {
            e = e;
            this.b.a(e);
        } catch (RuntimeException e2) {
            e = e2;
            this.b.a(e);
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause == null) {
                this.b.a(e3);
            } else {
                this.b.a(cause);
            }
        }
    }

    public final String toString() {
        return getClass().getSimpleName() + "," + this.b;
    }
}
