package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.PixelCopy;
import android.view.PixelCopy$OnPixelCopyFinishedListener;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ccx extends cci {
    SurfaceView d;
    final ccw e;

    public ccx(FrameLayout frameLayout, cbx cbxVar) {
        super(frameLayout, cbxVar);
        this.e = new ccw(this);
    }

    @Override // defpackage.cci
    public final Bitmap a() {
        SurfaceView surfaceView = this.d;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.d.getHolder().getSurface().isValid()) {
            return null;
        }
        final Semaphore semaphore = new Semaphore(0);
        Bitmap createBitmap = Bitmap.createBitmap(this.d.getWidth(), this.d.getHeight(), Bitmap.Config.ARGB_8888);
        HandlerThread handlerThread = new HandlerThread("pixelCopyRequest Thread");
        handlerThread.start();
        PixelCopy.request(this.d, createBitmap, new PixelCopy$OnPixelCopyFinishedListener() { // from class: ccu
            public final void onPixelCopyFinished(int i) {
                if (i == 0) {
                    avw.a("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() succeeded");
                } else {
                    avw.c("SurfaceViewImpl", a.h(i, "PreviewView.SurfaceViewImplementation.getBitmap() failed with error "));
                }
                semaphore.release();
            }
        }, new Handler(handlerThread.getLooper()));
        try {
            try {
                if (!semaphore.tryAcquire(1, 100L, TimeUnit.MILLISECONDS)) {
                    avw.c("SurfaceViewImpl", "Timed out while trying to acquire screenshot.");
                }
            } catch (InterruptedException e) {
                avw.d("SurfaceViewImpl", "Interrupted while trying to acquire screenshot.", e);
            }
            return createBitmap;
        } finally {
            handlerThread.quitSafely();
        }
    }

    @Override // defpackage.cci
    public final View b() {
        return this.d;
    }

    @Override // defpackage.cci
    public final ListenableFuture c() {
        return bkj.b(null);
    }

    @Override // defpackage.cci
    public final void h(final axt axtVar, final ccc cccVar) {
        SurfaceView surfaceView = this.d;
        boolean equals = Objects.equals(this.a, axtVar.c);
        if (surfaceView == null || !equals) {
            this.a = axtVar.c;
            ksw.h(this.a);
            SurfaceView surfaceView2 = new SurfaceView(this.b.getContext());
            this.d = surfaceView2;
            surfaceView2.setLayoutParams(new FrameLayout.LayoutParams(this.a.getWidth(), this.a.getHeight()));
            this.b.removeAllViews();
            this.b.addView(this.d);
            this.d.getHolder().addCallback(this.e);
        }
        axtVar.a(koa.e(this.d.getContext()), new Runnable() { // from class: ccs
            @Override // java.lang.Runnable
            public final void run() {
                ccc.this.a();
            }
        });
        this.d.post(new Runnable() { // from class: cct
            @Override // java.lang.Runnable
            public final void run() {
                ccw ccwVar = ccx.this.e;
                ccwVar.a();
                axt axtVar2 = axtVar;
                if (ccwVar.d) {
                    ccwVar.d = false;
                    axtVar2.e();
                    return;
                }
                ccc cccVar2 = cccVar;
                ccwVar.b = axtVar2;
                ccwVar.f = cccVar2;
                Size size = axtVar2.c;
                ccwVar.a = size;
                ccwVar.c = false;
                if (ccwVar.b()) {
                    return;
                }
                avw.a("SurfaceViewImpl", "Wait for new Surface creation.");
                ccwVar.e.d.getHolder().setFixedSize(size.getWidth(), size.getHeight());
            }
        });
    }

    @Override // defpackage.cci
    public final void d() {
    }

    @Override // defpackage.cci
    public final void e() {
    }
}
