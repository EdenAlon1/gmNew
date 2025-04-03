package defpackage;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cdg extends cci {
    TextureView d;
    SurfaceTexture e;
    ListenableFuture f;
    axt g;
    boolean h;
    SurfaceTexture i;
    final AtomicReference j;
    ccc k;

    public cdg(FrameLayout frameLayout, cbx cbxVar) {
        super(frameLayout, cbxVar);
        this.h = false;
        this.j = new AtomicReference();
    }

    @Override // defpackage.cci
    public final Bitmap a() {
        TextureView textureView = this.d;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.d.getBitmap();
    }

    @Override // defpackage.cci
    public final View b() {
        return this.d;
    }

    @Override // defpackage.cci
    public final ListenableFuture c() {
        return kfg.a(new kfd() { // from class: ccz
            @Override // defpackage.kfd
            public final Object a(kfb kfbVar) {
                cdg.this.j.set(kfbVar);
                return "textureViewImpl_waitForNextFrame";
            }
        });
    }

    @Override // defpackage.cci
    public final void d() {
        if (!this.h || this.i == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.d.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.i;
        if (surfaceTexture != surfaceTexture2) {
            this.d.setSurfaceTexture(surfaceTexture2);
            this.i = null;
            this.h = false;
        }
    }

    @Override // defpackage.cci
    public final void e() {
        this.h = true;
    }

    @Override // defpackage.cci
    public final void h(final axt axtVar, ccc cccVar) {
        this.a = axtVar.c;
        this.k = cccVar;
        ksw.h(this.a);
        TextureView textureView = new TextureView(this.b.getContext());
        this.d = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.a.getWidth(), this.a.getHeight()));
        this.d.setSurfaceTextureListener(new cdf(this));
        this.b.removeAllViews();
        this.b.addView(this.d);
        axt axtVar2 = this.g;
        if (axtVar2 != null) {
            axtVar2.f();
        }
        this.g = axtVar;
        axtVar.a(koa.e(this.d.getContext()), new Runnable() { // from class: cda
            @Override // java.lang.Runnable
            public final void run() {
                cdg cdgVar = cdg.this;
                axt axtVar3 = cdgVar.g;
                if (axtVar3 != null && axtVar3 == axtVar) {
                    cdgVar.g = null;
                    cdgVar.f = null;
                }
                cdgVar.i();
            }
        });
        j();
    }

    public final void i() {
        ccc cccVar = this.k;
        if (cccVar != null) {
            cccVar.a();
            this.k = null;
        }
    }

    final void j() {
        SurfaceTexture surfaceTexture;
        Size size = this.a;
        if (size == null || (surfaceTexture = this.e) == null || this.g == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.a.getHeight());
        final Surface surface = new Surface(this.e);
        final axt axtVar = this.g;
        final ListenableFuture a = kfg.a(new kfd() { // from class: cdc
            @Override // defpackage.kfd
            public final Object a(final kfb kfbVar) {
                avw.a("TextureViewImpl", "Surface set on Preview.");
                cdg cdgVar = cdg.this;
                axt axtVar2 = cdgVar.g;
                Executor a2 = bjb.a();
                ksp kspVar = new ksp() { // from class: cdb
                    @Override // defpackage.ksp
                    public final void accept(Object obj) {
                        kfb.this.b((axq) obj);
                    }
                };
                Surface surface2 = surface;
                axtVar2.b(surface2, a2, kspVar);
                return "provideSurface[request=" + cdgVar.g + " surface=" + surface2 + "]";
            }
        });
        this.f = a;
        a.b(new Runnable() { // from class: cdd
            @Override // java.lang.Runnable
            public final void run() {
                avw.a("TextureViewImpl", "Safe to release surface.");
                cdg cdgVar = cdg.this;
                cdgVar.i();
                surface.release();
                if (cdgVar.f == a) {
                    cdgVar.f = null;
                }
                if (cdgVar.g == axtVar) {
                    cdgVar.g = null;
                }
            }
        }, koa.e(this.d.getContext()));
        f();
    }
}
