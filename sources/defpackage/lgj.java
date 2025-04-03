package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lgj {
    public final lgg a;
    final Executor b;

    public lgj(Executor executor, lgg lggVar) {
        this.a = lggVar;
        this.b = executor;
    }

    final void a(final Throwable th) {
        this.b.execute(new Runnable() { // from class: lgi
            @Override // java.lang.Runnable
            public final void run() {
                lgj.this.a.a(th);
            }
        });
    }

    final void b() {
        this.b.execute(new Runnable() { // from class: lgh
            @Override // java.lang.Runnable
            public final void run() {
                lgj.this.a.b();
            }
        });
    }
}
