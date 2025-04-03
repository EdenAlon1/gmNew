package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class jxy {
    public final int a;

    public static String a(int i) {
        return b(i, 1) ? "Hyphens.None" : b(i, 2) ? "Hyphens.Auto" : b(i, Integer.MIN_VALUE) ? "Hyphens.Unspecified" : "Invalid";
    }

    public static final boolean b(int i, int i2) {
        return i == i2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof jxy) && this.a == ((jxy) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a(this.a);
    }
}
