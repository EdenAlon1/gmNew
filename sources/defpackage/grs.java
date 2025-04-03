package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class grs {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    private final long h;
    private final long i;
    private final long j;
    private final long k;
    private final long l;
    private final long m;
    private final long n;

    public grs(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14) {
        this.a = j;
        this.b = j2;
        this.h = j3;
        this.c = j4;
        this.i = j5;
        this.j = j6;
        this.d = j7;
        this.e = j8;
        this.f = j9;
        this.g = j10;
        this.k = j11;
        this.l = j12;
        this.m = j13;
        this.n = j14;
    }

    public final long a(boolean z) {
        return z ? this.i : this.j;
    }

    public final long b(boolean z) {
        return z ? this.k : this.l;
    }

    public final long c(boolean z) {
        return z ? this.m : this.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        grs grsVar = (grs) obj;
        long j = this.a;
        long j2 = grsVar.a;
        long j3 = ibw.a;
        return ffcp.a(j, j2) && ffcp.a(this.b, grsVar.b) && ffcp.a(this.h, grsVar.h) && ffcp.a(this.c, grsVar.c) && ffcp.a(this.d, grsVar.d) && ffcp.a(this.e, grsVar.e) && ffcp.a(this.f, grsVar.f) && ffcp.a(this.g, grsVar.g) && ffcp.a(this.k, grsVar.k) && ffcp.a(this.l, grsVar.l) && ffcp.a(this.m, grsVar.m) && ffcp.a(this.n, grsVar.n);
    }

    public final int hashCode() {
        long j = ibw.a;
        int a = ffco.a(this.a);
        long j2 = this.n;
        long j3 = this.m;
        long j4 = this.l;
        long j5 = this.k;
        long j6 = this.g;
        long j7 = this.f;
        long j8 = this.e;
        long j9 = this.d;
        long j10 = this.c;
        return (((((((((((((((((((((a * 31) + ffco.a(this.b)) * 31) + ffco.a(this.h)) * 31) + ffco.a(j10)) * 31) + ffco.a(j9)) * 31) + ffco.a(j8)) * 31) + ffco.a(j7)) * 31) + ffco.a(j6)) * 31) + ffco.a(j5)) * 31) + ffco.a(j4)) * 31) + ffco.a(j3)) * 31) + ffco.a(j2);
    }
}
