package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apku implements ctbj {
    final /* synthetic */ apkx a;

    public apku(apkx apkxVar) {
        this.a = apkxVar;
    }

    @Override // defpackage.ctbj
    public final void fN() {
        final apkx apkxVar = this.a;
        final apkx apkxVar2 = this.a;
        aqgd aqgdVar = new aqgd() { // from class: apks
            @Override // defpackage.aqgd
            public final elfl a() {
                return apkx.this.d();
            }
        };
        final apkx apkxVar3 = this.a;
        apkxVar.f = ctbt.b(apkxVar.c.a(apkx.e(), "EmergencySessionSupplier#suggestionsQueryRbm").f(new ctbf() { // from class: apkp
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                return apkx.this.d();
            }
        }, "EmergencySessionSupplier::register", "EmergencySessionSupplier::callback", "EmergencySessionSupplier::unregister"), apkxVar2.e.a(aqgdVar), apkxVar3.d.f.a(new ctbf() { // from class: apkt
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                return apkx.this.d();
            }
        }, "EmergencySessionTimeoutTracker::Register", "EmergencySessionTimeoutTracker::Callback", "EmergencySessionTimeoutTracker::Unregister"));
    }

    @Override // defpackage.ctbj
    public final void fO() {
        ctbx ctbxVar = this.a.f;
        if (ctbxVar != null) {
            ctbxVar.a();
        }
        this.a.f = null;
    }
}
