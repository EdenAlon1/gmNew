package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anxl implements aoax {
    public final String a;
    public final MessageId b;
    public final String c;
    private final aoav d;

    public anxl(anzh anzhVar) {
        SmartSuggestionItemSuggestionData smartSuggestionItemSuggestionData = (SmartSuggestionItemSuggestionData) anzhVar;
        this.a = smartSuggestionItemSuggestionData.a;
        this.b = new CoreBugleMessageId(smartSuggestionItemSuggestionData.x(), -1L);
        fbxa fbxaVar = smartSuggestionItemSuggestionData.c;
        String str = (fbxaVar.c == 27 ? (fbwf) fbxaVar.d : fbwf.a).b;
        str.getClass();
        this.c = str;
        this.d = aoav.w;
    }

    @Override // defpackage.aoax
    public final aoav a() {
        return this.d;
    }

    @Override // defpackage.aoax
    public final String b() {
        return this.a;
    }
}
