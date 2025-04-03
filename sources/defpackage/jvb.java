package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class jvb {
    public final int a;

    public static String a(int i) {
        return b(i, 0) ? "Unspecified" : b(i, 1) ? "Text" : b(i, 2) ? "Ascii" : b(i, 3) ? "Number" : b(i, 4) ? "Phone" : b(i, 5) ? "Uri" : b(i, 6) ? "Email" : b(i, 7) ? "Password" : b(i, 8) ? "NumberPassword" : b(i, 9) ? "Decimal" : "Invalid";
    }

    public static final boolean b(int i, int i2) {
        return i == i2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof jvb) && this.a == ((jvb) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a(this.a);
    }
}
