package defpackage;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfvt {
    private static final cpn a = new cpn();
    private static Locale b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            dfzi b2 = dfzj.b(context);
            return b2.a.getPackageManager().getApplicationLabel(b2.a.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i) {
        Resources resources = context.getResources();
        return i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(com.google.android.apps.messaging.R.string.common_google_play_services_enable_button) : resources.getString(com.google.android.apps.messaging.R.string.common_google_play_services_update_button) : resources.getString(com.google.android.apps.messaging.R.string.common_google_play_services_install_button);
    }

    public static String c(Context context, int i) {
        Resources resources = context.getResources();
        String a2 = a(context);
        if (i == 1) {
            return resources.getString(com.google.android.apps.messaging.R.string.common_google_play_services_install_text, a2);
        }
        if (i == 2) {
            return dfyn.c(context) ? resources.getString(com.google.android.apps.messaging.R.string.common_google_play_services_wear_update_text) : resources.getString(com.google.android.apps.messaging.R.string.common_google_play_services_update_text, a2);
        }
        if (i == 3) {
            return resources.getString(com.google.android.apps.messaging.R.string.common_google_play_services_enable_text, a2);
        }
        if (i == 5) {
            return e(context, "common_google_play_services_invalid_account_text", a2);
        }
        if (i == 7) {
            return e(context, "common_google_play_services_network_error_text", a2);
        }
        if (i == 9) {
            return resources.getString(com.google.android.apps.messaging.R.string.common_google_play_services_unsupported_text, a2);
        }
        if (i == 20) {
            return e(context, "common_google_play_services_restricted_profile_text", a2);
        }
        switch (i) {
            case 16:
                return e(context, "common_google_play_services_api_unavailable_text", a2);
            case 17:
                return e(context, "common_google_play_services_sign_in_failed_text", a2);
            case 18:
                return resources.getString(com.google.android.apps.messaging.R.string.common_google_play_services_updating_text, a2);
            default:
                return resources.getString(com.google.android.apps.messaging.R.string.common_google_play_services_unknown_issue, a2);
        }
    }

    public static String d(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(com.google.android.apps.messaging.R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(com.google.android.apps.messaging.R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(com.google.android.apps.messaging.R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return f(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return f(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                Log.e("GoogleApiAvailability", a.h(i, "Unexpected error code "));
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return f(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return f(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String e(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String f = f(context, str);
        if (f == null) {
            f = resources.getString(com.google.android.apps.messaging.R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, f, str2);
    }

    public static String f(Context context, String str) {
        Resources resources;
        cpn cpnVar = a;
        synchronized (cpnVar) {
            Locale f = kqt.a(context.getResources().getConfiguration()).f(0);
            if (!f.equals(b)) {
                cpnVar.clear();
                b = f;
            }
            String str2 = (String) cpnVar.get(str);
            if (str2 != null) {
                return str2;
            }
            int i = dfqe.a;
            try {
                resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
            } catch (PackageManager.NameNotFoundException unused) {
                resources = null;
            }
            if (resources == null) {
                return null;
            }
            int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                Log.w("GoogleApiAvailability", a.t(str, "Missing resource: "));
                return null;
            }
            String string = resources.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                Log.w("GoogleApiAvailability", a.t(str, "Got empty resource: "));
                return null;
            }
            a.put(str, string);
            return string;
        }
    }
}
