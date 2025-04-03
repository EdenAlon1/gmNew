package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lll implements lkp {
    final /* synthetic */ lki a;
    final /* synthetic */ fflb b;
    final /* synthetic */ ffsk c;
    final /* synthetic */ lki d;
    final /* synthetic */ ffrf e;
    final /* synthetic */ fgjb f;
    final /* synthetic */ ffjm g;

    public lll(lki lkiVar, fflb fflbVar, ffsk ffskVar, lki lkiVar2, ffrf ffrfVar, fgjb fgjbVar, ffjm ffjmVar) {
        this.a = lkiVar;
        this.b = fflbVar;
        this.c = ffskVar;
        this.d = lkiVar2;
        this.e = ffrfVar;
        this.f = fgjbVar;
        this.g = ffjmVar;
    }

    @Override // defpackage.lkp
    public final void hg(lkr lkrVar, lki lkiVar) {
        if (lkiVar == this.a) {
            this.b.a = ffqy.d(this.c, null, null, new llk(this.f, this.g, null), 3);
            return;
        }
        if (lkiVar == this.d) {
            ffud ffudVar = (ffud) this.b.a;
            if (ffudVar != null) {
                ffudVar.t(null);
            }
            this.b.a = null;
        }
        if (lkiVar == lki.ON_DESTROY) {
            this.e.w(ffcu.a);
        }
    }
}
