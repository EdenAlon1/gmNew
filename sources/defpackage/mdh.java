package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mdh extends mdj {
    public mbb a;
    public mbv b;
    private lqf c;
    private final lqg d;

    public mdh(lqg lqgVar, mdt mdtVar) {
        super(mdtVar);
        this.d = lqgVar;
    }

    @Override // defpackage.mdj, defpackage.mbh
    public final void b(final lqh lqhVar) {
        this.n.d(new mds() { // from class: mdf
            @Override // defpackage.mds
            public final void a() {
                mbv mbvVar = mdh.this.b;
                lti.f(mbvVar);
                int i = lqhVar.b;
                ltz.e();
                mcj mcjVar = mbvVar.a;
                lti.c(lvf.T(mcjVar.j, i));
                mch mchVar = (mch) mcjVar.j.get(i);
                mbl mblVar = mchVar.a;
                final long j = mchVar.b;
                final lzm lzmVar = (lzm) mblVar;
                lzmVar.c.d(new mds() { // from class: lzd
                    @Override // defpackage.mds
                    public final void a() {
                        lzm.this.e(j);
                    }
                });
                mcjVar.j.remove(i);
                mcjVar.b();
            }
        });
    }

    @Override // defpackage.mdj, defpackage.mbh
    public final void c() {
        lti.f(this.a);
        final mbb mbbVar = this.a;
        mbbVar.getClass();
        this.n.d(new mds() { // from class: mdg
            @Override // defpackage.mds
            public final void a() {
                mbb.this.c();
            }
        });
    }

    @Override // defpackage.mdj
    public final int d() {
        mbb mbbVar = this.a;
        lti.f(mbbVar);
        return mbbVar.d();
    }

    @Override // defpackage.mdj
    protected final synchronized void e() {
        mbb mbbVar = this.a;
        lti.f(mbbVar);
        mbbVar.w();
        super.e();
    }

    @Override // defpackage.mdj
    public final void h(mbj mbjVar) {
        this.a = new mbb(this.d, mbjVar, this.n);
    }

    @Override // defpackage.mdj
    public final void i() {
        this.n.d(new mds() { // from class: mdd
            @Override // defpackage.mds
            public final void a() {
                mbb mbbVar = mdh.this.a;
                lti.f(mbbVar);
                mbbVar.f();
                int i = lyt.a;
            }
        });
    }

    @Override // defpackage.mdj
    public final void r(lqf lqfVar, boolean z) {
        this.c = lqfVar;
    }

    @Override // defpackage.mdj
    public final void y(final int i, final long j) {
        final lqf lqfVar = this.c;
        lti.f(lqfVar);
        lti.f(this.b);
        this.n.d(new mds() { // from class: mde
            @Override // defpackage.mds
            public final void a() {
                int i2 = i;
                lqc lqcVar = lqfVar.a;
                lqh lqhVar = new lqh(i2, -1, lqcVar.v, lqcVar.w);
                mbb mbbVar = mdh.this.a;
                lti.f(mbbVar);
                mbbVar.e(lqhVar, j);
                int i3 = lyt.a;
            }
        });
    }

    @Override // defpackage.mdj
    public final void z(mbv mbvVar) {
        this.b = mbvVar;
    }

    @Override // defpackage.mdj
    public final void g() {
    }
}
