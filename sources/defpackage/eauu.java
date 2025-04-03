package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eauu implements Runnable {
    final /* synthetic */ eail a;
    final /* synthetic */ int b;

    public eauu(eail eailVar, int i) {
        this.a = eailVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a();
        ((ensz) ((ensz) eauv.a.h()).h("com/google/android/libraries/notifications/platform/tiktok/executor/GnpExecutorApiImpl$2", "run", 128, "GnpExecutorApiImpl.java")).r("Finished Broadcast execution [%d].", this.b);
    }
}
