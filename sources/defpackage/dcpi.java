package defpackage;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import com.google.android.apps.messaging.ui.mediapicker.camera.CameraTextureView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcpi implements TextureView.SurfaceTextureListener {
    final /* synthetic */ CameraTextureView a;

    public dcpi(CameraTextureView cameraTextureView) {
        this.a = cameraTextureView;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        CameraTextureView cameraTextureView = this.a;
        cameraTextureView.c.k(cameraTextureView, cameraTextureView.isShown());
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        CameraTextureView cameraTextureView = this.a;
        cameraTextureView.c.s(cameraTextureView);
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }
}
