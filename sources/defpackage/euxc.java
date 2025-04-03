package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euxc {
    public final Bundle a;

    public euxc(Bundle bundle) {
        this.a = new Bundle(bundle);
    }

    public static String f(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public static boolean i(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(j("gcm.n.e")));
    }

    private static String j(String str) {
        return !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
    }

    public final Bundle a() {
        Bundle bundle = new Bundle(this.a);
        for (String str : this.a.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public final Integer b(String str) {
        String e = e(str);
        if (TextUtils.isEmpty(e)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(e));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + f(str) + "(" + e + ") into an int");
            return null;
        }
    }

    public final String c(Resources resources, String str, String str2) {
        String[] strArr;
        String e = e(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(e)) {
            return null;
        }
        int identifier = resources.getIdentifier(e, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", f(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray g = g(str2.concat("_loc_args"));
        if (g == null) {
            strArr = null;
        } else {
            int length = g.length();
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = g.optString(i);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e2) {
            Log.w("NotificationParams", "Missing format argument for " + f(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e2);
            return null;
        }
    }

    public final String d(Resources resources, String str, String str2) {
        String e = e(str2);
        return !TextUtils.isEmpty(e) ? e : c(resources, str, str2);
    }

    public final String e(String str) {
        if (!this.a.containsKey(str) && str.startsWith("gcm.n.")) {
            String j = j(str);
            if (this.a.containsKey(j)) {
                str = j;
            }
        }
        return this.a.getString(str);
    }

    public final JSONArray g(String str) {
        String e = e(str);
        if (TextUtils.isEmpty(e)) {
            return null;
        }
        try {
            return new JSONArray(e);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + f(str) + ": " + e + ", falling back to default");
            return null;
        }
    }

    public final boolean h(String str) {
        String e = e(str);
        return "1".equals(e) || Boolean.parseBoolean(e);
    }
}
