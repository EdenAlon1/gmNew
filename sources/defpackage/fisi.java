package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
class fisi extends fitg {
    private final fise a;
    private final int c;
    private final int d;

    public fisi(fise fiseVar) {
        super(firf.h, 2629746000L);
        this.a = fiseVar;
        this.c = 12;
        this.d = 2;
    }

    @Override // defpackage.fisz, defpackage.fird
    public final int a(long j) {
        fise fiseVar = this.a;
        return fiseVar.T(j, fiseVar.Y(j));
    }

    @Override // defpackage.fisz, defpackage.fird
    public final int c() {
        return this.c;
    }

    @Override // defpackage.fird
    public final int d() {
        return 1;
    }

    @Override // defpackage.fisz, defpackage.fird
    public final long e(long j, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (i == 0) {
            return j;
        }
        long S = this.a.S(j);
        int Y = this.a.Y(j);
        int T = this.a.T(j, Y);
        int i7 = T - 1;
        int i8 = i7 + i;
        if (i8 < 0) {
            if (Math.signum(this.c + i) == Math.signum(i)) {
                i5 = Y - 1;
                i6 = i + this.c;
            } else {
                i5 = Y + 1;
                i6 = i - this.c;
            }
            int i9 = i5;
            i8 = i6 + i7;
            i2 = i9;
        } else {
            i2 = Y;
        }
        if (i8 >= 0) {
            int i10 = this.c;
            i3 = i2 + (i8 / i10);
            i4 = (i8 % i10) + 1;
        } else {
            int i11 = this.c;
            i3 = i2 + (i8 / i11);
            int i12 = i3 - 1;
            int abs = Math.abs(i8) % i11;
            if (abs == 0) {
                abs = this.c;
            }
            i4 = (this.c - abs) + 1;
            if (i4 != 1) {
                i3 = i12;
            }
        }
        int N = this.a.N(j, Y, T);
        int R = this.a.R(i3, i4);
        if (N > R) {
            N = R;
        }
        return this.a.ad(i3, i4, N) + S;
    }

    @Override // defpackage.fisz, defpackage.fird
    public final long f(long j) {
        return j - g(j);
    }

    @Override // defpackage.fisz, defpackage.fird
    public final long g(long j) {
        fise fiseVar = this.a;
        int Y = fiseVar.Y(j);
        int T = fiseVar.T(j, Y);
        fise fiseVar2 = this.a;
        return fiseVar2.ac(Y) + fiseVar2.ab(Y, T);
    }

    @Override // defpackage.fisz, defpackage.fird
    public final long h(long j, int i) {
        fite.c(this, i, 1, this.c);
        fise fiseVar = this.a;
        int Y = fiseVar.Y(j);
        int N = fiseVar.N(j, Y, fiseVar.T(j, Y));
        int R = this.a.R(Y, i);
        if (N > R) {
            N = R;
        }
        return this.a.ad(Y, i, N) + this.a.S(j);
    }

    @Override // defpackage.fisz, defpackage.fird
    public final firl r() {
        return this.a.c;
    }

    @Override // defpackage.fird
    public final firl s() {
        return this.a.g;
    }

    @Override // defpackage.fisz, defpackage.fird
    public final boolean t(long j) {
        fise fiseVar = this.a;
        int Y = fiseVar.Y(j);
        return fiseVar.ag(Y) && this.a.T(j, Y) == this.d;
    }

    @Override // defpackage.fitg
    public final long x(long j, long j2) {
        long j3;
        long j4;
        int i = (int) j2;
        if (i == j2) {
            return e(j, i);
        }
        long S = this.a.S(j);
        int Y = this.a.Y(j);
        long j5 = Y;
        int T = this.a.T(j, Y);
        long j6 = (T - 1) + j2;
        if (j6 >= 0) {
            long j7 = this.c;
            j3 = j5 + (j6 / j7);
            j4 = (j6 % j7) + 1;
        } else {
            long j8 = this.c;
            j3 = j5 + (j6 / j8);
            int abs = (int) (Math.abs(j6) % j8);
            if (abs == 0) {
                abs = this.c;
            }
            long j9 = (-1) + j3;
            long j10 = (this.c - abs) + 1;
            if (j10 != 1) {
                j3 = j9;
            }
            j4 = j10;
        }
        if (j3 < -292275054 || j3 > 292278993) {
            throw new IllegalArgumentException(a.s(j2, "Magnitude of add amount is too large: "));
        }
        int i2 = (int) j4;
        int N = this.a.N(j, Y, T);
        int i3 = (int) j3;
        int R = this.a.R(i3, i2);
        if (N > R) {
            N = R;
        }
        return this.a.ad(i3, i2, N) + S;
    }

    @Override // defpackage.fird
    public final void v() {
    }
}
