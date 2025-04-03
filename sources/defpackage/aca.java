package defpackage;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aca {
    public final ffdn a;
    public abo b;
    private final Runnable c;
    private OnBackInvokedCallback d;
    private OnBackInvokedDispatcher e;
    private boolean f;
    private boolean g;

    public aca() {
        this(null);
    }

    private final void g(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        OnBackInvokedCallback onBackInvokedCallback = this.d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z) {
            if (this.f) {
                return;
            }
            onBackInvokedDispatcher.registerOnBackInvokedCallback(0, onBackInvokedCallback);
            this.f = true;
            return;
        }
        if (this.f) {
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
            this.f = false;
        }
    }

    public final aal a(abo aboVar) {
        this.a.add(aboVar);
        abx abxVar = new abx(this, aboVar);
        aboVar.e(abxVar);
        f();
        aboVar.c = new abz(this);
        return abxVar;
    }

    public final void b(lkr lkrVar, abo aboVar) {
        lkrVar.getClass();
        aboVar.getClass();
        lkk P = lkrVar.P();
        if (P.a() == lkj.DESTROYED) {
            return;
        }
        aboVar.e(new abw(this, P, aboVar));
        f();
        aboVar.c = new aby(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void c() {
        abo aboVar;
        abo aboVar2 = this.b;
        if (aboVar2 == null) {
            ffdn ffdnVar = this.a;
            ListIterator listIterator = ffdnVar.listIterator(ffdnVar.a);
            while (true) {
                if (!listIterator.hasPrevious()) {
                    aboVar = 0;
                    break;
                } else {
                    aboVar = listIterator.previous();
                    if (((abo) aboVar).b) {
                        break;
                    }
                }
            }
            aboVar2 = aboVar;
        }
        this.b = null;
        if (aboVar2 != null) {
            aboVar2.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void d() {
        abo aboVar;
        abo aboVar2 = this.b;
        if (aboVar2 == null) {
            ffdn ffdnVar = this.a;
            ListIterator listIterator = ffdnVar.listIterator(ffdnVar.a);
            while (true) {
                if (!listIterator.hasPrevious()) {
                    aboVar = 0;
                    break;
                } else {
                    aboVar = listIterator.previous();
                    if (((abo) aboVar).b) {
                        break;
                    }
                }
            }
            aboVar2 = aboVar;
        }
        this.b = null;
        if (aboVar2 != null) {
            aboVar2.b();
            return;
        }
        Runnable runnable = this.c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void e(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        this.e = onBackInvokedDispatcher;
        g(this.g);
    }

    public final void f() {
        boolean z = this.g;
        ffdn ffdnVar = this.a;
        boolean z2 = false;
        if (!ffdnVar.isEmpty()) {
            Iterator<E> it = ffdnVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((abo) it.next()).b) {
                    z2 = true;
                    break;
                }
            }
        }
        this.g = z2;
        if (z2 == z || Build.VERSION.SDK_INT < 33) {
            return;
        }
        g(z2);
    }

    public aca(Runnable runnable) {
        OnBackInvokedCallback onBackInvokedCallback;
        this.c = runnable;
        this.a = new ffdn();
        if (Build.VERSION.SDK_INT >= 33) {
            if (Build.VERSION.SDK_INT >= 34) {
                onBackInvokedCallback = new abv(new abp(this), new abq(this), new abr(this), new abs(this));
            } else {
                final abt abtVar = new abt(this);
                onBackInvokedCallback = new OnBackInvokedCallback() { // from class: abu
                    public final void onBackInvoked() {
                        ffix.this.invoke();
                    }
                };
            }
            this.d = onBackInvokedCallback;
        }
    }
}
