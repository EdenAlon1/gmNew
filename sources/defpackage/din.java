package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class din {
    public static final dio a() {
        if (dhm.a()) {
            return Build.VERSION.SDK_INT == 28 ? diq.a : dis.a;
        }
        throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
    }
}
