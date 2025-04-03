package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apjz implements aqge {
    public final ffsk a;
    public ctbx b;
    public final ctbl c;
    public final amrw d;

    public apjz(ffsk ffskVar, amrw amrwVar, ctbk ctbkVar) {
        this.a = ffskVar;
        this.d = amrwVar;
        this.c = ctbkVar.a(new apjy(this));
    }

    @Override // defpackage.aqge
    public final ctbx a(final aqgd aqgdVar) {
        return this.c.a(new ctbf() { // from class: apjt
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                return aqgd.this.a();
            }
        }, "EmergencyLocationPermissionSupplier:register", "EmergencyLocationPermissionSupplier:callback", "EmergencyLocationPermissionSupplier:unregister");
    }

    @Override // defpackage.aqge
    public final elfl b() {
        elfl c;
        c = axol.c(this.a, ffhe.a, ffsm.a, new apju(this, null));
        return c;
    }

    @Override // defpackage.aqge
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }
}
