package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qwg implements Runnable {
    final /* synthetic */ qwj a;
    private final rih b;

    public qwg(qwj qwjVar, rih rihVar) {
        this.a = qwjVar;
        this.b = rihVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.a()) {
            synchronized (this.a) {
                if (this.a.a.c(this.b)) {
                    this.a.l.d();
                    qwj qwjVar = this.a;
                    try {
                        this.b.e(qwjVar.l, qwjVar.h);
                        this.a.g(this.b);
                    } catch (Throwable th) {
                        throw new qvf(th);
                    }
                }
                this.a.d();
            }
        }
    }
}
