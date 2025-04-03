package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejsp extends ejsr {
    public final ejqs a;

    public ejsp(ejqs ejqsVar) {
        this.a = ejqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ejsp) && ffkj.e(this.a, ((ejsp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Complete(outcome=" + this.a + ")";
    }
}
