package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class jss {
    public final int a;

    public static String a(int i) {
        return b(i, 0) ? "Normal" : b(i, 1) ? "Italic" : "Invalid";
    }

    public static final boolean b(int i, int i2) {
        return i == i2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof jss) && this.a == ((jss) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a(this.a);
    }
}
