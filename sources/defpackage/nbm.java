package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nbm extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, nax {
    private final nbl c;
    private final GestureDetector e;
    private final PointF a = new PointF();
    private final PointF b = new PointF();
    private final float d = 25.0f;
    private volatile float f = 3.1415927f;

    public nbm(Context context, nbl nblVar) {
        this.c = nblVar;
        this.e = new GestureDetector(context, this);
    }

    @Override // defpackage.nax
    public final void a(float[] fArr, float f) {
        this.f = -f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = motionEvent2.getX() - this.a.x;
        float y = motionEvent2.getY() - this.a.y;
        this.a.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.f;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f3 = this.d;
        float f4 = y / f3;
        float f5 = x / f3;
        this.b.x -= (cos * f5) - (sin * f4);
        this.b.y += (sin * f5) + (cos * f4);
        this.b.y = Math.max(-45.0f, Math.min(45.0f, this.b.y));
        this.c.b(this.b);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return ((nbj) this.c).a.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.e.onTouchEvent(motionEvent);
    }
}
