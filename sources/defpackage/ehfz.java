package defpackage;

import android.content.Context;
import android.graphics.Color;
import com.google.android.apps.messaging.R;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehfz {
    private static final int c = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    private final int d;
    private final int e;
    private final float f;

    public ehfz(boolean z, int i, int i2, int i3, float f) {
        this.a = z;
        this.d = i;
        this.e = i2;
        this.b = i3;
        this.f = f;
    }

    public final int a(int i, float f) {
        int i2;
        float min = (this.f <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int f2 = ehdr.f(kps.h(i, PrivateKeyType.INVALID), this.d, min);
        if (min > 0.0f && (i2 = this.e) != 0) {
            f2 = kps.g(kps.h(i2, c), f2);
        }
        return kps.h(f2, alpha);
    }

    public final int b(int i, float f) {
        return (this.a && kps.h(i, PrivateKeyType.INVALID) == this.b) ? a(i, f) : i;
    }

    public ehfz(Context context) {
        this(ehmp.d(context, R.attr.elevationOverlayEnabled, false), ehdr.c(context, R.attr.elevationOverlayColor, 0), ehdr.c(context, R.attr.elevationOverlayAccentColor, 0), ehdr.c(context, R.attr.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }
}
