package com.google.android.ims.rcsservice.chatsession.message;

import android.text.TextUtils;
import defpackage.dkta;
import defpackage.dkty;
import defpackage.evkn;
import defpackage.evko;
import defpackage.evlb;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ConversationSuggestionsJsonParser {
    private evkn parser;

    public ConversationSuggestionsJsonParser() {
        evko evkoVar = new evko();
        evkoVar.b();
        this.parser = evkoVar.a();
    }

    public ArrayList<ConversationSuggestion> parse(String str) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList<>();
        }
        try {
            ConversationSuggestionsContainer conversationSuggestionsContainer = (ConversationSuggestionsContainer) this.parser.i(str, ConversationSuggestionsContainer.class);
            ArrayList<ConversationSuggestion> arrayList = conversationSuggestionsContainer.suggestions;
            if (dkta.a(arrayList)) {
                dkty.q("No suggestions found in suggested chip list.", new Object[0]);
                return new ArrayList<>();
            }
            dkty.c("Parsed %d suggestions from suggested chip list.", Integer.valueOf(conversationSuggestionsContainer.suggestions.size()));
            if (!dkta.a(arrayList)) {
                arrayList.removeAll(Collections.singleton(null));
            }
            return arrayList;
        } catch (evlb e) {
            dkty.i(e, "Unable to parse incoming suggested chip list.", new Object[0]);
            return new ArrayList<>();
        }
    }
}
