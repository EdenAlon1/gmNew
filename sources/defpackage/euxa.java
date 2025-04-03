package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euxa {
    public static String a(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    public static String b(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    public static String c(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    public static void d(String str, Bundle bundle) {
        try {
            eumr.b();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String a = a(bundle);
            if (a != null) {
                bundle2.putString("_nmn", a);
            }
            String b = b(bundle);
            if (!TextUtils.isEmpty(b)) {
                bundle2.putString(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL, b);
            }
            String string2 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string2)) {
                bundle2.putString("message_channel", string2);
            }
            String c = c(bundle);
            if (c != null) {
                bundle2.putString("_nt", c);
            }
            String string3 = bundle.getString("google.c.a.ts");
            if (string3 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string3));
                } catch (NumberFormatException e) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
                }
            }
            String string4 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string4 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string4));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
                }
            }
            String str2 = true != euxc.i(bundle) ? GroupManagementRequest.DATA_TAG : "display";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2.toString());
            }
            eune euneVar = (eune) eumr.b().f(eune.class);
            if (euneVar != null) {
                euneVar.a();
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static boolean e(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }

    public static boolean f(Intent intent) {
        if (intent == null || e(intent)) {
            return false;
        }
        return g(intent.getExtras());
    }

    public static boolean g(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }
}
