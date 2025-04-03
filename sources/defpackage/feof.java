package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feof implements Runnable {
    final /* synthetic */ feog a;

    public feof(feog feogVar) {
        this.a = feogVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        feog feogVar = this.a;
        feogVar.c.n.remove(feogVar.a);
        if (this.a.c.r.a == fdyc.SHUTDOWN && this.a.c.n.isEmpty()) {
            this.a.c.e();
        }
    }
}
