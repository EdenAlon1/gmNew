package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class erqm implements Runnable {
    final Future a;
    final erqj b;

    public erqm(Future future, erqj erqjVar) {
        this.a = future;
        this.b = erqjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable i;
        Object obj = this.a;
        if ((obj instanceof erso) && (i = ((erso) obj).i()) != null) {
            this.b.hx(i);
            return;
        }
        try {
            this.b.b(erqt.q(this.a));
        } catch (ExecutionException e) {
            this.b.hx(e.getCause());
        } catch (Throwable th) {
            this.b.hx(th);
        }
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.a(this.b);
        return b.toString();
    }
}
