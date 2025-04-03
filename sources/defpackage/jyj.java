package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class jyj {
    public final int a;

    public static String a(int i) {
        return b(i, 1) ? "Left" : b(i, 2) ? "Right" : b(i, 3) ? "Center" : b(i, 4) ? "Justify" : b(i, 5) ? "Start" : b(i, 6) ? "End" : b(i, Integer.MIN_VALUE) ? "Unspecified" : "Invalid";
    }

    public static final boolean b(int i, int i2) {
        return i == i2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof jyj) && this.a == ((jyj) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a(this.a);
    }
}
