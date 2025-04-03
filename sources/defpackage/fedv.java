package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fedv implements Runnable {
    final /* synthetic */ fedx a;
    final /* synthetic */ fedz b;

    public fedv(fedz fedzVar, fedx fedxVar) {
        this.a = fedxVar;
        this.b = fedzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c.unregisterNetworkCallback(this.a);
    }
}
