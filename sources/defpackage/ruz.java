package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ruz {
    public static final /* synthetic */ int a = 0;
    private static final ffbz b = ffca.b(3, new ffix() { // from class: ruy
        @Override // defpackage.ffix
        public final Object invoke() {
            int i = ruz.a;
            return new Handler(Looper.getMainLooper());
        }
    });

    public static final long a(Drawable drawable) {
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return 9205357640488583168L;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        return (Float.floatToRawIntBits(intrinsicWidth) << 32) | (Float.floatToRawIntBits(intrinsicHeight) & 4294967295L);
    }

    public static final Handler b() {
        return (Handler) b.a();
    }
}
