package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aela implements aqge {
    public final aegr a;
    private final ffsk b;
    private final ctbl c;

    public aela(ffsk ffskVar, ctbk ctbkVar, aegr aegrVar) {
        ffskVar.getClass();
        ctbkVar.getClass();
        this.b = ffskVar;
        this.a = aegrVar;
        this.c = ctbkVar.a(new aekz());
    }

    @Override // defpackage.aqge
    public final ctbx a(final aqgd aqgdVar) {
        return this.c.a(new ctbf() { // from class: aekx
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                return aqgd.this.a();
            }
        }, "GroupUpgradeCounterSupplier::register", "GroupUpgradeCounterSupplier::callback", "GroupUpgradeCounterSupplier::unregister");
    }

    @Override // defpackage.aqge
    public final elfl b() {
        ffhe ffheVar = ffhe.a;
        ffsm ffsmVar = ffsm.a;
        return axol.a(ffra.b(this.b, ekxi.a(ffheVar), ffsmVar, new aeky(null, this)));
    }

    @Override // defpackage.aqge
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }
}
