package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversationId;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amqr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ amqw b;
    final /* synthetic */ anvc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amqr(amqw amqwVar, anvc anvcVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = amqwVar;
        this.c = anvcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amqr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            amqw amqwVar = this.b;
            elfl g = amqwVar.c.g(this.c);
            this.a = 1;
            obj = fgfz.c(g, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        engw<ConversationId> engwVar = (engw) obj;
        ArrayList arrayList = new ArrayList(ffdx.n(engwVar, 10));
        for (ConversationId conversationId : engwVar) {
            conversationId.getClass();
            arrayList.add(new EmergencyConversationId(((BugleConversationId) conversationId).a));
        }
        return engq.a(arrayList);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new amqr(this.b, this.c, ffguVar);
    }
}
