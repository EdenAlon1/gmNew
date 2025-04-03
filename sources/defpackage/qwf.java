package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qwf implements Runnable {
    final /* synthetic */ qwj a;
    private final rih b;

    public qwf(qwj qwjVar, rih rihVar) {
        this.a = qwjVar;
        this.b = rihVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.a()) {
            synchronized (this.a) {
                if (this.a.a.c(this.b)) {
                    qwj qwjVar = this.a;
                    try {
                        this.b.d(qwjVar.j);
                    } catch (Throwable th) {
                        throw new qvf(th);
                    }
                }
                this.a.d();
            }
        }
    }
}
