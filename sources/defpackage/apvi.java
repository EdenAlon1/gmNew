package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apvi {
    public final long a;
    public final long b;

    public apvi(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apvi)) {
            return false;
        }
        apvi apviVar = (apvi) obj;
        return this.a == apviVar.a && this.b == apviVar.b;
    }

    public final int hashCode() {
        return (apvh.a(this.a) * 31) + apvh.a(this.b);
    }

    public final String toString() {
        return "PlaceholdersCount(itemsBefore=" + this.a + ", itemsAfter=" + this.b + ")";
    }
}
