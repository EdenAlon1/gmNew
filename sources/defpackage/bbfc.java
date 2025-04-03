package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class bbfc {
    public static Action a(bbfd bbfdVar, ConversationIdType conversationIdType, MessageIdType messageIdType, boolean z, boolean z2, int i) {
        return ((baih) bbfdVar).i(new ConversationIdType[]{conversationIdType}, messageIdType, z, z2, i);
    }

    public static void b(bbfd bbfdVar, ConversationIdType conversationIdType, boolean z) {
        c(bbfdVar, conversationIdType, bdhb.a, z);
    }

    public static void c(bbfd bbfdVar, ConversationIdType conversationIdType, MessageIdType messageIdType, boolean z) {
        a(bbfdVar, conversationIdType, messageIdType, z, false, -1).A();
    }
}
