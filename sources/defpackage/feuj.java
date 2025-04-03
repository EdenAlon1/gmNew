package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feuj implements Runnable {
    private final fdyg a;
    private final Throwable b;

    public feuj(fdyg fdygVar, Throwable th) {
        this.a = fdygVar;
        this.b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.j(this.b);
    }
}
