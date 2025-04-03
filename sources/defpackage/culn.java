package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class culn {
    static {
        int i = culp.a;
    }

    public static /* synthetic */ engw a(culp culpVar, MessageIdType messageIdType, cuvb cuvbVar, ConversationIdType conversationIdType, cuva cuvaVar, int i) {
        if (1 == (i & 1)) {
            messageIdType = null;
        }
        if ((i & 2) != 0) {
            cuvbVar = null;
        }
        if ((i & 4) != 0) {
            conversationIdType = null;
        }
        if ((i & 8) != 0) {
            cuvaVar = null;
        }
        return culpVar.e(messageIdType, cuvbVar, conversationIdType, cuvaVar);
    }

    public static /* synthetic */ List b(culp culpVar, cuvb cuvbVar, cuva cuvaVar, int i) {
        if (1 == (i & 1)) {
            cuvbVar = null;
        }
        if ((i & 2) != 0) {
            cuvaVar = null;
        }
        return culpVar.h(cuvbVar, cuvaVar);
    }
}
