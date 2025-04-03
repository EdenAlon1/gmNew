package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fgeh extends fgea {
    protected final ffxx d;

    public fgeh(ffxx ffxxVar, ffhd ffhdVar, int i, int i2) {
        super(ffhdVar, i, i2);
        this.d = ffxxVar;
    }

    @Override // defpackage.fgea, defpackage.ffxx
    public final Object a(ffxy ffxyVar, ffgu ffguVar) {
        if (this.b == -3) {
            ffhd u = ffguVar.u();
            ffhd a = ffsa.a(u, this.a);
            if (ffkj.e(a, u)) {
                Object g = g(ffxyVar, ffguVar);
                if (g == ffhh.a) {
                    return g;
                }
            } else if (ffkj.e(a.get(ffgw.k), u.get(ffgw.k))) {
                ffhd u2 = ffguVar.u();
                if (!(ffxyVar instanceof fgfm) && !(ffxyVar instanceof fgff)) {
                    ffxyVar = new fgfq(ffxyVar, u2);
                }
                Object a2 = fgeb.a(a, ffxyVar, fghv.a(a), new fgeg(this, null), ffguVar);
                if (a2 == ffhh.a) {
                    return a2;
                }
            }
            return ffcu.a;
        }
        Object h = fgea.h(this, ffxyVar, ffguVar);
        if (h == ffhh.a) {
            return h;
        }
        return ffcu.a;
    }

    @Override // defpackage.fgea
    protected final Object b(ffxe ffxeVar, ffgu ffguVar) {
        Object g = g(new fgfm(ffxeVar), ffguVar);
        return g == ffhh.a ? g : ffcu.a;
    }

    protected abstract Object g(ffxy ffxyVar, ffgu ffguVar);

    @Override // defpackage.fgea
    public final String toString() {
        return this.d + " -> " + super.toString();
    }
}
