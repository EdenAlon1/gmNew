package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acrz {
    public static final cfup f;
    public static final cfup g;
    public static final cfup h;
    public static final cfva i;
    public static final cfva j;
    public static final cfup k;
    private static final enhk l = enhk.o("prod", "https://messages.google.com/web/", "preprod", "https://messages-web-preprod.sandbox.google.com/web/", "staging", "https://messages-web-staging.sandbox.google.com/web/", "autopush", "https://messages-web-autopush.sandbox.google.com/web/");
    public static final cfup a = cfvl.m(cfvl.b, "ditto_satellite_env", "prod");
    public static final cfup b = cfvl.m(cfvl.b, "ditto_sandbox_test_key", "");
    public static final cfva c = cfvl.n(cfvl.b, "ditto_satellite_enabled", false);
    public static final cfva d = cfvl.n(cfvl.b, "ditto_satellite_force_disabled", false);
    public static final cfva e = cfvl.n(cfvl.b, "ditto_satellite_force_wifi_only_mode", false);

    static {
        cfvl.n(cfvl.b, "ditto_satellite_chrome_debugging_enabled", false);
        f = cfvl.f(cfvl.b, "fail_to_load_timeout_millis", TimeUnit.SECONDS.toMillis(5L));
        g = cfvl.f(cfvl.b, "js_bridge_default_timeout_millis", 500L);
        h = cfvl.f(cfvl.b, "js_bridge_long_timeout_millis", TimeUnit.SECONDS.toMillis(5L));
        i = cfvl.n(cfvl.b, "is_tablet_form_factor", false);
        j = cfvl.n(cfvl.b, "is_phone_form_factor", false);
        k = cfvl.f(cfvl.b, "ditto_satellite_attachments_size_limit", 5242880L);
    }

    public static Uri.Builder a() {
        String str = (String) a.e();
        enhk enhkVar = l;
        if (enhkVar.containsKey(str)) {
            return Uri.parse((String) enhkVar.get(str)).buildUpon();
        }
        throw new acry(str);
    }

    public static Uri.Builder b(Uri.Builder builder) {
        cfup cfupVar = b;
        return TextUtils.isEmpty((CharSequence) cfupVar.e()) ? builder : builder.appendQueryParameter("test_key", (String) cfupVar.e());
    }

    public static Uri c(aclr aclrVar) {
        Uri.Builder a2 = a();
        if (!aclrVar.b()) {
            a2 = a2.appendPath("conversations").appendPath(aclrVar.a());
        }
        return b(a2).build();
    }

    public static String d() {
        return e(new aclr(""));
    }

    public static String e(aclr aclrVar) {
        return c(aclrVar).toString();
    }

    public static int f() {
        if (((Boolean) i.e()).booleanValue()) {
            return 3;
        }
        return ((Boolean) j.e()).booleanValue() ? 2 : 1;
    }
}
