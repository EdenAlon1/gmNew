package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class ici {
    public final int a;

    public static boolean a(int i, Object obj) {
        return (obj instanceof ici) && i == ((ici) obj).a;
    }

    public static final boolean b(int i, int i2) {
        return i == i2;
    }

    public final boolean equals(Object obj) {
        return a(this.a, obj);
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        return b(i, 0) ? "Argb8888" : b(i, 1) ? "Alpha8" : b(i, 2) ? "Rgb565" : b(i, 3) ? "F16" : b(i, 4) ? "Gpu" : "Unknown";
    }
}
