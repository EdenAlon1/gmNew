package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qnx implements Runnable {
    final /* synthetic */ qol a;
    final /* synthetic */ qny b;

    public qnx(qny qnyVar, qol qolVar) {
        this.a = qolVar;
        this.b = qnyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.a.put(this.a);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
