package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.ui.appsettings.SpamSettingsActivity;
import com.google.android.apps.messaging.ui.appsettings.protectionandsafety.ProtectionSafetySettingsActivity;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyjq implements cyjl {
    public final croc a;
    private final ffxx b;
    private final ffbr c;
    private final ffsk d;

    public cyjq(ffxx ffxxVar, ffbr ffbrVar, croc crocVar, ffsk ffskVar) {
        ffxxVar.getClass();
        crocVar.getClass();
        ffskVar.getClass();
        this.b = ffxxVar;
        this.c = ffbrVar;
        this.a = crocVar;
        this.d = ffskVar;
    }

    private final void e(ConversationId conversationId, byyt byytVar) {
        axol.k(this.d, null, new cyjm(this, conversationId, byytVar, null), 3);
    }

    @Override // defpackage.cyjl
    public final Class a() {
        if (!((Optional) this.c.b()).isPresent()) {
            return SpamSettingsActivity.class;
        }
        return ProtectionSafetySettingsActivity.class;
    }

    @Override // defpackage.cyjl
    public final void b(ConversationId conversationId) {
        e(conversationId, byyt.CROSS_COUNTRY_FOLDER);
    }

    @Override // defpackage.cyjl
    public final void c(ConversationId conversationId) {
        e(conversationId, byyt.UNARCHIVED);
    }

    @Override // defpackage.cyjl
    public final ffxx d() {
        return new fgcp(new cyjp(this.b, null));
    }
}
