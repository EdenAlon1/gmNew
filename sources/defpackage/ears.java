package defpackage;

import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ears {
    private final emyl A;
    private final emyl B;
    private final emyl C;
    private final emyl D;
    private final emyl E;
    private final emyl F;
    private final emyl G;
    private final emyl H;
    public final eflf a;
    public final emyl b;
    public final emyl c;
    public final emyl d;
    public final emyl e;
    public final emyl f;
    public final emyl g;
    public final emyl h;
    public final emyl i;
    public final emyl j;
    public final emyl k;
    public final emyl l;
    public final emyl m;
    public final emyl n;
    public final emyl o;
    public final emyl p;
    public final emyl q;
    public final emyl r;
    public final emyl s;
    public final emyl t;
    public final emyl u;
    public final emyl v;
    public final emyl w;
    public final emyl x;
    private final efle y;
    private final emyl z;

    public ears(ScheduledExecutorService scheduledExecutorService, efkv efkvVar, Application application) {
        emys.a(new emyl() { // from class: eaqd
            @Override // defpackage.emyl
            public final Object get() {
                efkw c = ears.this.a.c("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new efla("app_package_name", String.class), new efla("path", String.class), new efla("status_code", Integer.class));
                c.c();
                return c;
            }
        });
        this.b = emys.a(new emyl() { // from class: eaqf
            @Override // defpackage.emyl
            public final Object get() {
                efkw c = ears.this.a.c("/client_streamz/gnp_android/http/gnp_http_client/request_count", new efla("app_package_name", String.class), new efla("client_impl", String.class), new efla("path", String.class), new efla("status_code", Integer.class), new efla("purpose", String.class));
                c.c();
                return c;
            }
        });
        this.c = emys.a(new emyl() { // from class: eaqr
            @Override // defpackage.emyl
            public final Object get() {
                efkw c = ears.this.a.c("/client_streamz/gnp_android/push/decryption/request_count", new efla("app_package_name", String.class), new efla("failure", Boolean.class), new efla("has_placeholder", Boolean.class), new efla("fetched_threads", Boolean.class));
                c.c();
                return c;
            }
        });
        this.d = emys.a(new emyl() { // from class: eard
            @Override // defpackage.emyl
            public final Object get() {
                efky d = ears.this.a.d("/client_streamz/gnp_android/push/decryption/latency", new efla("app_package_name", String.class), new efla("failure", Boolean.class), new efla("fetched_threads", Boolean.class));
                d.c();
                return d;
            }
        });
        emys.a(new emyl() { // from class: earf
            @Override // defpackage.emyl
            public final Object get() {
                efkw c = ears.this.a.c("/client_streamz/gnp_android/chime/chime_account_storage_facade/insert_account_to_both_storages_count", new efla("app_package_name", String.class), new efla("gnp_insertion_equals_chime", Boolean.class));
                c.c();
                return c;
            }
        });
        emys.a(new emyl() { // from class: earg
            @Override // defpackage.emyl
            public final Object get() {
                efkw c = ears.this.a.c("/client_streamz/gnp_android/chime/chime_account_storage_facade/remove_account_from_both_storages_count", new efla("app_package_name", String.class), new efla("gnp_removal_equals_chime", Boolean.class));
                c.c();
                return c;
            }
        });
        emys.a(new emyl() { // from class: earh
            @Override // defpackage.emyl
            public final Object get() {
                efkw c = ears.this.a.c("/client_streamz/gnp_android/chime/chime_account_storage_facade/update_account_on_both_storages_count", new efla("app_package_name", String.class), new efla("gnp_update_equals_chime", Boolean.class));
                c.c();
                return c;
            }
        });
        emys.a(new emyl() { // from class: eari
            @Override // defpackage.emyl
            public final Object get() {
                efkw c = ears.this.a.c("/client_streamz/gnp_android/storage/chimegnp_storage_comparison", new efla("app_package_name", String.class), new efla("accounts_count_equal", Boolean.class), new efla("accounts_content_equal", Boolean.class), new efla("migration_performed", Boolean.class));
                c.c();
                return c;
            }
        });
        emys.a(new emyl() { // from class: earj
            @Override // defpackage.emyl
            public final Object get() {
                efkw c = ears.this.a.c("/client_streamz/chime_android/sdk/registration/request_builder_count", new efla("app_package_name", String.class), new efla("encryption_requested", Boolean.class), new efla("key_generation_result", Boolean.class));
                c.c();
                return c;
            }
        });
        this.z = emys.a(new emyl() { // from class: earl
            @Override // defpackage.emyl
            public final Object get() {
                efkw c = ears.this.a.c("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new efla("app_package_name", String.class), new efla("status", String.class));
                c.c();
                return c;
            }
        });
        this.A = emys.a(new emyl() { // from class: eaqo
            @Override // defpackage.emyl
            public final Object get() {
                efkw c = ears.this.a.c("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new efla("app_package_name", String.class), new efla("status", String.class));
                c.c();
                return c;
            }
        });
        emys.a(new emyl() { // from class: eaqz
            @Override // defpackage.emyl
            public final Object get() {
                efkw c = ears.this.a.c("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new efla("app_package_name", String.class), new efla("requested_tray_limit", Integer.class), new efla("above_tray_limit_count", Integer.class), new efla("requested_slot_limit", Integer.class), new efla("above_slot_limit_count", Integer.class));
                c.c();
                return c;
            }
        });
        this.e = emys.a(new emyl() { // from class: eark
            @Override // defpackage.emyl
            public final Object get() {
                efky d = ears.this.a.d("/client_streamz/chime_android/push/decompression/latency", new efla("app_package_name", String.class), new efla("failure", Boolean.class));
                d.c();
                return d;
            }
        });
        this.f = emys.a(new emyl() { // from class: earm
            @Override // defpackage.emyl
            public final Object get() {
                efkw c = ears.this.a.c("/client_streamz/gnp_android/registration/registration_request_builder_count", new efla("app_package_name", String.class), new efla("encryption_requested", Boolean.class), new efla("key_generation_result", Boolean.class));
                c.c();
                return c;
            }
        });
        emys.a(new emyl() { // from class: earn
            @Override // defpackage.emyl
            public final Object get() {
                efkw c = ears.this.a.c("/client_streamz/gnp_android/job/chime_job_count", new efla("app_package_name", String.class), new efla("android_sdk_version", Integer.class), new efla("is_gnp_job", Boolean.class), new efla("job_key", String.class), new efla("executed_in_place", Boolean.class), new efla("result", String.class));
                c.c();
                return c;
            }
        });
        this.g = emys.a(new emyl() { // from class: earo
            @Override // defpackage.emyl
            public final Object get() {
                efkw c = ears.this.a.c("/client_streamz/gnp_android/registration/registration_request_count", new efla("app_package_name", String.class), new efla("registration_reason", String.class), new efla("status", String.class));
                c.c();
                return c;
            }
        });
        this.B = emys.a(new emyl() { // from class: earp
            @Override // defpackage.emyl
            public final Object get() {
                efkw c = ears.this.a.c("/client_streamz/gnp_android/job/input_builder_result_count", new efla("app_package_name", String.class), new efla("is_success", Boolean.class));
                c.c();
                return c;
            }
        });
        this.C = emys.a(new emyl() { // from class: earq
            @Override // defpackage.emyl
            public final Object get() {
                efkw c = ears.this.a.c("/client_streamz/gnp_android/growthkit_logging_count", new efla("package_name", String.class), new efla("which_log", String.class), new efla("status", String.class));
                c.c();
                return c;
            }
        });
        this.D = emys.a(new emyl() { // from class: earr
            @Override // defpackage.emyl
            public final Object get() {
                efkw c = ears.this.a.c("/client_streamz/gnp_android/growthkit_started_count", new efla("package_name", String.class), new efla("status", String.class));
                c.c();
                return c;
            }
        });
        this.E = emys.a(new emyl() { // from class: eaqe
            @Override // defpackage.emyl
            public final Object get() {
                efkw c = ears.this.a.c("/client_streamz/gnp_android/growthkit_job_count", new efla("package_name", String.class), new efla("job_tag", String.class), new efla("status", String.class));
                c.c();
                return c;
            }
        });
        this.h = emys.a(new emyl() { // from class: eaqg
            @Override // defpackage.emyl
            public final Object get() {
                efkw c = ears.this.a.c("/client_streamz/gnp_android/promotion_shown_count", new efla("package_name", String.class), new efla("promotion_type", String.class));
                c.c();
                return c;
            }
        });
        this.i = emys.a(new emyl() { // from class: eaqh
            @Override // defpackage.emyl
            public final Object get() {
                efkw c = ears.this.a.c("/client_streamz/gnp_android/promotion_expired_count", new efla("package_name", String.class), new efla("account_type", String.class));
                c.c();
                return c;
            }
        });
        this.j = emys.a(new emyl() { // from class: eaqi
            @Override // defpackage.emyl
            public final Object get() {
                efky d = ears.this.a.d("/client_streamz/gnp_android/promotion_expiration_overdue", new efla("package_name", String.class), new efla("account_type", String.class));
                d.c();
                return d;
            }
        });
        this.k = emys.a(new emyl() { // from class: eaqj
            @Override // defpackage.emyl
            public final Object get() {
                efkw c = ears.this.a.c("/client_streamz/gnp_android/trigger_applied_count", new efla("package_name", String.class));
                c.c();
                return c;
            }
        });
        this.l = emys.a(new emyl() { // from class: eaqk
            @Override // defpackage.emyl
            public final Object get() {
                efkw c = ears.this.a.c("/client_streamz/gnp_android/targeting_applied_count", new efla("package_name", String.class));
                c.c();
                return c;
            }
        });
        this.m = emys.a(new emyl() { // from class: eaql
            @Override // defpackage.emyl
            public final Object get() {
                efkw c = ears.this.a.c("/client_streamz/gnp_android/promotion_filtering_start_count", new efla("package_name", String.class), new efla("account_type", String.class));
                c.c();
                return c;
            }
        });
        this.n = emys.a(new emyl() { // from class: eaqm
            @Override // defpackage.emyl
            public final Object get() {
                efkw c = ears.this.a.c("/client_streamz/gnp_android/promotion_passed_ui_support_filter_count", new efla("package_name", String.class));
                c.c();
                return c;
            }
        });
        this.o = emys.a(new emyl() { // from class: eaqn
            @Override // defpackage.emyl
            public final Object get() {
                efkw c = ears.this.a.c("/client_streamz/gnp_android/promotion_passed_event_triggering_filter_count", new efla("package_name", String.class));
                c.c();
                return c;
            }
        });
        this.p = emys.a(new emyl() { // from class: eaqp
            @Override // defpackage.emyl
            public final Object get() {
                efkw c = ears.this.a.c("/client_streamz/gnp_android/promotion_passed_capping_filter_count", new efla("package_name", String.class));
                c.c();
                return c;
            }
        });
        this.F = emys.a(new emyl() { // from class: eaqq
            @Override // defpackage.emyl
            public final Object get() {
                efkw c = ears.this.a.c("/client_streamz/gnp_android/growthkit_impressions_count", new efla("package_name", String.class), new efla("user_action", String.class));
                c.c();
                return c;
            }
        });
        this.q = emys.a(new emyl() { // from class: eaqs
            @Override // defpackage.emyl
            public final Object get() {
                efkw c = ears.this.a.c("/client_streamz/gnp_android/growthkit_promotions_fetched", new efla("package_name", String.class), new efla("account_type", String.class));
                c.c();
                return c;
            }
        });
        this.G = emys.a(new emyl() { // from class: eaqt
            @Override // defpackage.emyl
            public final Object get() {
                efkw c = ears.this.a.c("/client_streamz/gnp_android/growthkit_network_library_count", new efla("package_name", String.class), new efla("network_library", String.class), new efla("status", String.class), new efla("account_type", String.class), new efla("fetch_reason", String.class));
                c.c();
                return c;
            }
        });
        this.r = emys.a(new emyl() { // from class: eaqu
            @Override // defpackage.emyl
            public final Object get() {
                efkw c = ears.this.a.c("/client_streamz/gnp_android/growthkit_event_logged", new efla("package_name", String.class), new efla("account_type", String.class), new efla("event_code", String.class));
                c.c();
                return c;
            }
        });
        this.s = emys.a(new emyl() { // from class: eaqv
            @Override // defpackage.emyl
            public final Object get() {
                efky d = ears.this.a.d("/client_streamz/gnp_android/growthkit_event_processing_latency", new efla("package_name", String.class), new efla("cache_enabled", Boolean.class), new efla("optimized_flow", Boolean.class), new efla("promo_shown", Boolean.class));
                d.c();
                return d;
            }
        });
        this.t = emys.a(new emyl() { // from class: eaqw
            @Override // defpackage.emyl
            public final Object get() {
                efky d = ears.this.a.d("/client_streamz/gnp_android/growthkit_event_queue_time", new efla("package_name", String.class), new efla("cache_enabled", Boolean.class), new efla("optimized_flow", Boolean.class), new efla("promo_shown", Boolean.class));
                d.c();
                return d;
            }
        });
        emys.a(new emyl() { // from class: eaqx
            @Override // defpackage.emyl
            public final Object get() {
                efkw c = ears.this.a.c("/client_streamz/gnp_android/ui_executor_execute_calling_thread", new efla("app_package_name", String.class), new efla("is_ui_thread", Boolean.class));
                c.c();
                return c;
            }
        });
        this.u = emys.a(new emyl() { // from class: eaqy
            @Override // defpackage.emyl
            public final Object get() {
                efky d = ears.this.a.d("/client_streamz/gnp_android/inapp_cross_app_capping_read_latency", new efla("package_name", String.class), new efla("did_fail", Boolean.class));
                d.c();
                return d;
            }
        });
        this.v = emys.a(new emyl() { // from class: eara
            @Override // defpackage.emyl
            public final Object get() {
                efky d = ears.this.a.d("/client_streamz/gnp_android/inapp_cross_app_capping_write_latency", new efla("package_name", String.class), new efla("did_fail", Boolean.class));
                d.c();
                return d;
            }
        });
        this.H = emys.a(new emyl() { // from class: earb
            @Override // defpackage.emyl
            public final Object get() {
                efkw c = ears.this.a.c("/client_streamz/gnp_android/gnp/registration/registration_account_id_matching", new efla("app_package_name", String.class), new efla("result", String.class));
                c.c();
                return c;
            }
        });
        this.w = emys.a(new emyl() { // from class: earc
            @Override // defpackage.emyl
            public final Object get() {
                efkw c = ears.this.a.c("/client_streamz/gnp_android/gnp/account/username_change_result", new efla("app_package_name", String.class), new efla("is_failure", Boolean.class));
                c.c();
                return c;
            }
        });
        this.x = emys.a(new emyl() { // from class: eare
            @Override // defpackage.emyl
            public final Object get() {
                efkw c = ears.this.a.c("/client_streamz/gnp_android/gnp/account/account_removal_result", new efla("app_package_name", String.class), new efla("is_failure", Boolean.class));
                c.c();
                return c;
            }
        });
        eflf e = eflf.e("gnp_android");
        this.a = e;
        efle efleVar = e.c;
        if (efleVar == null) {
            this.y = efli.c(efkvVar, scheduledExecutorService, e, application);
        } else {
            this.y = efleVar;
            ((efli) efleVar).f = efkvVar;
        }
    }

    public final void a(String str, boolean z) {
        ((efkw) this.B.get()).a(str, Boolean.valueOf(z));
    }

    public final void b(String str, String str2) {
        ((efkw) this.H.get()).a(str, str2);
    }

    public final void c(String str, String str2) {
        ((efkw) this.A.get()).a(str, str2);
    }

    public final void d(int i, String str, String str2) {
        ((efkw) this.z.get()).b(i, str, str2);
    }

    public final void e(String str, String str2) {
        ((efkw) this.F.get()).a(str, str2);
    }

    public final void f(String str, String str2, String str3) {
        ((efkw) this.E.get()).a(str, str2, str3);
    }

    public final void g(String str, String str2) {
        ((efkw) this.D.get()).a(str, str2);
    }

    public final void h(String str, String str2) {
        ((efkw) this.C.get()).a(str, "Clearcut", str2);
    }

    public final void i(String str, String str2, String str3, String str4) {
        ((efkw) this.G.get()).a(str, "GnpHttpClient_ExperimentGroup", str2, str3, str4);
    }
}
