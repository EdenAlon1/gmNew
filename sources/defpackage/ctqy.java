package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctqy implements ffji {
    final /* synthetic */ ctrc a;
    final /* synthetic */ ConversationIdType b;

    public ctqy(ctrc ctrcVar, ConversationIdType conversationIdType) {
        this.a = ctrcVar;
        this.b = conversationIdType;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        SuggestionData suggestionData = (SuggestionData) obj;
        suggestionData.getClass();
        ((cbgf) this.a.c.b()).l(this.b, suggestionData.x(), new String[0]);
        return ffcu.a;
    }
}
