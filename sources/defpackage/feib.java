package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feib implements Runnable {
    final /* synthetic */ feid a;

    public feib(feid feidVar) {
        this.a = feidVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        feid feidVar = this.a;
        feqq feqqVar = feidVar.b;
        fdxd fdxdVar = feidVar.h;
        feqqVar.e();
        feidVar.h = fdxdVar;
        this.a.b.b();
    }
}
