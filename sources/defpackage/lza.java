package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lza implements lqg {
    private final EGLContext a = EGL14.EGL_NO_CONTEXT;
    private final List b = new ArrayList();

    @Override // defpackage.lqg
    public final EGLContext a(EGLDisplay eGLDisplay, int i, int[] iArr) {
        List list = this.b;
        EGLContext g = ltz.g(this.a, eGLDisplay, i, iArr);
        list.add(g);
        return g;
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
        int[] iArr = ltz.a;
        int[] iArr2 = new int[1];
        GLES20.glGenFramebuffers(1, iArr2, 0);
        ltz.m();
        GLES20.glBindFramebuffer(36160, iArr2[0]);
        ltz.m();
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
        ltz.m();
        return new lqh(i, iArr2[0], i2, i3);
    }

    @Override // defpackage.lqg
    public final void e(EGLDisplay eGLDisplay) {
        for (int i = 0; i < this.b.size(); i++) {
            ltz.r(eGLDisplay, (EGLContext) this.b.get(i));
        }
    }
}
