package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class zx implements wb {
    final /* synthetic */ aai a;

    public zx(aai aaiVar) {
        this.a = aaiVar;
    }

    @Override // defpackage.wb
    public final void c(boolean z) {
        if (z) {
            this.a.m(null, 0);
        }
    }

    @Override // defpackage.wb
    public final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
        this.a.q.onTouchEvent(motionEvent);
        VelocityTracker velocityTracker = this.a.o;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (this.a.i == -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int findPointerIndex = motionEvent.findPointerIndex(this.a.i);
        if (findPointerIndex >= 0) {
            this.a.g(actionMasked, motionEvent, findPointerIndex);
        }
        aai aaiVar = this.a;
        wr wrVar = aaiVar.b;
        if (wrVar != null) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (findPointerIndex >= 0) {
                        aaiVar.o(motionEvent, aaiVar.k, findPointerIndex);
                        this.a.i(wrVar);
                        aai aaiVar2 = this.a;
                        aaiVar2.m.removeCallbacks(aaiVar2.n);
                        this.a.n.run();
                        this.a.m.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    aai aaiVar3 = this.a;
                    if (pointerId == aaiVar3.i) {
                        aaiVar3.i = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        aai aaiVar4 = this.a;
                        aaiVar4.o(motionEvent, aaiVar4.k, actionIndex);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = aaiVar.o;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            this.a.m(null, 0);
            this.a.i = -1;
        }
    }

    @Override // defpackage.wb
    public final boolean j(RecyclerView recyclerView, MotionEvent motionEvent) {
        int findPointerIndex;
        this.a.q.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        aaf aafVar = null;
        if (actionMasked == 0) {
            this.a.i = motionEvent.getPointerId(0);
            this.a.c = motionEvent.getX();
            this.a.d = motionEvent.getY();
            this.a.j();
            aai aaiVar = this.a;
            if (aaiVar.b == null) {
                if (!aaiVar.l.isEmpty()) {
                    View e = aaiVar.e(motionEvent);
                    int size = aaiVar.l.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        aaf aafVar2 = (aaf) aaiVar.l.get(size);
                        if (aafVar2.h.a == e) {
                            aafVar = aafVar2;
                            break;
                        }
                        size--;
                    }
                }
                if (aafVar != null) {
                    aai aaiVar2 = this.a;
                    aaiVar2.c -= aafVar.l;
                    aaiVar2.d -= aafVar.m;
                    aaiVar2.h(aafVar.h, true);
                    if (this.a.a.remove(aafVar.h.a)) {
                        this.a.j.n(aafVar.h);
                    }
                    this.a.m(aafVar.h, aafVar.i);
                    aai aaiVar3 = this.a;
                    aaiVar3.o(motionEvent, aaiVar3.k, 0);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            aai aaiVar4 = this.a;
            aaiVar4.i = -1;
            aaiVar4.m(null, 0);
        } else {
            int i = this.a.i;
            if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                this.a.g(actionMasked, motionEvent, findPointerIndex);
            }
        }
        VelocityTracker velocityTracker = this.a.o;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return this.a.b != null;
    }
}
