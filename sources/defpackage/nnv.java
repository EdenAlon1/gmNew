package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nnv implements nbz {
    private final lvc a;
    private final luv b = new luv();

    public nnv(lvc lvcVar) {
        this.a = lvcVar;
    }

    @Override // defpackage.nbz
    public final nby a(ncp ncpVar, long j) {
        int g;
        nce nceVar = (nce) ncpVar;
        long j2 = nceVar.a;
        long j3 = nceVar.b;
        int min = (int) Math.min(20000L, j2 - j3);
        this.b.G(min);
        ncpVar.i(this.b.a, 0, min);
        int i = -1;
        int i2 = -1;
        long j4 = -9223372036854775807L;
        while (true) {
            luv luvVar = this.b;
            if (luvVar.b() < 4) {
                return j4 != -9223372036854775807L ? new nby(-2, j4, j3 + i) : nby.a;
            }
            if (nnw.g(luvVar.a, luvVar.b) != 442) {
                luvVar.L(1);
            } else {
                luvVar.L(4);
                long a = nnx.a(luvVar);
                if (a != -9223372036854775807L) {
                    long b = this.a.b(a);
                    if (b > j) {
                        return j4 == -9223372036854775807L ? new nby(-1, b, j3) : new nby(0, -9223372036854775807L, j3 + i2);
                    }
                    if (100000 + b > j) {
                        return new nby(0, -9223372036854775807L, j3 + luvVar.b);
                    }
                    j4 = b;
                    i2 = luvVar.b;
                }
                int i3 = luvVar.c;
                if (luvVar.b() >= 10) {
                    luvVar.L(9);
                    int j5 = luvVar.j() & 7;
                    if (luvVar.b() >= j5) {
                        luvVar.L(j5);
                        if (luvVar.b() >= 4) {
                            if (nnw.g(luvVar.a, luvVar.b) == 443) {
                                luvVar.L(4);
                                int n = luvVar.n();
                                if (luvVar.b() < n) {
                                    luvVar.K(i3);
                                } else {
                                    luvVar.L(n);
                                }
                            }
                            while (true) {
                                if (luvVar.b() < 4 || (g = nnw.g(luvVar.a, luvVar.b)) == 442 || g == 441 || (g >>> 8) != 1) {
                                    break;
                                }
                                luvVar.L(4);
                                if (luvVar.b() < 2) {
                                    luvVar.K(i3);
                                    break;
                                }
                                luvVar.K(Math.min(luvVar.c, luvVar.b + luvVar.n()));
                            }
                        } else {
                            luvVar.K(i3);
                        }
                    } else {
                        luvVar.K(i3);
                    }
                } else {
                    luvVar.K(i3);
                }
                i = luvVar.b;
            }
        }
    }

    @Override // defpackage.nbz
    public final void b() {
        this.b.H(lvf.c);
    }
}
