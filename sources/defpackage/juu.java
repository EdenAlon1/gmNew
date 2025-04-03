package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class juu {
    public final int a;

    public static String a(int i) {
        return b(i, -1) ? "Unspecified" : b(i, 0) ? "None" : b(i, 1) ? "Default" : b(i, 2) ? "Go" : b(i, 3) ? "Search" : b(i, 4) ? "Send" : b(i, 5) ? "Previous" : b(i, 6) ? "Next" : b(i, 7) ? "Done" : "Invalid";
    }

    public static final boolean b(int i, int i2) {
        return i == i2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof juu) && this.a == ((juu) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a(this.a);
    }
}
