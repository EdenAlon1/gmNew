package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejli implements Runnable {
    private final Runnable a;
    private boolean b = false;

    public ejli(Runnable runnable) {
        this.a = runnable;
    }

    final void a() {
        efbd.c();
        this.b = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        efbd.c();
        if (this.b) {
            return;
        }
        this.a.run();
    }
}
