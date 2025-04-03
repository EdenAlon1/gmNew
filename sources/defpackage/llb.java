package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class llb extends llc implements lkp {
    final lkr a;
    final /* synthetic */ lld b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public llb(lld lldVar, lkr lkrVar, llh llhVar) {
        super(lldVar, llhVar);
        this.b = lldVar;
        this.a = lkrVar;
    }

    @Override // defpackage.llc
    public final void b() {
        this.a.P().d(this);
    }

    @Override // defpackage.llc
    public final boolean c(lkr lkrVar) {
        return this.a == lkrVar;
    }

    @Override // defpackage.llc
    public final boolean ez() {
        return this.a.P().a().a(lkj.STARTED);
    }

    @Override // defpackage.lkp
    public final void hg(lkr lkrVar, lki lkiVar) {
        lkj a = this.a.P().a();
        if (a == lkj.DESTROYED) {
            this.b.k(this.c);
            return;
        }
        lkj lkjVar = null;
        while (lkjVar != a) {
            d(ez());
            lkjVar = a;
            a = this.a.P().a();
        }
    }
}
