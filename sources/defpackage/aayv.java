package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aayv extends ffhv implements ffji {
    int a;
    final /* synthetic */ SmartSuggestionData b;
    final /* synthetic */ abac c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aayv(SmartSuggestionData smartSuggestionData, abac abacVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = smartSuggestionData;
        this.c = abacVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        String b;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0 && (b = this.b.b()) != null) {
            ctqh ctqhVar = (ctqh) this.c.u.b();
            ConversationIdType conversationIdType = ((BugleConversationId) this.c.h.d()).a;
            fbre fbreVar = fbre.CONSUMED;
            this.a = 1;
            if (ctqhVar.h(conversationIdType, b, fbreVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new aayv(this.b, this.c, (ffgu) obj).b(ffcu.a);
    }
}
