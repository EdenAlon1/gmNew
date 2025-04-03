package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lkn extends lkl implements lkp {
    public final lkk a;
    private final ffhd b;

    public lkn(lkk lkkVar, ffhd ffhdVar) {
        ffhdVar.getClass();
        this.a = lkkVar;
        this.b = ffhdVar;
        if (lkkVar.a() == lkj.DESTROYED) {
            ffui.d(ffhdVar, null);
        }
    }

    @Override // defpackage.ffsk
    public final ffhd hT() {
        return this.b;
    }

    @Override // defpackage.lkp
    public final void hg(lkr lkrVar, lki lkiVar) {
        if (this.a.a().compareTo(lkj.DESTROYED) <= 0) {
            this.a.d(this);
            ffui.d(this.b, null);
        }
    }
}
