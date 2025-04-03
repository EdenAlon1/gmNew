package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class jyl {
    public final int a;

    public static String a(int i) {
        return b(i, 1) ? "Ltr" : b(i, 2) ? "Rtl" : b(i, 3) ? "Content" : b(i, 4) ? "ContentOrLtr" : b(i, 5) ? "ContentOrRtl" : b(i, Integer.MIN_VALUE) ? "Unspecified" : "Invalid";
    }

    public static final boolean b(int i, int i2) {
        return i == i2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof jyl) && this.a == ((jyl) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a(this.a);
    }
}
