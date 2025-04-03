package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class cbat extends bcps implements cbbn, cbbt {
    private cbbt a;

    public cbat(cbbt cbbtVar) {
        this.a = cbbtVar;
    }

    @Override // defpackage.cbbt
    public final void fW(cbbn cbbnVar) {
        cbbt cbbtVar;
        if (!i() || (cbbtVar = this.a) == null) {
            return;
        }
        cbbtVar.fW(cbbnVar);
    }

    @Override // defpackage.cbbt
    public final void fX(cbbn cbbnVar, cbcc cbccVar, boolean z) {
        cbbt cbbtVar;
        if (!i() || (cbbtVar = this.a) == null) {
            return;
        }
        cbbtVar.fX(cbbnVar, cbccVar, z);
    }

    @Override // defpackage.bcpr
    protected final void h() {
        this.a = null;
    }
}
