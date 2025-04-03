package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwks implements cira {
    private final Context a;
    private final cwkq b;

    public cwks(Context context, cwkq cwkqVar) {
        this.a = context;
        this.b = cwkqVar;
    }

    @Override // defpackage.cira
    public final kma a(SuggestionData suggestionData, ConversationId conversationId) {
        emxf.a(suggestionData instanceof SmartSuggestionData);
        emxf.a(bduu.b(suggestionData) == fbri.GIF);
        String string = this.a.getString(R.string.p2p_conversation_suggestion_gif_search_display_text, ((SmartSuggestionData) suggestionData).p());
        String b = suggestionData.b();
        b.getClass();
        return this.b.a(conversationId, b, R.drawable.quantum_ic_search_black_24, true, string);
    }
}
