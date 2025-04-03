package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ardw implements ardy {
    public final ardr a;

    public ardw(ardr ardrVar) {
        this.a = ardrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ardw) && ffkj.e(this.a, ((ardw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HostUnavailable(unavailabilityReason=" + this.a + ")";
    }
}
