package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import com.google.common.util.concurrent.SettableFuture;
import com.google.mediapipe.framework.TextureFrame;
import java.util.ArrayDeque;
import java.util.Deque;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dubi implements TextureView.SurfaceTextureListener, exky {
    public static final String a = "dubi";
    public final EGLContext b;
    public final Deque c = new ArrayDeque(10);
    public final SettableFuture d = SettableFuture.create();
    public SurfaceTexture e;
    public Surface f;
    public int g;
    public int h;
    public exky i;
    public EGLSurface j;
    public exmf k;
    public exml l;
    private final float[] m;
    private HandlerThread n;
    private Handler o;

    public dubi(EGLContext eGLContext, TextureView textureView) {
        float[] fArr = new float[16];
        this.m = fArr;
        this.b = eGLContext;
        Matrix.setIdentityM(fArr, 0);
        this.e = textureView.getSurfaceTexture();
        c();
        textureView.setSurfaceTextureListener(this);
    }

    private final void c() {
        HandlerThread handlerThread = new HandlerThread(a);
        this.n = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(this.n.getLooper());
        this.o = handler;
        handler.post(new dubf(this));
    }

    public final synchronized void b() {
        Handler handler;
        if (!this.n.isAlive() || (handler = this.o) == null) {
            return;
        }
        handler.post(new Runnable() { // from class: dubg
            @Override // java.lang.Runnable
            public final void run() {
                dubi dubiVar = dubi.this;
                synchronized (dubiVar.c) {
                    while (!dubiVar.c.isEmpty()) {
                        ((TextureFrame) dubiVar.c.pollFirst()).release();
                    }
                }
                exml exmlVar = dubiVar.l;
                if (exmlVar != null) {
                    exmlVar.a();
                    dubiVar.l = null;
                }
                exmf exmfVar = dubiVar.k;
                if (exmfVar != null) {
                    exmfVar.c();
                    EGLSurface eGLSurface = dubiVar.j;
                    if (eGLSurface != null) {
                        dubiVar.k.e(eGLSurface);
                        dubiVar.j = null;
                    }
                    Surface surface = dubiVar.f;
                    if (surface != null) {
                        surface.release();
                    }
                    dubiVar.k.d();
                    dubiVar.k = null;
                }
                SurfaceTexture surfaceTexture = dubiVar.e;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    dubiVar.e = null;
                }
            }
        });
        this.n.quitSafely();
    }

    @Override // defpackage.exky
    public final void hI(TextureFrame textureFrame) {
        if (!this.n.isAlive() || this.o == null) {
            textureFrame.release();
            return;
        }
        synchronized (this.c) {
            if (!this.c.offerLast(textureFrame)) {
                textureFrame.release();
            }
        }
        this.o.post(new Runnable() { // from class: dubh
            @Override // java.lang.Runnable
            public final void run() {
                TextureFrame textureFrame2;
                dubi dubiVar = dubi.this;
                synchronized (dubiVar.c) {
                    textureFrame2 = null;
                    while (!dubiVar.c.isEmpty()) {
                        if (textureFrame2 != null) {
                            Log.d(dubi.a, String.format("Dropped frame (tex=%d, ts=%,d) ", Integer.valueOf(textureFrame2.getTextureName()), Long.valueOf(textureFrame2.getTimestamp())));
                            textureFrame2.release();
                        }
                        textureFrame2 = (TextureFrame) dubiVar.c.pollFirst();
                    }
                }
                if (textureFrame2 != null) {
                    if (dubiVar.e != null) {
                        GLES20.glViewport(0, 0, dubiVar.g, dubiVar.h);
                        GLES20.glClear(16384);
                        dubiVar.l.b(textureFrame2.getTextureName());
                        EGL14.eglSwapBuffers(EGL14.eglGetCurrentDisplay(), EGL14.eglGetCurrentSurface(12377));
                    }
                    exky exkyVar = dubiVar.i;
                    if (exkyVar != null) {
                        exkyVar.hI(textureFrame2);
                    } else {
                        textureFrame2.release();
                    }
                }
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.e = surfaceTexture;
        this.g = i;
        this.h = i2;
        if (!this.n.isAlive()) {
            c();
        }
        this.o.post(new dubf(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        b();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.g = i;
        this.h = i2;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
