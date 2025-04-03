package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nef implements nco {
    public nei[] a;
    private final luv b;
    private final nee c;
    private final boolean d;
    private final nkh e;
    private int f;
    private ncr g;
    private neg h;
    private long i;
    private long j;
    private nei k;
    private int l;
    private long m;
    private long n;
    private int o;
    private boolean p;

    @Deprecated
    public nef() {
        this(1, nkh.a);
    }

    private final nei h(int i) {
        for (nei neiVar : this.a) {
            if (neiVar.c == i || neiVar.d == i) {
                return neiVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0365  */
    @Override // defpackage.nco
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(defpackage.ncp r22, defpackage.ndk r23) {
        /*
            Method dump skipped, instructions count: 1011
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nef.a(ncp, ndk):int");
    }

    @Override // defpackage.nco
    public final void c(ncr ncrVar) {
        this.f = 0;
        if (this.d) {
            ncrVar = new nkk(ncrVar, this.e);
        }
        this.g = ncrVar;
        this.j = -1L;
    }

    @Override // defpackage.nco
    public final void e(long j, long j2) {
        this.j = -1L;
        this.k = null;
        for (nei neiVar : this.a) {
            if (neiVar.j == 0) {
                neiVar.h = 0;
            } else {
                neiVar.h = neiVar.m[lvf.ak(neiVar.l, j, true)];
            }
        }
        if (j == 0) {
            this.f = this.a.length != 0 ? 3 : 0;
        } else {
            this.f = 6;
        }
    }

    @Override // defpackage.nco
    public final boolean f(ncp ncpVar) {
        ncpVar.i(this.b.a, 0, 12);
        this.b.K(0);
        if (this.b.f() != 1179011410) {
            return false;
        }
        this.b.L(4);
        return this.b.f() == 541677121;
    }

    @Override // defpackage.nco
    public final /* synthetic */ List x() {
        int i = engw.d;
        return enou.a;
    }

    public nef(int i, nkh nkhVar) {
        this.e = nkhVar;
        this.d = 1 == (i ^ 1);
        this.b = new luv(12);
        this.c = new nee();
        this.g = new ndi();
        this.a = new nei[0];
        this.m = -1L;
        this.n = -1L;
        this.l = -1;
        this.i = -9223372036854775807L;
    }

    @Override // defpackage.nco
    public final void d() {
    }

    @Override // defpackage.nco
    public final /* synthetic */ void g() {
    }
}
