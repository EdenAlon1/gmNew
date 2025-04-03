package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class bbff implements bbck {
    public abstract Action a(MessageIdType messageIdType);

    public abstract Action b(MessageIdType messageIdType, boolean z);

    public final void d(MessageIdType messageIdType) {
        a(messageIdType).t();
    }
}
