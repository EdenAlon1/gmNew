package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czql implements View.OnTouchListener {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ AtomicReference b;
    final /* synthetic */ czqm c;

    public czql(czqm czqmVar, AtomicReference atomicReference, AtomicReference atomicReference2) {
        this.a = atomicReference;
        this.b = atomicReference2;
        this.c = czqmVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        GestureDetector gestureDetector = (GestureDetector) this.a.get();
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
        AtomicReference atomicReference = this.b;
        float rawX = motionEvent.getRawX();
        int a = ddzd.a(this.c.m);
        atomicReference.set(Float.valueOf(a <= 0 ? -1.0f : rawX / a));
        czqm.a.p("Suggestion touch event registered at: ".concat(String.valueOf(String.valueOf(this.b.get()))));
        return false;
    }
}
