package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xcg extends ffhv implements ffjm {
    final /* synthetic */ xck a;
    final /* synthetic */ engw b;
    final /* synthetic */ ConversationId c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xcg(xck xckVar, engw engwVar, ConversationId conversationId, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = xckVar;
        this.b = engwVar;
        this.c = conversationId;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xcg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        cvfd cvfdVar = (cvfd) this.a.c.b();
        Object T = ffdx.T(this.b);
        T.getClass();
        cvfdVar.h((ResolvedRecipient) T, this.c);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new xcg(this.a, this.b, this.c, ffguVar);
    }
}
