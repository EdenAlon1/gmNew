package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fesj implements Runnable {
    final /* synthetic */ fesk a;

    public fesj(fesk feskVar) {
        this.a = feskVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fesk feskVar = this.a;
        feskVar.b.execute(new fesi(feskVar));
    }
}
