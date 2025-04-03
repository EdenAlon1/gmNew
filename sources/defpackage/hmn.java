package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmn extends hmq {
    public static final hmn a = new hmn();

    private hmn() {
        super(1, 1);
    }

    @Override // defpackage.hmq
    protected final void a(hmv hmvVar, hep hepVar, hjv hjvVar, hjj hjjVar, hmr hmrVar) {
        Object c = hmvVar.c(0);
        boolean z = c instanceof hjl;
        int a2 = hmvVar.a(0);
        if (z) {
            hjjVar.a((hjl) c);
        }
        Object x = hjvVar.x(hjvVar.q, a2, c);
        if (x instanceof hjl) {
            hqe hqeVar = (hqe) hjjVar;
            hqeVar.d((hjl) x, hjvVar.g() - hjvVar.o(hjvVar.q, a2), -1, -1);
        } else if (x instanceof hio) {
            ((hio) x).b();
        }
    }
}
