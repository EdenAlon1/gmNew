package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class eot implements dsg {
    public final dwn A;
    public final hjz B;
    private final boolean C;
    private int D;
    private ekg E;
    private boolean F;
    private final hho G;
    private final hho H;
    private final hjz I;
    private final hho a;
    private final dsg b;
    public boolean c;
    public eob d;
    public final eod e;
    public int f;
    public int g;
    public long h;
    public long i;
    public float j;
    public float k;
    public int l;
    public int m;
    public final hho n;
    public jzn o;
    public final ekh p;
    public final eia q;
    public final ehr r;
    public final hho s;
    public final iqo t;
    public long u;
    public final ekd v;
    public final hho w;
    public final hho x;
    public final hho y;
    public final hho z;

    public eot(int i, float f) {
        double d = f;
        if (d < -0.5d || d > 0.5d) {
            dwv.c("currentPageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        }
        this.a = new hic(new iak(0L), hla.a);
        eod eodVar = new eod(i, f, this);
        this.e = eodVar;
        this.f = i;
        this.h = Long.MAX_VALUE;
        this.b = new dne(new eoq(this));
        this.C = true;
        this.D = -1;
        this.n = new hic(eoy.a, hhs.a);
        this.o = eoy.b;
        this.A = new dwn();
        this.I = new hhy(-1);
        this.B = new hhy(i);
        hla hlaVar = hla.a;
        eor eorVar = new eor(this);
        hqg hqgVar = hkg.a;
        new hgk(eorVar, hlaVar);
        new hgk(new eos(this), hla.a);
        this.p = new ekh(new eol(this));
        this.q = new eia();
        this.r = new ehr();
        this.s = new hic(null, hla.a);
        this.t = new eom(this);
        this.u = jzl.k(0, 0, 0, 15);
        this.v = new ekd();
        ejx ejxVar = eodVar.d;
        this.w = new hic(ffcu.a, hhs.a);
        this.x = new hic(ffcu.a, hhs.a);
        this.G = new hic(false, hla.a);
        this.H = new hic(false, hla.a);
        this.y = new hic(false, hla.a);
        this.z = new hic(false, hla.a);
    }

    public static /* synthetic */ Object A(eot eotVar, int i, ffgu ffguVar) {
        Object e;
        e = eotVar.e(dhy.a, new eop(eotVar, i, null), ffguVar);
        return e == ffhh.a ? e : ffcu.a;
    }

    private final void C(int i) {
        this.I.i(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        if (r8.e(r6, r7, r0) != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        if (r8 != r1) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object r(defpackage.eot r5, defpackage.dhy r6, defpackage.ffjm r7, defpackage.ffgu r8) {
        /*
            boolean r0 = r8 instanceof defpackage.eoo
            if (r0 == 0) goto L13
            r0 = r8
            eoo r0 = (defpackage.eoo) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            eoo r0 = new eoo
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.c
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r5 = r0.a
            defpackage.ffci.b(r8)
            goto L73
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.Object r7 = r0.b
            dhy r6 = r0.f
            java.lang.Object r5 = r0.a
            defpackage.ffci.b(r8)
            goto L4f
        L3e:
            defpackage.ffci.b(r8)
            r0.a = r5
            r0.f = r6
            r0.b = r7
            r0.e = r4
            java.lang.Object r8 = r5.q(r0)
            if (r8 == r1) goto L7c
        L4f:
            r8 = r5
            eot r8 = (defpackage.eot) r8
            boolean r2 = r8.i()
            if (r2 != 0) goto L61
            int r2 = r8.j()
            hjz r4 = r8.B
            r4.i(r2)
        L61:
            dsg r8 = r8.b
            r0.a = r5
            r2 = 0
            r0.f = r2
            r0.b = r2
            r0.e = r3
            java.lang.Object r6 = r8.e(r6, r7, r0)
            if (r6 != r1) goto L73
            goto L7c
        L73:
            eot r5 = (defpackage.eot) r5
            r6 = -1
            r5.C(r6)
            ffcu r5 = defpackage.ffcu.a
            return r5
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eot.r(eot, dhy, ffjm, ffgu):java.lang.Object");
    }

    public static /* synthetic */ Object z(eot eotVar, int i, cxt cxtVar, ffgu ffguVar, int i2) {
        if ((i2 & 4) != 0) {
            cxtVar = cxu.b(0.0f, 0.0f, null, 7);
        }
        return eotVar.y(i, cxtVar, ffguVar);
    }

    public final void B(int i) {
        C(f(i));
    }

    @Override // defpackage.dsg
    public final float a(float f) {
        return this.b.a(f);
    }

    public abstract int b();

    public final float c() {
        return this.e.a();
    }

    public final float d() {
        jzn jznVar = this.o;
        eob eobVar = eoy.a;
        return Math.min(jznVar.em(56.0f), k() / 2.0f) / k();
    }

    @Override // defpackage.dsg
    public final Object e(dhy dhyVar, ffjm ffjmVar, ffgu ffguVar) {
        return r(this, dhyVar, ffjmVar, ffguVar);
    }

    public final int f(int i) {
        if (b() > 0) {
            return ffmk.i(i, 0, b() - 1);
        }
        return 0;
    }

    @Override // defpackage.dsg
    public final boolean g() {
        return ((Boolean) this.H.a()).booleanValue();
    }

    @Override // defpackage.dsg
    public final boolean h() {
        return ((Boolean) this.G.a()).booleanValue();
    }

    @Override // defpackage.dsg
    public final boolean i() {
        return this.b.i();
    }

    public final int j() {
        return this.e.e.c();
    }

    public final int k() {
        return ((eob) this.n.a()).b;
    }

    public final int l() {
        return k() + m();
    }

    public final int m() {
        return ((eob) this.n.a()).c;
    }

    public final int n() {
        return this.I.c();
    }

    public final long o() {
        return ((iak) this.a.a()).a;
    }

    public final iqn p() {
        return (iqn) this.s.a();
    }

    public final Object q(ffgu ffguVar) {
        Object d = this.r.d(ffguVar);
        return d == ffhh.a ? d : ffcu.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x011a, code lost:
    
        if (w() == false) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0136 A[Catch: all -> 0x01f2, TryCatch #0 {all -> 0x01f2, blocks: (B:24:0x00c3, B:26:0x00d6, B:28:0x00da, B:30:0x00e6, B:33:0x011c, B:36:0x0124, B:42:0x0136, B:44:0x0155, B:46:0x015b, B:48:0x015f, B:50:0x0163, B:52:0x0167, B:53:0x016a, B:55:0x017a, B:57:0x0192, B:59:0x0196, B:60:0x019a, B:62:0x01ad, B:64:0x01b1, B:65:0x0145, B:67:0x0116, B:69:0x00fe), top: B:23:0x00c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015f A[Catch: all -> 0x01f2, TryCatch #0 {all -> 0x01f2, blocks: (B:24:0x00c3, B:26:0x00d6, B:28:0x00da, B:30:0x00e6, B:33:0x011c, B:36:0x0124, B:42:0x0136, B:44:0x0155, B:46:0x015b, B:48:0x015f, B:50:0x0163, B:52:0x0167, B:53:0x016a, B:55:0x017a, B:57:0x0192, B:59:0x0196, B:60:0x019a, B:62:0x01ad, B:64:0x01b1, B:65:0x0145, B:67:0x0116, B:69:0x00fe), top: B:23:0x00c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017a A[Catch: all -> 0x01f2, TryCatch #0 {all -> 0x01f2, blocks: (B:24:0x00c3, B:26:0x00d6, B:28:0x00da, B:30:0x00e6, B:33:0x011c, B:36:0x0124, B:42:0x0136, B:44:0x0155, B:46:0x015b, B:48:0x015f, B:50:0x0163, B:52:0x0167, B:53:0x016a, B:55:0x017a, B:57:0x0192, B:59:0x0196, B:60:0x019a, B:62:0x01ad, B:64:0x01b1, B:65:0x0145, B:67:0x0116, B:69:0x00fe), top: B:23:0x00c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019a A[Catch: all -> 0x01f2, TryCatch #0 {all -> 0x01f2, blocks: (B:24:0x00c3, B:26:0x00d6, B:28:0x00da, B:30:0x00e6, B:33:0x011c, B:36:0x0124, B:42:0x0136, B:44:0x0155, B:46:0x015b, B:48:0x015f, B:50:0x0163, B:52:0x0167, B:53:0x016a, B:55:0x017a, B:57:0x0192, B:59:0x0196, B:60:0x019a, B:62:0x01ad, B:64:0x01b1, B:65:0x0145, B:67:0x0116, B:69:0x00fe), top: B:23:0x00c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0145 A[Catch: all -> 0x01f2, TryCatch #0 {all -> 0x01f2, blocks: (B:24:0x00c3, B:26:0x00d6, B:28:0x00da, B:30:0x00e6, B:33:0x011c, B:36:0x0124, B:42:0x0136, B:44:0x0155, B:46:0x015b, B:48:0x015f, B:50:0x0163, B:52:0x0167, B:53:0x016a, B:55:0x017a, B:57:0x0192, B:59:0x0196, B:60:0x019a, B:62:0x01ad, B:64:0x01b1, B:65:0x0145, B:67:0x0116, B:69:0x00fe), top: B:23:0x00c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(defpackage.eob r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eot.s(eob, boolean, boolean):void");
    }

    public final void t(long j) {
        this.a.b(new iak(j));
    }

    public final void u(int i, float f, boolean z) {
        eod eodVar = this.e;
        eodVar.d(i, f);
        eodVar.c = null;
        if (!z) {
            elq.b(this.x);
            return;
        }
        iqn p = p();
        if (p != null) {
            p.h();
        }
    }

    public final boolean v() {
        return ((Boolean) this.y.a()).booleanValue();
    }

    public final boolean w() {
        return ((int) Float.intBitsToFloat((int) (o() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (o() & 4294967295L))) == 0;
    }

    public final eob x() {
        return (eob) this.n.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0085, code lost:
    
        if (r12 != r1) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(int r12, defpackage.cxt r13, defpackage.ffgu r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.eoi
            if (r0 == 0) goto L13
            r0 = r14
            eoi r0 = (defpackage.eoi) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            eoi r0 = new eoi
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.d
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            defpackage.ffci.b(r14)
            goto L88
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L33:
            int r12 = r0.c
            java.lang.Object r13 = r0.b
            java.lang.Object r2 = r0.a
            defpackage.ffci.b(r14)
        L3c:
            r9 = r13
            goto L66
        L3e:
            defpackage.ffci.b(r14)
            int r14 = r11.j()
            if (r12 != r14) goto L4f
            float r14 = r11.c()
            int r14 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r14 == 0) goto L88
        L4f:
            int r14 = r11.b()
            if (r14 == 0) goto L88
            r0.a = r11
            r0.b = r13
            r0.c = r12
            r0.f = r5
            java.lang.Object r14 = r11.q(r0)
            if (r14 != r1) goto L64
            goto L87
        L64:
            r2 = r11
            goto L3c
        L66:
            r6 = r2
            eot r6 = (defpackage.eot) r6
            int r7 = r6.f(r12)
            int r12 = r6.l()
            float r12 = (float) r12
            float r8 = r12 * r3
            eok r5 = new eok
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r12 = 0
            r0.a = r12
            r0.b = r12
            r0.f = r4
            java.lang.Object r12 = defpackage.dsf.a(r2, r5, r0)
            if (r12 != r1) goto L88
        L87:
            return r1
        L88:
            ffcu r12 = defpackage.ffcu.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eot.y(int, cxt, ffgu):java.lang.Object");
    }
}
