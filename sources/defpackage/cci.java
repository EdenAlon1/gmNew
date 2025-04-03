package defpackage;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cci {
    Size a;
    public final FrameLayout b;
    public final cbx c;
    private boolean d = false;

    public cci(FrameLayout frameLayout, cbx cbxVar) {
        this.b = frameLayout;
        this.c = cbxVar;
    }

    public abstract Bitmap a();

    public abstract View b();

    public abstract ListenableFuture c();

    public abstract void d();

    public abstract void e();

    final void f() {
        this.d = true;
        g();
    }

    public final void g() {
        View b = b();
        if (b == null || !this.d) {
            return;
        }
        cbx cbxVar = this.c;
        FrameLayout frameLayout = this.b;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = this.b.getLayoutDirection();
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            size.toString();
            avw.f("PreviewTransform", "Transform not applied due to PreviewView size: ".concat(size.toString()));
            return;
        }
        if (cbxVar.f()) {
            if (b instanceof TextureView) {
                ((TextureView) b).setTransform(cbxVar.d());
            } else {
                Display display = b.getDisplay();
                boolean z = (!cbxVar.g || display == null || display.getRotation() == cbxVar.e) ? false : true;
                boolean z2 = (cbxVar.g || cbxVar.a() == 0) ? false : true;
                if (z || z2) {
                    avw.c("PreviewTransform", "Custom rotation not supported with SurfaceView/PERFORMANCE mode.");
                }
            }
            RectF e = cbxVar.e(size, layoutDirection);
            b.setPivotX(0.0f);
            b.setPivotY(0.0f);
            b.setScaleX(e.width() / cbxVar.a.getWidth());
            b.setScaleY(e.height() / cbxVar.a.getHeight());
            b.setTranslationX(e.left - b.getLeft());
            b.setTranslationY(e.top - b.getTop());
        }
    }

    public abstract void h(axt axtVar, ccc cccVar);
}
