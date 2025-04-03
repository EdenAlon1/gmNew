package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mzc extends Surface {
    public static int a;
    private static boolean c;
    public final boolean b;
    private final mzb d;
    private boolean e;

    public mzc(mzb mzbVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.d = mzbVar;
        this.b = z;
    }

    public static synchronized boolean a() {
        int i;
        synchronized (mzc.class) {
            if (!c) {
                int[] iArr = ltz.a;
                int i2 = lvf.a;
                a = ltz.x("EGL_EXT_protected_content") ? ltz.y() ? 1 : 2 : 0;
                c = true;
            }
            i = a;
        }
        return i != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.d) {
            if (!this.e) {
                mzb mzbVar = this.d;
                lti.f(mzbVar.b);
                mzbVar.b.sendEmptyMessage(2);
                this.e = true;
            }
        }
    }
}
