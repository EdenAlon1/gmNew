package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgef extends fgea {
    private final ffxx d;
    private final int e;

    public fgef(ffxx ffxxVar, int i, ffhd ffhdVar, int i2, int i3) {
        super(ffhdVar, i2, i3);
        this.d = ffxxVar;
        this.e = i;
    }

    @Override // defpackage.fgea
    protected final Object b(ffxe ffxeVar, ffgu ffguVar) {
        int i = fgjn.a;
        Object a = this.d.a(new fgee((ffud) ffguVar.u().get(ffud.c), new fgjm(this.e), ffxeVar, new fgfm(ffxeVar)), ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }

    @Override // defpackage.fgea
    protected final fgea c(ffhd ffhdVar, int i, int i2) {
        return new fgef(this.d, this.e, ffhdVar, i, i2);
    }

    @Override // defpackage.fgea
    protected final String d() {
        return "concurrency=" + this.e;
    }

    @Override // defpackage.fgea
    public final ffxg e(ffsk ffskVar) {
        return ffxd.a(ffskVar, this.a, this.b, new fgdz(this, null));
    }
}
