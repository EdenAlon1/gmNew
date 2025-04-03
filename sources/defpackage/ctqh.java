package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public interface ctqh {
    elfl a(ConversationIdType conversationIdType, String str, fbre fbreVar);

    engw b(MessageIdType messageIdType);

    engw c(MessageIdType messageIdType);

    engw d(MessageIdType messageIdType);

    Optional e(MessageIdType messageIdType);

    Optional f(String str);

    Object g(ConversationIdType conversationIdType, ffgu ffguVar);

    Object h(ConversationIdType conversationIdType, String str, fbre fbreVar, ffgu ffguVar);

    List i(ConversationIdType conversationIdType, long j);

    List j(MessageIdType messageIdType);

    void k(SmartSuggestionItemSuggestionData smartSuggestionItemSuggestionData, ConversationIdType conversationIdType, MessageIdType messageIdType, long j);

    void l(List list, ConversationIdType conversationIdType, MessageIdType messageIdType, long j);

    void m(long j);

    void n();

    void o(List list);

    void p(SuggestionData suggestionData, fbrd fbrdVar);

    void q(List list, fbrd fbrdVar);

    engw r(List list);

    void s(List list, fbrd fbrdVar);
}
