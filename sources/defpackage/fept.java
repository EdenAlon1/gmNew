package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fept implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ fepv b;

    public fept(fepv fepvVar, Runnable runnable) {
        this.a = runnable;
        this.b = fepvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
        fepv fepvVar = this.b;
        fepvVar.f.c.m.execute(new fepu(fepvVar));
    }
}
