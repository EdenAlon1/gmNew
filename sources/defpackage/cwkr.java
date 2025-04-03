package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwkr implements cira {
    private final Context a;
    private final cwkq b;

    public cwkr(Context context, cwkq cwkqVar) {
        this.a = context;
        this.b = cwkqVar;
    }

    @Override // defpackage.cira
    public final kma a(SuggestionData suggestionData, ConversationId conversationId) {
        emxf.a(bduu.b(suggestionData) == fbri.DUO_CALL);
        String string = this.a.getString(R.string.p2p_conversation_suggestion_duo_call_action_text);
        String b = suggestionData.b();
        b.getClass();
        return this.b.a(conversationId, b, R.drawable.product_logo_duo_color_24, false, string);
    }
}
