package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bjn implements Runnable {
    final /* synthetic */ Runnable a;

    public bjn(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }
}
