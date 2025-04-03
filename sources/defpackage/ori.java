package defpackage;

import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ori extends oqh {
    private final oqe b;
    private final Runnable c;
    private final Runnable d;
    private final Runnable e;

    public ori(ord ordVar, oqe oqeVar, Runnable runnable, oqx oqxVar, oqy oqyVar, Runnable runnable2, Runnable runnable3) {
        super(ordVar);
        ksw.a(true);
        ksw.a(true);
        ksw.a(true);
        ksw.a(oqyVar != null);
        ksw.a(oqxVar != null);
        ksw.a(true);
        this.b = oqeVar;
        this.c = runnable;
        this.d = runnable2;
        this.e = runnable3;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return oqg.d(motionEvent) && onSingleTapUp(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        oqd a;
        if (this.b.c(motionEvent) && (a = this.b.a(motionEvent)) != null) {
            this.e.run();
            c(motionEvent);
            if (this.a.l(((aeil) a).a)) {
                return;
            }
            b(a);
            if (this.a.j()) {
                this.c.run();
            }
            this.d.run();
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        oqd a = this.b.a(motionEvent);
        if (a == null || !a.c()) {
            return this.a.h();
        }
        if (!this.a.i()) {
            return false;
        }
        c(motionEvent);
        aeil aeilVar = (aeil) a;
        if (this.a.l(aeilVar.a)) {
            this.a.m(aeilVar.a);
            return true;
        }
        b(a);
        return true;
    }
}
