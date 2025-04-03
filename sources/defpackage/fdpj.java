package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdpj implements fdpi {
    public static final ecwj a;
    public static final ecwj b;
    public static final ecwj c;
    public static final ecwj d;

    static {
        ecwh b2 = new ecwh(ecvd.a("com.google.lighter.android")).a().b();
        a = b2.o("capability_reporting_enabled", false);
        b = b2.m("register_capabilities_check_change_interval_millis", 86400000L);
        c = b2.m("register_capabilities_refresh_jitter_ms", 7200000L);
        d = b2.m("register_capabilities_report_anyway_interval_millis", 2592000000L);
    }

    @Override // defpackage.fdpi
    public final long a() {
        return ((Long) b.b()).longValue();
    }

    @Override // defpackage.fdpi
    public final long b() {
        return ((Long) c.b()).longValue();
    }

    @Override // defpackage.fdpi
    public final long c() {
        return ((Long) d.b()).longValue();
    }

    @Override // defpackage.fdpi
    public final boolean d() {
        return ((Boolean) a.b()).booleanValue();
    }
}
