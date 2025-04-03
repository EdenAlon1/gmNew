package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ptc {
    public final prv a;
    private final qbc b;

    public ptc(prv prvVar, qbc qbcVar) {
        prvVar.getClass();
        qbcVar.getClass();
        this.a = prvVar;
        this.b = qbcVar;
    }

    public final /* synthetic */ void a(psb psbVar) {
        b(psbVar, null);
    }

    public final void b(final psb psbVar, final pre preVar) {
        this.b.a(new Runnable() { // from class: ptb
            @Override // java.lang.Runnable
            public final void run() {
                ptc.this.a.g(psbVar, preVar);
            }
        });
    }

    public final void c(psb psbVar, int i) {
        this.b.a(new qaq(this.a, psbVar, false, i));
    }
}
