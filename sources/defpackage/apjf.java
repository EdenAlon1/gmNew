package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apjf implements aqge {
    public final ffsk a;
    public final aqge b;
    public final aqge c;
    public ctbx d;
    public final ctbl e;

    public apjf(ffsk ffskVar, ctbk ctbkVar, aqge aqgeVar, aqge aqgeVar2) {
        this.a = ffskVar;
        this.b = aqgeVar;
        this.c = aqgeVar2;
        this.e = ctbkVar.a(new apjc(this));
    }

    @Override // defpackage.aqge
    public final ctbx a(final aqgd aqgdVar) {
        return this.e.a(new ctbf() { // from class: apiz
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                return aqgd.this.a();
            }
        }, "GeofilterConstraintSupplier:register", "GeofilterConstraintSupplier:callback", "GeofilterConstraintSupplier:unregister");
    }

    @Override // defpackage.aqge
    public final elfl b() {
        elfl c;
        c = axol.c(this.a, ffhe.a, ffsm.a, new apja(this, null));
        return c;
    }

    @Override // defpackage.aqge
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }
}
