package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duxr implements erqj {
    final /* synthetic */ duxu a;

    public duxr(duxu duxuVar) {
        this.a = duxuVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }

    @Override // defpackage.erqj
    public final void hx(final Throwable th) {
        this.a.a().execute(new Runnable() { // from class: duxq
            @Override // java.lang.Runnable
            public final void run() {
                Throwable th2 = th;
                if (!(th2 instanceof RuntimeException)) {
                    throw new IllegalStateException(th2);
                }
                throw ((RuntimeException) th2);
            }
        });
    }
}
