package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwd {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public fwd(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final long a(boolean z) {
        return z ? this.a : this.c;
    }

    public final long b(boolean z) {
        return z ? this.b : this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof fwd)) {
            return false;
        }
        long j = this.a;
        fwd fwdVar = (fwd) obj;
        long j2 = fwdVar.a;
        long j3 = ibw.a;
        return ffcp.a(j, j2) && ffcp.a(this.b, fwdVar.b) && ffcp.a(this.c, fwdVar.c) && ffcp.a(this.d, fwdVar.d);
    }

    public final int hashCode() {
        long j = ibw.a;
        int a = ffco.a(this.a);
        long j2 = this.d;
        return (((((a * 31) + ffco.a(this.b)) * 31) + ffco.a(this.c)) * 31) + ffco.a(j2);
    }
}
