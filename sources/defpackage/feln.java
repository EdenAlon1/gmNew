package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feln implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ fema b;

    public feln(fema femaVar, int i) {
        this.a = i;
        this.b = femaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f.k(this.a);
    }
}
