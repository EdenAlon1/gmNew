package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmm {
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

    public gmm(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
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
    }

    public final long a(boolean z, boolean z2) {
        return z ? z2 ? this.c : this.e : z2 ? this.h : this.j;
    }

    public final long b(boolean z, boolean z2) {
        return z ? z2 ? this.b : this.d : z2 ? this.g : this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof gmm)) {
            return false;
        }
        long j = this.a;
        gmm gmmVar = (gmm) obj;
        long j2 = gmmVar.a;
        long j3 = ibw.a;
        return ffcp.a(j, j2) && ffcp.a(this.b, gmmVar.b) && ffcp.a(this.c, gmmVar.c) && ffcp.a(this.d, gmmVar.d) && ffcp.a(this.e, gmmVar.e) && ffcp.a(this.f, gmmVar.f) && ffcp.a(this.g, gmmVar.g) && ffcp.a(this.h, gmmVar.h) && ffcp.a(this.i, gmmVar.i) && ffcp.a(this.j, gmmVar.j);
    }

    public final int hashCode() {
        long j = ibw.a;
        int a = ffco.a(this.a);
        long j2 = this.j;
        long j3 = this.i;
        long j4 = this.h;
        long j5 = this.g;
        long j6 = this.f;
        long j7 = this.e;
        long j8 = this.d;
        return (((((((((((((((((a * 31) + ffco.a(this.b)) * 31) + ffco.a(this.c)) * 31) + ffco.a(j8)) * 31) + ffco.a(j7)) * 31) + ffco.a(j6)) * 31) + ffco.a(j5)) * 31) + ffco.a(j4)) * 31) + ffco.a(j3)) * 31) + ffco.a(j2);
    }
}
