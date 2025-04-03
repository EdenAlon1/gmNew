package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.DeviceData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class bbfb implements bbck {
    public abstract Action a(MessageCoreData messageCoreData, boolean z, eooi eooiVar, byyt byytVar, int i, Optional optional, long j, boolean z2);

    public abstract Action b(int i, engw engwVar, String str, String str2, ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, boolean z, boolean z2, eooi eooiVar, DeviceData deviceData, boolean z3, ArrayList arrayList, boolean z4, fjay fjayVar);

    public final Action d(MessageCoreData messageCoreData, int i, eooi eooiVar, long j) {
        return a(messageCoreData, false, eooiVar, null, i, Optional.empty(), j, false);
    }

    public final Action e(MessageCoreData messageCoreData, boolean z, byyt byytVar) {
        return a(messageCoreData, z, null, byytVar, -1, Optional.empty(), 0L, false);
    }

    public final Action f(MessageCoreData messageCoreData, int i, boolean z) {
        return a(messageCoreData, true, null, null, i, Optional.empty(), 0L, z);
    }

    public final Action g(MessageCoreData messageCoreData, long j) {
        return a(messageCoreData, false, null, null, -1, Optional.empty(), j, false);
    }
}
