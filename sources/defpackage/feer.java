package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feer implements lkp {
    final /* synthetic */ fecr a;

    public feer(fecr fecrVar) {
        this.a = fecrVar;
    }

    @Override // defpackage.lkp
    public final void hg(lkr lkrVar, lki lkiVar) {
        if (lkiVar == lki.ON_DESTROY) {
            lkrVar.P().d(this);
            this.a.a();
        }
    }
}
