package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class mea implements mig, mij {
    public final int b;
    public int c;
    public mvc d;
    public long e;
    public long f;
    public boolean g;
    public mii i;
    private mik k;
    private int l;
    private mlu m;
    private ltn n;
    private lqc[] o;
    private boolean q;
    public final Object a = new Object();
    private final mgz j = new mgz();
    private long p = Long.MIN_VALUE;
    public lru h = lru.a;

    public mea(int i) {
        this.b = i;
    }

    private final void W(long j, boolean z) {
        this.g = false;
        this.f = j;
        this.p = j;
        w(j, z);
    }

    @Override // defpackage.mig
    public final void C() {
        lti.c(this.c == 0);
        x();
    }

    @Override // defpackage.mig
    public final void D(lqc[] lqcVarArr, mvc mvcVar, long j, long j2, mtl mtlVar) {
        lti.c(!this.g);
        this.d = mvcVar;
        if (this.p == Long.MIN_VALUE) {
            this.p = j;
        }
        this.o = lqcVarArr;
        this.e = j2;
        B(lqcVarArr, j, j2, mtlVar);
    }

    @Override // defpackage.mig
    public final void E() {
        lti.c(this.c == 0);
        this.j.a();
        y();
    }

    @Override // defpackage.mig
    public final void F(long j) {
        W(j, false);
    }

    @Override // defpackage.mig
    public final void G() {
        this.g = true;
    }

    @Override // defpackage.mij
    public final void H(mii miiVar) {
        synchronized (this.a) {
            this.i = miiVar;
        }
    }

    @Override // defpackage.mig
    public final void J(lru lruVar) {
        lru lruVar2 = this.h;
        int i = lvf.a;
        if (Objects.equals(lruVar2, lruVar)) {
            return;
        }
        this.h = lruVar;
    }

    @Override // defpackage.mig
    public final void K() {
        lti.c(this.c == 1);
        this.c = 2;
        z();
    }

    @Override // defpackage.mig
    public final void L() {
        lti.c(this.c == 2);
        this.c = 1;
        A();
    }

    @Override // defpackage.mig
    public final boolean M() {
        return this.p == Long.MIN_VALUE;
    }

    @Override // defpackage.mig
    public final boolean N() {
        return this.g;
    }

    protected final lqc[] O() {
        lqc[] lqcVarArr = this.o;
        lti.f(lqcVarArr);
        return lqcVarArr;
    }

    @Override // defpackage.mig
    public final void P(mik mikVar, lqc[] lqcVarArr, mvc mvcVar, boolean z, boolean z2, long j, long j2, mtl mtlVar) {
        lti.c(this.c == 0);
        this.k = mikVar;
        this.c = 1;
        v(z, z2);
        D(lqcVarArr, mvcVar, j, j2, mtlVar);
        W(j, z);
    }

    protected final void Q() {
        lti.f(this.k);
    }

    protected final int c(mgz mgzVar, lxz lxzVar, int i) {
        mvc mvcVar = this.d;
        lti.f(mvcVar);
        int a = mvcVar.a(mgzVar, lxzVar, i);
        if (a == -4) {
            if (lxzVar.eR()) {
                this.p = Long.MIN_VALUE;
                return this.g ? -4 : -3;
            }
            long j = lxzVar.f + this.e;
            lxzVar.f = j;
            this.p = Math.max(this.p, j);
            return a;
        }
        if (a == -5) {
            lqc lqcVar = mgzVar.b;
            lti.f(lqcVar);
            long j2 = lqcVar.t;
            if (j2 != Long.MAX_VALUE) {
                lqb lqbVar = new lqb(lqcVar);
                lqbVar.r = j2 + this.e;
                mgzVar.b = new lqc(lqbVar);
                return -5;
            }
        }
        return a;
    }

    @Override // defpackage.mij
    public int e() {
        return 0;
    }

    @Override // defpackage.mig
    public final int eK() {
        return this.c;
    }

    @Override // defpackage.mig, defpackage.mij
    public final int eL() {
        return this.b;
    }

    public final int eM(long j) {
        mvc mvcVar = this.d;
        lti.f(mvcVar);
        return mvcVar.b(j - this.e);
    }

    protected final ltn eN() {
        ltn ltnVar = this.n;
        lti.f(ltnVar);
        return ltnVar;
    }

    @Override // defpackage.mig
    public final long f() {
        return this.p;
    }

    public final mel h(Throwable th, lqc lqcVar, int i) {
        return i(th, lqcVar, false, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final defpackage.mel i(java.lang.Throwable r11, defpackage.lqc r12, boolean r13, int r14) {
        /*
            r10 = this;
            r0 = 4
            if (r12 == 0) goto L1c
            boolean r1 = r10.q
            if (r1 != 0) goto L1c
            r1 = 1
            r10.q = r1
            r1 = 0
            int r2 = r10.V(r12)     // Catch: java.lang.Throwable -> L16 defpackage.mel -> L1a
            int r2 = defpackage.mih.e(r2)     // Catch: java.lang.Throwable -> L16 defpackage.mel -> L1a
            r10.q = r1
            goto L1d
        L16:
            r0 = move-exception
            r10.q = r1
            throw r0
        L1a:
            r10.q = r1
        L1c:
            r2 = r0
        L1d:
            java.lang.String r5 = r10.R()
            int r6 = r10.l
            if (r12 != 0) goto L27
            r8 = r0
            goto L28
        L27:
            r8 = r2
        L28:
            mel r1 = new mel
            r2 = 1
            r3 = r11
            r7 = r12
            r9 = r13
            r4 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mea.i(java.lang.Throwable, lqc, boolean, int):mel");
    }

    protected final mgz j() {
        this.j.a();
        return this.j;
    }

    @Override // defpackage.mig
    public mhd k() {
        return null;
    }

    protected final mlu m() {
        mlu mluVar = this.m;
        lti.f(mluVar);
        return mluVar;
    }

    @Override // defpackage.mig
    public final mvc n() {
        return this.d;
    }

    @Override // defpackage.mij
    public final void o() {
        synchronized (this.a) {
            this.i = null;
        }
    }

    @Override // defpackage.mig
    public final void p() {
        lti.c(this.c == 1);
        this.j.a();
        this.c = 0;
        this.d = null;
        this.o = null;
        this.g = false;
        u();
    }

    @Override // defpackage.mig
    public final void s(int i, mlu mluVar, ltn ltnVar) {
        this.l = i;
        this.m = mluVar;
        this.n = ltnVar;
    }

    @Override // defpackage.mig
    public final void t() {
        mvc mvcVar = this.d;
        lti.f(mvcVar);
        mvcVar.c();
    }

    protected void A() {
    }

    @Override // defpackage.mig
    public final mij l() {
        return this;
    }

    @Override // defpackage.mig
    public /* synthetic */ void q() {
    }

    protected void u() {
    }

    protected void x() {
    }

    protected void y() {
    }

    protected void z() {
    }

    @Override // defpackage.mig
    public /* synthetic */ void I(float f, float f2) {
    }

    @Override // defpackage.mic
    public void r(int i, Object obj) {
    }

    protected void v(boolean z, boolean z2) {
    }

    protected void w(long j, boolean z) {
    }

    protected void B(lqc[] lqcVarArr, long j, long j2, mtl mtlVar) {
    }
}
