package defpackage;

import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecqf implements ViewTreeObserver.OnDrawListener {
    public static final /* synthetic */ int b = 0;
    final /* synthetic */ ecqj a;
    private final AtomicReference c;

    public ecqf(ecqj ecqjVar, View view) {
        this.a = ecqjVar;
        this.c = new AtomicReference(view);
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        final View view = (View) this.c.getAndSet(null);
        if (view != null) {
            try {
                Handler a = efbd.a();
                final ecqj ecqjVar = this.a;
                a.postAtFrontOfQueue(new Runnable() { // from class: ecqc
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = ecqf.b;
                        efbd.c();
                        ecqj ecqjVar2 = ecqj.this;
                        if (ecqjVar2.b.i != null) {
                            return;
                        }
                        ecqjVar2.b.i = ecjl.d();
                    }
                });
                final ecqj ecqjVar2 = this.a;
                efbd.e(new Runnable() { // from class: ecqd
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = ecqf.b;
                        efbd.c();
                        ecqj ecqjVar3 = ecqj.this;
                        if (ecqjVar3.b.j != null) {
                            return;
                        }
                        ecqjVar3.b.j = ecjl.d();
                        ecqk.e("Primes-ttfdd-end-and-length-ms", ((ecio) ecqjVar3.b.j).a);
                        ecqjVar3.a.unregisterActivityLifecycleCallbacks(ecqjVar3);
                    }
                });
                efbd.e(new Runnable() { // from class: ecqe
                    @Override // java.lang.Runnable
                    public final void run() {
                        view.getViewTreeObserver().removeOnDrawListener(ecqf.this);
                    }
                });
            } catch (RuntimeException e) {
                Log.d("PrimesStartupMeasure", "Error handling StartupMeasure's onDraw", e);
            }
        }
    }
}
