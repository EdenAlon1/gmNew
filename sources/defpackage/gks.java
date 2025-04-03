package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gks {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public gks(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gks)) {
            return false;
        }
        long j = this.a;
        gks gksVar = (gks) obj;
        long j2 = gksVar.a;
        long j3 = ibw.a;
        return ffcp.a(j, j2) && ffcp.a(this.b, gksVar.b) && ffcp.a(this.c, gksVar.c) && ffcp.a(this.d, gksVar.d);
    }

    public final int hashCode() {
        long j = ibw.a;
        int a = ffco.a(this.a);
        long j2 = this.d;
        return (((((a * 31) + ffco.a(this.b)) * 31) + ffco.a(this.c)) * 31) + ffco.a(j2);
    }
}
