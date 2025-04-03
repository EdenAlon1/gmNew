package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nei {
    public final neh a;
    public final ndu b;
    public final int c;
    public final int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public long[] l;
    public int[] m;
    private final long n;

    public nei(int i, neh nehVar, ndu nduVar) {
        this.a = nehVar;
        int b = nehVar.b();
        boolean z = true;
        if (b != 1) {
            if (b == 2) {
                b = 2;
            } else {
                z = false;
            }
        }
        lti.a(z);
        this.c = d(i, b == 2 ? 1667497984 : 1651965952);
        this.n = nehVar.c();
        this.b = nduVar;
        this.d = b == 2 ? d(i, 1650720768) : -1;
        this.k = -1L;
        this.l = new long[512];
        this.m = new int[512];
        this.e = nehVar.d;
    }

    private static int d(int i, int i2) {
        return (((i % 10) + 48) << 8) | ((i / 10) + 48) | i2;
    }

    private final ndo e(int i) {
        return new ndo(this.m[i] * b(), this.l[i]);
    }

    public final long a(int i) {
        return (this.n * i) / this.e;
    }

    public final long b() {
        return a(1);
    }

    public final ndl c(long j) {
        if (this.j == 0) {
            ndo ndoVar = new ndo(0L, this.k);
            return new ndl(ndoVar, ndoVar);
        }
        int b = (int) (j / b());
        int b2 = lvf.b(this.m, b, true, true);
        if (this.m[b2] == b) {
            ndo e = e(b2);
            return new ndl(e, e);
        }
        ndo e2 = e(b2);
        int i = b2 + 1;
        return i < this.l.length ? new ndl(e2, e(i)) : new ndl(e2, e2);
    }
}
