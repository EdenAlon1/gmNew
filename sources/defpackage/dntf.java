package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dntf {
    public final int a;

    public dntf(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dntf) && this.a == ((dntf) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Flags(groupMessageMonogramSizeDp=" + this.a + ")";
    }

    public dntf() {
        this(24);
    }
}
