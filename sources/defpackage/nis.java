package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nis {
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final lqc g;
    public final int h;
    public final long[] i;
    public final long[] j;
    public final int k;
    private final nit[] l;

    public nis(int i, int i2, long j, long j2, long j3, long j4, lqc lqcVar, int i3, nit[] nitVarArr, int i4, long[] jArr, long[] jArr2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = lqcVar;
        this.h = i3;
        this.l = nitVarArr;
        this.k = i4;
        this.i = jArr;
        this.j = jArr2;
    }

    public final nis a(lqc lqcVar) {
        return new nis(this.a, this.b, this.c, this.d, this.e, this.f, lqcVar, this.h, this.l, this.k, this.i, this.j);
    }

    public final nit b(int i) {
        return this.l[i];
    }
}
