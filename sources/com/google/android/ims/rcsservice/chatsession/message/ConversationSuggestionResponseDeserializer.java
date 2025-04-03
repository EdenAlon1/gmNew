package com.google.android.ims.rcsservice.chatsession.message;

import android.text.TextUtils;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponse;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementResponse;
import defpackage.dkty;
import defpackage.evko;
import defpackage.evkr;
import defpackage.evks;
import defpackage.evkt;
import defpackage.evkw;
import defpackage.evkx;
import java.lang.reflect.Type;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ConversationSuggestionResponseDeserializer {
    public static ConversationSuggestionResponse deserializeFromJson(String str) {
        evko evkoVar = new evko();
        evkoVar.c(ConversationSuggestionResponse.class, new evks<ConversationSuggestionResponse>() { // from class: com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponseDeserializer.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // defpackage.evks
            public ConversationSuggestionResponse deserialize(evkt evktVar, Type type, evkr evkrVar) {
                evkw d = evktVar.c().d(GroupManagementResponse.XML_TAG);
                if (d == null) {
                    return null;
                }
                evkw d2 = d.d("reply");
                evkw d3 = d.d(GroupManagementRequest.ACTION_TAG);
                if (d2 == null && d3 == null) {
                    return null;
                }
                ConversationSuggestionResponse conversationSuggestionResponse = new ConversationSuggestionResponse();
                if (d2 != null) {
                    conversationSuggestionResponse.type = ConversationSuggestionResponse.ConversationSuggestionResponseType.REPLY;
                } else {
                    conversationSuggestionResponse.type = ConversationSuggestionResponse.ConversationSuggestionResponseType.ACTION;
                    d2 = d3;
                }
                ConversationSuggestionDeserializer conversationSuggestionDeserializer = new ConversationSuggestionDeserializer();
                String deserializeDisplayText = conversationSuggestionDeserializer.deserializeDisplayText(d2);
                String deserializePostBackData = conversationSuggestionDeserializer.deserializePostBackData(d2);
                if (TextUtils.isEmpty(deserializeDisplayText)) {
                    return null;
                }
                conversationSuggestionResponse.displayText = deserializeDisplayText;
                conversationSuggestionResponse.postBackData = deserializePostBackData;
                return conversationSuggestionResponse;
            }
        });
        try {
            return (ConversationSuggestionResponse) evkoVar.a().i(str, ConversationSuggestionResponse.class);
        } catch (evkx e) {
            dkty.i(e, "Unable to deserialize JSON into suggestion response: %s", str);
            return null;
        }
    }
}
