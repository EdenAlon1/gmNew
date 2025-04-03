package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class bbgg implements bbck {
    public abstract Action a(MessageIdType messageIdType, ConversationIdType conversationIdType, int i, eooi eooiVar);

    public final Action b() {
        return a(bdhb.a, bdgq.a, -1, eooi.UNKNOWN_BUGLE_MESSAGE_SOURCE);
    }

    public final Action d(MessageIdType messageIdType, eooi eooiVar) {
        return a(messageIdType, bdgq.a, 1, eooiVar);
    }

    public final Action e(eooi eooiVar) {
        return a(bdhb.a, bdgq.a, 4, eooiVar);
    }
}
