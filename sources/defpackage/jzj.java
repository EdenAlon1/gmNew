package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jzj {
    public static final long a(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int min = Math.min(i3, 262142);
        int i6 = Alert.DURATION_SHOW_INDEFINITELY;
        int min2 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
        int i7 = min2 == Integer.MAX_VALUE ? min : min2;
        if (i7 >= 8191) {
            if (i7 < 32767) {
                i5 = 65534;
            } else if (i7 < 65535) {
                i5 = 32766;
            } else {
                if (i7 >= 262143) {
                    jzl.i(i7);
                    throw new ffbx();
                }
                i5 = 8190;
            }
        }
        if (i2 != Integer.MAX_VALUE) {
            i6 = Math.min(i5, i2);
        }
        return jzl.d(Math.min(i5, i), i6, min, min2);
    }

    public static final long b(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int min = Math.min(i, 262142);
        int i6 = Alert.DURATION_SHOW_INDEFINITELY;
        int min2 = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i2, 262142);
        int i7 = min2 == Integer.MAX_VALUE ? min : min2;
        if (i7 >= 8191) {
            if (i7 < 32767) {
                i5 = 65534;
            } else if (i7 < 65535) {
                i5 = 32766;
            } else {
                if (i7 >= 262143) {
                    jzl.i(i7);
                    throw new ffbx();
                }
                i5 = 8190;
            }
        }
        if (i4 != Integer.MAX_VALUE) {
            i6 = Math.min(i5, i4);
        }
        return jzl.d(min, min2, Math.min(i5, i3), i6);
    }

    public static final long c(int i, int i2) {
        if (!((i2 >= 0) & (i >= 0))) {
            jzy.a("width and height must be >= 0");
        }
        return jzl.g(i, i, i2, i2);
    }

    public static final long d(int i) {
        if (i < 0) {
            jzy.a("width must be >= 0");
        }
        return jzl.g(i, i, 0, Alert.DURATION_SHOW_INDEFINITELY);
    }
}
