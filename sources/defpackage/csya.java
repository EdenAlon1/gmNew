package defpackage;

import android.os.Bundle;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csya {
    public static final long a = TimeUnit.MINUTES.toMillis(20);
    public static volatile enhk b;
    public static volatile Bundle c;
    private static volatile enhk d;

    public static enhk a() {
        if (d != null) {
            return d;
        }
        enhd enhdVar = new enhd();
        enhdVar.k("bugle_gservices_working", "bool");
        enhdVar.k("bugle_logsaver", "bool");
        enhdVar.k("bugle_max_resend_delay_in_millis", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LONG);
        enhdVar.k("bugle_mms_attachment_limit", "int");
        enhdVar.k("bugle_rcs_attachment_limit", "int");
        enhdVar.k("bugle_refresh_notification_backoff_duration_in_millis", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LONG);
        enhdVar.k("bugle_enable_analytics", "bool");
        enhdVar.k("bugle_persistent_logsaver_rotation_set_size", "int");
        enhdVar.k("bugle_persistent_logsaver_file_limit", "int");
        enhdVar.k("bugle_min_phone_number_length_to_format", "int");
        enhdVar.k("bugle_testing_simulation_session_id", "string");
        enhdVar.k("device_country", "string");
        d = enhdVar.c();
        return d;
    }

    public static String b(String str) {
        return (String) a().get(str);
    }

    public static boolean c(String str) {
        return c != null && c.containsKey(str);
    }
}
