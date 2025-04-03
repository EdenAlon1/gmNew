package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class glp {
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
    public final long m;

    public glp(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
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
        this.m = j13;
    }

    public final glp a(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        return new glp(j != 16 ? j : this.a, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d, j5 != 16 ? j5 : this.e, j6 != 16 ? j6 : this.f, j7 != 16 ? j7 : this.g, j8 != 16 ? j8 : this.h, j9 != 16 ? j9 : this.i, j10 != 16 ? j10 : this.j, j11 != 16 ? j11 : this.k, j12 != 16 ? j12 : this.l, j13 != 16 ? j13 : this.m);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof glp)) {
            return false;
        }
        long j = this.a;
        glp glpVar = (glp) obj;
        long j2 = glpVar.a;
        long j3 = ibw.a;
        return ffcp.a(j, j2) && ffcp.a(this.b, glpVar.b) && ffcp.a(this.c, glpVar.c) && ffcp.a(this.d, glpVar.d) && ffcp.a(this.e, glpVar.e) && ffcp.a(this.f, glpVar.f) && ffcp.a(this.g, glpVar.g) && ffcp.a(this.h, glpVar.h) && ffcp.a(this.i, glpVar.i) && ffcp.a(this.j, glpVar.j) && ffcp.a(this.k, glpVar.k) && ffcp.a(this.l, glpVar.l) && ffcp.a(this.m, glpVar.m);
    }

    public final int hashCode() {
        long j = ibw.a;
        int a = ffco.a(this.a);
        long j2 = this.m;
        long j3 = this.l;
        long j4 = this.k;
        long j5 = this.j;
        long j6 = this.i;
        long j7 = this.h;
        long j8 = this.g;
        long j9 = this.f;
        long j10 = this.e;
        long j11 = this.d;
        return (((((((((((((((((((((((a * 31) + ffco.a(this.b)) * 31) + ffco.a(this.c)) * 31) + ffco.a(j11)) * 31) + ffco.a(j10)) * 31) + ffco.a(j9)) * 31) + ffco.a(j8)) * 31) + ffco.a(j7)) * 31) + ffco.a(j6)) * 31) + ffco.a(j5)) * 31) + ffco.a(j4)) * 31) + ffco.a(j3)) * 31) + ffco.a(j2);
    }
}
