package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffib {
    public static final int a(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                return i2 - b(i2, i, i3);
            }
        } else {
            if (i3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i > i2) {
                return i2 + b(i, i2, -i3);
            }
        }
        return i2;
    }

    private static final int b(int i, int i2, int i3) {
        return c(c(i, i3) - c(i2, i3), i3);
    }

    private static final int c(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }
}
