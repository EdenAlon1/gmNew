package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdtu implements aoax {
    public final /* synthetic */ SmartSuggestionItemSuggestionData a;
    private final String b;
    private final aoav c = aoav.i;

    public bdtu(SmartSuggestionItemSuggestionData smartSuggestionItemSuggestionData) {
        this.a = smartSuggestionItemSuggestionData;
        this.b = smartSuggestionItemSuggestionData.a;
    }

    @Override // defpackage.aoax
    public final aoav a() {
        return this.c;
    }

    @Override // defpackage.aoax
    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a.u();
    }
}
