package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhqq implements Runnable {
    final /* synthetic */ dhre a;
    final /* synthetic */ dhqr b;

    public dhqq(dhqr dhqrVar, dhre dhreVar) {
        this.a = dhreVar;
        this.b = dhqrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.a) {
            this.b.b.a(this.a);
        }
    }
}
