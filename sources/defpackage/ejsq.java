package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejsq extends ejsr {
    private final ffcu a = ffcu.a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ejsq) && ffkj.e(this.a, ((ejsq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Reading(unit=" + this.a + ")";
    }
}
