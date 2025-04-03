package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.libraries.view.zoomableimage.ZoomableImageView;
import com.google.android.libraries.view.zoomableimage.ZoomableImageView.FlingAnimationHelper;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egyr extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ ZoomableImageView a;

    public egyr(ZoomableImageView zoomableImageView) {
        this.a = zoomableImageView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        if (this.a.h()) {
            return false;
        }
        if (this.a.g()) {
            ZoomableImageView zoomableImageView = this.a;
            zoomableImageView.f(zoomableImageView.d);
            return true;
        }
        if (this.a.getDrawable() == null) {
            return true;
        }
        ZoomableImageView zoomableImageView2 = this.a;
        PointF pointF = new PointF(motionEvent.getX(0), motionEvent.getY(0));
        Matrix matrix = new Matrix(zoomableImageView2.e);
        float f = pointF.x;
        float f2 = pointF.y;
        float f3 = zoomableImageView2.a;
        matrix.postScale(f3, f3, f, f2);
        zoomableImageView2.f(matrix);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.a.g() || this.a.h()) {
            return false;
        }
        ZoomableImageView zoomableImageView = this.a;
        float f3 = zoomableImageView.b;
        float f4 = (f2 / 1000.0f) * f3;
        float f5 = (f / 1000.0f) * f3;
        float sqrt = (float) Math.sqrt((f5 * f5) + (f4 * f4));
        egyt egytVar = new egyt(zoomableImageView.e);
        egyt egytVar2 = new egyt(zoomableImageView.e);
        float f6 = egytVar.a;
        float f7 = (-sqrt) / zoomableImageView.c;
        egytVar2.a = f6 + (f5 * f7);
        egytVar2.b = egytVar.b + (f4 * f7);
        ZoomableImageView.FlingAnimationHelper flingAnimationHelper = zoomableImageView.new FlingAnimationHelper();
        zoomableImageView.i = new AnimatorSet();
        zoomableImageView.i.play(ObjectAnimator.ofFloat(flingAnimationHelper, "matrixTranslateX", egytVar.a, egytVar2.a)).with(ObjectAnimator.ofFloat(flingAnimationHelper, "matrixTranslateY", egytVar.b, egytVar2.b));
        zoomableImageView.i.setDuration((int) f7);
        zoomableImageView.i.setInterpolator(new DecelerateInterpolator());
        zoomableImageView.i.start();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.a.g() || this.a.h()) {
            return false;
        }
        AnimatorSet animatorSet = this.a.h;
        if (animatorSet != null && animatorSet.isRunning()) {
            return true;
        }
        ZoomableImageView zoomableImageView = this.a;
        zoomableImageView.e.postTranslate(-f, -f2);
        zoomableImageView.b(zoomableImageView.e);
        zoomableImageView.setImageMatrix(zoomableImageView.e);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ZoomableImageView zoomableImageView = this.a;
        View.OnClickListener onClickListener = zoomableImageView.f;
        if (onClickListener == null) {
            return true;
        }
        onClickListener.onClick(zoomableImageView);
        return true;
    }
}
