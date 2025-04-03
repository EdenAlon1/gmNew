package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feks implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ felb b;

    public feks(felb felbVar, int i) {
        this.a = i;
        this.b = felbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.e(this.a);
    }
}
