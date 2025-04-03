package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nmu implements nco {
    private final nmv a = new nmv(null, 0, "audio/ac4");
    private final luv b = new luv(16384);
    private boolean c;

    @Override // defpackage.nco
    public final int a(ncp ncpVar, ndk ndkVar) {
        int a = ncpVar.a(this.b.a, 0, 16384);
        if (a == -1) {
            return -1;
        }
        this.b.K(0);
        this.b.J(a);
        if (!this.c) {
            this.a.a = 0L;
            this.c = true;
        }
        this.a.a(this.b);
        return 0;
    }

    @Override // defpackage.nco
    public final void c(ncr ncrVar) {
        this.a.b(ncrVar, new nom(0, 1));
        ncrVar.r();
        ncrVar.w(new ndm(-9223372036854775807L));
    }

    @Override // defpackage.nco
    public final void e(long j, long j2) {
        this.c = false;
        this.a.e();
    }

    @Override // defpackage.nco
    public final boolean f(ncp ncpVar) {
        int i;
        luv luvVar = new luv(10);
        int i2 = 0;
        while (true) {
            ncpVar.i(luvVar.a, 0, 10);
            luvVar.K(0);
            if (luvVar.l() != 4801587) {
                break;
            }
            luvVar.L(3);
            int i3 = luvVar.i();
            i2 += i3 + 10;
            ncpVar.g(i3);
        }
        ncpVar.k();
        ncpVar.g(i2);
        int i4 = 0;
        int i5 = i2;
        while (true) {
            int i6 = 7;
            ncpVar.i(luvVar.a, 0, 7);
            luvVar.K(0);
            int n = luvVar.n();
            if (n == 44096 || n == 44097) {
                i4++;
                if (i4 >= 4) {
                    return true;
                }
                byte[] bArr = luvVar.a;
                int i7 = nbs.a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i8 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i8 == 65535) {
                        i8 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i6 = 4;
                    }
                    if (n == 44097) {
                        i6 += 2;
                    }
                    i = i8 + i6;
                }
                if (i == -1) {
                    return false;
                }
                ncpVar.g(i - 7);
            } else {
                ncpVar.k();
                i5++;
                if (i5 - i2 >= 8192) {
                    return false;
                }
                ncpVar.g(i5);
                i4 = 0;
            }
        }
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
