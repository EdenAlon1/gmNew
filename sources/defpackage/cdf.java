package defpackage;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cdf implements TextureView.SurfaceTextureListener {
    final /* synthetic */ cdg a;

    public cdf(cdg cdgVar) {
        this.a = cdgVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        avw.a("TextureViewImpl", a.r(i2, i, "SurfaceTexture available. Size: ", "x"));
        cdg cdgVar = this.a;
        cdgVar.e = surfaceTexture;
        if (cdgVar.f == null) {
            cdgVar.j();
            return;
        }
        ksw.h(cdgVar.g);
        axt axtVar = this.a.g;
        Objects.toString(axtVar);
        avw.a("TextureViewImpl", "Surface invalidated ".concat(String.valueOf(axtVar)));
        this.a.g.i.d();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        cdg cdgVar = this.a;
        cdgVar.e = null;
        ListenableFuture listenableFuture = cdgVar.f;
        if (listenableFuture == null) {
            avw.a("TextureViewImpl", "SurfaceTexture about to be destroyed");
            return true;
        }
        bkj.i(listenableFuture, new cde(this, surfaceTexture), koa.e(cdgVar.d.getContext()));
        this.a.i = surfaceTexture;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        avw.a("TextureViewImpl", a.r(i2, i, "SurfaceTexture size changed: ", "x"));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        kfb kfbVar = (kfb) this.a.j.getAndSet(null);
        if (kfbVar != null) {
            kfbVar.b(null);
        }
    }
}
