package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mzb extends HandlerThread implements Handler.Callback {
    public ltu a;
    public Handler b;
    public Error c;
    public RuntimeException d;
    public mzc e;

    public mzb() {
        super("ExoPlayer:PlaceholderSurface");
    }

    /* JADX WARN: Finally extract failed */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        EGLSurface eglCreatePbufferSurface;
        int i = message.what;
        try {
            if (i == 1) {
                try {
                    try {
                        try {
                            int i2 = message.arg1;
                            lti.f(this.a);
                            ltu ltuVar = this.a;
                            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                            ltz.n(eglGetDisplay != null, "eglGetDisplay failed");
                            int[] iArr = new int[2];
                            ltz.n(EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
                            ltuVar.d = eglGetDisplay;
                            EGLConfig[] eGLConfigArr = new EGLConfig[1];
                            int[] iArr2 = new int[1];
                            boolean eglChooseConfig = EGL14.eglChooseConfig(ltuVar.d, ltu.a, 0, eGLConfigArr, 0, 1, iArr2, 0);
                            ltz.n(eglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null, lvf.G("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]));
                            EGLConfig eGLConfig = eGLConfigArr[0];
                            EGLContext eglCreateContext = EGL14.eglCreateContext(ltuVar.d, eGLConfig, EGL14.EGL_NO_CONTEXT, i2 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
                            ltz.n(eglCreateContext != null, "eglCreateContext failed");
                            ltuVar.e = eglCreateContext;
                            EGLDisplay eGLDisplay = ltuVar.d;
                            EGLContext eGLContext = ltuVar.e;
                            if (i2 == 1) {
                                eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
                            } else {
                                eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i2 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                                ltz.n(eglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
                            }
                            ltz.n(EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eGLContext), "eglMakeCurrent failed");
                            ltuVar.f = eglCreatePbufferSurface;
                            GLES20.glGenTextures(1, ltuVar.c, 0);
                            ltz.m();
                            ltuVar.g = new SurfaceTexture(ltuVar.c[0]);
                            ltuVar.g.setOnFrameAvailableListener(ltuVar);
                            SurfaceTexture surfaceTexture = this.a.g;
                            lti.f(surfaceTexture);
                            this.e = new mzc(this, surfaceTexture, i2 != 0);
                            synchronized (this) {
                                notify();
                            }
                        } catch (RuntimeException e) {
                            luj.d("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                            this.d = e;
                            synchronized (this) {
                                notify();
                            }
                        }
                    } catch (Error e2) {
                        luj.d("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                        this.c = e2;
                        synchronized (this) {
                            notify();
                        }
                    }
                } catch (lty e3) {
                    luj.d("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.d = new IllegalStateException(e3);
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i == 2) {
                try {
                    lti.f(this.a);
                    ltu ltuVar2 = this.a;
                    ltuVar2.b.removeCallbacks(ltuVar2);
                    try {
                        SurfaceTexture surfaceTexture2 = ltuVar2.g;
                        if (surfaceTexture2 != null) {
                            surfaceTexture2.release();
                            GLES20.glDeleteTextures(1, ltuVar2.c, 0);
                        }
                        EGLDisplay eGLDisplay2 = ltuVar2.d;
                        if (eGLDisplay2 != null && !eGLDisplay2.equals(EGL14.EGL_NO_DISPLAY)) {
                            EGL14.eglMakeCurrent(ltuVar2.d, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
                        }
                        EGLSurface eGLSurface = ltuVar2.f;
                        if (eGLSurface != null && !eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
                            EGL14.eglDestroySurface(ltuVar2.d, ltuVar2.f);
                        }
                        EGLContext eGLContext2 = ltuVar2.e;
                        if (eGLContext2 != null) {
                            EGL14.eglDestroyContext(ltuVar2.d, eGLContext2);
                        }
                        EGL14.eglReleaseThread();
                        EGLDisplay eGLDisplay3 = ltuVar2.d;
                        if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                            EGL14.eglTerminate(ltuVar2.d);
                        }
                        ltuVar2.d = null;
                        ltuVar2.e = null;
                        ltuVar2.f = null;
                        ltuVar2.g = null;
                    } catch (Throwable th) {
                        EGLDisplay eGLDisplay4 = ltuVar2.d;
                        if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                            EGL14.eglMakeCurrent(ltuVar2.d, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
                        }
                        EGLSurface eGLSurface2 = ltuVar2.f;
                        if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                            EGL14.eglDestroySurface(ltuVar2.d, ltuVar2.f);
                        }
                        EGLContext eGLContext3 = ltuVar2.e;
                        if (eGLContext3 != null) {
                            EGL14.eglDestroyContext(ltuVar2.d, eGLContext3);
                        }
                        EGL14.eglReleaseThread();
                        EGLDisplay eGLDisplay5 = ltuVar2.d;
                        if (eGLDisplay5 != null && !eGLDisplay5.equals(EGL14.EGL_NO_DISPLAY)) {
                            EGL14.eglTerminate(ltuVar2.d);
                        }
                        ltuVar2.d = null;
                        ltuVar2.e = null;
                        ltuVar2.f = null;
                        ltuVar2.g = null;
                        throw th;
                    }
                } finally {
                    try {
                    } finally {
                    }
                }
                return true;
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
