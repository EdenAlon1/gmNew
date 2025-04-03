package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class jst {
    public final int a;

    public static String a(int i) {
        return b(i, 0) ? "None" : b(i, 1) ? "Weight" : b(i, 2) ? "Style" : b(i, 65535) ? "All" : "Invalid";
    }

    public static final boolean b(int i, int i2) {
        return i == i2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof jst) && this.a == ((jst) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a(this.a);
    }
}
