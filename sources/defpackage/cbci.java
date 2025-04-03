package defpackage;

import android.net.Uri;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbci {
    public static final ensn a = new ensn("success_count", Integer.class, false, false);
    public static final ensn b = new ensn("failure_count", Integer.class, false, false);
    public static final ensn c = new ensn("time_since_last_reference", Long.class, false, false);
    public static final ensn d = new ensn("cache_name", String.class, false, false);
    public static final ensn e = new ensn("total_cache_hit", Integer.class, false, false);
    public static final ensn f = new ensn("total_cache_miss", Integer.class, false, false);
    public static final ensn g = new ensn("key", String.class, false, false);
    public static final ensn h = new ensn(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, Uri.class, false, false);
    public static final ensn i = new ensn(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, CharSequence.class, false, false);
}
