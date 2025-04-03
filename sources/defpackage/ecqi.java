package defpackage;

import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecqi implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ ecqj a;
    private final AtomicReference b;

    public ecqi(ecqj ecqjVar, View view) {
        this.a = ecqjVar;
        this.b = new AtomicReference(view);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = (View) this.b.getAndSet(null);
        if (view == null) {
            return true;
        }
        try {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
            Handler a = efbd.a();
            final ecqj ecqjVar = this.a;
            a.postAtFrontOfQueue(new Runnable() { // from class: ecqg
                @Override // java.lang.Runnable
                public final void run() {
                    efbd.c();
                    ecqj ecqjVar2 = ecqj.this;
                    if (ecqjVar2.b.l != null) {
                        return;
                    }
                    ecqjVar2.b.l = ecjl.d();
                }
            });
            final ecqj ecqjVar2 = this.a;
            efbd.e(new Runnable() { // from class: ecqh
                @Override // java.lang.Runnable
                public final void run() {
                    efbd.c();
                    ecqj ecqjVar3 = ecqj.this;
                    if (ecqjVar3.b.k != null) {
                        return;
                    }
                    ecqjVar3.b.k = ecjl.d();
                }
            });
            return true;
        } catch (RuntimeException e) {
            Log.d("PrimesStartupMeasure", "Error handling StartupMeasure's onPreDraw", e);
            return true;
        }
    }
}
