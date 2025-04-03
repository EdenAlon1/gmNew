package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ffxs extends fgea {
    private final ffjm d;

    public ffxs(ffjm ffjmVar, ffhd ffhdVar, int i, int i2) {
        super(ffhdVar, i, i2);
        this.d = ffjmVar;
    }

    static /* synthetic */ Object g(ffxs ffxsVar, ffxe ffxeVar, ffgu ffguVar) {
        Object a = ffxsVar.d.a(ffxeVar, ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }

    @Override // defpackage.fgea
    protected Object b(ffxe ffxeVar, ffgu ffguVar) {
        return g(this, ffxeVar, ffguVar);
    }

    @Override // defpackage.fgea
    protected fgea c(ffhd ffhdVar, int i, int i2) {
        return new ffxs(this.d, ffhdVar, i, i2);
    }

    @Override // defpackage.fgea
    public final String toString() {
        return "block[" + this.d + "] -> " + super.toString();
    }

    public /* synthetic */ ffxs(ffjm ffjmVar) {
        this(ffjmVar, ffhe.a, -2, 1);
    }
}
