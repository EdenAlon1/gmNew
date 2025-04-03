package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qaj implements Runnable {
    final qak a;
    final Runnable b;

    public qaj(qak qakVar, Runnable runnable) {
        this.a = qakVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.run();
            synchronized (this.a.b) {
                this.a.a();
            }
        } catch (Throwable th) {
            synchronized (this.a.b) {
                this.a.a();
                throw th;
            }
        }
    }
}
