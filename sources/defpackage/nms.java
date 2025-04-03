package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nms implements nco {
    private final nmt a = new nmt("audio/ac3");
    private final luv b = new luv(2786);
    private boolean c;

    @Override // defpackage.nco
    public final int a(ncp ncpVar, ndk ndkVar) {
        int a = ncpVar.a(this.b.a, 0, 2786);
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
        int a;
        luv luvVar = new luv(10);
        int i = 0;
        while (true) {
            ncpVar.i(luvVar.a, 0, 10);
            luvVar.K(0);
            if (luvVar.l() != 4801587) {
                break;
            }
            luvVar.L(3);
            int i2 = luvVar.i();
            i += i2 + 10;
            ncpVar.g(i2);
        }
        ncpVar.k();
        ncpVar.g(i);
        int i3 = 0;
        int i4 = i;
        while (true) {
            ncpVar.i(luvVar.a, 0, 6);
            luvVar.K(0);
            if (luvVar.n() != 2935) {
                ncpVar.k();
                i4++;
                if (i4 - i >= 8192) {
                    return false;
                }
                ncpVar.g(i4);
                i3 = 0;
            } else {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = luvVar.a;
                int[] iArr = nbp.a;
                if (bArr.length < 6) {
                    a = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    int i5 = (((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1;
                    a = i5 + i5;
                } else {
                    byte b = bArr[4];
                    a = nbp.a((b & 192) >> 6, b & 63);
                }
                if (a == -1) {
                    return false;
                }
                ncpVar.g(a - 6);
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
