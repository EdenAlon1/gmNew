package defpackage;

import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLU;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ltz {
    public static final int[] a = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
    public static final int[] b = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};
    private static final int[] c = {12445, 13120, 12344, 12344};
    private static final int[] d = {12445, 13632, 12344, 12344};
    private static final int[] e = {12344};

    public static float[] A() {
        return new float[]{-1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    private static int B(int i, int i2, int i3, int i4) {
        D(i, i2);
        int d2 = d();
        l(3553, d2, 9729);
        GLES20.glTexImage2D(3553, 0, i3, i, i2, 0, 6408, i4, null);
        m();
        return d2;
    }

    private static EGLConfig C(EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        throw new lty("eglChooseConfig failed.");
    }

    private static void D(int i, int i2) {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(3379, iArr, 0);
        int i3 = iArr[0];
        lti.d(i3 > 0, "Create a OpenGL context first or run the GL methods on an OpenGL thread.");
        if (i < 0 || i2 < 0) {
            throw new lty("width or height is less than 0");
        }
        if (i > i3 || i2 > i3) {
            throw new lty(a.h(i3, "width or height is greater than GL_MAX_TEXTURE_SIZE "));
        }
    }

    private static void E(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        throw new lty(str + ", error code: 0x" + Integer.toHexString(eglGetError));
    }

    public static int a() {
        int d2 = d();
        l(36197, d2, 9729);
        return d2;
    }

    public static int b(Bitmap bitmap) {
        int d2 = d();
        v(d2, bitmap);
        return d2;
    }

    public static int c(int i, int i2, boolean z) {
        return z ? B(i, i2, 34842, 5131) : B(i, i2, 6408, 5121);
    }

    public static int d() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        m();
        return iArr[0];
    }

    public static long e() {
        if (f() < 3) {
            return 0L;
        }
        long glFenceSync = GLES30.glFenceSync(37143, 0);
        m();
        GLES20.glFlush();
        m();
        return glFenceSync;
    }

    public static long f() {
        EGL14.eglQueryContext(EGL14.eglGetDisplay(0), EGL14.eglGetCurrentContext(), 12440, new int[1], 0);
        m();
        return r0[0];
    }

    public static EGLContext g(EGLContext eGLContext, EGLDisplay eGLDisplay, int i, int[] iArr) {
        lti.a(Arrays.equals(iArr, a) || Arrays.equals(iArr, b));
        if (i != 2) {
            i = 3;
        }
        lti.a(true);
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, C(eGLDisplay, iArr), eGLContext, new int[]{12440, i, 12344}, 0);
        if (eglCreateContext == null || eglCreateContext.equals(EGL14.EGL_NO_CONTEXT)) {
            EGL14.eglTerminate(eGLDisplay);
            throw new lty(a.h(i, "eglCreateContext() failed to create a valid context. The device may not support EGL version "));
        }
        m();
        return eglCreateContext;
    }

    public static EGLDisplay h() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        n(!eglGetDisplay.equals(EGL14.EGL_NO_DISPLAY), "No EGL display.");
        n(EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0), "Error in eglInitialize.");
        m();
        return eglGetDisplay;
    }

    public static EGLSurface i(EGLDisplay eGLDisplay, Object obj, int i, boolean z) {
        int[] iArr;
        int[] iArr2;
        if (i == 3 || i == 10) {
            iArr = a;
            iArr2 = e;
        } else {
            if (i != 7 && i != 6) {
                throw new IllegalArgumentException(a.h(i, "Unsupported color transfer: "));
            }
            iArr = b;
            if (z) {
                iArr2 = e;
            } else if (i == 6) {
                if (lvf.a < 33 || !x("EGL_EXT_gl_colorspace_bt2020_pq")) {
                    throw new lty("BT.2020 PQ OpenGL output isn't supported.");
                }
                iArr2 = c;
            } else {
                if (!x("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                    throw new lty("BT.2020 HLG OpenGL output isn't supported.");
                }
                iArr2 = d;
            }
        }
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, C(eGLDisplay, iArr), obj, iArr2, 0);
        E("Error creating a new EGL surface");
        return eglCreateWindowSurface;
    }

    public static EGLSurface j(EGLContext eGLContext, EGLDisplay eGLDisplay) {
        EGLSurface eglCreatePbufferSurface;
        int[] iArr = a;
        if (y()) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, C(eGLDisplay, iArr), new int[]{12375, 1, 12374, 1, 12344}, 0);
            E("Error creating a new EGL Pbuffer surface");
        }
        t(eGLDisplay, eGLContext, eglCreatePbufferSurface, 1, 1);
        return eglCreatePbufferSurface;
    }

    public static FloatBuffer k(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public static void l(int i, int i2, int i3) {
        GLES20.glBindTexture(i, i2);
        m();
        GLES20.glTexParameteri(i, 10240, i3);
        m();
        GLES20.glTexParameteri(i, 10241, i3);
        m();
        GLES20.glTexParameteri(i, 10242, 33071);
        m();
        GLES20.glTexParameteri(i, 10243, 33071);
        m();
    }

    public static void m() {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x".concat(String.valueOf(Integer.toHexString(glGetError)));
            }
            sb.append("glError: ");
            sb.append(gluErrorString);
            z = true;
        }
        if (z) {
            throw new lty(sb.toString());
        }
    }

    public static void n(boolean z, String str) {
        if (!z) {
            throw new lty(str);
        }
    }

    public static void o() {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClearDepthf(1.0f);
        GLES20.glClear(16640);
        m();
    }

    public static void p(long j) {
        GLES30.glDeleteSync(j);
        m();
    }

    public static void q(int i) {
        GLES20.glDeleteTextures(1, new int[]{i}, 0);
        m();
    }

    public static void r(EGLDisplay eGLDisplay, EGLContext eGLContext) {
        if (eGLDisplay == null || eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
            return;
        }
        EGL14.eglMakeCurrent(eGLDisplay, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
        E("Error releasing context");
        if (eGLContext != null && !eGLContext.equals(EGL14.EGL_NO_CONTEXT)) {
            EGL14.eglDestroyContext(eGLDisplay, eGLContext);
            E("Error destroying context");
        }
        EGL14.eglReleaseThread();
        E("Error releasing thread");
        EGL14.eglTerminate(eGLDisplay);
        E("Error terminating display");
    }

    public static void s(EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
        if (eGLDisplay == null || eGLDisplay.equals(EGL14.EGL_NO_DISPLAY) || eGLSurface == null || eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
            return;
        }
        EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
        E("Error destroying surface");
    }

    public static void t(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i, int i2) {
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        E("Error making context current");
        u(0, i, i2);
    }

    public static void u(int i, int i2, int i3) {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        if (iArr[0] != i) {
            GLES20.glBindFramebuffer(36160, i);
        }
        m();
        GLES20.glViewport(0, 0, i2, i3);
        m();
    }

    public static void v(int i, Bitmap bitmap) {
        D(bitmap.getWidth(), bitmap.getHeight());
        l(3553, i, 9729);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        m();
    }

    public static void w(float[] fArr) {
        Matrix.setIdentityM(fArr, 0);
    }

    public static boolean x(String str) {
        String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        return eglQueryString != null && eglQueryString.contains(str);
    }

    public static boolean y() {
        return x("EGL_KHR_surfaceless_context");
    }

    public static float[] z() {
        float[] fArr = new float[16];
        w(fArr);
        return fArr;
    }
}
