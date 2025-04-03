package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdua implements aoax {
    public final String a;
    public final int b;
    private final String c;
    private final aoav d = aoav.k;

    public bdua(SmartSuggestionItemSuggestionData smartSuggestionItemSuggestionData) {
        this.c = smartSuggestionItemSuggestionData.a;
        this.a = smartSuggestionItemSuggestionData.s();
        this.b = smartSuggestionItemSuggestionData.h();
    }

    @Override // defpackage.aoax
    public final aoav a() {
        return this.d;
    }

    @Override // defpackage.aoax
    public final String b() {
        return this.c;
    }
}
