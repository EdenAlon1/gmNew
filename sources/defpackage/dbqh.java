package defpackage;

import android.view.SurfaceHolder;
import com.google.android.apps.messaging.ui.ditto.CameraSourcePreview;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbqh implements SurfaceHolder.Callback {
    final /* synthetic */ CameraSourcePreview a;

    public dbqh(CameraSourcePreview cameraSourcePreview) {
        this.a = cameraSourcePreview;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        CameraSourcePreview cameraSourcePreview = this.a;
        cameraSourcePreview.e = true;
        cameraSourcePreview.a();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.a.e = false;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }
}
