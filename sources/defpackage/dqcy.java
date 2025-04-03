package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqcy extends dqcz {
    public final dqcp a;

    public dqcy(dqcp dqcpVar) {
        this.a = dqcpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dqcy) && ffkj.e(this.a, ((dqcy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Spanned(gridSizeLookup=" + this.a + ")";
    }
}
