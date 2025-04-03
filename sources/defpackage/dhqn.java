package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhqn implements Runnable {
    final /* synthetic */ dhqo a;

    public dhqn(dhqo dhqoVar) {
        this.a = dhqoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a.a) {
            this.a.b.a();
        }
    }
}
