package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cziy extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ vyw a;
    final /* synthetic */ cziz b;

    public cziy(cziz czizVar, vyw vywVar) {
        this.a = vywVar;
        this.b = czizVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        this.b.b = true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.a.f()) {
            return false;
        }
        Runnable runnable = this.b.c;
        if (runnable == null) {
            return true;
        }
        runnable.run();
        return true;
    }
}
