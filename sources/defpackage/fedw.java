package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fedw implements Runnable {
    final /* synthetic */ fedy a;
    final /* synthetic */ fedz b;

    public fedw(fedz fedzVar, fedy fedyVar) {
        this.a = fedyVar;
        this.b = fedzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.unregisterReceiver(this.a);
    }
}
