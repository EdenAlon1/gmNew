package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mdb implements lsh {
    public long a;
    final /* synthetic */ mdc b;

    public mdb(mdc mdcVar) {
        this.b = mdcVar;
    }

    @Override // defpackage.lsh
    public final void a() {
        this.b.b.execute(new Runnable() { // from class: mcz
            @Override // java.lang.Runnable
            public final void run() {
                mdb mdbVar = mdb.this;
                mdbVar.b.a.a(mdbVar.a);
            }
        });
    }

    @Override // defpackage.lsh
    public final void b(final lsf lsfVar) {
        this.b.b.execute(new Runnable() { // from class: mda
            @Override // java.lang.Runnable
            public final void run() {
                mdb.this.b.a.b(lsfVar);
            }
        });
    }

    @Override // defpackage.lsh
    public final void c(final long j) {
        if (j == 0) {
            this.b.c = true;
            j = 0;
        }
        this.a = j;
        this.b.b.execute(new Runnable() { // from class: mcx
            @Override // java.lang.Runnable
            public final void run() {
                mdb.this.b.a.k(j);
            }
        });
    }

    @Override // defpackage.lsh
    public final void d(final float f) {
        this.b.b.execute(new Runnable() { // from class: mcw
            @Override // java.lang.Runnable
            public final void run() {
                mdb.this.b.a.d(f);
            }
        });
    }

    @Override // defpackage.lsh
    public final void e(final int i, final int i2) {
        this.b.b.execute(new Runnable() { // from class: mcy
            @Override // java.lang.Runnable
            public final void run() {
                mdb.this.b.a.e(i, i2);
            }
        });
    }

    @Override // defpackage.lsh
    public final /* synthetic */ void f() {
    }
}
