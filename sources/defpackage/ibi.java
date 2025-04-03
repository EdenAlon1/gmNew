package defpackage;

import android.graphics.Shader;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ibi {
    public static final Shader.TileMode a(int i) {
        Shader.TileMode tileMode;
        if (idp.b(i, 0)) {
            return Shader.TileMode.CLAMP;
        }
        if (idp.b(i, 1)) {
            return Shader.TileMode.REPEAT;
        }
        if (idp.b(i, 2)) {
            return Shader.TileMode.MIRROR;
        }
        if (!idp.b(i, 3)) {
            return Shader.TileMode.CLAMP;
        }
        if (Build.VERSION.SDK_INT < 31) {
            return Shader.TileMode.CLAMP;
        }
        tileMode = Shader.TileMode.DECAL;
        return tileMode;
    }
}
