package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgen extends fgeh {
    public final ffjn e;

    public fgen(ffjn ffjnVar, ffxx ffxxVar, ffhd ffhdVar, int i, int i2) {
        super(ffxxVar, ffhdVar, i, i2);
        this.e = ffjnVar;
    }

    @Override // defpackage.fgea
    protected final fgea c(ffhd ffhdVar, int i, int i2) {
        return new fgen(this.e, this.d, ffhdVar, i, i2);
    }

    @Override // defpackage.fgeh
    protected final Object g(ffxy ffxyVar, ffgu ffguVar) {
        boolean z = ffso.a;
        Object a = ffsl.a(new fgem(this, ffxyVar, null), ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }

    public /* synthetic */ fgen(ffjn ffjnVar, ffxx ffxxVar) {
        this(ffjnVar, ffxxVar, ffhe.a, -2, 1);
    }
}
