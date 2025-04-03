package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mgi implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ mgl a;

    public mgi(mgl mglVar) {
        this.a = mglVar;
    }

    public final void a(Surface surface) {
        this.a.aq(surface);
    }

    public final void b() {
        this.a.aq(null);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.a.ap(surfaceTexture);
        this.a.am(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.a.aq(null);
        this.a.am(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.a.am(i, i2);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.a.am(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        mgl mglVar = this.a;
        if (mglVar.u) {
            mglVar.aq(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        mgl mglVar = this.a;
        if (mglVar.u) {
            mglVar.aq(null);
        }
        this.a.am(0, 0);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
