package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehke implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ ehkh b;

    public ehke(ehkh ehkhVar, int i) {
        this.a = i;
        this.b = ehkhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.M(this.a);
    }
}
