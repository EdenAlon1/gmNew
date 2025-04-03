package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class jsr {
    public static String a(int i) {
        if (b(i, 0)) {
            return "Blocking";
        }
        if (b(i, 1)) {
            return "Optional";
        }
        if (b(i, 2)) {
            return "Async";
        }
        return "Invalid(value=" + i + ')';
    }

    public static final boolean b(int i, int i2) {
        return i == i2;
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
