package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aphg implements apga {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/api/messaging/message/compose/constraints/emergency/EmergencyComposeConstraintsSupplier");
    public final ffsk b;
    public final aqge c;
    public final aqge d;
    public final aqge e;
    public ctbx f;
    public final ctbl g;
    private final ffsk h;
    private final ffbr i;

    public aphg(ffsk ffskVar, ffsk ffskVar2, ffbr ffbrVar, ctbk ctbkVar, aqge aqgeVar, aqge aqgeVar2, aqge aqgeVar3) {
        this.b = ffskVar;
        this.h = ffskVar2;
        this.i = ffbrVar;
        this.c = aqgeVar;
        this.d = aqgeVar2;
        this.e = aqgeVar3;
        this.g = ctbkVar.a(new aphd(this));
    }

    @Override // defpackage.aqge
    public final ctbx a(final aqgd aqgdVar) {
        return this.g.a(new ctbf() { // from class: apha
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                return aqgd.this.a();
            }
        }, "EmergencyComposeConstraintsSupplier:register", "EmergencyComposeConstraintsSupplier:callback", "EmergencyComposeConstraintsSupplier:unregister");
    }

    @Override // defpackage.aqge
    public final elfl b() {
        elfl c;
        c = axol.c(this.h, ffhe.a, ffsm.a, new aphb(this, null));
        return c;
    }

    @Override // defpackage.aqge
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.apga
    public final elfl d() {
        return e().d();
    }

    public final apga e() {
        aqge aqgeVar = this.c;
        if (!(aqgeVar instanceof aqgb)) {
            return (apga) aqgeVar;
        }
        aqge aqgeVar2 = ((aqgb) aqgeVar).e;
        aqgeVar2.getClass();
        return (apga) aqgeVar2;
    }

    public final boolean f(apkn apknVar) {
        if (apknVar != null) {
            return ((cqoh) this.i.b()).f().isBefore(apknVar.e);
        }
        return false;
    }
}
