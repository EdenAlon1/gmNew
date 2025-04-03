package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwkt implements cira {
    private final Context a;
    private final cwkq b;

    public cwkt(Context context, cwkq cwkqVar) {
        this.a = context;
        this.b = cwkqVar;
    }

    @Override // defpackage.cira
    public final kma a(SuggestionData suggestionData, ConversationId conversationId) {
        emxf.a(bduu.b(suggestionData) == fbri.LOCATION);
        String string = this.a.getString(R.string.p2p_conversation_suggestion_share_location_text);
        String b = suggestionData.b();
        b.getClass();
        return this.b.a(conversationId, b, R.drawable.quantum_gm_ic_my_location_black_24, true, string);
    }
}
