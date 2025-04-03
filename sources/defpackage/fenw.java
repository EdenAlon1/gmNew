package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fenw implements Runnable {
    final /* synthetic */ feoi a;

    public fenw(feoi feoiVar) {
        this.a = feoiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d.a(2, "Terminated");
        feoi feoiVar = this.a;
        fepy fepyVar = (fepy) feoiVar.a;
        fepyVar.b.j.w.remove(feoiVar);
        fdzq.c(fepyVar.b.j.I.e, feoiVar);
        fepyVar.b.j.l();
    }
}
