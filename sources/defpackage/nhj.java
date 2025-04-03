package defpackage;

import java.io.EOFException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nhj implements nco {
    public boolean a;
    private final luv b;
    private final ndg c;
    private final ndc d;
    private final nde e;
    private final ndu f;
    private ncr g;
    private ndu h;
    private ndu i;
    private int j;
    private lrb k;
    private long l;
    private long m;
    private long n;
    private long o;
    private int p;
    private nhl q;

    public nhj() {
        this(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0331  */
    /* JADX WARN: Type inference failed for: r27v13 */
    /* JADX WARN: Type inference failed for: r27v5 */
    /* JADX WARN: Type inference failed for: r27v6, types: [nhl] */
    /* JADX WARN: Type inference failed for: r27v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int h(defpackage.ncp r56) {
        /*
            Method dump skipped, instructions count: 1160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nhj.h(ncp):int");
    }

    private final long i(long j) {
        return this.l + ((j * 1000000) / this.c.d);
    }

    private final void j() {
        nhl nhlVar = this.q;
        if ((nhlVar instanceof nhg) && nhlVar.y()) {
            long j = this.o;
            if (j == -1 || j == this.q.f()) {
                return;
            }
            nhg nhgVar = (nhg) this.q;
            this.q = new nhg(this.o, nhgVar.a, nhgVar.b, nhgVar.c);
            ncr ncrVar = this.g;
            lti.f(ncrVar);
            ncrVar.w(this.q);
            lti.f(this.h);
            this.q.w();
        }
    }

    private static boolean k(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    private final boolean l(ncp ncpVar) {
        nhl nhlVar = this.q;
        if (nhlVar != null) {
            long f = nhlVar.f();
            if (f != -1 && ncpVar.e() > f - 4) {
                return true;
            }
        }
        try {
            return !ncpVar.n(this.b.a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean m(ncp ncpVar, boolean z) {
        int i;
        int i2;
        int a;
        ncpVar.k();
        if (((nce) ncpVar).b == 0) {
            lrb a2 = this.e.a(ncpVar, null);
            this.k = a2;
            if (a2 != null) {
                this.d.b(a2);
            }
            i = (int) ncpVar.e();
            if (!z) {
                ncpVar.l(i);
            }
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i3 = i2;
        int i4 = i3;
        while (true) {
            if (!l(ncpVar)) {
                this.b.K(0);
                int e = this.b.e();
                if ((i2 == 0 || k(e, i2)) && (a = ndh.a(e)) != -1) {
                    i3++;
                    if (i3 != 1) {
                        if (i3 == 4) {
                            break;
                        }
                    } else {
                        this.c.a(e);
                        i2 = e;
                    }
                    ncpVar.g(a - 4);
                } else {
                    int i5 = i4 + 1;
                    if (i4 == (true != z ? 131072 : 32768)) {
                        if (z) {
                            return false;
                        }
                        j();
                        throw new EOFException();
                    }
                    if (z) {
                        ncpVar.k();
                        ncpVar.g(i + i5);
                    } else {
                        ncpVar.l(1);
                    }
                    i2 = 0;
                    i4 = i5;
                    i3 = 0;
                }
            } else if (i3 <= 0) {
                j();
                throw new EOFException();
            }
        }
        if (z) {
            ncpVar.l(i + i4);
        } else {
            ncpVar.k();
        }
        this.j = i2;
        return true;
    }

    @Override // defpackage.nco
    public final int a(ncp ncpVar, ndk ndkVar) {
        lti.g(this.h);
        int i = lvf.a;
        int h = h(ncpVar);
        if (h == -1 && (this.q instanceof nhh)) {
            if (this.q.w() != i(this.m)) {
                throw null;
            }
        }
        return h;
    }

    @Override // defpackage.nco
    public final void c(ncr ncrVar) {
        this.g = ncrVar;
        ndu p = ncrVar.p(0, 1);
        this.h = p;
        this.i = p;
        this.g.r();
    }

    @Override // defpackage.nco
    public final void e(long j, long j2) {
        this.j = 0;
        this.l = -9223372036854775807L;
        this.m = 0L;
        this.p = 0;
        nhl nhlVar = this.q;
        if (nhlVar instanceof nhh) {
            throw null;
        }
    }

    @Override // defpackage.nco
    public final boolean f(ncp ncpVar) {
        return m(ncpVar, true);
    }

    @Override // defpackage.nco
    public final /* synthetic */ List x() {
        int i = engw.d;
        return enou.a;
    }

    public nhj(byte[] bArr) {
        this.b = new luv(10);
        this.c = new ndg();
        this.d = new ndc();
        this.l = -9223372036854775807L;
        this.e = new nde();
        nck nckVar = new nck();
        this.f = nckVar;
        this.i = nckVar;
        this.o = -1L;
    }

    @Override // defpackage.nco
    public final void d() {
    }

    @Override // defpackage.nco
    public final /* synthetic */ void g() {
    }
}
