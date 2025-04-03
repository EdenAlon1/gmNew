package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cokv implements ehxi {
    private final List a = new CopyOnWriteArrayList();

    public final void a(ehxi ehxiVar) {
        this.a.add(ehxiVar);
    }

    @Override // defpackage.ehxi
    public final void d(String str, ehxh ehxhVar) {
        ekzz f = eleg.f("JibeServiceListenerPropagator#handleServiceConnectFailed");
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((ehxi) it.next()).d(str, ehxhVar);
            }
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ehxi
    public final void e(String str) {
        ekzz f = eleg.f("JibeServiceListenerPropagator#handleServiceConnected");
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((ehxi) it.next()).e(str);
            }
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ehxi
    public final void f(String str) {
        ekzz f = eleg.f("JibeServiceListenerPropagator#handleServiceDisconnected");
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((ehxi) it.next()).f(str);
            }
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
