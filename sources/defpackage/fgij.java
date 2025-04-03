package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgij extends fgii {
    public final Runnable a;

    public fgij(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }

    public final String toString() {
        Runnable runnable = this.a;
        String a = ffsp.a(runnable);
        String b = ffsp.b(runnable);
        long j = this.g;
        boolean z = this.h;
        String str = fgik.a;
        return "Task[" + a + "@" + b + ", " + j + ", " + (true != z ? "Non-blocking" : "Blocking") + "]";
    }
}
