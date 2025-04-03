package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aelp implements aqge {
    public final ffsk a;
    public final awti b;
    public final aolr c;
    public final cqoh d;
    public final ctbl e;
    public ctbx f;
    private final ffsk g;

    public aelp(ctbk ctbkVar, ffsk ffskVar, ffsk ffskVar2, awti awtiVar, aolr aolrVar, cqoh cqohVar) {
        ctbkVar.getClass();
        ffskVar.getClass();
        ffskVar2.getClass();
        awtiVar.getClass();
        aolrVar.getClass();
        cqohVar.getClass();
        this.a = ffskVar;
        this.g = ffskVar2;
        this.b = awtiVar;
        this.c = aolrVar;
        this.d = cqohVar;
        this.e = ctbkVar.a(new aelm(this));
    }

    @Override // defpackage.aqge
    public final ctbx a(final aqgd aqgdVar) {
        return this.e.a(new ctbf() { // from class: aeli
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                return aqgd.this.a();
            }
        }, "HomeScreenActiveComposersSupplier::register", "HomeScreenActiveComposersSupplier::callback", "HomeScreenActiveComposersSupplier::unregister");
    }

    @Override // defpackage.aqge
    public final elfl b() {
        ffhe ffheVar = ffhe.a;
        ffsm ffsmVar = ffsm.a;
        return axol.a(ffra.b(this.g, ekxi.a(ffheVar), ffsmVar, new aelk(null, this)));
    }

    @Override // defpackage.aqge
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }
}
