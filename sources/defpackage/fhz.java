package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fhz {
    public final long a;
    public final long b;

    public fhz(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fhz)) {
            return false;
        }
        long j = this.a;
        fhz fhzVar = (fhz) obj;
        long j2 = fhzVar.a;
        long j3 = ibw.a;
        return ffcp.a(j, j2) && ffcp.a(this.b, fhzVar.b);
    }

    public final int hashCode() {
        long j = ibw.a;
        return (ffco.a(this.a) * 31) + ffco.a(this.b);
    }

    public final String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) ibw.g(this.a)) + ", selectionBackgroundColor=" + ((Object) ibw.g(this.b)) + ')';
    }
}
