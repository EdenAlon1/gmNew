package defpackage;

import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.util.HashMap;
import java.util.Map;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exmf {
    public EGL10 a;
    public EGLDisplay b;
    public EGLContext c;
    public long d;
    private EGLConfig e;
    private int[] f;

    public exmf(Object obj) {
        this(obj, null);
    }

    private final void g(String str) {
        int eglGetError = this.a.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        throw new RuntimeException(str + ": EGL error: 0x" + Integer.toHexString(eglGetError));
    }

    private final void h(EGLContext eGLContext, int i, int[] iArr) {
        EGLConfig eGLConfig;
        int[] iArr2 = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 16, 12352, i == 3 ? 64 : 4, 12339, 5, 12344};
        if (iArr != null) {
            HashMap hashMap = new HashMap();
            int[][] iArr3 = {iArr2, iArr};
            for (int i2 = 0; i2 < 2; i2++) {
                int[] iArr4 = iArr3[i2];
                for (int i3 = 0; i3 < (iArr4.length >> 1); i3++) {
                    int i4 = i3 + i3;
                    int i5 = iArr4[i4];
                    int i6 = iArr4[i4 + 1];
                    if (i5 == 12344) {
                        break;
                    }
                    hashMap.put(Integer.valueOf(i5), Integer.valueOf(i6));
                }
            }
            int size = hashMap.size();
            iArr2 = new int[size + size + 1];
            int i7 = 0;
            for (Map.Entry entry : hashMap.entrySet()) {
                int i8 = i7 + 1;
                iArr2[i7] = ((Integer) entry.getKey()).intValue();
                i7 += 2;
                iArr2[i8] = ((Integer) entry.getValue()).intValue();
            }
            iArr2[i7] = 12344;
        }
        int[] iArr5 = iArr2;
        int[] iArr6 = this.f;
        if (!this.a.eglChooseConfig(this.b, iArr5, null, 0, iArr6)) {
            throw new IllegalArgumentException("eglChooseConfig failed");
        }
        int i9 = iArr6[0];
        if (i9 <= 0) {
            throw new IllegalArgumentException("No configs match requested attributes");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[i9];
        if (!this.a.eglChooseConfig(this.b, iArr5, eGLConfigArr, i9, iArr6)) {
            throw new IllegalArgumentException("eglChooseConfig#2 failed");
        }
        int i10 = 0;
        while (true) {
            if (i10 >= i9) {
                eGLConfig = null;
                break;
            }
            eGLConfig = eGLConfigArr[i10];
            int i11 = i(eGLConfig, 12324);
            int i12 = i(eGLConfig, 12323);
            int i13 = i(eGLConfig, 12322);
            int i14 = i(eGLConfig, 12321);
            if (i11 == 8 && i12 == 8 && i13 == 8 && i14 == 8) {
                break;
            } else {
                i10++;
            }
        }
        if (eGLConfig == null) {
            eGLConfig = eGLConfigArr[0];
        }
        this.e = eGLConfig;
        if (eGLConfig == null) {
            throw new RuntimeException("Unable to find a suitable EGLConfig");
        }
        EGLContext eglCreateContext = this.a.eglCreateContext(this.b, eGLConfig, eGLContext, new int[]{12440, i, 12344});
        this.c = eglCreateContext;
        if (eglCreateContext == null || eglCreateContext == EGL10.EGL_NO_CONTEXT) {
            int eglGetError = this.a.eglGetError();
            String hexString = Integer.toHexString(eglGetError);
            StringBuilder sb = new StringBuilder("Could not create GL context: EGL error: 0x");
            sb.append(hexString);
            sb.append(eglGetError == 12294 ? ": parent context uses a different version of OpenGL" : "");
            throw new RuntimeException(sb.toString());
        }
    }

    private final int i(EGLConfig eGLConfig, int i) {
        if (this.a.eglGetConfigAttrib(this.b, eGLConfig, i, this.f)) {
            return this.f[0];
        }
        return 0;
    }

    public final EGLSurface a(Object obj) {
        if (!(obj instanceof Surface) && !(obj instanceof SurfaceHolder)) {
            throw new RuntimeException("invalid surface: ".concat(String.valueOf(String.valueOf(obj))));
        }
        EGLSurface eglCreateWindowSurface = this.a.eglCreateWindowSurface(this.b, this.e, obj, new int[]{12344});
        g("eglCreateWindowSurface");
        if (eglCreateWindowSurface != null) {
            return eglCreateWindowSurface;
        }
        throw new RuntimeException("surface was null");
    }

    public final void b(EGLSurface eGLSurface, EGLSurface eGLSurface2) {
        if (!this.a.eglMakeCurrent(this.b, eGLSurface, eGLSurface2, this.c)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public final void c() {
        if (!this.a.eglMakeCurrent(this.b, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public final void d() {
        if (this.b != EGL10.EGL_NO_DISPLAY) {
            this.a.eglMakeCurrent(this.b, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
            this.a.eglDestroyContext(this.b, this.c);
            this.a.eglTerminate(this.b);
        }
        this.b = EGL10.EGL_NO_DISPLAY;
        this.c = EGL10.EGL_NO_CONTEXT;
        this.e = null;
    }

    public final void e(EGLSurface eGLSurface) {
        this.a.eglDestroySurface(this.b, eGLSurface);
    }

    public final EGLSurface f() {
        EGLSurface eglCreatePbufferSurface = this.a.eglCreatePbufferSurface(this.b, this.e, new int[]{12375, 1, 12374, 1, 12344});
        g("eglCreatePbufferSurface");
        if (eglCreatePbufferSurface != null) {
            return eglCreatePbufferSurface;
        }
        throw new RuntimeException("surface was null");
    }

    public exmf(Object obj, int[] iArr) {
        this.b = EGL10.EGL_NO_DISPLAY;
        this.e = null;
        this.c = EGL10.EGL_NO_CONTEXT;
        this.d = 0L;
        this.f = new int[1];
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.a = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.b = eglGetDisplay;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            throw new RuntimeException("eglGetDisplay failed");
        }
        if (!this.a.eglInitialize(this.b, new int[2])) {
            throw new RuntimeException("eglInitialize failed");
        }
        obj = obj == null ? EGL10.EGL_NO_CONTEXT : obj;
        try {
            h((EGLContext) obj, 3, iArr);
        } catch (RuntimeException e) {
            Log.w("EglManager", "could not create GLES 3 context: ".concat(e.toString()));
            h((EGLContext) obj, 2, iArr);
        }
    }
}
