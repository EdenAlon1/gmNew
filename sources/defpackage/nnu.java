package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nnu implements non {
    public int b;
    private final nnb c;
    private int e;
    private lvc f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int j;
    private boolean k;
    private final luu d = new luu(new byte[10]);
    public int a = 0;

    public nnu(nnb nnbVar) {
        this.c = nnbVar;
    }

    private final void d(int i) {
        this.a = i;
        this.e = 0;
    }

    private final boolean e(luv luvVar, byte[] bArr, int i) {
        int min = Math.min(luvVar.b(), i - this.e);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            luvVar.L(min);
        } else {
            luvVar.F(bArr, this.e, min);
        }
        int i2 = this.e + min;
        this.e = i2;
        return i2 == i;
    }

    @Override // defpackage.non
    public final void a(luv luvVar, int i) {
        int i2;
        int i3;
        int i4;
        long j;
        long j2;
        lti.g(this.f);
        int i5 = -1;
        int i6 = 2;
        if ((i & 1) != 0) {
            int i7 = this.a;
            if (i7 != 0 && i7 != 1) {
                if (i7 != 2) {
                    int i8 = this.b;
                    if (i8 != -1) {
                        luj.f("PesReader", a.f(i8, "Unexpected start indicator: expected ", " more bytes"));
                    }
                    this.c.c(luvVar.c == 0);
                } else {
                    luj.f("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            d(1);
        }
        int i9 = i;
        while (luvVar.b() > 0) {
            int i10 = this.a;
            if (i10 == 0) {
                i2 = i6;
                i3 = i5;
                luvVar.L(luvVar.b());
            } else if (i10 != 1) {
                if (i10 != i6) {
                    int b = luvVar.b();
                    int i11 = this.b;
                    int i12 = i11 == i5 ? 0 : b - i11;
                    if (i12 > 0) {
                        b -= i12;
                        luvVar.J(luvVar.b + b);
                    }
                    this.c.a(luvVar);
                    int i13 = this.b;
                    if (i13 != i5) {
                        int i14 = i13 - b;
                        this.b = i14;
                        if (i14 == 0) {
                            this.c.c(false);
                            d(1);
                        }
                    }
                } else {
                    if (e(luvVar, this.d.a, Math.min(10, this.j)) && e(luvVar, null, this.j)) {
                        this.d.l(0);
                        if (this.g) {
                            this.d.n(4);
                            long d = this.d.d(3);
                            this.d.n(1);
                            int d2 = this.d.d(15) << 15;
                            this.d.n(1);
                            long d3 = this.d.d(15);
                            this.d.n(1);
                            if (this.i || !this.h) {
                                j2 = d;
                            } else {
                                this.d.n(4);
                                j2 = d;
                                this.d.n(1);
                                int d4 = this.d.d(15) << 15;
                                this.d.n(1);
                                long d5 = this.d.d(15);
                                this.d.n(1);
                                this.f.b((this.d.d(3) << 30) | d4 | d5);
                                this.i = true;
                            }
                            j = this.f.b((j2 << 30) | d2 | d3);
                        } else {
                            j = -9223372036854775807L;
                        }
                        i9 |= true != this.k ? 0 : 4;
                        this.c.d(j, i9);
                        d(3);
                        i5 = -1;
                        i6 = 2;
                    }
                }
                i2 = i6;
                i3 = i5;
            } else if (e(luvVar, this.d.a, 9)) {
                this.d.l(0);
                int d6 = this.d.d(24);
                if (d6 != 1) {
                    luj.f("PesReader", a.h(d6, "Unexpected start code prefix: "));
                    this.b = -1;
                    i3 = -1;
                    i4 = 0;
                    i2 = 2;
                } else {
                    this.d.n(8);
                    luu luuVar = this.d;
                    int d7 = luuVar.d(16);
                    luuVar.n(5);
                    this.k = this.d.p();
                    i2 = 2;
                    this.d.n(2);
                    this.g = this.d.p();
                    this.h = this.d.p();
                    this.d.n(6);
                    int d8 = this.d.d(8);
                    this.j = d8;
                    i3 = -1;
                    if (d7 == 0) {
                        this.b = -1;
                    } else {
                        int i15 = (d7 - 3) - d8;
                        this.b = i15;
                        if (i15 < 0) {
                            luj.f("PesReader", a.h(i15, "Found negative packet payload size: "));
                            this.b = -1;
                        }
                    }
                    i4 = 2;
                }
                d(i4);
            } else {
                i3 = -1;
                i2 = 2;
            }
            i5 = i3;
            i6 = i2;
        }
    }

    @Override // defpackage.non
    public final void b(lvc lvcVar, ncr ncrVar, nom nomVar) {
        this.f = lvcVar;
        this.c.b(ncrVar, nomVar);
    }

    @Override // defpackage.non
    public final void c() {
        this.a = 0;
        this.e = 0;
        this.i = false;
        this.c.e();
    }
}
