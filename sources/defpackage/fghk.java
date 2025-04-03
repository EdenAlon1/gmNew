package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fghk extends ffqq implements ffhs {
    public final ffgu e;

    public fghk(ffhd ffhdVar, ffgu ffguVar) {
        super(ffhdVar, true);
        this.e = ffguVar;
    }

    @Override // defpackage.ffhs
    public final ffhs dI() {
        ffgu ffguVar = this.e;
        if (ffguVar instanceof ffhs) {
            return (ffhs) ffguVar;
        }
        return null;
    }

    @Override // defpackage.ffuq
    protected void hR(Object obj) {
        ffgu ffguVar = this.e;
        fggl.a(ffhi.c(ffguVar), ffrv.a(obj, ffguVar));
    }

    @Override // defpackage.ffuq
    protected final boolean hS() {
        return true;
    }

    @Override // defpackage.ffqq
    protected void hV(Object obj) {
        ffgu ffguVar = this.e;
        ffguVar.w(ffrv.a(obj, ffguVar));
    }

    @Override // defpackage.ffhs
    public final void dJ() {
    }
}
