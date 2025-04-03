package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aphw implements cnjv, aqge {
    private final ffbr a;
    private final ctbl b;

    public aphw(ffbr ffbrVar, ctbk ctbkVar) {
        ctbkVar.getClass();
        this.a = ffbrVar;
        this.b = ctbkVar.a(new aphv());
    }

    @Override // defpackage.aqge
    public final ctbx a(final aqgd aqgdVar) {
        return this.b.a(new ctbf() { // from class: apht
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                return aqgd.this.a();
            }
        }, "DefaultSmsAppObservableSupplier::register", "DefaultSmsAppObservableSupplier::callback", "DefaultSmsAppObservableSupplier::unregister");
    }

    @Override // defpackage.aqge
    public final elfl b() {
        elfl e = elfo.e(c());
        e.getClass();
        return e;
    }

    @Override // defpackage.aqge
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Boolean c() {
        return Boolean.valueOf(((ctvs) this.a.b()).d());
    }

    @Override // defpackage.cnjv
    public final elfl fM(boolean z) {
        this.b.c(new Supplier() { // from class: aphu
            @Override // java.util.function.Supplier
            public final Object get() {
                return ffcu.a;
            }
        }, "DefaultSmsAppObservableSupplier::notify");
        elfl e = elfo.e(null);
        e.getClass();
        return e;
    }
}
