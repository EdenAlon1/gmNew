package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdmz implements fdmy {
    public static final ecwj a;
    public static final ecwj b;
    public static final ecwj c;
    public static final ecwj d;
    public static final ecwj e;
    public static final ecwj f;
    public static final ecwj g;

    static {
        ecwh b2 = new ecwh(ecvd.a("com.google.android.gms.icing.mdd")).c().b();
        a = b2.m("api_logging_sample_interval", 100L);
        b2.m("cleanup_log_logging_sample_interval", 1000L);
        b = b2.m("group_stats_logging_sample_interval", 100L);
        c = b2.m("mdd_android_sharing_sample_interval", 100L);
        d = b2.m("mdd_default_sample_interval", 100L);
        b2.m("mdd_download_events_sample_interval", 1L);
        b2.m("mobstore_file_service_stats_sample_interval", 100L);
        e = b2.m("network_stats_logging_sample_interval", 100L);
        f = b2.m("pds_migration_compare_results_sample_interval", 10000L);
        b2.m("silent_feedback_sample_interval", 100L);
        g = b2.m("storage_stats_logging_sample_interval", 100L);
    }

    @Override // defpackage.fdmy
    public final long a() {
        return ((Long) a.b()).longValue();
    }

    @Override // defpackage.fdmy
    public final long b() {
        return ((Long) b.b()).longValue();
    }

    @Override // defpackage.fdmy
    public final long c() {
        return ((Long) c.b()).longValue();
    }

    @Override // defpackage.fdmy
    public final long d() {
        return ((Long) d.b()).longValue();
    }

    @Override // defpackage.fdmy
    public final long e() {
        return ((Long) e.b()).longValue();
    }

    @Override // defpackage.fdmy
    public final long f() {
        return ((Long) f.b()).longValue();
    }

    @Override // defpackage.fdmy
    public final long g() {
        return ((Long) g.b()).longValue();
    }
}
