package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdmw implements fdmt {
    public static final ecwj a;
    public static final ecwj b;
    public static final ecwj c;
    public static final ecwj d;
    public static final ecwj e;
    public static final ecwj f;
    public static final ecwj g;
    public static final ecwj h;
    public static final ecwj i;
    public static final ecwj j;
    public static final ecwj k;
    public static final ecwj l;
    public static final ecwj m;
    public static final ecwj n;
    public static final ecwj o;
    public static final ecwj p;
    public static final ecwj q;
    public static final ecwj r;
    public static final ecwj s;
    public static final ecwj t;
    public static final ecwj u;
    public static final ecwj v;
    public static final ecwj w;
    public static final ecwj x;

    static {
        ecwh b2 = new ecwh(ecvd.a("com.google.android.gms.icing.mdd")).c().b();
        b2.o("gms_icing_mdd_add_configs_from_phenotype", true);
        b2.o("broadcast_newly_downloaded_groups", true);
        a = b2.p("build_id_overrides", new ecwg() { // from class: fdmu
            @Override // defpackage.ecwg
            public final Object a(byte[] bArr) {
                return (dwot) eyfy.parseFrom(dwot.a, bArr);
            }
        }, "");
        b2.o("gms_icing_mdd_cache_last_location", true);
        b2.o("clear_state_on_mdd_disabled", false);
        b = b2.o("delete_file_groups_with_files_missing", true);
        c = b2.o("disable_phenotype_namespace_migration_and_cleanup", false);
        b2.o("gms_mdd_download_first_on_wifi_then_on_any_network", true);
        b2.o("gms_mdd_dump_mdd_info", false);
        b2.o("enable_android_file_sharing", true);
        b2.o("enable_android_file_sharing_data_clean_up", true);
        b2.o("enable_android_sharing_daily_maintenance", false);
        b2.o("enable_client_error_logging", false);
        d = b2.o("enable_compressed_file", true);
        e = b2.o("enable_days_since_last_maintenance_tracking", true);
        b2.o("gms_mdd_enable_debug_ui", false);
        f = b2.o("enable_delayed_download", true);
        b2.o("enable_delta_download", true);
        b2.o("enable_download_stage_experiment_id_propagation", true);
        g = b2.o("enable_file_download_dedup_by_file_key", false);
        h = b2.o("enable_gdd_batch_sync", false);
        i = b2.o("enable_gdd_zwieback_id_propagation", false);
        j = b2.o("enable_isolated_structure_verification", true);
        b2.o("gms_mdd_enable_mdd_gcm_service", true);
        k = b2.o("enable_mdd_multi_variant_handling", false);
        b2.o("enable_mobile_data_download", true);
        b2.o("enable_mobstore_file_service", true);
        b2.o("enable_mobstore_file_service_rename", true);
        b2.o("enable_mobstore_file_service_whitelist", true);
        l = b2.o("enable_rng_based_device_stable_sampling", true);
        b2.o("enable_set_runtime_properties", true);
        m = b2.o("enable_sideloading", true);
        b2.o("gms_mdd_enable_silent_feedback", true);
        n = b2.o("enable_zip_folder", true);
        o = b2.m("FeatureFlags__file_key_version", 2L);
        b2.o("gcm_reschedule_only_once_per_process_start", true);
        b2.o("gms_mdd_switch_to_cronet", false);
        b2.m("gms_icing_mdd_location_s2_level", 10L);
        b2.m("gms_icing_mdd_task_await_time", 5L);
        p = b2.o("log_file_groups_with_files_missing", true);
        q = b2.o("log_network_stats", true);
        b2.o("gms_mdd_log_storage_stats", true);
        r = b2.o("gms_icing_mdd_delete_groups_removed_accounts", false);
        s = b2.o("gms_icing_mdd_delete_uninstalled_apps", true);
        t = b2.o("gms_icing_mdd_enable_download_pending_groups", true);
        u = b2.o("gms_icing_mdd_enable_garbage_collection", true);
        v = b2.o("gms_icing_mdd_enable_verify_pending_groups", true);
        w = b2.m("gms_icing_mdd_reset_trigger", 0L);
        b2.o("migrate_file_expiration_policy", true);
        b2.o("migrate_to_new_file_key", true);
        x = b2.p("FeatureFlags__pds_migration_state", new ecwg() { // from class: fdmv
            @Override // defpackage.ecwg
            public final Object a(byte[] bArr) {
                return (dwry) eyfy.parseFrom(dwry.a, bArr);
            }
        }, "");
        b2.o("remove_groupkeys_with_downloaded_field_not_set", true);
        b2.o("test_only_file_key_version", false);
    }

    @Override // defpackage.fdmt
    public final long a() {
        return ((Long) o.b()).longValue();
    }

    @Override // defpackage.fdmt
    public final long b() {
        return ((Long) w.b()).longValue();
    }

    @Override // defpackage.fdmt
    public final dwot c() {
        return (dwot) a.b();
    }

    @Override // defpackage.fdmt
    public final dwry d() {
        return (dwry) x.b();
    }

    @Override // defpackage.fdmt
    public final boolean e() {
        return ((Boolean) b.b()).booleanValue();
    }

    @Override // defpackage.fdmt
    public final boolean f() {
        return ((Boolean) c.b()).booleanValue();
    }

    @Override // defpackage.fdmt
    public final boolean g() {
        return ((Boolean) d.b()).booleanValue();
    }

    @Override // defpackage.fdmt
    public final boolean h() {
        return ((Boolean) e.b()).booleanValue();
    }

    @Override // defpackage.fdmt
    public final boolean i() {
        return ((Boolean) f.b()).booleanValue();
    }

    @Override // defpackage.fdmt
    public final boolean j() {
        return ((Boolean) g.b()).booleanValue();
    }

    @Override // defpackage.fdmt
    public final boolean k() {
        return ((Boolean) h.b()).booleanValue();
    }

    @Override // defpackage.fdmt
    public final boolean l() {
        return ((Boolean) i.b()).booleanValue();
    }

    @Override // defpackage.fdmt
    public final boolean m() {
        return ((Boolean) j.b()).booleanValue();
    }

    @Override // defpackage.fdmt
    public final boolean n() {
        return ((Boolean) k.b()).booleanValue();
    }

    @Override // defpackage.fdmt
    public final boolean o() {
        return ((Boolean) l.b()).booleanValue();
    }

    @Override // defpackage.fdmt
    public final boolean p() {
        return ((Boolean) m.b()).booleanValue();
    }

    @Override // defpackage.fdmt
    public final boolean q() {
        return ((Boolean) n.b()).booleanValue();
    }

    @Override // defpackage.fdmt
    public final boolean r() {
        return ((Boolean) p.b()).booleanValue();
    }

    @Override // defpackage.fdmt
    public final boolean s() {
        return ((Boolean) q.b()).booleanValue();
    }

    @Override // defpackage.fdmt
    public final boolean t() {
        return ((Boolean) r.b()).booleanValue();
    }

    @Override // defpackage.fdmt
    public final boolean u() {
        return ((Boolean) s.b()).booleanValue();
    }

    @Override // defpackage.fdmt
    public final boolean v() {
        return ((Boolean) t.b()).booleanValue();
    }

    @Override // defpackage.fdmt
    public final boolean w() {
        return ((Boolean) u.b()).booleanValue();
    }

    @Override // defpackage.fdmt
    public final boolean x() {
        return ((Boolean) v.b()).booleanValue();
    }
}
