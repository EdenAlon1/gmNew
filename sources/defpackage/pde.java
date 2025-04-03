package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pde implements lkp {
    final /* synthetic */ pdr a;
    final /* synthetic */ pdq b;

    public pde(pdq pdqVar, pdr pdrVar) {
        this.b = pdqVar;
        this.a = pdrVar;
    }

    @Override // defpackage.lkp
    public final void hg(lkr lkrVar, lki lkiVar) {
        if (this.b.J()) {
            return;
        }
        lkrVar.P().d(this);
        if (this.a.C().isAttachedToWindow()) {
            this.b.H(this.a);
        }
    }
}
