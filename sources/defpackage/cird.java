package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cird {
    public static final ensn a = new ensn("failed_messages_count", Integer.class, false, false);
    public static final ensn b = new ensn("failed_messages_to_notify", Integer.class, false, false);
    public static final ensn c;
    public static final ensn d;
    public static final ensn e;
    public static final ensn f;
    public static final ensn g;
    public static final ensn h;
    public static final ensn i;
    public static final ensn j;
    public static final ensn k;
    public static final ensn l;
    public static final ensn m;
    public static final ensn n;
    public static final ensn o;
    public static final ensn p;
    public static final ensn q;
    public static final ensn r;
    public static final ensn s;
    public static final ensn t;
    public static final ensn u;
    public static final ensn v;

    static {
        new ensn("conversations", Integer.class, false, false);
        new ensn("messages", Integer.class, false, false);
        new ensn("max_messages_in_conversation", Integer.class, false, false);
        new ensn(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE, CharSequence.class, false, false);
        new ensn("content", CharSequence.class, false, false);
        new ensn("previous_date", String.class, false, false);
        new ensn("receive_date", String.class, false, false);
        c = new ensn("notification_importance", Integer.class, false, false);
        d = new ensn("notification_tag", String.class, false, false);
        new ensn("attachment_type", String.class, false, false);
        e = new ensn("suggestion_id", String.class, false, false);
        f = new ensn("for_incoming_messages", Boolean.class, false, false);
        g = new ensn("for_failures", Boolean.class, false, false);
        h = new ensn("is_silent", Boolean.class, false, false);
        i = new ensn("is_quick_reply", Boolean.class, false, false);
        j = new ensn("is_smart_reply_update", Boolean.class, false, false);
        k = new ensn("notification_channel_id", String.class, false, false);
        l = new ensn("name_changed", Boolean.class, false, false);
        m = new ensn("group_changed", Boolean.class, false, false);
        n = new ensn("notification_type", cixf.class, false, false);
        o = new ensn("notification_callback_type", civq.class, false, false);
        p = new ensn("notification_action_type", ciux.class, false, false);
        q = new ensn("notification_style_type", ciws.class, false, false);
        r = new ensn("earliest_conversation_timestamp", Long.class, false, false);
        new ensn("notification_channel", String.class, false, false);
        s = new ensn("notification_actions", String.class, false, false);
        t = new ensn("notification_shortcut", String.class, false, false);
        u = new ensn("is_only_alert_once", Boolean.class, false, false);
        new ensn("last_created_notification_timestamp", Long.class, false, false);
        v = new ensn("shortcut_exists", Boolean.class, false, false);
    }
}
