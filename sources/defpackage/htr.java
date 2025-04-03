package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class htr extends hrq {
    public ffji l;
    public ffji m;
    public final long n;
    private final hrq o;
    private final boolean p;
    private final boolean q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public htr(defpackage.hrq r8, defpackage.ffji r9, defpackage.ffji r10, boolean r11, boolean r12) {
        /*
            r7 = this;
            ffji r0 = defpackage.hsj.a
            hsd r4 = defpackage.hsd.a
            if (r8 == 0) goto Lc
            ffji r0 = r8.k()
            if (r0 != 0) goto L10
        Lc:
            hrp r0 = defpackage.hsj.i
            ffji r0 = r0.a
        L10:
            ffji r5 = defpackage.hsj.p(r9, r0, r11)
            if (r8 == 0) goto L1c
            ffji r9 = r8.m()
            if (r9 != 0) goto L20
        L1c:
            hrp r9 = defpackage.hsj.i
            ffji r9 = r9.b
        L20:
            r2 = 0
            ffji r6 = defpackage.hsj.q(r10, r9)
            r1 = r7
            r1.<init>(r2, r4, r5, r6)
            r1.o = r8
            r1.p = r11
            r1.q = r12
            ffji r8 = r1.a
            r1.l = r8
            ffji r8 = r1.b
            r1.m = r8
            long r8 = defpackage.hqk.a()
            r1.n = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.htr.<init>(hrq, ffji, ffji, boolean, boolean):void");
    }

    private final hrq F() {
        hrq hrqVar = this.o;
        return hrqVar == null ? hsj.i : hrqVar;
    }

    @Override // defpackage.hrw
    public final void A(hsd hsdVar) {
        hsw.a();
        throw new ffbx();
    }

    @Override // defpackage.hrw
    public final void B(long j) {
        hsw.a();
        throw new ffbx();
    }

    @Override // defpackage.hrq
    public final hrq a(ffji ffjiVar, ffji ffjiVar2) {
        ffji p;
        p = hsj.p(ffjiVar, this.l, true);
        ffji q = hsj.q(ffjiVar2, this.m);
        return !this.p ? new htr(F().a(null, q), p, q, false, true) : F().a(p, q);
    }

    @Override // defpackage.hrq, defpackage.hrw
    public final hrw b(ffji ffjiVar) {
        ffji p;
        hrw a;
        p = hsj.p(ffjiVar, this.l, true);
        if (this.p) {
            return F().b(p);
        }
        a = hsj.a(F().b(null), p, true);
        return a;
    }

    @Override // defpackage.hrq
    public final hrz c() {
        return F().c();
    }

    @Override // defpackage.hrq, defpackage.hrw
    public final void d() {
        hrq hrqVar;
        D();
        if (!this.q || (hrqVar = this.o) == null) {
            return;
        }
        hrqVar.d();
    }

    @Override // defpackage.hrq, defpackage.hrw
    public final void e() {
        F().e();
    }

    @Override // defpackage.hrq, defpackage.hrw
    public final /* bridge */ /* synthetic */ void f() {
        hsw.a();
        throw new ffbx();
    }

    @Override // defpackage.hrq, defpackage.hrw
    public final /* bridge */ /* synthetic */ void g() {
        hsw.a();
        throw new ffbx();
    }

    @Override // defpackage.hrq, defpackage.hrw
    public final int h() {
        return F().h();
    }

    @Override // defpackage.hrq
    public final coq i() {
        return F().i();
    }

    @Override // defpackage.hrq, defpackage.hrw
    public final /* synthetic */ ffji k() {
        return this.l;
    }

    @Override // defpackage.hrq
    /* renamed from: l */
    public final ffji k() {
        return this.l;
    }

    @Override // defpackage.hrq, defpackage.hrw
    public final ffji m() {
        return this.m;
    }

    @Override // defpackage.hrq, defpackage.hrw
    public final void p(htm htmVar) {
        F().p(htmVar);
    }

    @Override // defpackage.hrq
    public final void s(coq coqVar) {
        hsw.a();
        throw new ffbx();
    }

    @Override // defpackage.hrq, defpackage.hrw
    public final void t(int i) {
        F().t(i);
    }

    @Override // defpackage.hrq, defpackage.hrw
    public final boolean u() {
        F().u();
        return false;
    }

    @Override // defpackage.hrw
    public final long v() {
        return F().v();
    }

    @Override // defpackage.hrw
    public final hsd x() {
        return F().x();
    }
}
