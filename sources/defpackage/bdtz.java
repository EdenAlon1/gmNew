package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdtz implements aoax {
    public final String a;
    public final String b;
    private final String c;
    private final aoav d = aoav.l;

    public bdtz(SmartSuggestionItemSuggestionData smartSuggestionItemSuggestionData) {
        this.c = smartSuggestionItemSuggestionData.a;
        this.a = smartSuggestionItemSuggestionData.d();
        this.b = smartSuggestionItemSuggestionData.a();
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
