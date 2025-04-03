package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class jjh {
    public final int a;

    public static final boolean a(int i, int i2) {
        return i == i2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof jjh) && this.a == ((jjh) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        return a(i, 0) ? "Polite" : a(i, 1) ? "Assertive" : "Unknown";
    }
}
