package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdtj implements aoar, aoau {
    public final /* synthetic */ ConversationSuggestion a;
    private final appw c;
    private final String e;
    private final aoav b = aoav.b;
    private final eooi d = eooi.RBM_SUGGESTION_REPLY;

    public bdtj(bdtp bdtpVar, ConversationSuggestion conversationSuggestion) {
        this.a = conversationSuggestion;
        this.c = bdtpVar;
        this.e = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_FALLBACK_URL);
    }

    @Override // defpackage.aoax
    public final aoav a() {
        return this.b;
    }

    @Override // defpackage.aoax
    public final String b() {
        return null;
    }

    @Override // defpackage.aoar
    public final appw h() {
        return this.c;
    }

    @Override // defpackage.aoar
    public final eooi i() {
        return this.d;
    }

    @Override // defpackage.aoau
    public final String j() {
        return this.e;
    }
}
