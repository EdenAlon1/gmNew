package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctze {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/util/prefs/common/BuglePrefsPrinter");
    private static final enip g = enip.v("assistant_request_id", "ditto_active_desktop_id", "ditto_active_desktop_request_id", "firebase_instance_id", "rcs_msisdn", "usage_stats_hash_salt", "UPSELL_PROMPT_SIM_ID");
    private static final enip h = enip.s("is_fi_device_", "msisdn_for_iccid_", "rcs_user_id_");
    public final Context b;
    public final ctvb c;
    public final ctwb d;
    public final ctyx e;
    public final ctyw f;

    public ctze(Context context, ctvb ctvbVar, ctwb ctwbVar, ctyx ctyxVar, ctyw ctywVar) {
        this.b = context;
        this.c = ctvbVar;
        this.d = ctwbVar;
        this.e = ctyxVar;
        this.f = ctywVar;
    }

    public static void a(String str, Context context, StringBuilder sb) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        sb.append(a.a(str, "Prefs for \"", "\":\n"));
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            enqu listIterator = h.listIterator();
            while (true) {
                if (!listIterator.hasNext()) {
                    break;
                }
                String str2 = (String) listIterator.next();
                if (key.startsWith(str2)) {
                    key = String.valueOf(str2).concat("[Redacted]");
                    break;
                }
            }
            sb.append(String.valueOf(key).concat(": "));
            if (value == null) {
                sb.append("null");
            } else if (value instanceof Set) {
                sb.append("is a Set");
            } else if (g.contains(key)) {
                sb.append("Redacted");
            } else if ((value instanceof String) && key.contains("phone_number")) {
                sb.append(cskt.b(value.toString()));
            } else {
                sb.append(value);
            }
            sb.append("\n");
        }
    }
}
