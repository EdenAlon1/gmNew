package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdtn implements aoau, aoar, aoas {
    private final appw b;
    private final String d;
    private final long e;
    private final long f;
    private final String g;
    private final String h;
    private final aoav a = aoav.f;
    private final eooi c = eooi.RBM_SUGGESTION_REPLY;

    public bdtn(bdtp bdtpVar, ConversationSuggestion conversationSuggestion, long j, long j2) {
        this.b = bdtpVar;
        this.d = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_FALLBACK_URL);
        this.e = j;
        this.f = j2;
        this.g = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE);
        this.h = conversationSuggestion.getPropertyValue("description");
    }

    @Override // defpackage.aoax
    public final aoav a() {
        return this.a;
    }

    @Override // defpackage.aoax
    public final String b() {
        return null;
    }

    @Override // defpackage.aoas
    public final Long c() {
        return Long.valueOf(this.f);
    }

    @Override // defpackage.aoas
    public final Long d() {
        return Long.valueOf(this.e);
    }

    @Override // defpackage.aoas
    public final String e() {
        return this.h;
    }

    @Override // defpackage.aoas
    public final String f() {
        return null;
    }

    @Override // defpackage.aoas
    public final String g() {
        return this.g;
    }

    @Override // defpackage.aoar
    public final appw h() {
        return this.b;
    }

    @Override // defpackage.aoar
    public final eooi i() {
        return this.c;
    }

    @Override // defpackage.aoau
    public final String j() {
        return this.d;
    }
}
