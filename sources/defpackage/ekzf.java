package defpackage;

import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekzf implements Runnable {
    final /* synthetic */ ekzi a;

    public ekzf(ekzi ekziVar) {
        this.a = ekziVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (!this.a.c.isShutdown()) {
            try {
                try {
                    ekzg ekzgVar = ((ekzh) this.a.b.remove()).a;
                    int i = ekzg.b;
                    ekzgVar.set(null);
                } catch (RejectedExecutionException e) {
                    Iterator it = ekzi.a.keySet().iterator();
                    while (it.hasNext()) {
                        ((ekzh) it.next()).a.setException(e);
                    }
                    return;
                }
            } catch (InterruptedException unused) {
                this.a.c.execute(this);
                return;
            } catch (Throwable th) {
                try {
                    this.a.c.execute(this);
                } catch (RejectedExecutionException e2) {
                    Iterator it2 = ekzi.a.keySet().iterator();
                    while (it2.hasNext()) {
                        ((ekzh) it2.next()).a.setException(e2);
                    }
                }
                throw th;
            }
        }
        try {
            this.a.c.execute(this);
        } catch (RejectedExecutionException e3) {
            Iterator it3 = ekzi.a.keySet().iterator();
            while (it3.hasNext()) {
                ((ekzh) it3.next()).a.setException(e3);
            }
        }
    }
}
