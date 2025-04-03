package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feod implements Runnable {
    final /* synthetic */ feog a;

    public feod(feog feogVar) {
        this.a = feogVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        feog feogVar = this.a;
        feoi feoiVar = feogVar.c;
        feoiVar.u = null;
        if (feoiVar.s != null) {
            emxf.m(feoiVar.q == null, "Unexpected non-null activeTransport");
            feog feogVar2 = this.a;
            feogVar2.a.n(feogVar2.c.s);
            return;
        }
        fekh fekhVar = feoiVar.p;
        fekh fekhVar2 = feogVar.a;
        if (fekhVar == fekhVar2) {
            feoiVar.q = fekhVar2;
            this.a.c.p = null;
            feoi feoiVar2 = this.a.c;
            feoiVar2.t = feoiVar2.h.a();
            this.a.c.b(fdyc.READY);
        }
    }
}
