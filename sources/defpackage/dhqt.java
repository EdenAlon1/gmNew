package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhqt implements Runnable {
    final /* synthetic */ dhre a;
    final /* synthetic */ dhqu b;

    public dhqt(dhqu dhquVar, dhre dhreVar) {
        this.a = dhreVar;
        this.b = dhquVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.a) {
            dhqv dhqvVar = this.b.b;
            Exception h = this.a.h();
            dfwv.n(h);
            dhqvVar.d(h);
        }
    }
}
