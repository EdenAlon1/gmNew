package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fftb implements Executor {
    public final ffsd a;

    public fftb(ffsd ffsdVar) {
        this.a = ffsdVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.a.ex(ffhe.a)) {
            this.a.a(ffhe.a, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
