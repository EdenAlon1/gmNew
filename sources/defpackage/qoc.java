package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qoc implements Runnable {
    private final qol a;
    private final qor b;
    private final Runnable c;

    public qoc(qol qolVar, qor qorVar, Runnable runnable) {
        this.a = qolVar;
        this.b = qorVar;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qop qopVar;
        if (this.a.j()) {
            this.a.g("canceled-at-delivery");
            return;
        }
        qor qorVar = this.b;
        if (qorVar.a()) {
            this.a.f(qorVar.a);
        } else {
            qol qolVar = this.a;
            synchronized (qolVar.d) {
                qopVar = qolVar.e;
            }
            if (qopVar != null) {
                qopVar.a(qorVar.c);
            }
        }
        if (this.b.d) {
            this.a.d("intermediate-response");
        } else {
            this.a.g("done");
        }
        Runnable runnable = this.c;
        if (runnable != null) {
            runnable.run();
        }
    }
}
