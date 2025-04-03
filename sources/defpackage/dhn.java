package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class dhn {
    public final int a = 0;

    public static final boolean a(int i) {
        return i == 0;
    }

    public static String b() {
        if (a(0)) {
            return "Immediately";
        }
        if (a(1)) {
            return "WhileFocused";
        }
        throw new IllegalStateException("invalid value: 0");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dhn)) {
            return false;
        }
        int i = ((dhn) obj).a;
        return true;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return b();
    }
}
