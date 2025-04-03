package defpackage;

import com.google.android.libraries.smartmessaging.expressivetext.impl.opengl.GLTextureView;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eeqe extends eeqd {
    protected final int c;
    protected final int d;
    private final int[] e;

    public eeqe(GLTextureView gLTextureView, int i, int i2) {
        super(gLTextureView, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, i, 12325, i2, 12326, 0, 12344});
        this.e = new int[1];
        this.c = i;
        this.d = i2;
    }

    private final int c(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.e)) {
            return this.e[0];
        }
        return 0;
    }

    @Override // defpackage.eeqd
    public final EGLConfig b(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
        for (EGLConfig eGLConfig : eGLConfigArr) {
            int c = c(egl10, eGLDisplay, eGLConfig, 12325);
            int c2 = c(egl10, eGLDisplay, eGLConfig, 12326);
            if (c >= this.d && c2 >= 0) {
                int c3 = c(egl10, eGLDisplay, eGLConfig, 12324);
                int c4 = c(egl10, eGLDisplay, eGLConfig, 12323);
                int c5 = c(egl10, eGLDisplay, eGLConfig, 12322);
                int c6 = c(egl10, eGLDisplay, eGLConfig, 12321);
                if (c3 == 8 && c4 == 8 && c5 == 8 && c6 == this.c) {
                    return eGLConfig;
                }
            }
        }
        return null;
    }
}
