package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdtv implements aoat {
    private final String a;
    private final aoav b = aoav.g;
    private final String c;
    private final MessageId d;

    public bdtv(SmartSuggestionItemSuggestionData smartSuggestionItemSuggestionData) {
        this.a = smartSuggestionItemSuggestionData.a;
        this.c = smartSuggestionItemSuggestionData.r();
        this.d = new CoreBugleMessageId(smartSuggestionItemSuggestionData.x(), -1L);
    }

    @Override // defpackage.aoax
    public final aoav a() {
        return this.b;
    }

    @Override // defpackage.aoax
    public final String b() {
        return this.a;
    }

    @Override // defpackage.aoat
    public final MessageId c() {
        return this.d;
    }

    @Override // defpackage.aoat
    public final String d() {
        return this.c;
    }
}
