package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class phq {
    public static final phq a = new phq(0);
    public static final phq b = new phq(1);
    private final int c;

    private phq(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof phq) && this.c == ((phq) obj).c;
    }

    public final int hashCode() {
        return this.c * 31;
    }

    public final String toString() {
        return this.c != 0 ? "JUMP_CUT" : "DEFAULT";
    }
}
