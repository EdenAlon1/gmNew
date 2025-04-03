package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponseSerializer;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class anwn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ anwr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anwn(anwr anwrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = anwrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((anwn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object c;
        String propertyValue;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            c = obj;
        } else {
            elfl w = anwr.d(this.b.c.a).w();
            w.getClass();
            this.a = 1;
            c = fgfz.c(w, this);
            if (c == ffhhVar) {
                return ffhhVar;
            }
        }
        c.getClass();
        ArrayList arrayList = new ArrayList();
        for (bryo bryoVar : (Iterable) c) {
            bryoVar.getClass();
            ConversationSuggestion createRbmConversationSuggestion = ConversationSuggestion.createRbmConversationSuggestion(bryoVar.k(), bryoVar.r(), bryoVar.o(), bryoVar.q(), bryoVar.m().b, bryoVar.n().b);
            String serializeToJson = ConversationSuggestionResponseSerializer.serializeToJson(createRbmConversationSuggestion);
            aoax aoaxVar = null;
            if (serializeToJson != null) {
                if (createRbmConversationSuggestion.getSuggestionType() != 0) {
                    bdtp bdtpVar = new bdtp(serializeToJson, createRbmConversationSuggestion);
                    switch (createRbmConversationSuggestion.getSuggestionType()) {
                        case 1:
                            aoaxVar = new bdtk(bdtpVar, createRbmConversationSuggestion);
                            break;
                        case 2:
                            aoaxVar = new bdtj(bdtpVar, createRbmConversationSuggestion);
                            break;
                        case 3:
                            aoaxVar = new bdtm(bdtpVar, createRbmConversationSuggestion);
                            break;
                        case 4:
                            String propertyValue2 = createRbmConversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME);
                            if (propertyValue2 != null && (propertyValue = createRbmConversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_END_TIME)) != null) {
                                try {
                                    aoaxVar = new bdtn(bdtpVar, createRbmConversationSuggestion, dktc.b(propertyValue2).a, dktc.b(propertyValue).a);
                                    break;
                                } catch (IllegalArgumentException unused) {
                                    break;
                                }
                            }
                            break;
                        case 5:
                            aoaxVar = new bdto(bdtpVar);
                            break;
                        case 6:
                        case 7:
                        default:
                            ((enrr) enru.c("com/google/android/apps/messaging/shared/datamodel/data/suggestions/ConversationSuggestionExtKt").j().h("com/google/android/apps/messaging/shared/datamodel/data/suggestions/ConversationSuggestionExtKt", "toSuggestionV2", 205, "ConversationSuggestionExt.kt")).r("Unexpected RBM suggestion type loaded", createRbmConversationSuggestion.getSuggestionType());
                            break;
                        case 8:
                            aoaxVar = new bdtg(aoav.t, createRbmConversationSuggestion);
                            break;
                        case 9:
                            aoaxVar = new bdtg(aoav.v, createRbmConversationSuggestion);
                            break;
                        case 10:
                            aoaxVar = new bdtg(aoav.u, createRbmConversationSuggestion);
                            break;
                        case 11:
                            aoaxVar = new bdtl(bdtpVar, createRbmConversationSuggestion);
                            break;
                    }
                } else {
                    String propertyValue3 = createRbmConversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
                    if (propertyValue3 != null) {
                        aoaxVar = new bdti(propertyValue3);
                    }
                }
            }
            if (aoaxVar != null) {
                arrayList.add(aoaxVar);
            }
        }
        return engq.a(arrayList);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new anwn(this.b, ffguVar);
    }
}
