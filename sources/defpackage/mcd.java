package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mcd implements lsh {
    final /* synthetic */ mcj a;

    public mcd(mcj mcjVar) {
        this.a = mcjVar;
    }

    @Override // defpackage.lsh
    public final void a() {
        this.a.e.execute(new Runnable() { // from class: mcb
            @Override // java.lang.Runnable
            public final void run() {
                mcj mcjVar = mcd.this.a;
                mcjVar.d.a(mcjVar.p);
            }
        });
    }

    @Override // defpackage.lsh
    public final void b(lsf lsfVar) {
        this.a.a(lsfVar);
    }

    @Override // defpackage.lsh
    public final void c(long j) {
        if (j == 0) {
            this.a.q = true;
            j = 0;
        }
        mcj mcjVar = this.a;
        mcjVar.p = j;
        mcjVar.e.execute(new Runnable() { // from class: mcc
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }

    @Override // defpackage.lsh
    public final void d(float f) {
        this.a.e.execute(new Runnable() { // from class: mca
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }

    @Override // defpackage.lsh
    public final void e(final int i, final int i2) {
        this.a.e.execute(new Runnable() { // from class: mbz
            @Override // java.lang.Runnable
            public final void run() {
                mcd.this.a.d.e(i, i2);
            }
        });
    }

    @Override // defpackage.lsh
    public final void f() {
        mcj mcjVar = this.a;
        mcjVar.n = true;
        mcjVar.b();
    }
}
