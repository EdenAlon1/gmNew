package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtps implements ThreadFactory {
    public final dtpn a;
    private final ThreadFactory b;

    public dtps(ThreadFactory threadFactory, dtpn dtpnVar) {
        this.b = threadFactory;
        this.a = dtpnVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(final Runnable runnable) {
        return this.b.newThread(new Runnable() { // from class: dtpr
            @Override // java.lang.Runnable
            public final void run() {
                long id = Thread.currentThread().getId();
                dtps dtpsVar = dtps.this;
                dtpsVar.a.e(id);
                try {
                    runnable.run();
                } finally {
                    dtpsVar.a.d(id);
                }
            }
        });
    }
}
