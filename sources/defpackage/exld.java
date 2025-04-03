package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.GLES20;
import android.util.Log;
import android.view.Surface;
import com.google.mediapipe.framework.TextureFrame;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exld implements exky {
    public static final String a = "exld";
    public int b;
    public int c;
    public int d;
    public boolean e;
    public exmi f;
    public exmn g;
    public Surface h;
    public EGLSurface i;
    public exmf j;
    public boolean l;
    private final Object p;
    public final Object m = new Object();
    public final ExecutorService n = Executors.newFixedThreadPool(3);
    public int o = 0;
    public final exml k = new exml();

    public exld(Object obj) {
        this.p = obj;
    }

    private final synchronized void d() {
        if (this.f != null) {
            return;
        }
        exmi exmiVar = new exmi(this.p, new int[]{12610, 1, 12344});
        this.f = exmiVar;
        exmiVar.setName("TextureFrameRecorder");
        this.f.start();
        try {
            this.f.k();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            Log.e(a, "Recording thread was interrupted: ".concat(String.valueOf(Log.getStackTraceString(e))));
            throw new RuntimeException(e);
        }
    }

    private final synchronized void e() {
        exmi exmiVar = this.f;
        if (exmiVar == null) {
            return;
        }
        exmiVar.l();
        try {
            this.f.join();
            this.f = null;
        } catch (InterruptedException e) {
            Log.d(a, "Recording thread was interrupted: ".concat(String.valueOf(Log.getStackTraceString(e))));
        }
    }

    public final synchronized void b() {
        exmi exmiVar;
        if (this.e && (exmiVar = this.f) != null) {
            exmiVar.p.post(new Runnable() { // from class: exla
                @Override // java.lang.Runnable
                public final void run() {
                    exld.this.k.a();
                }
            });
            this.e = false;
            this.i = null;
            this.h = null;
            this.j = null;
            e();
        }
    }

    public final synchronized void c() {
        this.g.getClass();
        if (this.e) {
            return;
        }
        this.d = 0;
        d();
        this.l = false;
        this.f.p.post(new Runnable() { // from class: exlb
            @Override // java.lang.Runnable
            public final void run() {
                exld exldVar = exld.this;
                exldVar.j = exldVar.f.n;
                exldVar.k.c();
                Surface surface = exldVar.h;
                if (surface != null) {
                    exldVar.i = exldVar.j.a(surface);
                    exldVar.e = true;
                    Log.d(exld.a, "Created encoder surface.");
                }
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                synchronized (exldVar.m) {
                    exldVar.l = true;
                    exldVar.m.notifyAll();
                }
            }
        });
        synchronized (this.m) {
            while (!this.l) {
                try {
                    this.m.wait();
                } catch (InterruptedException e) {
                    Log.d(a, "Notifier thread was interrupted: " + Log.getStackTraceString(e));
                }
            }
        }
    }

    @Override // defpackage.exky
    public final void hI(final TextureFrame textureFrame) {
        if (!this.e || this.f == null) {
            textureFrame.release();
        } else {
            Log.d(a, String.format("Recording frame with ts: %d", Long.valueOf(textureFrame.getTimestamp())));
            this.f.p.post(new Runnable() { // from class: exlc
                @Override // java.lang.Runnable
                public final void run() {
                    final exld exldVar = exld.this;
                    boolean z = exldVar.e;
                    TextureFrame textureFrame2 = textureFrame;
                    if (!z) {
                        textureFrame2.release();
                        return;
                    }
                    exmf exmfVar = exldVar.j;
                    EGLSurface eGLSurface = exldVar.i;
                    exmfVar.b(eGLSurface, eGLSurface);
                    EGLDisplay eglGetCurrentDisplay = EGL14.eglGetCurrentDisplay();
                    android.opengl.EGLSurface eglGetCurrentSurface = EGL14.eglGetCurrentSurface(12377);
                    EGLExt.eglPresentationTimeANDROID(eglGetCurrentDisplay, eglGetCurrentSurface, TimeUnit.MICROSECONDS.toNanos(textureFrame2.getTimestamp()));
                    GLES20.glClear(16384);
                    GLES20.glViewport(0, 0, exldVar.b, exldVar.c);
                    exldVar.k.b(textureFrame2.getTextureName());
                    EGL14.eglSwapBuffers(eglGetCurrentDisplay, eglGetCurrentSurface);
                    exldVar.d++;
                    textureFrame2.release();
                    exldVar.n.execute(new Runnable() { // from class: exkz
                        @Override // java.lang.Runnable
                        public final void run() {
                            exld.this.g.d();
                        }
                    });
                }
            });
        }
    }
}
