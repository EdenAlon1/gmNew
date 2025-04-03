package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvo {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public fvo(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final fvo a(long j, long j2, long j3, long j4) {
        if (j == 16) {
            j = this.a;
        }
        return new fvo(j, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof fvo)) {
            return false;
        }
        long j = this.a;
        fvo fvoVar = (fvo) obj;
        long j2 = fvoVar.a;
        long j3 = ibw.a;
        return ffcp.a(j, j2) && ffcp.a(this.b, fvoVar.b) && ffcp.a(this.c, fvoVar.c) && ffcp.a(this.d, fvoVar.d);
    }

    public final int hashCode() {
        long j = ibw.a;
        int a = ffco.a(this.a);
        long j2 = this.d;
        return (((((a * 31) + ffco.a(this.b)) * 31) + ffco.a(this.c)) * 31) + ffco.a(j2);
    }
}
