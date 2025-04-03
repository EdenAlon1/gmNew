package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aral implements aqge {
    private final beci a;
    private final arak b;

    public aral(beci beciVar, arak arakVar) {
        this.a = beciVar;
        this.b = arakVar;
    }

    @Override // defpackage.aqge
    public final ctbx a(final aqgd aqgdVar) {
        return this.a.f(new ctbf() { // from class: araj
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                return aqgd.this.a();
            }
        }, "QueryObservableSupplier::register", "QueryObservableSupplier::callback", "QueryObservableSupplier::unregister");
    }

    @Override // defpackage.aqge
    public final elfl b() {
        return this.b.c();
    }

    @Override // defpackage.aqge
    public final Object c() {
        return ((ampm) this.b).d();
    }
}
