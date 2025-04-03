package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lnd implements lkp {
    final /* synthetic */ lkj a;
    final /* synthetic */ lkk b;
    final /* synthetic */ ffrf c;
    final /* synthetic */ ffix d;

    public lnd(lkj lkjVar, lkk lkkVar, ffrf ffrfVar, ffix ffixVar) {
        this.a = lkjVar;
        this.b = lkkVar;
        this.c = ffrfVar;
        this.d = ffixVar;
    }

    @Override // defpackage.lkp
    public final void hg(lkr lkrVar, lki lkiVar) {
        Object a;
        if (lkiVar != lkh.c(this.a)) {
            if (lkiVar == lki.ON_DESTROY) {
                this.b.d(this);
                this.c.w(ffci.a(new lko()));
                return;
            }
            return;
        }
        this.b.d(this);
        ffrf ffrfVar = this.c;
        try {
            a = this.d.invoke();
        } catch (Throwable th) {
            a = ffci.a(th);
        }
        ffrfVar.w(a);
    }
}
