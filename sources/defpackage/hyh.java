package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class hyh {
    public final int a;

    public static String a(int i) {
        return b(i, 1) ? "Next" : b(i, 2) ? "Previous" : b(i, 3) ? "Left" : b(i, 4) ? "Right" : b(i, 5) ? "Up" : b(i, 6) ? "Down" : b(i, 7) ? "Enter" : b(i, 8) ? "Exit" : "Invalid FocusDirection";
    }

    public static final boolean b(int i, int i2) {
        return i == i2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof hyh) && this.a == ((hyh) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a(this.a);
    }
}
