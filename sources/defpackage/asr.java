package defpackage;

import android.media.Image;
import android.media.ImageReader;
import android.view.Surface;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class asr implements bev {
    public final Object a = new Object();
    public boolean b = true;
    private final ImageReader c;

    public asr(ImageReader imageReader) {
        this.c = imageReader;
    }

    private static final boolean k(RuntimeException runtimeException) {
        return "ImageReaderContext is not initialized".equals(runtimeException.getMessage());
    }

    @Override // defpackage.bev
    public final int a() {
        int height;
        synchronized (this.a) {
            height = this.c.getHeight();
        }
        return height;
    }

    @Override // defpackage.bev
    public final int b() {
        int imageFormat;
        synchronized (this.a) {
            imageFormat = this.c.getImageFormat();
        }
        return imageFormat;
    }

    @Override // defpackage.bev
    public final int c() {
        int maxImages;
        synchronized (this.a) {
            maxImages = this.c.getMaxImages();
        }
        return maxImages;
    }

    @Override // defpackage.bev
    public final int d() {
        int width;
        synchronized (this.a) {
            width = this.c.getWidth();
        }
        return width;
    }

    @Override // defpackage.bev
    public final Surface e() {
        Surface surface;
        synchronized (this.a) {
            surface = this.c.getSurface();
        }
        return surface;
    }

    @Override // defpackage.bev
    public final avr f() {
        Image image;
        synchronized (this.a) {
            try {
                image = this.c.acquireLatestImage();
            } catch (RuntimeException e) {
                if (!k(e)) {
                    throw e;
                }
                image = null;
            }
            if (image == null) {
                return null;
            }
            return new aso(image);
        }
    }

    @Override // defpackage.bev
    public final avr g() {
        Image image;
        synchronized (this.a) {
            try {
                image = this.c.acquireNextImage();
            } catch (RuntimeException e) {
                if (!k(e)) {
                    throw e;
                }
                image = null;
            }
            if (image == null) {
                return null;
            }
            return new aso(image);
        }
    }

    @Override // defpackage.bev
    public final void h() {
        synchronized (this.a) {
            this.b = true;
            this.c.setOnImageAvailableListener(null, null);
        }
    }

    @Override // defpackage.bev
    public final void i() {
        synchronized (this.a) {
            this.c.close();
        }
    }

    @Override // defpackage.bev
    public final void j(final beu beuVar, final Executor executor) {
        synchronized (this.a) {
            this.b = false;
            this.c.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: asq
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    final asr asrVar = asr.this;
                    Object obj = asrVar.a;
                    Executor executor2 = executor;
                    final beu beuVar2 = beuVar;
                    synchronized (obj) {
                        if (!asrVar.b) {
                            executor2.execute(new Runnable() { // from class: asp
                                @Override // java.lang.Runnable
                                public final void run() {
                                    beuVar2.a(asr.this);
                                }
                            });
                        }
                    }
                }
            }, bim.a());
        }
    }
}
