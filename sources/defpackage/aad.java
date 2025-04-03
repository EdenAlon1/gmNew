package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aad extends GestureDetector.SimpleOnGestureListener {
    public boolean a = true;
    final /* synthetic */ aai b;

    public aad(aai aaiVar) {
        this.b = aaiVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        View e;
        wr k;
        if (!this.a || (e = this.b.e(motionEvent)) == null || (k = this.b.m.k(e)) == null) {
            return;
        }
        aai aaiVar = this.b;
        if (aaiVar.j.j(aaiVar.m, k)) {
            int pointerId = motionEvent.getPointerId(0);
            int i = this.b.i;
            if (pointerId == i) {
                int findPointerIndex = motionEvent.findPointerIndex(i);
                float x = motionEvent.getX(findPointerIndex);
                float y = motionEvent.getY(findPointerIndex);
                aai aaiVar2 = this.b;
                aaiVar2.c = x;
                aaiVar2.d = y;
                aaiVar2.f = 0.0f;
                aaiVar2.e = 0.0f;
                if (aaiVar2.j.l()) {
                    this.b.m(k, 2);
                }
            }
        }
    }
}
