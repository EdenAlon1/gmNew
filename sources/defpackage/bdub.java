package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdub implements aoax {
    public final String a;
    private final String b;
    private final aoav c = aoav.m;

    public bdub(SmartSuggestionItemSuggestionData smartSuggestionItemSuggestionData) {
        this.b = smartSuggestionItemSuggestionData.a;
        this.a = smartSuggestionItemSuggestionData.q();
    }

    @Override // defpackage.aoax
    public final aoav a() {
        return this.c;
    }

    @Override // defpackage.aoax
    public final String b() {
        return this.b;
    }
}
