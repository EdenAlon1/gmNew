package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class donh {
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

    public donh(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11) {
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof donh)) {
            return false;
        }
        donh donhVar = (donh) obj;
        long j = this.a;
        long j2 = donhVar.a;
        long j3 = ibw.a;
        return ffcp.a(j, j2) && ffcp.a(this.b, donhVar.b) && ffcp.a(this.c, donhVar.c) && ffcp.a(this.d, donhVar.d) && ffcp.a(this.e, donhVar.e) && ffcp.a(this.f, donhVar.f) && ffcp.a(this.g, donhVar.g) && ffcp.a(this.h, donhVar.h) && ffcp.a(this.i, donhVar.i) && ffcp.a(this.j, donhVar.j) && ffcp.a(this.k, donhVar.k);
    }

    public final int hashCode() {
        long j = ibw.a;
        int a = ffco.a(this.a);
        long j2 = this.k;
        long j3 = this.j;
        long j4 = this.i;
        long j5 = this.h;
        long j6 = this.g;
        long j7 = this.f;
        long j8 = this.e;
        long j9 = this.d;
        return (((((((((((((((((((a * 31) + ffco.a(this.b)) * 31) + ffco.a(this.c)) * 31) + ffco.a(j9)) * 31) + ffco.a(j8)) * 31) + ffco.a(j7)) * 31) + ffco.a(j6)) * 31) + ffco.a(j5)) * 31) + ffco.a(j4)) * 31) + ffco.a(j3)) * 31) + ffco.a(j2);
    }

    public final String toString() {
        long j = this.k;
        long j2 = this.j;
        long j3 = this.i;
        long j4 = this.h;
        long j5 = this.g;
        long j6 = this.f;
        long j7 = this.e;
        long j8 = this.d;
        long j9 = this.c;
        long j10 = this.b;
        return "AbcBubbleColors(incomingXms=" + ibw.g(this.a) + ", onIncomingXms=" + ibw.g(j10) + ", outgoingXms=" + ibw.g(j9) + ", onOutgoingXms=" + ibw.g(j8) + ", incomingRcs=" + ibw.g(j7) + ", onIncomingRcs=" + ibw.g(j6) + ", outgoingRcsStart=" + ibw.g(j5) + ", outgoingRcsEnd=" + ibw.g(j4) + ", onOutgoingRcs=" + ibw.g(j3) + ", selected=" + ibw.g(j2) + ", onSelected=" + ibw.g(j) + ")";
    }
}
