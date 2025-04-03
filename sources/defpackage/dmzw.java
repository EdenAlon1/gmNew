package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmzw {
    private final boolean a;

    public dmzw(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dmzw) && this.a == ((dmzw) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "Flags(enableSwipeToShowTimestamps=" + this.a + ")";
    }

    public dmzw() {
        this(false);
    }
}
