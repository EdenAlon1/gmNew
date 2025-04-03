package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqmw implements aqge {
    public final ffsk a;
    public final becj b;
    public final ffbr c;
    public final aoku d;
    public ctbx e;
    public final ctbl f;
    private final ffsk g;
    private final ctbk h;

    public aqmw(ffsk ffskVar, ffsk ffskVar2, ctbk ctbkVar, becj becjVar, ffbr ffbrVar, aoku aokuVar) {
        this.a = ffskVar;
        this.g = ffskVar2;
        this.h = ctbkVar;
        this.b = becjVar;
        this.c = ffbrVar;
        this.d = aokuVar;
        this.f = ctbkVar.a(new aqmt(this));
    }

    public static final bopc d(String str) {
        bopd a = bopg.a();
        a.z("createRecipientBusinessInfo");
        if (str == null) {
            return a.b();
        }
        bopf bopfVar = new bopf();
        bopfVar.b(str);
        a.k(new bope(bopfVar));
        return a.b();
    }

    @Override // defpackage.aqge
    public final ctbx a(final aqgd aqgdVar) {
        return this.f.a(new ctbf() { // from class: aqmr
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                return aqgd.this.a();
            }
        }, "RecipientBusinessInfoObservableSupplier::register", "RecipientBusinessInfoObservableSupplier::callback", "RecipientBusinessInfoObservableSupplier::unregister");
    }

    @Override // defpackage.aqge
    public final elfl b() {
        elfl c;
        c = axol.c(this.g, ffhe.a, ffsm.a, new aqms(this, null));
        return c;
    }

    @Override // defpackage.aqge
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }
}
