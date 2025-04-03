package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fedp implements Runnable {
    final /* synthetic */ fedq a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ feds c;

    public fedp(feds fedsVar, fedq fedqVar, Runnable runnable) {
        this.a = fedqVar;
        this.b = runnable;
        this.c = fedsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.execute(this.a);
    }

    public final String toString() {
        return String.valueOf(this.b.toString()).concat("(scheduled in SynchronizationContext)");
    }
}
