package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fens implements Runnable {
    final /* synthetic */ feoi a;

    public fens(feoi feoiVar) {
        this.a = feoiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.r.a == fdyc.IDLE) {
            this.a.d.a(2, "CONNECTING as requested");
            this.a.b(fdyc.CONNECTING);
            this.a.h();
        }
    }
}
