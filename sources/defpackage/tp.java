package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class tp implements Runnable {
    final /* synthetic */ tq a;

    public tp(tq tqVar) {
        this.a = tqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tq tqVar = this.a;
        tqVar.d();
        View view = tqVar.c;
        if (view.isEnabled() && !view.isLongClickable() && tqVar.b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            tqVar.d = true;
        }
    }
}
