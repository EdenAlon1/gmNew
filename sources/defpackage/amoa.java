package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amoa extends ffhv implements ffjm {
    final /* synthetic */ ConversationId a;
    final /* synthetic */ amny b;
    final /* synthetic */ amoc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amoa(ConversationId conversationId, amny amnyVar, amoc amocVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = conversationId;
        this.b = amnyVar;
        this.c = amocVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amoa) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ConversationId conversationId = this.a;
        int ordinal = this.b.ordinal();
        ConversationIdType conversationIdType = ((BugleConversationId) conversationId).a;
        if (ordinal == 1) {
            cggo.b(conversationIdType);
        } else {
            if (ordinal != 2) {
                throw new IllegalArgumentException("Parental approval status=" + this.b + " is not supported");
            }
            cggo.c(conversationIdType);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new amoa(this.a, this.b, this.c, ffguVar);
    }
}
