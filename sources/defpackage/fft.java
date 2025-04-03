package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fft {
    public final fgi a;
    public iir c;
    public ffji d;
    public iak f;
    public ioc g;
    public fen i;
    public jbw j;
    private boolean s;
    private final hho k = new hic(null, hla.a);
    private final hho l = new hic(true, hla.a);
    public ffji b = new ffp(this);
    public final hzi e = new hzi();
    private final hho m = new hic(false, hla.a);
    private final hho n = new hic(new iak(0), hla.a);
    private final hho o = new hic(new iak(0), hla.a);
    private final hho p = new hic(null, hla.a);
    private final hho q = new hic(null, hla.a);
    private final hho r = new hic(null, hla.a);
    public final hho h = new hic(null, hla.a);

    public fft(fgi fgiVar) {
        this.a = fgiVar;
        fgiVar.e = new ffa(this);
        fgiVar.f = new ffb(this);
        fgiVar.g = new ffc(this);
        fgiVar.h = new ffd(this);
        fgiVar.i = new ffe(this);
        fgiVar.j = new fff(this);
    }

    public final boolean A() {
        List j = this.a.j(i());
        if (j.isEmpty()) {
            return true;
        }
        int size = j.size();
        for (int i = 0; i < size; i++) {
            fcv fcvVar = (fcv) j.get(i);
            jlm l = fcvVar.l();
            if (l.a() != 0) {
                fcy fcyVar = (fcy) this.a.b().a(fcvVar.h());
                if (fcyVar == null) {
                    return false;
                }
                if (Math.abs(fcyVar.a.b - fcyVar.b.b) != l.a()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean B() {
        return ((Boolean) this.l.a()).booleanValue();
    }

    public final boolean C() {
        fcy f = f();
        if (f != null && !ffkj.e(f.a, f.b)) {
            if (f.a.c == f.b.c) {
                return true;
            }
            List j = this.a.j(i());
            int size = j.size();
            for (int i = 0; i < size; i++) {
                fcy fcyVar = (fcy) this.a.b().a(((fcv) j.get(i)).h());
                if (fcyVar != null) {
                    if (fcyVar.a.b != fcyVar.b.b) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean D() {
        fcy f = f();
        if (f == null) {
            return true;
        }
        return ffkj.e(f.a, f.b);
    }

    public final boolean E(long j, long j2, boolean z, fdh fdhVar) {
        p(z ? euf.b : euf.c);
        m(new iak(j));
        ioc i = i();
        List j3 = this.a.j(i);
        int i2 = cng.a;
        fen fenVar = null;
        cnz cnzVar = new cnz((byte[]) null);
        int size = j3.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            cnzVar.c(((fcv) j3.get(i4)).h(), i4);
        }
        feo feoVar = new feo(j, j2, i, z, (j2 & 9223372034707292159L) == 9205357640488583168L ? null : f(), new ffg(cnzVar));
        int size2 = j3.size();
        for (int i5 = 0; i5 < size2; i5++) {
            ((fcv) j3.get(i5)).m(feoVar);
        }
        int i6 = feoVar.k + 1;
        int size3 = feoVar.h.size();
        if (size3 != 0) {
            if (size3 != 1) {
                cnz cnzVar2 = feoVar.g;
                List list = feoVar.h;
                int i7 = feoVar.i;
                int i8 = i7 == -1 ? i6 : i7;
                int i9 = feoVar.j;
                fenVar = new fcr(cnzVar2, list, i8, i9 != -1 ? i9 : i6, feoVar.d, feoVar.e);
            } else {
                fcw fcwVar = (fcw) ffdx.T(feoVar.h);
                int i10 = feoVar.i;
                int i11 = i10 == -1 ? i6 : i10;
                int i12 = feoVar.j;
                fenVar = new fgp(feoVar.d, i11, i12 != -1 ? i12 : i6, feoVar.e, fcwVar);
            }
        }
        if (fenVar == null || !fenVar.m(this.i)) {
            return false;
        }
        fcy a = fdhVar.a(fenVar);
        if (!ffkj.e(a, f())) {
            if (B()) {
                List list2 = this.a.b;
                int size4 = list2.size();
                while (true) {
                    if (i3 >= size4) {
                        break;
                    }
                    if (((fcv) list2.get(i3)).l().a() > 0) {
                        iir iirVar = this.c;
                        if (iirVar != null) {
                            iirVar.a(9);
                        }
                    } else {
                        i3++;
                    }
                }
            }
            this.a.k(fenVar.d(a));
            this.b.invoke(a);
        }
        this.i = fenVar;
        return true;
    }

    public final boolean F(iak iakVar, long j, boolean z, fdh fdhVar) {
        return E(iakVar.a, j, z, fdhVar);
    }

    public final long a(ioc iocVar, long j) {
        ioc iocVar2 = this.g;
        if (iocVar2 == null || !iocVar2.t()) {
            return 9205357640488583168L;
        }
        return i().h(iocVar, j);
    }

    public final long b() {
        return ((iak) this.n.a()).a;
    }

    public final long c() {
        return ((iak) this.o.a()).a;
    }

    public final euf d() {
        return (euf) this.r.a();
    }

    public final fcv e(fcx fcxVar) {
        return (fcv) this.a.c.a(fcxVar.c);
    }

    public final fcy f() {
        return (fcy) this.k.a();
    }

    public final iak g() {
        return (iak) this.q.a();
    }

    public final iak h() {
        return (iak) this.p.a();
    }

    public final ioc i() {
        ioc iocVar = this.g;
        if (iocVar == null) {
            dwv.a("null coordinates");
            throw new ffbx();
        }
        if (!iocVar.t()) {
            dwv.c("unattached coordinates");
        }
        return iocVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j() {
        jlm jlmVar;
        ffji ffjiVar;
        if (f() == null || this.a.b().c()) {
            jlmVar = 0;
        } else {
            jlj jljVar = new jlj(r1);
            List j = this.a.j(i());
            int size = j.size();
            for (int i = 0; i < size; i++) {
                fcv fcvVar = (fcv) j.get(i);
                fcy fcyVar = (fcy) this.a.b().a(fcvVar.h());
                if (fcyVar != null) {
                    jlm l = fcvVar.l();
                    jljVar.e(fcyVar.c ? l.subSequence(fcyVar.b.b, fcyVar.a.b) : l.subSequence(fcyVar.a.b, fcyVar.b.b));
                }
            }
            jlmVar = jljVar.b();
        }
        if (jlmVar != 0) {
            r1 = jlmVar.a() > 0 ? jlmVar : null;
            if (r1 == null || (ffjiVar = this.d) == null) {
                return;
            }
            ffjiVar.invoke(r1);
        }
    }

    public final void k() {
        iir iirVar;
        this.a.k(cnk.a());
        u(false);
        if (f() != null) {
            this.b.invoke(null);
            if (!B() || (iirVar = this.c) == null) {
                return;
            }
            iirVar.a(9);
        }
    }

    public final void l() {
        List j = this.a.j(i());
        if (j.isEmpty()) {
            return;
        }
        int i = cnk.a;
        coc cocVar = new coc((byte[]) null);
        int size = j.size();
        fcy fcyVar = null;
        fcy fcyVar2 = null;
        for (int i2 = 0; i2 < size; i2++) {
            fcv fcvVar = (fcv) j.get(i2);
            fcy i3 = fcvVar.i();
            if (i3 != null) {
                if (fcyVar == null) {
                    fcyVar = i3;
                }
                cocVar.g(fcvVar.h(), i3);
                fcyVar2 = i3;
            }
        }
        if (cocVar.c()) {
            return;
        }
        if (fcyVar != fcyVar2) {
            fcyVar.getClass();
            fcyVar2.getClass();
            fcyVar = new fcy(fcyVar.a, fcyVar2.b, false);
        }
        this.a.k(cocVar);
        this.b.invoke(fcyVar);
        this.i = null;
    }

    public final void m(iak iakVar) {
        this.h.b(iakVar);
    }

    public final void n(long j) {
        this.n.b(new iak(j));
    }

    public final void o(long j) {
        this.o.b(new iak(j));
    }

    public final void p(euf eufVar) {
        this.r.b(eufVar);
    }

    public final void q(iak iakVar) {
        this.q.b(iakVar);
    }

    public final void r(boolean z) {
        this.m.b(Boolean.valueOf(z));
    }

    public final void s(boolean z) {
        if (((Boolean) this.l.a()).booleanValue() != z) {
            this.l.b(Boolean.valueOf(z));
            x();
        }
    }

    public final void t(fcy fcyVar) {
        this.k.b(fcyVar);
        if (fcyVar != null) {
            w();
        }
    }

    public final void u(boolean z) {
        this.s = z;
        x();
    }

    public final void v(iak iakVar) {
        this.p.b(iakVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        if (defpackage.ffu.c(r8, r13) == false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w() {
        /*
            r17 = this;
            r0 = r17
            fcy r1 = r0.f()
            ioc r2 = r0.g
            r3 = 0
            if (r1 == 0) goto L14
            fcx r4 = r1.a
            if (r4 == 0) goto L14
            fcv r4 = r0.e(r4)
            goto L15
        L14:
            r4 = r3
        L15:
            if (r1 == 0) goto L20
            fcx r5 = r1.b
            if (r5 == 0) goto L20
            fcv r5 = r0.e(r5)
            goto L21
        L20:
            r5 = r3
        L21:
            if (r4 == 0) goto L28
            ioc r6 = r4.k()
            goto L29
        L28:
            r6 = r3
        L29:
            if (r5 == 0) goto L30
            ioc r7 = r5.k()
            goto L31
        L30:
            r7 = r3
        L31:
            if (r1 == 0) goto La4
            if (r2 == 0) goto La4
            boolean r8 = r2.t()
            if (r8 == 0) goto La4
            if (r6 != 0) goto L3f
            if (r7 == 0) goto La4
        L3f:
            iam r8 = defpackage.ffu.b(r2)
            r9 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r11 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            if (r6 == 0) goto L74
            r13 = 1
            long r13 = r4.f(r1, r13)
            long r15 = r13 & r11
            int r4 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r4 != 0) goto L5b
            goto L74
        L5b:
            long r13 = r2.h(r6, r13)
            iak r4 = new iak
            r4.<init>(r13)
            long r13 = r4.a
            euf r6 = r0.d()
            euf r15 = defpackage.euf.b
            if (r6 == r15) goto L75
            boolean r6 = defpackage.ffu.c(r8, r13)
            if (r6 != 0) goto L75
        L74:
            r4 = r3
        L75:
            r0.v(r4)
            if (r7 == 0) goto La0
            r4 = 0
            long r4 = r5.f(r1, r4)
            long r11 = r11 & r4
            int r1 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r1 != 0) goto L85
            goto La0
        L85:
            long r1 = r2.h(r7, r4)
            iak r4 = new iak
            r4.<init>(r1)
            long r1 = r4.a
            euf r5 = r0.d()
            euf r6 = defpackage.euf.c
            if (r5 == r6) goto L9f
            boolean r1 = defpackage.ffu.c(r8, r1)
            if (r1 != 0) goto L9f
            goto La0
        L9f:
            r3 = r4
        La0:
            r0.q(r3)
            return
        La4:
            r0.v(r3)
            r0.q(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fft.w():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x() {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fft.x():void");
    }

    public final boolean y() {
        return ((Boolean) this.m.a()).booleanValue();
    }

    public final boolean z() {
        return d() != null;
    }
}
