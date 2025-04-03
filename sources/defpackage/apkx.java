package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apkx implements aqge {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/api/messaging/message/compose/emergency/session/EmergencySessionSupplier");
    public final cqoh b;
    public final becj c;
    public final apld d;
    public final aqge e;
    public ctbx f;
    public final ctbl g;
    private final ffsk h;
    private final ffsk i;

    public apkx(ffsk ffskVar, ffsk ffskVar2, cqoh cqohVar, becj becjVar, ctbk ctbkVar, apld apldVar, aqge aqgeVar) {
        this.h = ffskVar;
        this.i = ffskVar2;
        this.b = cqohVar;
        this.c = becjVar;
        this.d = apldVar;
        this.e = aqgeVar;
        this.g = ctbkVar.a(new apku(this));
    }

    public static final bszg e() {
        String[] strArr = bszm.a;
        bszh bszhVar = new bszh(bszm.a);
        bszhVar.z("EmergencySessionSupplier.createEmergencySessionsTableQuery");
        bszhVar.r();
        return bszhVar.b();
    }

    @Override // defpackage.aqge
    public final ctbx a(final aqgd aqgdVar) {
        return this.g.a(new ctbf() { // from class: apkq
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                return aqgd.this.a();
            }
        }, "EmergencySessionSupplier:register", "EmergencySessionSupplier:callback", "EmergencySessionSupplier:unregister");
    }

    @Override // defpackage.aqge
    public final elfl b() {
        elfl c;
        c = axol.c(this.i, ffhe.a, ffsm.a, new apkr(this, null));
        return c;
    }

    @Override // defpackage.aqge
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }

    public final elfl d() {
        elfl c;
        c = axol.c(this.h, ffhe.a, ffsm.a, new apkw(this, null));
        return c;
    }
}
