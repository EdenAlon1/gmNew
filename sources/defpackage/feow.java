package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feow implements Runnable {
    final /* synthetic */ feqc a;

    public feow(feqc feqcVar) {
        this.a = feqcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.B.get()) {
            return;
        }
        feqc feqcVar = this.a;
        if (feqcVar.u == null) {
            return;
        }
        feqcVar.i(false);
        this.a.j();
    }
}
