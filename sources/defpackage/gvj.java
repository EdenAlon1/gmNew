package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvj {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public gvj(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof gvj)) {
            return false;
        }
        long j = this.a;
        gvj gvjVar = (gvj) obj;
        long j2 = gvjVar.a;
        long j3 = ibw.a;
        return ffcp.a(j, j2) && ffcp.a(this.b, gvjVar.b) && ffcp.a(this.c, gvjVar.c) && ffcp.a(this.d, gvjVar.d) && ffcp.a(this.e, gvjVar.e) && ffcp.a(this.f, gvjVar.f);
    }

    public final int hashCode() {
        long j = ibw.a;
        int a = ffco.a(this.a);
        long j2 = this.f;
        long j3 = this.e;
        long j4 = this.d;
        return (((((((((a * 31) + ffco.a(this.b)) * 31) + ffco.a(this.c)) * 31) + ffco.a(j4)) * 31) + ffco.a(j3)) * 31) + ffco.a(j2);
    }
}
