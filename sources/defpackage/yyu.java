package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yyu {
    public final Context a;
    public final ffsk b;
    public final aigz c;
    public final ffxx d;
    public final ffxx e;
    private final ConversationId f;
    private final alxs g;
    private final ffxx h;

    public yyu(Context context, ffsk ffskVar, aigz aigzVar, ConversationId conversationId, alxs alxsVar, ffxx ffxxVar) {
        ffxx ffygVar;
        context.getClass();
        ffskVar.getClass();
        aigzVar.getClass();
        conversationId.getClass();
        alxsVar.getClass();
        ffxxVar.getClass();
        this.a = context;
        this.b = ffskVar;
        this.c = aigzVar;
        this.f = conversationId;
        this.g = alxsVar;
        this.h = ffxxVar;
        this.d = alxsVar instanceof apio ? aqfu.a(((apio) alxsVar).q()) : new ffyg(false);
        if (conversationId instanceof EmergencyConversationId) {
            yyq yyqVar = new yyq(null, this);
            int i = fgau.a;
            ffygVar = new fgen(yyqVar, ffxxVar);
        } else {
            ffygVar = new ffyg(false);
        }
        this.e = ffygVar;
    }
}
