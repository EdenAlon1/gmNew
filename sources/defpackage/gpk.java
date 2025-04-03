package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpk {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    private final long m;
    private final long n;
    private final long o;
    private final long p;

    public gpk(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.m = j4;
        this.d = j5;
        this.e = j6;
        this.f = j7;
        this.n = j8;
        this.g = j9;
        this.h = j10;
        this.i = j11;
        this.o = j12;
        this.j = j13;
        this.k = j14;
        this.l = j15;
        this.p = j16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof gpk)) {
            return false;
        }
        long j = this.a;
        gpk gpkVar = (gpk) obj;
        long j2 = gpkVar.a;
        long j3 = ibw.a;
        return ffcp.a(j, j2) && ffcp.a(this.b, gpkVar.b) && ffcp.a(this.c, gpkVar.c) && ffcp.a(this.m, gpkVar.m) && ffcp.a(this.d, gpkVar.d) && ffcp.a(this.e, gpkVar.e) && ffcp.a(this.f, gpkVar.f) && ffcp.a(this.n, gpkVar.n) && ffcp.a(this.g, gpkVar.g) && ffcp.a(this.h, gpkVar.h) && ffcp.a(this.i, gpkVar.i) && ffcp.a(this.o, gpkVar.o) && ffcp.a(this.j, gpkVar.j) && ffcp.a(this.k, gpkVar.k) && ffcp.a(this.l, gpkVar.l) && ffcp.a(this.p, gpkVar.p);
    }

    public final int hashCode() {
        long j = ibw.a;
        int a = ffco.a(this.a);
        long j2 = this.p;
        long j3 = this.l;
        long j4 = this.k;
        long j5 = this.j;
        long j6 = this.o;
        long j7 = this.i;
        long j8 = this.h;
        long j9 = this.g;
        long j10 = this.n;
        long j11 = this.f;
        long j12 = this.e;
        long j13 = this.d;
        long j14 = this.m;
        return (((((((((((((((((((((((((((((a * 31) + ffco.a(this.b)) * 31) + ffco.a(this.c)) * 31) + ffco.a(j14)) * 31) + ffco.a(j13)) * 31) + ffco.a(j12)) * 31) + ffco.a(j11)) * 31) + ffco.a(j10)) * 31) + ffco.a(j9)) * 31) + ffco.a(j8)) * 31) + ffco.a(j7)) * 31) + ffco.a(j6)) * 31) + ffco.a(j5)) * 31) + ffco.a(j4)) * 31) + ffco.a(j3)) * 31) + ffco.a(j2);
    }
}
