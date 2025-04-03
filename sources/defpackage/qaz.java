package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qaz implements Runnable {
    private final qba a;
    private final pxs b;

    public qaz(qba qbaVar, pxs pxsVar) {
        this.a = qbaVar;
        this.b = pxsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a.e) {
            if (((qaz) this.a.c.remove(this.b)) != null) {
                qay qayVar = (qay) this.a.d.remove(this.b);
                if (qayVar != null) {
                    qayVar.b(this.b);
                }
            } else {
                ppt.c().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.b));
            }
        }
    }
}
