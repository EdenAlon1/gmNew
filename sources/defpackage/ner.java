package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ner implements nco {
    private final byte[] a;
    private final luv b;
    private final ncu c;
    private ncr d;
    private ndu e;
    private int f;
    private lrb g;
    private ncz h;
    private int i;
    private int j;
    private neq k;
    private int l;
    private long m;

    public ner() {
        this(null);
    }

    private final long h(luv luvVar, boolean z) {
        boolean z2;
        lti.f(this.h);
        int i = luvVar.b;
        while (i <= luvVar.c - 16) {
            luvVar.K(i);
            if (ncv.c(luvVar, this.h, this.j, this.c)) {
                luvVar.K(i);
                return this.c.a;
            }
            i++;
        }
        if (!z) {
            luvVar.K(i);
            return -1L;
        }
        while (true) {
            int i2 = luvVar.c;
            if (i > i2 - this.i) {
                luvVar.K(i2);
                return -1L;
            }
            luvVar.K(i);
            try {
                z2 = ncv.c(luvVar, this.h, this.j, this.c);
            } catch (IndexOutOfBoundsException unused) {
                z2 = false;
            }
            if (luvVar.b <= luvVar.c && z2) {
                luvVar.K(i);
                return this.c.a;
            }
            i++;
        }
    }

    private final void i() {
        long j = this.m * 1000000;
        ncz nczVar = this.h;
        int i = lvf.a;
        this.e.o(j / nczVar.e, 1, this.l, 0, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0290 A[LOOP:0: B:72:0x0174->B:78:0x0290, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // defpackage.nco
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(defpackage.ncp r25, defpackage.ndk r26) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ner.a(ncp, ndk):int");
    }

    @Override // defpackage.nco
    public final void c(ncr ncrVar) {
        this.d = ncrVar;
        this.e = ncrVar.p(0, 1);
        ncrVar.r();
    }

    @Override // defpackage.nco
    public final void e(long j, long j2) {
        if (j == 0) {
            this.f = 0;
        } else {
            neq neqVar = this.k;
            if (neqVar != null) {
                neqVar.b(j2);
            }
        }
        this.m = j2 != 0 ? -1L : 0L;
        this.l = 0;
        this.b.G(0);
    }

    @Override // defpackage.nco
    public final boolean f(ncp ncpVar) {
        ncw.a(ncpVar, false);
        luv luvVar = new luv(4);
        ncpVar.i(luvVar.a, 0, 4);
        return luvVar.r() == 1716281667;
    }

    @Override // defpackage.nco
    public final /* synthetic */ List x() {
        int i = engw.d;
        return enou.a;
    }

    public ner(byte[] bArr) {
        this.a = new byte[42];
        this.b = new luv(new byte[32768], 0);
        this.c = new ncu();
        this.f = 0;
    }

    @Override // defpackage.nco
    public final void d() {
    }

    @Override // defpackage.nco
    public final /* synthetic */ void g() {
    }
}
