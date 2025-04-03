package defpackage;

import android.view.ScaleGestureDetector;
import com.google.android.libraries.view.zoomableimage.ZoomableImageView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egys extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    final /* synthetic */ ZoomableImageView a;

    public egys(ZoomableImageView zoomableImageView) {
        this.a = zoomableImageView;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        ZoomableImageView zoomableImageView = this.a;
        if (zoomableImageView.g == null || zoomableImageView.h()) {
            return false;
        }
        ZoomableImageView zoomableImageView2 = this.a;
        float f = zoomableImageView2.g.c;
        float f2 = 10.0f * f;
        float f3 = f * 0.7f;
        egyt egytVar = new egyt(zoomableImageView2.e);
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        float f4 = egytVar.c * scaleFactor;
        egytVar.c = f4;
        if (f4 < f3 || f4 >= f2) {
            return true;
        }
        ZoomableImageView zoomableImageView3 = this.a;
        zoomableImageView3.e.postScale(scaleFactor, scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        zoomableImageView3.b(zoomableImageView3.e);
        zoomableImageView3.setImageMatrix(zoomableImageView3.e);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        ZoomableImageView zoomableImageView = this.a;
        if (zoomableImageView.g == null || zoomableImageView.h()) {
            return;
        }
        float f = new egyt(this.a.e).c;
        ZoomableImageView zoomableImageView2 = this.a;
        if (f < zoomableImageView2.g.c) {
            zoomableImageView2.f(zoomableImageView2.d);
        }
    }
}
