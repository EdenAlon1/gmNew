package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class opy implements wb, oqs {
    private final GestureDetector a;
    private boolean b;

    public opy(GestureDetector gestureDetector) {
        ksw.a(true);
        this.a = gestureDetector;
    }

    private final void a() {
        this.a.onTouchEvent(MotionEvent.obtain(0L, 1L, 3, 0.0f, 0.0f, 0));
    }

    @Override // defpackage.wb
    public final void c(boolean z) {
        if (z) {
            this.b = true;
            a();
        }
    }

    @Override // defpackage.oqs
    public final void g() {
        this.b = false;
        a();
    }

    @Override // defpackage.wb
    public final boolean j(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.b && oqg.b(motionEvent)) {
            this.b = false;
        }
        return !this.b && this.a.onTouchEvent(motionEvent);
    }

    @Override // defpackage.oqs
    public final boolean k() {
        return true;
    }

    @Override // defpackage.wb
    public final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
