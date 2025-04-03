package defpackage;

import android.content.res.Resources;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaxq {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    public eaxq(Resources resources) {
        this.a = resources.getDimensionPixelSize(R.dimen.og_apd_min_avatar_size_for_large_ring);
        this.b = resources.getDimensionPixelSize(R.dimen.og_apd_min_avatar_size_for_legacy_large_ring);
        this.d = resources.getDimensionPixelSize(R.dimen.og_apd_legacy_large_ring_width);
        this.c = resources.getDimensionPixelSize(R.dimen.og_apd_large_ring_width);
        this.e = resources.getDimensionPixelSize(R.dimen.og_apd_small_ring_width);
    }

    private final int e(int i, int i2) {
        return i >= this.b ? this.d : i >= i2 ? this.c : this.e;
    }

    public final int a(int i) {
        return (i - (d(i) * 4)) - 2;
    }

    public final int b(int i) {
        return i + (c(i) * 4) + 2;
    }

    public final int c(int i) {
        return e(i, this.a);
    }

    final int d(int i) {
        return e(i, b(this.a));
    }
}
