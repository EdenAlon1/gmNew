package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class idp {
    public static String a(int i) {
        return b(i, 0) ? "Clamp" : b(i, 1) ? "Repeated" : b(i, 2) ? "Mirror" : b(i, 3) ? "Decal" : "Unknown";
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
