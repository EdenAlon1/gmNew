package defpackage;

import android.util.Log;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oqi extends oqh {
    private final oqe b;
    private boolean c;
    private boolean d;

    public oqi(ord ordVar, oqe oqeVar, oqz oqzVar, oqy oqyVar) {
        super(ordVar);
        ksw.a(true);
        ksw.a(oqzVar != null);
        ksw.a(oqyVar != null);
        this.b = oqeVar;
    }

    private final void d(oqd oqdVar, MotionEvent motionEvent) {
        if (oqg.f(motionEvent)) {
            b(oqdVar);
            return;
        }
        ksw.a(oqdVar != null);
        ksw.a(oqh.a(oqdVar));
        this.a.h();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        this.c = false;
        if (this.b.c(motionEvent) && !oqg.h(motionEvent)) {
            this.b.a(motionEvent);
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        oqd a;
        if ((!oqg.a(motionEvent.getMetaState(), 2) || !oqg.g(motionEvent)) && !oqg.e(motionEvent, 2)) {
            return false;
        }
        this.d = true;
        if (!this.b.c(motionEvent) || (a = this.b.a(motionEvent)) == null || this.a.l(((aeil) a).a)) {
            return false;
        }
        this.a.h();
        b(a);
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return (((motionEvent2.getToolType(0) == 1 && motionEvent2.getSource() == 8194) || motionEvent2.getToolType(0) == 3) && oqg.c(motionEvent2) && motionEvent2.getButtonState() == 0) ? false : true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        oqd a;
        if (this.c) {
            this.c = false;
            return false;
        }
        if (this.a.i() || !this.b.b(motionEvent) || oqg.h(motionEvent) || (a = this.b.a(motionEvent)) == null || !a.c()) {
            return false;
        }
        d(a, motionEvent);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (this.d) {
            this.d = false;
            return false;
        }
        if (!this.b.c(motionEvent)) {
            this.a.h();
            return false;
        }
        if (oqg.h(motionEvent) || !this.a.i()) {
            return false;
        }
        oqd a = this.b.a(motionEvent);
        if (this.a.i()) {
            ksw.a(a != null);
            c(motionEvent);
            if (!oqg.f(motionEvent) && !this.a.l(((aeil) a).a)) {
                this.a.h();
            }
            aeil aeilVar = (aeil) a;
            if (this.a.l(aeilVar.a)) {
                this.a.m(aeilVar.a);
            } else {
                d(a, motionEvent);
            }
        } else {
            Log.e("MouseInputHandler", "Call to onItemClick w/o selection.");
        }
        this.c = true;
        return true;
    }
}
