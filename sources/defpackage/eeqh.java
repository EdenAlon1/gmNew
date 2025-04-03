package defpackage;

import android.util.Log;
import com.google.android.libraries.smartmessaging.expressivetext.impl.opengl.GLTextureView;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeqh {
    public final WeakReference a;
    EGL10 b;
    EGLDisplay c;
    EGLSurface d;
    EGLConfig e;
    EGLContext f;

    public eeqh(WeakReference weakReference) {
        this.a = weakReference;
    }

    public static String a(String str, int i) {
        return a.g(i, str, " failed: ");
    }

    public static void c(String str, String str2, int i) {
        Log.w(str, a(str2, i));
    }

    public static void d(String str, int i) {
        throw new RuntimeException(a(str, i));
    }

    public final void b() {
        EGLSurface eGLSurface = this.d;
        if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
            return;
        }
        this.b.eglMakeCurrent(this.c, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
        if (((GLTextureView) this.a.get()) != null) {
            this.b.eglDestroySurface(this.c, this.d);
        }
        this.d = null;
    }
}
