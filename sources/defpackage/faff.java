package defpackage;

import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.google.research.xeno.effect.UserInteractionManager;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class faff implements GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener, ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener {
    final /* synthetic */ UserInteractionManager a;
    private float b = 0.0f;
    private float c = 0.0f;
    private float d = 0.0f;
    private final fafd e = new fafd();
    private final HashMap f = new HashMap();
    private final fafc g = new fafc();

    public faff(UserInteractionManager userInteractionManager) {
        this.a = userInteractionManager;
    }

    private final void c(int i, MotionEvent motionEvent) {
        fafq fafqVar = (fafq) fafr.a.createBuilder();
        long micros = TimeUnit.MILLISECONDS.toMicros(motionEvent.getEventTime());
        fafqVar.copyOnWrite();
        ((fafr) fafqVar.instance).g = micros;
        fafqVar.copyOnWrite();
        ((fafr) fafqVar.instance).f = fafu.a(i);
        facw a = this.a.a(motionEvent.getX(), motionEvent.getY());
        fafqVar.copyOnWrite();
        fafr fafrVar = (fafr) fafqVar.instance;
        a.getClass();
        fafrVar.e = a;
        fafrVar.b |= 1;
        int pointerCount = motionEvent.getPointerCount();
        fafqVar.copyOnWrite();
        ((fafr) fafqVar.instance).c = pointerCount;
        for (int i2 = 0; i2 < motionEvent.getPointerCount(); i2++) {
            facw a2 = this.a.a(motionEvent.getX(i2), motionEvent.getY(i2));
            fafqVar.copyOnWrite();
            fafr fafrVar2 = (fafr) fafqVar.instance;
            a2.getClass();
            eygr eygrVar = fafrVar2.d;
            if (!eygrVar.c()) {
                fafrVar2.d = eyfy.mutableCopy(eygrVar);
            }
            fafrVar2.d.add(a2);
        }
        UserInteractionManager userInteractionManager = this.a;
        fafo fafoVar = (fafo) fafp.a.createBuilder();
        fafoVar.copyOnWrite();
        fafp fafpVar = (fafp) fafoVar.instance;
        fafr fafrVar3 = (fafr) fafqVar.build();
        fafrVar3.getClass();
        fafpVar.c = fafrVar3;
        fafpVar.b = 6;
        userInteractionManager.b((fafp) fafoVar.build());
    }

    public final void a(int i, ScaleGestureDetector scaleGestureDetector) {
        if (i == 3) {
            this.b = scaleGestureDetector.getCurrentSpan() / scaleGestureDetector.getPreviousSpan();
        } else {
            this.b += (scaleGestureDetector.getCurrentSpan() / scaleGestureDetector.getPreviousSpan()) - 1.0f;
        }
        float currentSpan = scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan();
        facw a = this.a.a(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        UserInteractionManager userInteractionManager = this.a;
        fafo fafoVar = (fafo) fafp.a.createBuilder();
        fafv fafvVar = (fafv) fafw.a.createBuilder();
        fafvVar.copyOnWrite();
        ((fafw) fafvVar.instance).f = fafu.a(i);
        double d = this.b;
        fafvVar.copyOnWrite();
        ((fafw) fafvVar.instance).c = d;
        fafvVar.copyOnWrite();
        ((fafw) fafvVar.instance).d = currentSpan;
        fafvVar.copyOnWrite();
        fafw fafwVar = (fafw) fafvVar.instance;
        a.getClass();
        fafwVar.e = a;
        fafwVar.b |= 1;
        long micros = TimeUnit.MILLISECONDS.toMicros(scaleGestureDetector.getEventTime());
        fafvVar.copyOnWrite();
        ((fafw) fafvVar.instance).g = micros;
        fafoVar.copyOnWrite();
        fafp fafpVar = (fafp) fafoVar.instance;
        fafw fafwVar2 = (fafw) fafvVar.build();
        fafwVar2.getClass();
        fafpVar.c = fafwVar2;
        fafpVar.b = 2;
        userInteractionManager.b((fafp) fafoVar.build());
    }

    public final void b(int i, MotionEvent motionEvent, float f, float f2) {
        if (i == 3) {
            this.c = 0.0f;
            this.d = 0.0f;
        }
        this.c -= f;
        this.d -= f2;
        fafs fafsVar = (fafs) faft.a.createBuilder();
        long micros = TimeUnit.MILLISECONDS.toMicros(motionEvent.getEventTime());
        fafsVar.copyOnWrite();
        ((faft) fafsVar.instance).g = micros;
        fafsVar.copyOnWrite();
        ((faft) fafsVar.instance).f = fafu.a(i);
        UserInteractionManager userInteractionManager = this.a;
        PointF pointF = new PointF(this.c, this.d);
        userInteractionManager.c(pointF);
        PointF pointF2 = new PointF(0.0f, 0.0f);
        pointF.x -= pointF2.x;
        pointF.y -= pointF2.y;
        facw d = UserInteractionManager.d(pointF);
        fafsVar.copyOnWrite();
        faft faftVar = (faft) fafsVar.instance;
        d.getClass();
        faftVar.e = d;
        faftVar.b |= 1;
        int pointerCount = motionEvent.getPointerCount();
        fafsVar.copyOnWrite();
        ((faft) fafsVar.instance).c = pointerCount;
        for (int i2 = 0; i2 < motionEvent.getPointerCount(); i2++) {
            facw a = this.a.a(motionEvent.getX(i2), motionEvent.getY(i2));
            fafsVar.copyOnWrite();
            faft faftVar2 = (faft) fafsVar.instance;
            a.getClass();
            eygr eygrVar = faftVar2.d;
            if (!eygrVar.c()) {
                faftVar2.d = eyfy.mutableCopy(eygrVar);
            }
            faftVar2.d.add(a);
        }
        UserInteractionManager userInteractionManager2 = this.a;
        fafo fafoVar = (fafo) fafp.a.createBuilder();
        fafoVar.copyOnWrite();
        fafp fafpVar = (fafp) fafoVar.instance;
        faft faftVar3 = (faft) fafsVar.build();
        faftVar3.getClass();
        fafpVar.c = faftVar3;
        fafpVar.b = 7;
        userInteractionManager2.b((fafp) fafoVar.build());
        if (i == 5) {
            this.c = 0.0f;
            this.d = 0.0f;
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        fafm fafmVar = (fafm) fafn.a.createBuilder();
        long micros = TimeUnit.MILLISECONDS.toMicros(motionEvent.getEventTime());
        fafmVar.copyOnWrite();
        ((fafn) fafmVar.instance).f = micros;
        facw a = this.a.a(motionEvent.getX(), motionEvent.getY());
        fafmVar.copyOnWrite();
        fafn fafnVar = (fafn) fafmVar.instance;
        a.getClass();
        fafnVar.e = a;
        fafnVar.b |= 1;
        int pointerCount = motionEvent.getPointerCount();
        fafmVar.copyOnWrite();
        ((fafn) fafmVar.instance).c = pointerCount;
        for (int i = 0; i < motionEvent.getPointerCount(); i++) {
            facw a2 = this.a.a(motionEvent.getX(i), motionEvent.getY(i));
            fafmVar.copyOnWrite();
            fafn fafnVar2 = (fafn) fafmVar.instance;
            a2.getClass();
            eygr eygrVar = fafnVar2.d;
            if (!eygrVar.c()) {
                fafnVar2.d = eyfy.mutableCopy(eygrVar);
            }
            fafnVar2.d.add(a2);
        }
        UserInteractionManager userInteractionManager = this.a;
        fafo fafoVar = (fafo) fafp.a.createBuilder();
        fafoVar.copyOnWrite();
        fafp fafpVar = (fafp) fafoVar.instance;
        fafn fafnVar3 = (fafn) fafmVar.build();
        fafnVar3.getClass();
        fafpVar.c = fafnVar3;
        fafpVar.b = 5;
        userInteractionManager.b((fafp) fafoVar.build());
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i;
        if (motionEvent != null) {
            float abs = Math.abs(f2 != 0.0f ? f / f2 : f);
            float abs2 = Math.abs(f != 0.0f ? f2 / f : f2);
            if (abs > abs2) {
                i = f < 0.0f ? 4 : 3;
            } else if (abs < abs2) {
                i = f2 < 0.0f ? 6 : 5;
            }
            fafz fafzVar = (fafz) faga.a.createBuilder();
            long micros = TimeUnit.MILLISECONDS.toMicros(motionEvent2.getEventTime());
            fafzVar.copyOnWrite();
            ((faga) fafzVar.instance).g = micros;
            fafzVar.copyOnWrite();
            ((faga) fafzVar.instance).c = i - 2;
            facw a = this.a.a(motionEvent.getX(), motionEvent.getY());
            fafzVar.copyOnWrite();
            faga fagaVar = (faga) fafzVar.instance;
            a.getClass();
            fagaVar.f = a;
            fagaVar.b |= 1;
            int pointerCount = motionEvent.getPointerCount();
            fafzVar.copyOnWrite();
            ((faga) fafzVar.instance).d = pointerCount;
            for (int i2 = 0; i2 < motionEvent.getPointerCount(); i2++) {
                facw a2 = this.a.a(motionEvent.getX(i2), motionEvent.getY(i2));
                fafzVar.copyOnWrite();
                faga fagaVar2 = (faga) fafzVar.instance;
                a2.getClass();
                eygr eygrVar = fagaVar2.e;
                if (!eygrVar.c()) {
                    fagaVar2.e = eyfy.mutableCopy(eygrVar);
                }
                fagaVar2.e.add(a2);
            }
            UserInteractionManager userInteractionManager = this.a;
            fafo fafoVar = (fafo) fafp.a.createBuilder();
            fafoVar.copyOnWrite();
            fafp fafpVar = (fafp) fafoVar.instance;
            faga fagaVar3 = (faga) fafzVar.build();
            fagaVar3.getClass();
            fafpVar.c = fagaVar3;
            fafpVar.b = 1;
            userInteractionManager.b((fafp) fafoVar.build());
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        fafc fafcVar = this.g;
        fafcVar.a = true;
        fafcVar.b = motionEvent.getActionIndex();
        c(3, motionEvent);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        a(4, scaleGestureDetector);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        a(3, scaleGestureDetector);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        a(5, scaleGestureDetector);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i;
        if (motionEvent == null) {
            return false;
        }
        fafd fafdVar = this.e;
        if (fafdVar.a) {
            i = 4;
        } else {
            fafdVar.a = true;
            i = 3;
        }
        b(i, motionEvent2, f, f2);
        fafd fafdVar2 = this.e;
        fafdVar2.b = motionEvent;
        fafdVar2.c = motionEvent2;
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        fagb fagbVar = (fagb) fagc.a.createBuilder();
        long micros = TimeUnit.MILLISECONDS.toMicros(motionEvent.getEventTime());
        fagbVar.copyOnWrite();
        ((fagc) fagbVar.instance).f = micros;
        facw a = this.a.a(motionEvent.getX(), motionEvent.getY());
        fagbVar.copyOnWrite();
        fagc fagcVar = (fagc) fagbVar.instance;
        a.getClass();
        fagcVar.e = a;
        fagcVar.b |= 1;
        int pointerCount = motionEvent.getPointerCount();
        fagbVar.copyOnWrite();
        ((fagc) fagbVar.instance).c = pointerCount;
        for (int i = 0; i < motionEvent.getPointerCount(); i++) {
            facw a2 = this.a.a(motionEvent.getX(i), motionEvent.getY(i));
            fagbVar.copyOnWrite();
            fagc fagcVar2 = (fagc) fagbVar.instance;
            a2.getClass();
            eygr eygrVar = fagcVar2.d;
            if (!eygrVar.c()) {
                fagcVar2.d = eyfy.mutableCopy(eygrVar);
            }
            fagcVar2.d.add(a2);
        }
        UserInteractionManager userInteractionManager = this.a;
        fafo fafoVar = (fafo) fafp.a.createBuilder();
        fafoVar.copyOnWrite();
        fafp fafpVar = (fafp) fafoVar.instance;
        fagc fagcVar3 = (fagc) fagbVar.build();
        fagcVar3.getClass();
        fafpVar.c = fagcVar3;
        fafpVar.b = 4;
        userInteractionManager.b((fafp) fafoVar.build());
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0091  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.faff.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
