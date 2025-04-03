package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enyk extends enym {
    public enyk() {
    }

    public static enyk c() {
        return new enyk(new enxo(1.0d, eobe.a), enxu.c());
    }

    @Override // defpackage.enym
    public final enxo a() {
        return new enxo(this.a);
    }

    @Override // defpackage.enym
    public final enxu b() {
        return new enxu(this.b);
    }

    public final enyl d() {
        return new enyl(new enxo(this.a), new enxu(this.b));
    }

    public final void e(enyl enylVar) {
        this.a.f(enylVar.a);
        this.b.i(enylVar.b);
    }

    public enyk(enxo enxoVar, enxu enxuVar) {
        super(enxoVar, enxuVar);
    }
}
