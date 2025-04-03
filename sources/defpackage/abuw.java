package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class abuw {
    public abstract abux a();

    public abstract void b(epwk epwkVar);

    public abstract void c(ConversationIdType conversationIdType);

    public abstract void d(epwn epwnVar);

    public final abux e() {
        abux a = a();
        if (((abuu) a).a == epwn.NEW_CONVERSATION_WITH_EXISTING_RCS_GROUP_ID) {
            emxf.m(!((engw) r1.e.get()).isEmpty(), "NEW_CONVERSATION_WITH_EXISTING_RCS_GROUP_ID error with empty forkedConversationJoinStates");
        }
        return a;
    }
}
