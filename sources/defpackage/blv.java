package defpackage;

import android.media.MediaCodec;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blv {
    public final boolean a;

    public blv() {
        this.a = blp.a(SurfaceOrderQuirk.class) != null;
    }

    public static final int a(bdy bdyVar) {
        Class cls = bdyVar.n;
        if (cls != MediaCodec.class) {
            return cls == awl.class ? 0 : 1;
        }
        return 2;
    }
}
