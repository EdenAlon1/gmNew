package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwq {
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

    public fwq(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
        this.k = j11;
        this.l = j12;
    }

    public static final cxt a(jlc jlcVar, hfd hfdVar) {
        if (jlcVar == jlc.b) {
            hfdVar.v(657546094);
            cyq a = gjb.a(5, hfdVar);
            ((hfm) hfdVar).Z();
            return a;
        }
        hfdVar.v(657639404);
        cyq a2 = gjb.a(4, hfdVar);
        ((hfm) hfdVar).Z();
        return a2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof fwq)) {
            return false;
        }
        long j = this.a;
        fwq fwqVar = (fwq) obj;
        long j2 = fwqVar.a;
        long j3 = ibw.a;
        return ffcp.a(j, j2) && ffcp.a(this.b, fwqVar.b) && ffcp.a(this.c, fwqVar.c) && ffcp.a(this.d, fwqVar.d) && ffcp.a(this.e, fwqVar.e) && ffcp.a(this.f, fwqVar.f) && ffcp.a(this.g, fwqVar.g) && ffcp.a(this.h, fwqVar.h) && ffcp.a(this.i, fwqVar.i) && ffcp.a(this.j, fwqVar.j) && ffcp.a(this.k, fwqVar.k) && ffcp.a(this.l, fwqVar.l);
    }

    public final int hashCode() {
        long j = ibw.a;
        int a = ffco.a(this.a);
        long j2 = this.l;
        long j3 = this.k;
        long j4 = this.j;
        long j5 = this.i;
        long j6 = this.h;
        long j7 = this.g;
        long j8 = this.f;
        long j9 = this.e;
        long j10 = this.d;
        return (((((((((((((((((((((a * 31) + ffco.a(this.b)) * 31) + ffco.a(this.c)) * 31) + ffco.a(j10)) * 31) + ffco.a(j9)) * 31) + ffco.a(j8)) * 31) + ffco.a(j7)) * 31) + ffco.a(j6)) * 31) + ffco.a(j5)) * 31) + ffco.a(j4)) * 31) + ffco.a(j3)) * 31) + ffco.a(j2);
    }
}
