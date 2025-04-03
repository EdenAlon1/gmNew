package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axre implements axrc {
    public final Object a;
    private final ffxx b;

    public axre(ffxx ffxxVar, Object obj) {
        this.b = ffxxVar;
        this.a = obj;
        if (ffxxVar instanceof fgcq) {
            throw new IllegalArgumentException("Shared flows are not allowed here. Consider `InitialValuedStateFlow` for state flows.");
        }
    }

    @Override // defpackage.ffxx
    public final Object a(ffxy ffxyVar, ffgu ffguVar) {
        Object a = new ffzh(new axrd(this, null), this.b).a(ffxyVar, ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }

    @Override // defpackage.axrc
    public final Object b() {
        return this.a;
    }
}
