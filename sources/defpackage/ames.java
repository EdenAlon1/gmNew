package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergencysos.EmergencySosConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ames {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;

    public ames(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffbrVar4;
    }

    public final ConversationId a(ConversationIdType conversationIdType, String str, boolean z) {
        conversationIdType.getClass();
        if (str == null) {
            return new BugleConversationId(conversationIdType);
        }
        aoku a = (z && ((askf) this.c.b()).a()) ? ((aolr) this.a.b()).a(str) : ((aolr) this.a.b()).n(str);
        return a.C() ? new EmergencySosConversationId(conversationIdType) : (((aspy) this.b.b()).a() && a.A()) ? new PenpalBotConversationId(conversationIdType) : (((askf) this.c.b()).a() && a.B()) ? new RbmConversationId(conversationIdType) : (((attl) this.d.b()).a() && a.w()) ? new EmergencyConversationId(conversationIdType) : new BugleConversationId(conversationIdType);
    }
}
