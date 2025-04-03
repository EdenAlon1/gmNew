package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponseSerializer;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class anwd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ anwh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anwd(anwh anwhVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = anwhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((anwd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elfl w = anwh.d(this.b.c.a).w();
            w.getClass();
            this.a = 1;
            obj = fgfz.c(w, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        obj.getClass();
        ArrayList arrayList = new ArrayList();
        for (bryo bryoVar : (Iterable) obj) {
            ConversationSuggestion createRbmConversationSuggestion = ConversationSuggestion.createRbmConversationSuggestion(bryoVar.k(), bryoVar.r(), bryoVar.o(), bryoVar.q(), bryoVar.m().b, bryoVar.n().b);
            String serializeToJson = ConversationSuggestionResponseSerializer.serializeToJson(createRbmConversationSuggestion);
            RbmSuggestionData rbmSuggestionData = null;
            if (serializeToJson != null) {
                String propertyValue = createRbmConversationSuggestion.getSuggestionType() == 0 ? createRbmConversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT) : serializeToJson;
                if (propertyValue != null) {
                    MessageIdType l = bryoVar.l();
                    l.getClass();
                    rbmSuggestionData = new RbmSuggestionData(createRbmConversationSuggestion, l, new anwc(serializeToJson, propertyValue));
                }
            }
            if (rbmSuggestionData != null) {
                arrayList.add(rbmSuggestionData);
            }
        }
        return engq.a(arrayList);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new anwd(this.b, ffguVar);
    }
}
