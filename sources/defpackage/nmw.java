package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nmw implements nco {
    private final nmx a;
    private final luv b;
    private final luv c;
    private final luu d;
    private ncr e;
    private long f;
    private long g;
    private boolean h;
    private boolean i;

    public nmw() {
        this(null);
    }

    @Override // defpackage.nco
    public final int a(ncp ncpVar, ndk ndkVar) {
        lti.g(this.e);
        int a = ncpVar.a(this.b.a, 0, 2048);
        if (!this.i) {
            this.e.w(new ndm(-9223372036854775807L));
            this.i = true;
        }
        if (a == -1) {
            return -1;
        }
        this.b.K(0);
        this.b.J(a);
        if (!this.h) {
            this.a.b = this.f;
            this.h = true;
        }
        this.a.a(this.b);
        return 0;
    }

    @Override // defpackage.nco
    public final void c(ncr ncrVar) {
        this.e = ncrVar;
        this.a.b(ncrVar, new nom(0, 1));
        ncrVar.r();
    }

    @Override // defpackage.nco
    public final void e(long j, long j2) {
        this.h = false;
        this.a.e();
        this.f = j2;
    }

    @Override // defpackage.nco
    public final boolean f(ncp ncpVar) {
        int i = 0;
        while (true) {
            ncpVar.i(this.c.a, 0, 10);
            this.c.K(0);
            if (this.c.l() != 4801587) {
                break;
            }
            this.c.L(3);
            int i2 = this.c.i();
            i += i2 + 10;
            ncpVar.g(i2);
        }
        ncpVar.k();
        ncpVar.g(i);
        if (this.g == -1) {
            this.g = i;
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = i;
        do {
            ncpVar.i(this.c.a, 0, 2);
            this.c.K(0);
            if (nmx.f(this.c.n())) {
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                ncpVar.i(this.c.a, 0, 4);
                this.d.l(14);
                int d = this.d.d(13);
                if (d <= 6) {
                    i5++;
                    ncpVar.k();
                    ncpVar.g(i5);
                } else {
                    ncpVar.g(d - 6);
                    i4 += d;
                }
            } else {
                i5++;
                ncpVar.k();
                ncpVar.g(i5);
            }
            i3 = 0;
            i4 = 0;
        } while (i5 - i < 8192);
        return false;
    }

    @Override // defpackage.nco
    public final /* synthetic */ List x() {
        int i = engw.d;
        return enou.a;
    }

    public nmw(byte[] bArr) {
        this.a = new nmx(true, null, 0, "audio/mp4a-latm");
        this.b = new luv(2048);
        this.g = -1L;
        luv luvVar = new luv(10);
        this.c = luvVar;
        this.d = new luu(luvVar.a);
    }

    @Override // defpackage.nco
    public final void d() {
    }

    @Override // defpackage.nco
    public final /* synthetic */ void g() {
    }
}
