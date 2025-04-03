package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdpa implements fdox {
    public static final edax a;
    public static final edax b;
    public static final edax c;
    public static final edax d;
    public static final edax e;
    public static final edax f;
    public static final edax g;
    public static final edax h;
    public static final edax i;
    public static final edax j;
    public static final edax k;
    public static final edax l;
    public static final edax m;
    public static final edax n;

    static {
        enpd enpdVar = enpd.a;
        a = edbk.g("SuperpacksFlags__additional_download_labels", new edbj() { // from class: fdoy
            @Override // defpackage.edbj
            public final Object a(Object obj) {
                return (rug) eyfy.parseFrom(rug.a, (byte[]) obj);
            }
        }, "Cg8KB3JlbGVhc2USBHByb2Q", "com.google.android.libraries.abuse.hades.moirai", enpdVar, true, false, false);
        b = edbk.f("SuperpacksFlags__always_download_on_startup", false, "com.google.android.libraries.abuse.hades.moirai", enpdVar, true, false, false);
        c = edbk.d("SuperpacksFlags__classification_count_limit_per_protection", 1000L, "com.google.android.libraries.abuse.hades.moirai", enpdVar, true, false, false);
        d = edbk.f("SuperpacksFlags__download_requires_charging", false, "com.google.android.libraries.abuse.hades.moirai", enpdVar, true, false, false);
        e = edbk.f("SuperpacksFlags__download_requires_wifi", false, "com.google.android.libraries.abuse.hades.moirai", enpdVar, true, false, false);
        f = edbk.f("SuperpacksFlags__enable_classification_count_based_protection_decay", true, "com.google.android.libraries.abuse.hades.moirai", enpdVar, true, false, false);
        g = edbk.f("SuperpacksFlags__enable_default_client_role", true, "com.google.android.libraries.abuse.hades.moirai", enpdVar, true, false, false);
        h = edbk.f("SuperpacksFlags__enable_flexible_downloads", false, "com.google.android.libraries.abuse.hades.moirai", enpdVar, true, false, false);
        i = edbk.f("SuperpacksFlags__enable_persephone_downloads", false, "com.google.android.libraries.abuse.hades.moirai", enpdVar, true, false, false);
        j = edbk.e("SuperpacksFlags__persephone_api_key", "AIzaSyBVISctL4wnC5nctQ1nGYDRD6zybQjKCL8", "com.google.android.libraries.abuse.hades.moirai", enpdVar, true, false, false);
        k = edbk.e("SuperpacksFlags__persephone_host_url", "ondevicesafety-pa.googleapis.com", "com.google.android.libraries.abuse.hades.moirai", enpdVar, true, false, false);
        l = edbk.d("SuperpacksFlags__protection_decay_period_days", -1L, "com.google.android.libraries.abuse.hades.moirai", enpdVar, true, false, false);
        m = edbk.d("SuperpacksFlags__protection_download_period", 7L, "com.google.android.libraries.abuse.hades.moirai", enpdVar, true, false, false);
        n = edbk.g("SuperpacksFlags__protection_download_policy", new edbj() { // from class: fdoz
            @Override // defpackage.edbj
            public final Object a(Object obj) {
                return (dlgo) eyfy.parseFrom(dlgo.a, (byte[]) obj);
            }
        }, "CgYIAhAAGAASDgoECID1JBIGCAIQABgA", "com.google.android.libraries.abuse.hades.moirai", enpdVar, true, false, false);
    }

    @Override // defpackage.fdox
    public final long a(Context context) {
        return ((Long) c.a(context)).longValue();
    }

    @Override // defpackage.fdox
    public final long b(Context context) {
        return ((Long) l.a(context)).longValue();
    }

    @Override // defpackage.fdox
    public final long c(Context context) {
        return ((Long) m.a(context)).longValue();
    }

    @Override // defpackage.fdox
    public final rug d(Context context) {
        return (rug) a.a(context);
    }

    @Override // defpackage.fdox
    public final dlgo e(Context context) {
        return (dlgo) n.a(context);
    }

    @Override // defpackage.fdox
    public final String f(Context context) {
        return (String) j.a(context);
    }

    @Override // defpackage.fdox
    public final String g(Context context) {
        return (String) k.a(context);
    }

    @Override // defpackage.fdox
    public final boolean h(Context context) {
        return ((Boolean) b.a(context)).booleanValue();
    }

    @Override // defpackage.fdox
    public final boolean i(Context context) {
        return ((Boolean) d.a(context)).booleanValue();
    }

    @Override // defpackage.fdox
    public final boolean j(Context context) {
        return ((Boolean) e.a(context)).booleanValue();
    }

    @Override // defpackage.fdox
    public final boolean k(Context context) {
        return ((Boolean) f.a(context)).booleanValue();
    }

    @Override // defpackage.fdox
    public final boolean l(Context context) {
        return ((Boolean) g.a(context)).booleanValue();
    }

    @Override // defpackage.fdox
    public final boolean m(Context context) {
        return ((Boolean) h.a(context)).booleanValue();
    }

    @Override // defpackage.fdox
    public final boolean n(Context context) {
        return ((Boolean) i.a(context)).booleanValue();
    }
}
