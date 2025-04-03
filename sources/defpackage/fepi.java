package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fepi implements Runnable {
    final /* synthetic */ feqc a;

    public fepi(feqc feqcVar) {
        this.a = feqcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        feqc feqcVar = this.a;
        if (feqcVar.u == null) {
            return;
        }
        feqcVar.j();
    }
}
