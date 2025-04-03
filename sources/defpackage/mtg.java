package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mtg extends mvq {
    public mte d;
    private final boolean f;
    private final lrt g;
    private final lrs h;
    private mtd i;
    private boolean j;
    private boolean k;
    private boolean l;

    public mtg(mtn mtnVar, boolean z) {
        super(mtnVar);
        boolean z2;
        if (z) {
            mtnVar.s();
            z2 = true;
        } else {
            z2 = false;
        }
        this.f = z2;
        this.g = new lrt();
        this.h = new lrs();
        mtnVar.r();
        this.d = mte.s(mtnVar.F());
    }

    private final Object H(Object obj) {
        mte mteVar = this.d;
        Object obj2 = mte.c;
        return (mteVar.d == null || !obj.equals(mte.c)) ? obj : this.d.d;
    }

    private final boolean I(long j) {
        mtd mtdVar = this.i;
        int a = this.d.a(mtdVar.a.a);
        if (a == -1) {
            return false;
        }
        long j2 = this.d.n(a, this.h).d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        mtdVar.e = j;
        return true;
    }

    @Override // defpackage.mvq
    protected final mtl C(mtl mtlVar) {
        mte mteVar = this.d;
        Object obj = mte.c;
        Object obj2 = mteVar.d;
        Object obj3 = mtlVar.a;
        if (obj2 != null && this.d.d.equals(obj3)) {
            obj3 = mte.c;
        }
        return mtlVar.a(obj3);
    }

    @Override // defpackage.mvq
    public final void D() {
        if (this.f) {
            return;
        }
        this.j = true;
        G();
    }

    @Override // defpackage.mvq, defpackage.mtn
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final mtd w(mtl mtlVar, mxt mxtVar, long j) {
        mtd mtdVar = new mtd(mtlVar, mxtVar, j);
        lti.c(mtdVar.c == null);
        mtdVar.c = this.e;
        if (this.k) {
            mtdVar.m(mtlVar.a(H(mtlVar.a)));
            return mtdVar;
        }
        this.i = mtdVar;
        if (!this.j) {
            this.j = true;
            G();
        }
        return mtdVar;
    }

    @Override // defpackage.msn, defpackage.msa
    public final void n() {
        this.k = false;
        this.j = false;
        super.n();
    }

    @Override // defpackage.mvq, defpackage.msa, defpackage.mtn
    public final void q(lqw lqwVar) {
        if (this.l) {
            this.d = this.d.r(new mvm(this.d.b, lqwVar));
        } else {
            this.d = mte.s(lqwVar);
        }
        this.e.q(lqwVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    @Override // defpackage.mvq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void u(defpackage.lru r15) {
        /*
            r14 = this;
            boolean r0 = r14.k
            r1 = 0
            if (r0 == 0) goto L18
            mte r0 = r14.d
            mte r15 = r0.r(r15)
            r14.d = r15
            mtd r15 = r14.i
            if (r15 == 0) goto La6
            long r2 = r15.e
            r14.I(r2)
            goto La6
        L18:
            boolean r0 = r15.q()
            if (r0 == 0) goto L37
            boolean r0 = r14.l
            if (r0 == 0) goto L29
            mte r0 = r14.d
            mte r15 = r0.r(r15)
            goto L33
        L29:
            java.lang.Object r0 = defpackage.lrt.a
            java.lang.Object r2 = defpackage.mte.c
            mte r3 = new mte
            r3.<init>(r15, r0, r2)
            r15 = r3
        L33:
            r14.d = r15
            goto La6
        L37:
            lrt r0 = r14.g
            r2 = 0
            r15.p(r2, r0)
            lrt r0 = r14.g
            long r3 = r0.l
            java.lang.Object r0 = r0.b
            mtd r5 = r14.i
            if (r5 == 0) goto L69
            mte r6 = r14.d
            lrs r7 = r14.h
            mtl r8 = r5.a
            java.lang.Object r8 = r8.a
            r6.o(r8, r7)
            lrs r6 = r14.h
            long r6 = r6.e
            long r8 = r5.b
            long r6 = r6 + r8
            mte r5 = r14.d
            lrt r8 = r14.g
            lrt r2 = r5.p(r2, r8)
            long r8 = r2.l
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 == 0) goto L69
            r12 = r6
            goto L6a
        L69:
            r12 = r3
        L6a:
            lrt r9 = r14.g
            lrs r10 = r14.h
            r11 = 0
            r8 = r15
            android.util.Pair r15 = r8.l(r9, r10, r11, r12)
            java.lang.Object r2 = r15.first
            java.lang.Object r15 = r15.second
            java.lang.Long r15 = (java.lang.Long) r15
            long r3 = r15.longValue()
            boolean r15 = r14.l
            if (r15 == 0) goto L89
            mte r15 = r14.d
            mte r15 = r15.r(r8)
            goto L8e
        L89:
            mte r15 = new mte
            r15.<init>(r8, r0, r2)
        L8e:
            r14.d = r15
            mtd r15 = r14.i
            if (r15 == 0) goto La6
            boolean r0 = r14.I(r3)
            if (r0 == 0) goto La6
            mtl r15 = r15.a
            java.lang.Object r0 = r15.a
            java.lang.Object r0 = r14.H(r0)
            mtl r1 = r15.a(r0)
        La6:
            r15 = 1
            r14.l = r15
            r14.k = r15
            mte r15 = r14.d
            r14.l(r15)
            if (r1 == 0) goto Lba
            mtd r15 = r14.i
            defpackage.lti.f(r15)
            r15.m(r1)
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mtg.u(lru):void");
    }

    @Override // defpackage.mvq, defpackage.mtn
    public final void v(mtj mtjVar) {
        mtd mtdVar = (mtd) mtjVar;
        if (mtdVar.d != null) {
            mtn mtnVar = mtdVar.c;
            lti.f(mtnVar);
            mtnVar.v(mtdVar.d);
        }
        if (mtjVar == this.i) {
            this.i = null;
        }
    }

    @Override // defpackage.msn, defpackage.mtn
    public final void t() {
    }
}
