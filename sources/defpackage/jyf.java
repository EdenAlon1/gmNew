package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class jyf {
    public final int a;

    public static String a(int i) {
        return "Mode(value=" + i + ')';
    }

    public static final boolean b(int i, int i2) {
        return i == i2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof jyf) && this.a == ((jyf) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a(this.a);
    }
}
