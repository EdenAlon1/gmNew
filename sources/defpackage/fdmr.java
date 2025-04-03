package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdmr implements fdmq {
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
        a = b2.m("abs_free_space_after_download", 524288000L);
        b = b2.m("abs_free_space_after_download_extremely_low_storage_allowed", 2097152L);
        c = b2.m("abs_free_space_after_download_low_storage_allowed", 104857600L);
        d = b2.o("downloader_enforce_https", true);
        e = b2.m("downloader_max_retry_on_checksum_mismatch_count", 5L);
        f = b2.m("downloader_max_threads", 2L);
        g = b2.o("enforce_low_storage_behavior", true);
        h = b2.l("fraction_free_space_after_download", 0.1d);
        b2.m("time_to_wait_for_downloader", 120000L);
    }

    @Override // defpackage.fdmq
    public final double a() {
        return ((Double) h.b()).doubleValue();
    }

    @Override // defpackage.fdmq
    public final long b() {
        return ((Long) a.b()).longValue();
    }

    @Override // defpackage.fdmq
    public final long c() {
        return ((Long) b.b()).longValue();
    }

    @Override // defpackage.fdmq
    public final long d() {
        return ((Long) c.b()).longValue();
    }

    @Override // defpackage.fdmq
    public final long e() {
        return ((Long) e.b()).longValue();
    }

    @Override // defpackage.fdmq
    public final long f() {
        return ((Long) f.b()).longValue();
    }

    @Override // defpackage.fdmq
    public final boolean g() {
        return ((Boolean) d.b()).booleanValue();
    }

    @Override // defpackage.fdmq
    public final boolean h() {
        return ((Boolean) g.b()).booleanValue();
    }
}
