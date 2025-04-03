package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fedq implements Runnable {
    final Runnable a;
    boolean b;
    boolean c;

    public fedq(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b) {
            return;
        }
        this.c = true;
        this.a.run();
    }
}
