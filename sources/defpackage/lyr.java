package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lyr implements mbh, mbi {
    public final mbj a;
    private final mbb b;
    private final mdt c;

    public lyr(lqg lqgVar, mbj mbjVar, mbj mbjVar2, mdt mdtVar) {
        this.a = mbjVar;
        this.b = new mbb(lqgVar, mbjVar2, mdtVar);
        this.c = mdtVar;
    }

    @Override // defpackage.mbi
    public final synchronized void a() {
        this.b.f();
    }

    @Override // defpackage.mbh
    public final void b(final lqh lqhVar) {
        this.c.d(new mds() { // from class: lyp
            @Override // defpackage.mds
            public final void a() {
                lyr.this.a.f(lqhVar);
            }
        });
    }

    @Override // defpackage.mbh
    public final synchronized void c() {
        this.b.c();
    }

    @Override // defpackage.mbh
    public final synchronized void w() {
        this.b.w();
        final mbj mbjVar = this.a;
        mbjVar.getClass();
        this.c.d(new mds() { // from class: lyq
            @Override // defpackage.mds
            public final void a() {
                mbj.this.c();
            }
        });
    }

    @Override // defpackage.mbi
    public final synchronized void x(lqh lqhVar, long j) {
        this.b.e(lqhVar, j);
    }
}
