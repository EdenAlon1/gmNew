package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgei extends fgeh {
    public fgei(ffxx ffxxVar, ffhd ffhdVar, int i, int i2) {
        super(ffxxVar, ffhdVar, i, i2);
    }

    @Override // defpackage.fgea
    protected final fgea c(ffhd ffhdVar, int i, int i2) {
        return new fgei(this.d, ffhdVar, i, i2);
    }

    @Override // defpackage.fgea
    public final ffxx f() {
        return this.d;
    }

    @Override // defpackage.fgeh
    protected final Object g(ffxy ffxyVar, ffgu ffguVar) {
        Object a = this.d.a(ffxyVar, ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }

    public /* synthetic */ fgei(ffxx ffxxVar, ffhd ffhdVar, int i, int i2, int i3) {
        super(ffxxVar, (i3 & 2) != 0 ? ffhe.a : ffhdVar, (i3 & 4) != 0 ? -3 : i, (i3 & 8) != 0 ? 1 : i2);
    }
}
