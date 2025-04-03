package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdnd implements fdnb {
    public static final ecwj a;
    public static final ecwj b;
    public static final ecwj c;
    public static final ecwj d;
    public static final ecwj e;
    public static final ecwj f;
    public static final ecwj g;
    public static final ecwj h;

    static {
        ecwh b2 = new ecwh(ecvd.a("com.google.android.gms.icing.mdd")).c().b();
        b2.m("PeriodicTaskFlags__cellular_charging_gcm_task_cadence", 5L);
        b2.o("PeriodicTaskFlags__cellular_charging_gcm_task_enabled", true);
        a = b2.m("cellular_charging_gcm_task_period", 21600L);
        b = b2.p("cellular_task_constraint_overrides", new ecwg() { // from class: fdnc
            @Override // defpackage.ecwg
            public final Object a(byte[] bArr) {
                return (dwow) eyfy.parseFrom(dwow.a, bArr);
            }
        }, "CAEQARgA");
        b2.m("PeriodicTaskFlags__charging_gcm_task_cadence", 5L);
        b2.o("PeriodicTaskFlags__charging_gcm_task_enabled", true);
        c = b2.m("charging_gcm_task_period", 21600L);
        b2.m("PeriodicTaskFlags__maintenance_gcm_task_cadence", 0L);
        b2.o("PeriodicTaskFlags__maintenance_gcm_task_enabled", true);
        d = b2.m("maintenance_gcm_task_period", 86400L);
        e = b2.p("maintenance_task_constraint_overrides", new ecwg() { // from class: fdnc
            @Override // defpackage.ecwg
            public final Object a(byte[] bArr) {
                return (dwow) eyfy.parseFrom(dwow.a, bArr);
            }
        }, "CAEQARgA");
        f = b2.p("routine_task_constraint_overrides", new ecwg() { // from class: fdnc
            @Override // defpackage.ecwg
            public final Object a(byte[] bArr) {
                return (dwow) eyfy.parseFrom(dwow.a, bArr);
            }
        }, "CAEQARgA");
        b2.m("PeriodicTaskFlags__wifi_charging_gcm_task_cadence", 5L);
        b2.o("PeriodicTaskFlags__wifi_charging_gcm_task_enabled", true);
        g = b2.m("wifi_charging_gcm_task_period", 21600L);
        h = b2.p("wifi_task_constraint_overrides", new ecwg() { // from class: fdnc
            @Override // defpackage.ecwg
            public final Object a(byte[] bArr) {
                return (dwow) eyfy.parseFrom(dwow.a, bArr);
            }
        }, "CAEQARgA");
    }

    @Override // defpackage.fdnb
    public final long a() {
        return ((Long) a.b()).longValue();
    }

    @Override // defpackage.fdnb
    public final long b() {
        return ((Long) c.b()).longValue();
    }

    @Override // defpackage.fdnb
    public final long c() {
        return ((Long) d.b()).longValue();
    }

    @Override // defpackage.fdnb
    public final long d() {
        return ((Long) g.b()).longValue();
    }

    @Override // defpackage.fdnb
    public final dwow e() {
        return (dwow) b.b();
    }

    @Override // defpackage.fdnb
    public final dwow f() {
        return (dwow) e.b();
    }

    @Override // defpackage.fdnb
    public final dwow g() {
        return (dwow) f.b();
    }

    @Override // defpackage.fdnb
    public final dwow h() {
        return (dwow) h.b();
    }
}
