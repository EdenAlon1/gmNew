package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwmq extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ dwna a;

    public dwmq(dwna dwnaVar) {
        this.a = dwnaVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.a.e();
        return true;
    }
}
