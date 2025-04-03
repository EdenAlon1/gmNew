package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
class ffon extends ffom {
    public static final char c(int i) {
        if (i < 0 || i >= 10) {
            throw new IllegalArgumentException(a.f(i, "Int ", " is not a decimal digit"));
        }
        return (char) (i + 48);
    }

    public static final int d(char c) {
        int b = ffol.b(c);
        if (b >= 0) {
            return b;
        }
        throw new IllegalArgumentException(a.H(c, "Char ", " is not a decimal digit"));
    }

    public static final boolean e(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
}
