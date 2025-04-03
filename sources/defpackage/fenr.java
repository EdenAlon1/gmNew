package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fenr implements Runnable {
    final /* synthetic */ feoi a;

    public fenr(feoi feoiVar) {
        this.a = feoiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        feoi feoiVar = this.a;
        feoiVar.k = null;
        feoiVar.d.a(2, "CONNECTING after backoff");
        this.a.b(fdyc.CONNECTING);
        this.a.h();
    }
}
