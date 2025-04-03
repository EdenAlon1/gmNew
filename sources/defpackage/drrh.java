package defpackage;

import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drrh extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ drri a;
    final /* synthetic */ drlj b;
    final /* synthetic */ drre c;

    public drrh(drri drriVar, drlj drljVar, drre drreVar) {
        this.a = drriVar;
        this.b = drljVar;
        this.c = drreVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        motionEvent.getClass();
        PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
        ((enrr) drri.s.h().h("com/google/android/libraries/compose/media/ui/holder/MediaViewHolder$bind$gestureDetector$1", "onLongPress", 162, "MediaViewHolder.kt")).J("%s long clicked at offset=%s with media=%s", this.a.w, pointF, this.b);
        this.c.a(this.b, pointF);
    }
}
