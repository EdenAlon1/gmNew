package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdtg implements aoax {
    public final String a;
    public final String b;
    private final aoav c;

    public bdtg(aoav aoavVar, ConversationSuggestion conversationSuggestion) {
        this.c = aoavVar;
        this.a = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_PHONE_NUMBER);
        this.b = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_COMPOSE_ACTION_DRAFT_TEXT);
    }

    @Override // defpackage.aoax
    public final aoav a() {
        return this.c;
    }

    @Override // defpackage.aoax
    public final String b() {
        return null;
    }
}
