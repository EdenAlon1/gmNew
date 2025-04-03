package defpackage;

import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mci implements lqg {
    private final lqg a = new lza();
    private EGLContext b;

    @Override // defpackage.lqg
    public final EGLContext a(EGLDisplay eGLDisplay, int i, int[] iArr) {
        if (this.b == null) {
            this.b = this.a.a(eGLDisplay, i, iArr);
        }
        return this.b;
    }

    @Override // defpackage.lqg
    public final EGLSurface b(EGLDisplay eGLDisplay, Object obj, int i, boolean z) {
        return ltz.i(eGLDisplay, obj, i, z);
    }

    @Override // defpackage.lqg
    public final EGLSurface c(EGLContext eGLContext, EGLDisplay eGLDisplay) {
        return ltz.j(eGLContext, eGLDisplay);
    }

    @Override // defpackage.lqg
    public final lqh d(int i, int i2, int i3) {
        return this.a.d(i, i2, i3);
    }

    @Override // defpackage.lqg
    public final void e(EGLDisplay eGLDisplay) {
        EGLContext eGLContext = this.b;
        if (eGLContext != null) {
            ltz.r(eGLDisplay, eGLContext);
        }
    }
}
