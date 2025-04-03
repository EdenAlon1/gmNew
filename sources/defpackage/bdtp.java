package defpackage;

import com.google.android.ims.message.rbm.RbmSuggestionResponse;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdtp implements appi {
    final /* synthetic */ String a;
    final /* synthetic */ ConversationSuggestion b;

    public bdtp(String str, ConversationSuggestion conversationSuggestion) {
        this.a = str;
        this.b = conversationSuggestion;
    }

    @Override // defpackage.appw
    public final /* synthetic */ engw a() {
        int i = engw.d;
        return enou.a;
    }

    @Override // defpackage.appw, defpackage.appj
    public final String b() {
        return RbmSuggestionResponse.CONTENT_TYPE;
    }

    @Override // defpackage.appw
    public final String c() {
        String propertyValue = this.b.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_DISPLAY_TEXT);
        return propertyValue == null ? this.a : propertyValue;
    }

    @Override // defpackage.appi
    public final String d() {
        return this.a;
    }
}
