package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyil implements sry {
    public final Context a;
    public final ConversationId b;
    public final tac c;
    public final cyis d;
    private final ffhd e;
    private final ffsk f;
    private final ssm g;

    public cyil(Context context, ffhd ffhdVar, ffsk ffskVar, ConversationId conversationId, cyis cyisVar, tac tacVar, ssm ssmVar) {
        context.getClass();
        ffhdVar.getClass();
        ffskVar.getClass();
        conversationId.getClass();
        tacVar.getClass();
        ssmVar.getClass();
        this.a = context;
        this.e = ffhdVar;
        this.f = ffskVar;
        this.b = conversationId;
        this.d = cyisVar;
        this.c = tacVar;
        this.g = ssmVar;
    }

    @Override // defpackage.sry
    public final fgdj a() {
        cyis cyisVar = this.d;
        return ejso.a(ffyo.b(new cyir(cyisVar.b, cyisVar), this.e), this.f, new cyij(this));
    }

    @Override // defpackage.sry
    public final boolean b() {
        return true;
    }

    public final void c(ResolvedRecipient resolvedRecipient, int i) {
        axol.k(this.f, this.e, new cyik(this, resolvedRecipient, i == 4 ? erfe.DISMISSED_WARNING_BANNER : erfe.REPORTED_NOT_SPAM, null), 2);
        this.g.a("spam_banner", ssn.b);
    }
}
