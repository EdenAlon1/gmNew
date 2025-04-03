package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abw implements lkp, aal {
    final /* synthetic */ aca a;
    private final lkk b;
    private final abo c;
    private aal d;

    public abw(aca acaVar, lkk lkkVar, abo aboVar) {
        lkkVar.getClass();
        this.a = acaVar;
        this.b = lkkVar;
        this.c = aboVar;
        lkkVar.c(this);
    }

    @Override // defpackage.aal
    public final void b() {
        this.b.d(this);
        this.c.g(this);
        aal aalVar = this.d;
        if (aalVar != null) {
            aalVar.b();
        }
        this.d = null;
    }

    @Override // defpackage.lkp
    public final void hg(lkr lkrVar, lki lkiVar) {
        if (lkiVar == lki.ON_START) {
            this.d = this.a.a(this.c);
            return;
        }
        if (lkiVar != lki.ON_STOP) {
            if (lkiVar == lki.ON_DESTROY) {
                b();
            }
        } else {
            aal aalVar = this.d;
            if (aalVar != null) {
                aalVar.b();
            }
        }
    }
}
