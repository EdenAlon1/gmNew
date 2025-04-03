package defpackage;

import android.animation.Animator;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.animation.LinearInterpolator;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwmp extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ dwna a;

    public dwmp(dwna dwnaVar) {
        this.a = dwnaVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        dwna dwnaVar = this.a;
        if (!dwnaVar.A) {
            return false;
        }
        if (!dwnaVar.w) {
            dwnaVar.w = true;
            dwnaVar.x = new LinearInterpolator();
            dwna dwnaVar2 = this.a;
            dwnaVar2.y = dwnaVar2.c(dwnaVar2.x);
            Animator animator = this.a.q;
            if (animator != null) {
                animator.cancel();
            }
            this.a.s.d();
        }
        float x = motionEvent2.getX();
        float y = motionEvent2.getY();
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        this.a.u = dwni.a(x, y, x2, y2);
        float dimension = this.a.getResources().getDimension(R.dimen.libraries_material_featurehighlight_swipe_max_transition_distance);
        dwna dwnaVar3 = this.a;
        dwnaVar3.v = Math.min(1.0f, dwnaVar3.u / dimension);
        dwna dwnaVar4 = this.a;
        float interpolation = dwnaVar4.x.getInterpolation(dwnaVar4.v);
        float f3 = 1.0f - interpolation;
        float exactCenterX = (dwnaVar4.a.exactCenterX() - dwnaVar4.e.h) * interpolation;
        float exactCenterY = dwnaVar4.a.exactCenterY();
        dwne dwneVar = dwnaVar4.e;
        float f4 = interpolation * (exactCenterY - dwneVar.i);
        dwneVar.setScale(f3);
        int i = (int) (255.0f * f3);
        dwnaVar4.e.setAlpha(i);
        dwnaVar4.e.setTranslationX(exactCenterX);
        dwnaVar4.e.setTranslationY(f4);
        dwnaVar4.f.setAlpha(i);
        dwnaVar4.f.setScale(f3);
        if (dwnaVar4.q()) {
            dwnaVar4.p.setElevation(f3 * dwnaVar4.h.getElevation());
        }
        dwnaVar4.g.a().setAlpha(1.0f - dwnaVar4.y.getInterpolation(dwnaVar4.v));
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        dwna dwnaVar = this.a;
        if (dwnaVar.D != null && dwnaVar.G.isTouchExplorationEnabled()) {
            dwna dwnaVar2 = this.a;
            if (dwnaVar2.D.c == 5) {
                dwnaVar2.d(0);
                return true;
            }
        }
        dwna dwnaVar3 = this.a;
        if (!dwnaVar3.B) {
            return true;
        }
        if (dwnaVar3.o(x, y) && this.a.e.e(x, y)) {
            return true;
        }
        this.a.d(0);
        return true;
    }
}
