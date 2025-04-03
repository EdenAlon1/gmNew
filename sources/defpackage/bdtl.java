package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdtl implements aoaw {
    private final appw a;
    private final eooi b = eooi.RBM_SUGGESTION_REPLY;
    private final aoav c = aoav.e;
    private final String d;
    private final String e;
    private final String f;
    private final String g;

    public bdtl(bdtp bdtpVar, ConversationSuggestion conversationSuggestion) {
        this.a = bdtpVar;
        this.d = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
        this.e = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_OPEN_URL_VIEW_MODE);
        this.f = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_OPEN_URL_DESCRIPTION);
        this.g = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_FALLBACK_URL);
    }

    @Override // defpackage.aoax
    public final aoav a() {
        return this.c;
    }

    @Override // defpackage.aoax
    public final String b() {
        return null;
    }

    @Override // defpackage.aoaw
    public final String c() {
        return this.f;
    }

    @Override // defpackage.aoaw
    public final String d() {
        return this.d;
    }

    @Override // defpackage.aoaw
    public final String e() {
        return this.e;
    }

    @Override // defpackage.aoar
    public final appw h() {
        return this.a;
    }

    @Override // defpackage.aoar
    public final eooi i() {
        return this.b;
    }

    @Override // defpackage.aoau
    public final String j() {
        return this.g;
    }
}
