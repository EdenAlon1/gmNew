package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class bbfg implements bbck {
    protected abstract Action a(MessageIdType messageIdType, MessageUsageStatisticsData messageUsageStatisticsData);

    public final void b(MessageIdType messageIdType, MessageUsageStatisticsData messageUsageStatisticsData) {
        a(messageIdType, messageUsageStatisticsData).t();
    }

    public final void d(MessageIdType messageIdType) {
        a(messageIdType, null).A();
    }
}
