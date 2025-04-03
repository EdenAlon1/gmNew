package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fepk implements Runnable {
    final /* synthetic */ feao a;
    final /* synthetic */ fdyc b;
    final /* synthetic */ fepl c;

    public fepk(fepl feplVar, feao feaoVar, fdyc fdycVar) {
        this.a = feaoVar;
        this.b = fdycVar;
        this.c = feplVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fepl feplVar = this.c;
        feqc feqcVar = feplVar.b;
        if (feplVar != feqcVar.u || feqcVar.v) {
            return;
        }
        feqcVar.o(this.a);
        fdyc fdycVar = this.b;
        if (fdycVar != fdyc.SHUTDOWN) {
            this.c.b.H.b(2, "Entering {0} state with picker: {1}", fdycVar, this.a);
            this.c.b.p.a(this.b);
        }
    }
}
