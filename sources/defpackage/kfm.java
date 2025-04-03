package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kfm {
    public static final String a(int i) {
        return i != 0 ? "bottom" : "top";
    }

    public static final String b(int i) {
        return i != -2 ? ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_END_TIME : ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME;
    }
}
