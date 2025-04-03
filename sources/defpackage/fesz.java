package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fesz implements Runnable {
    final /* synthetic */ fetu a;

    public fesz(fetu fetuVar) {
        this.a = fetuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fetu fetuVar = this.a;
        if (fetuVar.G) {
            return;
        }
        fetuVar.C.e();
    }
}
