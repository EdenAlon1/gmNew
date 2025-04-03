package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qvb implements Runnable {
    final /* synthetic */ qve a;

    public qvb(qve qveVar) {
        this.a = qveVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (true) {
            qve qveVar = this.a;
            boolean z = qveVar.c;
            try {
                qveVar.c((qvd) qveVar.b.remove());
                qvc qvcVar = qveVar.d;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
