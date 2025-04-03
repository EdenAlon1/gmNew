package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhqw implements Runnable {
    final /* synthetic */ dhre a;
    final /* synthetic */ dhqx b;

    public dhqw(dhqx dhqxVar, dhre dhreVar) {
        this.a = dhreVar;
        this.b = dhqxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.a) {
            this.b.b.e(this.a.i());
        }
    }
}
