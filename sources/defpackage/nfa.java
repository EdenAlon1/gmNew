package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nfa implements nco {
    private ncr b;
    private int c;
    private int d;
    private int e;
    private ngk g;
    private ncp h;
    private nfd i;
    private nil j;
    private final luv a = new luv(6);
    private long f = -1;

    private final int h(ncp ncpVar) {
        this.a.G(2);
        ncpVar.i(this.a.a, 0, 2);
        return this.a.n();
    }

    private final void i() {
        ncr ncrVar = this.b;
        lti.f(ncrVar);
        ncrVar.r();
        this.b.w(new ndm(-9223372036854775807L));
        this.c = 6;
    }

    @Override // defpackage.nco
    public final int a(ncp ncpVar, ndk ndkVar) {
        String w;
        nfc a;
        int i;
        long j;
        int i2 = this.c;
        long j2 = -1;
        if (i2 == 0) {
            this.a.G(2);
            ncpVar.j(this.a.a, 0, 2);
            int n = this.a.n();
            this.d = n;
            if (n == 65498) {
                if (this.f != -1) {
                    this.c = 4;
                } else {
                    i();
                }
            } else if ((n < 65488 || n > 65497) && n != 65281) {
                this.c = 1;
            }
            return 0;
        }
        if (i2 == 1) {
            this.a.G(2);
            ncpVar.j(this.a.a, 0, 2);
            this.e = this.a.n() - 2;
            this.c = 2;
            return 0;
        }
        if (i2 != 2) {
            if (i2 != 4) {
                if (i2 != 5) {
                    if (i2 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.i == null || ncpVar != this.h) {
                    this.h = ncpVar;
                    this.i = new nfd(ncpVar, this.f);
                }
                nil nilVar = this.j;
                lti.f(nilVar);
                int a2 = nilVar.a(this.i, ndkVar);
                if (a2 == 1) {
                    ndkVar.a += this.f;
                }
                return a2;
            }
            long j3 = ((nce) ncpVar).b;
            long j4 = this.f;
            if (j3 != j4) {
                ndkVar.a = j4;
                return 1;
            }
            if (ncpVar.n(this.a.a, 0, 1, true)) {
                ncpVar.k();
                if (this.j == null) {
                    this.j = new nil(nkh.a, 8);
                }
                nfd nfdVar = new nfd(ncpVar, this.f);
                this.i = nfdVar;
                if (this.j.f(nfdVar)) {
                    nil nilVar2 = this.j;
                    long j5 = this.f;
                    ncr ncrVar = this.b;
                    lti.f(ncrVar);
                    nilVar2.c(new nff(j5, ncrVar));
                    ngk ngkVar = this.g;
                    lti.f(ngkVar);
                    ncr ncrVar2 = this.b;
                    lti.f(ncrVar2);
                    ndu p = ncrVar2.p(1024, 4);
                    lqb lqbVar = new lqb();
                    lqbVar.a("image/jpeg");
                    lqbVar.k = new lrb(ngkVar);
                    p.i(new lqc(lqbVar));
                    this.c = 5;
                } else {
                    i();
                }
            } else {
                i();
            }
            return 0;
        }
        if (this.d == 65505) {
            luv luvVar = new luv(this.e);
            ncpVar.j(luvVar.a, 0, this.e);
            if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(luvVar.w()) && (w = luvVar.w()) != null) {
                long j6 = ((nce) ncpVar).a;
                ngk ngkVar2 = null;
                if (j6 != -1 && (a = nfg.a(w)) != null && (i = ((enou) a.b).c) >= 2) {
                    int i3 = i - 1;
                    long j7 = -1;
                    long j8 = -1;
                    long j9 = -1;
                    long j10 = -1;
                    boolean z = false;
                    while (i3 >= 0) {
                        nfb nfbVar = (nfb) a.b.get(i3);
                        long j11 = j2;
                        boolean equals = "video/mp4".equals(nfbVar.a) | z;
                        if (i3 == 0) {
                            j6 -= nfbVar.c;
                            j = 0;
                        } else {
                            j = j6 - nfbVar.b;
                        }
                        long j12 = j;
                        long j13 = j6;
                        j6 = j12;
                        if (equals && j6 != j13) {
                            j10 = j13 - j6;
                            j9 = j6;
                            equals = false;
                        }
                        if (i3 == 0) {
                            j8 = j13;
                        }
                        if (i3 == 0) {
                            j7 = j6;
                        }
                        i3--;
                        z = equals;
                        j2 = j11;
                    }
                    long j14 = j2;
                    if (j9 != j14 && j10 != j14 && j7 != j14 && j8 != j14) {
                        ngkVar2 = new ngk(j7, j8, a.a, j9, j10);
                    }
                }
                this.g = ngkVar2;
                if (ngkVar2 != null) {
                    this.f = ngkVar2.d;
                }
            }
        } else {
            ncpVar.l(this.e);
        }
        this.c = 0;
        return 0;
    }

    @Override // defpackage.nco
    public final void c(ncr ncrVar) {
        this.b = ncrVar;
    }

    @Override // defpackage.nco
    public final void e(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            nil nilVar = this.j;
            lti.f(nilVar);
            nilVar.e(j, j2);
        }
    }

    @Override // defpackage.nco
    public final boolean f(ncp ncpVar) {
        if (h(ncpVar) != 65496) {
            return false;
        }
        int h = h(ncpVar);
        this.d = h;
        if (h == 65504) {
            this.a.G(2);
            ncpVar.i(this.a.a, 0, 2);
            ncpVar.g(this.a.n() - 2);
            h = h(ncpVar);
            this.d = h;
        }
        if (h != 65505) {
            return false;
        }
        ncpVar.g(2);
        this.a.G(6);
        ncpVar.i(this.a.a, 0, 6);
        return this.a.r() == 1165519206 && this.a.n() == 0;
    }

    @Override // defpackage.nco
    public final /* synthetic */ List x() {
        int i = engw.d;
        return enou.a;
    }

    @Override // defpackage.nco
    public final void d() {
    }

    @Override // defpackage.nco
    public final /* synthetic */ void g() {
    }
}
