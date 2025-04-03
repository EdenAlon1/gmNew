package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class phw {
    public static final phw a = new phw(0);
    public static final phw b = new phw(1);
    public static final phw c = new phw(2);
    public static final phw d = new phw(3);
    public final int e;

    public phw(int i) {
        this.e = i;
        if (i < 0 || i >= 4) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof phw) && this.e == ((phw) obj).e;
    }

    public final int hashCode() {
        return this.e;
    }

    public final String toString() {
        int i = this.e;
        if (i == 0) {
            return "left";
        }
        if (i == 1) {
            return "top";
        }
        if (i == 2) {
            return "right";
        }
        if (i == 3) {
            return "bottom";
        }
        return "unknown position:" + this.e;
    }
}
