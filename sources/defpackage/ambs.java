package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public interface ambs {
    IncomingDraft a(Context context, bcse bcseVar);

    @Deprecated
    MessageCoreData b(Resources resources, bcse bcseVar);

    elfl c(List list);

    elfl d(List list, cgrr cgrrVar);

    elfl e(BugleConversationId bugleConversationId);

    elfl f(engw engwVar);

    elfl g(int i, MessageCoreData messageCoreData, long j, MessageUsageStatisticsData messageUsageStatisticsData);

    elfl h(int i, MessageCoreData messageCoreData, long j);

    elfl i(int i, MessageCoreData messageCoreData, long j, cniz cnizVar);

    @Deprecated
    void j(List list);

    @Deprecated
    void k(List list, cgrr cgrrVar);

    void l(MessageIdType messageIdType);

    void m(MessageIdType messageIdType, MessageUsageStatisticsData messageUsageStatisticsData);

    void n(MessageCoreData messageCoreData, long j, MessageUsageStatisticsData messageUsageStatisticsData);

    void o(aqux aquxVar, MessageCoreData messageCoreData, long j, MessageUsageStatisticsData messageUsageStatisticsData);
}
