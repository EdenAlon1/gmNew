package defpackage;

import androidx.car.app.model.Alert;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzaq {
    public static final cfva a = cfvl.f(cfvl.b, "gaia_pairing_verification_timeout_millis", TimeUnit.MINUTES.toMillis(5));
    public static final cfva b = cfvl.f(cfvl.b, "message_repush_time_mills_buffer", 1000);
    public static final cfva c = cfvl.e(cfvl.b, "ditto_max_messages_per_repush", 100);
    public static final cfup d = cfvl.e(cfvl.b, "ditto_max_messages_per_request", 100);
    public static final cfup e = cfvl.e(cfvl.b, "ditto_max_contacts_per_request", Alert.DURATION_SHOW_INDEFINITELY);
    public static final cfup f = cfvl.e(cfvl.b, "ditto_default_alarm_retry_interval_secs", 30);
    public static final cfup g = cfvl.e(cfvl.b, "ditto_max_conversations_per_request", 25);
    public static final cfup h = cfvl.e(cfvl.b, "ditto_blob_lifespan_days", 28);
    public static final cfup i = cfvl.h(cfvl.b, "ditto_display_url", "https://messages.google.com/web");
    public static final cfup j = cfvl.h(cfvl.b, "ditto_server_timestamp_url", "https://messages.google.com/web/timesource");
    public static final cfup k = cfvl.e(cfvl.b, "ditto_max_hours_before_challenge", 2);
    public static final cfup l = cfvl.e(cfvl.b, "ditto_max_minutes_after_challenge_cutoff", 10);
    public static final cfup m = cfvl.e(cfvl.b, "ditto_max_attachments_per_pre_upload_batch", 30);
    public static final emyl n = cfvl.w("enable_keychain_pairing_debug_menu");
    public static final emyl o = cfvl.w("only_get_conversation_populates_participant_group_e2ee");
    public static final emyl p;

    static {
        cfvl.w("enable_get_conversation_by_conversation_id");
        cfvl.w("enable_keychain_pairing_lskf");
        p = cfvl.w("limit_list_conversations_query");
    }
}
