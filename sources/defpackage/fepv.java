package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fepv extends felb {
    final fdyn c;
    final febs d;
    final fdxj e;
    final /* synthetic */ fepw f;
    private final long g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public fepv(defpackage.fepw r3, defpackage.fdyn r4, defpackage.febs r5, defpackage.fdxj r6) {
        /*
            r2 = this;
            r2.f = r3
            feqc r3 = r3.c
            java.util.concurrent.Executor r0 = r3.h(r6)
            fepx r3 = r3.j
            fdys r1 = r6.b
            r2.<init>(r0, r3, r1)
            r2.c = r4
            r2.d = r5
            r2.e = r6
            long r3 = java.lang.System.nanoTime()
            r2.g = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fepv.<init>(fepw, fdyn, febs, fdxj):void");
    }

    @Override // defpackage.felb
    protected final void b() {
        this.f.c.m.execute(new fepu(this));
    }

    final void j() {
        fekm fekmVar;
        fdyn a = this.c.a();
        try {
            fdxo c = this.f.c(this.d, this.e.f(fdxt.f, Long.valueOf(System.nanoTime() - this.g)));
            synchronized (this) {
                if (this.b != null) {
                    fekmVar = null;
                } else {
                    super.i(c);
                    fekmVar = new fekm(this, this.a);
                }
            }
            if (fekmVar == null) {
                fepw fepwVar = this.f;
                fepwVar.c.m.execute(new fepu(this));
            } else {
                fepw fepwVar2 = this.f;
                fepwVar2.c.h(this.e).execute(new fept(this, fekmVar));
            }
        } finally {
            this.c.f(a);
        }
    }
}
