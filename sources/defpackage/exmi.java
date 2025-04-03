package defpackage;

import android.opengl.GLES20;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class exmi extends Thread {
    private boolean a;
    private boolean b;
    private final Object c;
    public volatile exmf n;
    public EGLSurface o;
    public Handler p;
    protected Looper q;
    protected int r;

    public exmi(Object obj) {
        this(obj, null);
    }

    public void c() {
        this.o = i();
        exmf exmfVar = this.n;
        EGLSurface eGLSurface = this.o;
        exmfVar.b(eGLSurface, eGLSurface);
        GLES20.glDisable(2929);
        GLES20.glDisable(2884);
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        this.r = iArr[0];
    }

    public void d() {
        int i = this.r;
        if (i != 0) {
            GLES20.glDeleteFramebuffers(1, new int[]{i}, 0);
            this.r = 0;
        }
        this.n.c();
        if (this.o != null) {
            this.n.e(this.o);
            this.o = null;
        }
    }

    protected EGLSurface i() {
        return this.n.f();
    }

    public final void j(int i, int i2, int i3) {
        GLES20.glBindFramebuffer(36160, this.r);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus != 36053) {
            throw new exmj(a.h(glCheckFramebufferStatus, "Framebuffer not complete, status="));
        }
        GLES20.glViewport(0, 0, i2, i3);
        exmk.c("glViewport");
    }

    public final boolean k() {
        synchronized (this.c) {
            while (!this.a) {
                this.c.wait();
            }
        }
        return this.b;
    }

    public final void l() {
        Looper looper = this.q;
        if (looper == null) {
            return;
        }
        looper.quitSafely();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            try {
                Looper.prepare();
                this.p = new Handler();
                this.q = Looper.myLooper();
                Log.d("GlThread", String.format("Starting GL thread %s", getName()));
                c();
                this.b = true;
                synchronized (this.c) {
                    this.a = true;
                    this.c.notify();
                }
                try {
                    Looper.loop();
                    this.q = null;
                    d();
                    this.n.d();
                    Log.d("GlThread", String.format("Stopping GL thread %s", getName()));
                } catch (Throwable th) {
                    this.q = null;
                    d();
                    this.n.d();
                    Log.d("GlThread", String.format("Stopping GL thread %s", getName()));
                    throw th;
                }
            } catch (RuntimeException e) {
                d();
                this.n.d();
                throw e;
            }
        } catch (Throwable th2) {
            synchronized (this.c) {
                this.a = true;
                this.c.notify();
                throw th2;
            }
        }
    }

    public exmi(Object obj, int[] iArr) {
        this.c = new Object();
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = 0;
        this.n = new exmf(obj, iArr);
        setName("drishti.glutil.GlThread");
    }
}
