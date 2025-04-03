package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class phb {
    public static final void a(int i) {
        if ((i >>> 24) != 255) {
            throw new IllegalArgumentException("Divider color must be opaque. Got: ".concat(String.valueOf(Integer.toHexString(i))));
        }
    }

    public static final void b(int i) {
        if (i != -1 && i < 0) {
            throw new IllegalArgumentException(a.h(i, "widthDp must be greater than or equal to 0 or WIDTH_SYSTEM_DEFAULT. Got: "));
        }
    }
}
