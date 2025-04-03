package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdtm implements aoar, aoau {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    private final appw e;
    private final eooi f = eooi.RBM_SUGGESTION_REPLY;
    private final aoav g = aoav.s;
    private final String h;

    public bdtm(bdtp bdtpVar, ConversationSuggestion conversationSuggestion) {
        this.e = bdtpVar;
        this.a = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY);
        this.b = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LAT);
        this.c = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LONG);
        this.d = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL);
        this.h = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_FALLBACK_URL);
    }

    @Override // defpackage.aoax
    public final aoav a() {
        return this.g;
    }

    @Override // defpackage.aoax
    public final String b() {
        return null;
    }

    @Override // defpackage.aoar
    public final appw h() {
        return this.e;
    }

    @Override // defpackage.aoar
    public final eooi i() {
        return this.f;
    }

    @Override // defpackage.aoau
    public final String j() {
        return this.h;
    }
}
