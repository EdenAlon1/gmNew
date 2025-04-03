package defpackage;

import android.graphics.SurfaceTexture;
import android.util.Log;
import java.lang.Thread;
import javax.microedition.khronos.egl.EGLContext;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exku {
    public exkt a;
    public Throwable b = null;

    public exku(EGLContext eGLContext) {
        exkt exktVar = new exkt(eGLContext);
        this.a = exktVar;
        exktVar.setName("ExternalTextureConverter");
        final Object obj = new Object();
        this.a.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: exko
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                exku exkuVar = exku.this;
                Object obj2 = obj;
                synchronized (obj2) {
                    exkuVar.b = th;
                    obj2.notify();
                }
            }
        });
        this.a.start();
        try {
            if (!this.a.k()) {
                synchronized (obj) {
                    while (this.b == null) {
                        obj.wait();
                    }
                }
            }
            this.a.setUncaughtExceptionHandler(null);
            if (this.b == null) {
                return;
            }
            this.a.l();
            throw new RuntimeException(this.b);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            Log.e("ExternalTextureConv", "thread was unexpectedly interrupted: ".concat(String.valueOf(e.getMessage())));
            throw new RuntimeException(e);
        }
    }

    public final void a(exky exkyVar) {
        exkt exktVar = this.a;
        synchronized (exktVar.c) {
            exktVar.c.clear();
            exktVar.c.add(exkyVar);
        }
    }

    public final void b(final SurfaceTexture surfaceTexture, final int i, final int i2) {
        if (surfaceTexture != null && (i == 0 || i2 == 0)) {
            throw new RuntimeException("ExternalTextureConverter: setSurfaceTexture dimensions cannot be zero");
        }
        this.a.p.post(new Runnable() { // from class: exkp
            @Override // java.lang.Runnable
            public final void run() {
                exku.this.a.f(surfaceTexture, i, i2);
            }
        });
    }
}
