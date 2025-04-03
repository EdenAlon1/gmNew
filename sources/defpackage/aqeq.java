package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqeq extends ffhv implements ffjm {
    final /* synthetic */ BugleConversationId a;
    final /* synthetic */ aqes b;
    final /* synthetic */ aqvj c;
    final /* synthetic */ engw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqeq(BugleConversationId bugleConversationId, aqes aqesVar, aqvj aqvjVar, engw engwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = bugleConversationId;
        this.b = aqesVar;
        this.c = aqvjVar;
        this.d = engwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aqeq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        bdmq bdmqVar = (bdmq) this.b.a.b();
        ConversationIdType conversationIdType = this.a.a;
        MessageCoreData q = bdmqVar.q(conversationIdType);
        MessageIdType B = q != null ? q.B() : null;
        int ordinal = this.c.ordinal();
        if (ordinal != 1) {
            if (ordinal == 3 && B == null) {
                int i = 251;
                if (this.d.size() == 1) {
                    engw engwVar = this.d;
                    engwVar.getClass();
                    if (((ResolvedRecipient) ffdx.T(engwVar)).g().v()) {
                        i = 239;
                    }
                }
                ((cbvt) this.b.b.b()).l(((bdtd) this.b.c.b()).e(), this.b.d.f().toEpochMilli(), conversationIdType, -1L, i);
            }
        } else if (B != null && ((bdmq) this.b.a.b()).r(conversationIdType) != null) {
            if (((asix) this.b.f.b()).a()) {
                ((cgrq) this.b.e.b()).f(B, cgrr.PREVIOUS_TOMBSTONE_DELETION);
            } else {
                ((cgrq) this.b.e.b()).d(B);
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aqeq(this.a, this.b, this.c, this.d, ffguVar);
    }
}
