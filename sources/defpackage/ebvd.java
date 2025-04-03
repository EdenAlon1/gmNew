package defpackage;

import android.app.Application;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebvd {
    public final eflf a;
    public final emyl b = emys.a(new emyl() { // from class: ebuo
        @Override // defpackage.emyl
        public final Object get() {
            efkw c = ebvd.this.a.c("/client_streamz/og_android/invalid_user_profile_switch", new efla("app_package", String.class));
            c.c();
            return c;
        }
    });
    public final emyl c = emys.a(new emyl() { // from class: ebuz
        @Override // defpackage.emyl
        public final Object get() {
            efkw c = ebvd.this.a.c("/client_streamz/og_android/switch_profile", new efla("result", String.class), new efla("has_category_launcher", Boolean.class), new efla("has_category_info", Boolean.class), new efla("user_in_target_user_profiles", Boolean.class), new efla("api_version", Integer.class), new efla("app_package", String.class));
            c.c();
            return c;
        }
    });
    public final emyl d = emys.a(new emyl() { // from class: ebva
        @Override // defpackage.emyl
        public final Object get() {
            efkw c = ebvd.this.a.c("/client_streamz/og_android/load_owners_count", new efla("implementation", String.class), new efla("result", String.class), new efla("number_of_owners", Integer.class), new efla("app_package", String.class), new efla("load_cached", Boolean.class));
            c.c();
            return c;
        }
    });
    public final emyl e = emys.a(new emyl() { // from class: ebvb
        @Override // defpackage.emyl
        public final Object get() {
            efkw c = ebvd.this.a.c("/client_streamz/og_android/load_owner_count", new efla("implementation", String.class), new efla("result", String.class), new efla("app_package", String.class));
            c.c();
            return c;
        }
    });
    public final emyl f;
    public final emyl g;
    public final emyl h;
    public final emyl i;
    public final emyl j;
    public final emyl k;
    private final efle l;

    public ebvd(ScheduledExecutorService scheduledExecutorService, efkv efkvVar, Application application) {
        emys.a(new emyl() { // from class: ebvc
            @Override // defpackage.emyl
            public final Object get() {
                efkw c = ebvd.this.a.c("/client_streamz/og_android/legacy/load_owners", new efla("app_package", String.class));
                c.c();
                return c;
            }
        });
        this.f = emys.a(new emyl() { // from class: ebup
            @Override // defpackage.emyl
            public final Object get() {
                efkw c = ebvd.this.a.c("/client_streamz/og_android/load_owner_avatar_count", new efla("implementation", String.class), new efla("avatar_size", String.class), new efla("result", String.class), new efla("app_package", String.class), new efla("load_cached", Boolean.class));
                c.c();
                return c;
            }
        });
        this.g = emys.a(new emyl() { // from class: ebuq
            @Override // defpackage.emyl
            public final Object get() {
                efky d = ebvd.this.a.d("/client_streamz/og_android/load_owners_latency", new efla("implementation", String.class), new efla("result", String.class), new efla("number_of_owners", Integer.class), new efla("app_package", String.class), new efla("load_cached", Boolean.class));
                d.c();
                return d;
            }
        });
        this.h = emys.a(new emyl() { // from class: ebur
            @Override // defpackage.emyl
            public final Object get() {
                efky d = ebvd.this.a.d("/client_streamz/og_android/load_owner_avatar_latency", new efla("implementation", String.class), new efla("avatar_size", String.class), new efla("result", String.class), new efla("app_package", String.class), new efla("load_cached", Boolean.class));
                d.c();
                return d;
            }
        });
        this.i = emys.a(new emyl() { // from class: ebus
            @Override // defpackage.emyl
            public final Object get() {
                efkw c = ebvd.this.a.c("/client_streamz/og_android/profile_cache/get_people_me", new efla("result", String.class), new efla("app_package", String.class));
                c.c();
                return c;
            }
        });
        emys.a(new emyl() { // from class: ebut
            @Override // defpackage.emyl
            public final Object get() {
                efkw c = ebvd.this.a.c("/client_streamz/og_android/lazy_provider_count", new efla("app_package", String.class));
                c.c();
                return c;
            }
        });
        emys.a(new emyl() { // from class: ebuu
            @Override // defpackage.emyl
            public final Object get() {
                efkw c = ebvd.this.a.c("/client_streamz/og_android/visual_elements_usage", new efla("app_package", String.class), new efla("ve_enabled", Boolean.class), new efla("ve_provided", Boolean.class));
                c.c();
                return c;
            }
        });
        this.j = emys.a(new emyl() { // from class: ebuv
            @Override // defpackage.emyl
            public final Object get() {
                efkw c = ebvd.this.a.c("/client_streamz/og_android/safety_exp_account_menu_refresh", new efla[0]);
                c.c();
                return c;
            }
        });
        emys.a(new emyl() { // from class: ebuw
            @Override // defpackage.emyl
            public final Object get() {
                efkw c = ebvd.this.a.c("/client_streamz/og_android/safety_exp_default_entry_point", new efla[0]);
                c.c();
                return c;
            }
        });
        this.k = emys.a(new emyl() { // from class: ebux
            @Override // defpackage.emyl
            public final Object get() {
                efkw c = ebvd.this.a.c("/client_streamz/og_android/safety_exp_color_resolve_crash", new efla("app_package", String.class), new efla("has_material", Boolean.class), new efla("is_material3", Boolean.class), new efla("is_light_theme", Boolean.class), new efla("failing_attribute_index", Integer.class), new efla("is_next_attribute_failing", Boolean.class));
                c.c();
                return c;
            }
        });
        emys.a(new emyl() { // from class: ebuy
            @Override // defpackage.emyl
            public final Object get() {
                efkw c = ebvd.this.a.c("/client_streamz/og_android/anchor_view_is_shown_on_screen_data", new efla("part_of_the_view_is_visible", Boolean.class), new efla("is_laid_out", Boolean.class), new efla("is_shown", Boolean.class));
                c.c();
                return c;
            }
        });
        eflf e = eflf.e("STREAMZ_ONEGOOGLE_ANDROID");
        this.a = e;
        efle efleVar = e.c;
        if (efleVar == null) {
            this.l = efli.c(efkvVar, scheduledExecutorService, e, application);
        } else {
            this.l = efleVar;
            ((efli) efleVar).f = efkvVar;
        }
    }
}
