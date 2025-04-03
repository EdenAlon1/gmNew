package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctek {
    private static final int[] e = {12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344};
    private static final int[] f = {12440, 2, 12344};
    public EGLDisplay a;
    public EGLContext b;
    public EGLSurface c;
    public Surface d;
    private final EGLConfig[] g;

    public ctek(Surface surface) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        this.g = eGLConfigArr;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay == null) {
            ((ensz) ctfm.a.o().h("com/google/android/apps/messaging/shared/util/media/video/InputSurface", "configureDisplay", 72, "InputSurface.java")).q("unable to get EGL14 display");
            throw new ctfk("unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            ((ensz) ctfm.a.o().h("com/google/android/apps/messaging/shared/util/media/video/InputSurface", "configureDisplay", 77, "InputSurface.java")).q("unable to initialize EGL14");
            throw new ctfk("unable to initialize EGL14");
        }
        if (!EGL14.eglChooseConfig(eglGetDisplay, e, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            ((ensz) ctfm.a.o().h("com/google/android/apps/messaging/shared/util/media/video/InputSurface", "configureDisplay", 84, "InputSurface.java")).q("unable to find RGB888+recordable ES2 EGL config");
            EGL14.eglTerminate(eglGetDisplay);
            throw new ctfk("unable to find RGB888+recordable ES2 EGL config");
        }
        this.a = eglGetDisplay;
        EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfigArr[0], EGL14.EGL_NO_CONTEXT, f, 0);
        this.b = eglCreateContext;
        if (eglCreateContext == null) {
            throw new ctfk("Unable to create EGL context");
        }
        this.d = surface;
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(this.a, eGLConfigArr[0], surface, new int[]{12344}, 0);
        this.c = eglCreateWindowSurface;
        if (eglCreateWindowSurface == null) {
            throw new ctfk("Unable to create EGL window surface");
        }
    }
}
