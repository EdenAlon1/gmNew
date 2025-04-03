package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fele implements Runnable {
    final /* synthetic */ feqq a;

    public fele(feqq feqqVar) {
        this.a = feqqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fepf fepfVar = (fepf) this.a;
        emxf.m(fepfVar.a.B.get(), "Channel must have been shut down");
        feqc feqcVar = fepfVar.a;
        feqcVar.C = true;
        feqcVar.n(false);
        fepfVar.a.l();
    }
}
