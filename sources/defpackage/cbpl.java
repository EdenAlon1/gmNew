package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public interface cbpl {
    long a(int i);

    bseh b(ConversationIdType conversationIdType);

    btrw c(String str);

    MessagesTable.BindData d(MessageIdType messageIdType);

    ParticipantsTable.BindData e(String str);

    cbnb f(bfkp bfkpVar);

    cbnb g(String str, cbne cbneVar);

    cbnb h(String str, cbne cbneVar, int i);

    cbnb i(ConversationIdType conversationIdType, String str, Collection collection, int i);

    List j(ConversationIdType conversationIdType, String str, cbne cbneVar, boolean z);

    List k(ConversationIdType conversationIdType, Collection collection);

    List l(Collection collection, ConversationIdType conversationIdType);

    List m(MessageIdType messageIdType);

    List n(ConversationIdType conversationIdType, String str, cbne cbneVar, boolean z, int i);

    Set o(int i, long j, long j2);

    void p(String str, fbuk fbukVar);

    blqw q(ConversationIdType conversationIdType, String str, boolean z);

    blqw r(ConversationIdType conversationIdType, String str, boolean z, int i);

    blqw s(ConversationIdType conversationIdType, String str, boolean z);

    blqw t(ConversationIdType conversationIdType, String str, boolean z, int i);
}
