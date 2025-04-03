package defpackage;

import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mzz {
    public static void a(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            luj.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }
}
