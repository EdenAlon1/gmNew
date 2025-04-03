package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ctjh {
    elfl a(String str);

    elfl b(MessageIdType messageIdType, ConversationIdType conversationIdType, fbwv fbwvVar, eopx eopxVar);

    elfl c(boolean z, MessageCoreData messageCoreData, eooi eooiVar);

    elfl d(MessageCoreData messageCoreData, eooi eooiVar);

    elfl e(ConversationIdType conversationIdType, long j, eooi eooiVar);

    elfl f(SuggestionData suggestionData, eoqz eoqzVar, fbqp fbqpVar, boolean z, float f, Boolean bool, Boolean bool2);

    elfl g(ConversationIdType conversationIdType, MessageCoreData messageCoreData, long j);

    Object h(String str, ffgu ffguVar);

    Object i(MessageIdType messageIdType, ConversationIdType conversationIdType, fbwv fbwvVar, eopx eopxVar, ffgu ffguVar);

    Object j(SuggestionData suggestionData, eoqz eoqzVar, fbqp fbqpVar, boolean z, float f, Boolean bool, Boolean bool2, ffgu ffguVar);

    Object k(anzd anzdVar, ffgu ffguVar);

    void l(MessageIdType messageIdType, ConversationIdType conversationIdType, fbwv fbwvVar, eopx eopxVar);

    Object m(Long l, boolean z, ConversationIdType conversationIdType, fbrc fbrcVar, eopx eopxVar);

    Object n(MessageCoreData messageCoreData, ffgu ffguVar);

    elfl o(SuggestionData suggestionData, eoqz eoqzVar, fbqp fbqpVar);
}
