package defpackage;

import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
final class njd {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[PrivateKeyType.INVALID];
    private final luv g = new luv(PrivateKeyType.INVALID);

    public final void a() {
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
    }

    public final boolean b(ncp ncpVar, boolean z) {
        a();
        this.g.G(27);
        if (ncs.e(ncpVar, this.g.a, 27, z) && this.g.r() == 1332176723) {
            if (this.g.j() != 0) {
                if (z) {
                    return false;
                }
                throw new lrg("unsupported bit stream revision", null, false, 1);
            }
            this.a = this.g.j();
            this.b = this.g.o();
            this.g.p();
            this.g.p();
            this.g.p();
            int j = this.g.j();
            this.c = j;
            this.d = j + 27;
            this.g.G(j);
            if (ncs.e(ncpVar, this.g.a, this.c, z)) {
                for (int i = 0; i < this.c; i++) {
                    this.f[i] = this.g.j();
                    this.e += this.f[i];
                }
                return true;
            }
        }
        return false;
    }

    public final boolean c(ncp ncpVar) {
        return d(ncpVar, -1L);
    }

    public final boolean d(ncp ncpVar, long j) {
        nce nceVar = (nce) ncpVar;
        lti.a(nceVar.b == ncpVar.e());
        this.g.G(4);
        while (true) {
            if ((j == -1 || nceVar.b + 4 < j) && ncs.e(ncpVar, this.g.a, 4, true)) {
                this.g.K(0);
                if (this.g.r() == 1332176723) {
                    ncpVar.k();
                    return true;
                }
                ncpVar.l(1);
            }
        }
        do {
            if (j != -1 && nceVar.b >= j) {
                break;
            }
        } while (ncpVar.c(1) != -1);
        return false;
    }
}
