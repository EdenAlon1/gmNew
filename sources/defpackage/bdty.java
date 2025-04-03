package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdty implements aoar {
    private final String a;
    private final appw c;
    private final aoav b = aoav.a;
    private final eooi d = eooi.PHONE_SMART_REPLY;

    public bdty(final SmartSuggestionItemSuggestionData smartSuggestionItemSuggestionData) {
        this.a = smartSuggestionItemSuggestionData.a;
        this.c = new appw() { // from class: bdtx
            @Override // defpackage.appw
            public final /* synthetic */ engw a() {
                int i = engw.d;
                return enou.a;
            }

            @Override // defpackage.appw, defpackage.appj
            public final /* synthetic */ String b() {
                return "text/plain";
            }

            @Override // defpackage.appw
            public final String c() {
                return SmartSuggestionItemSuggestionData.this.a();
            }
        };
    }

    @Override // defpackage.aoax
    public final aoav a() {
        return this.b;
    }

    @Override // defpackage.aoax
    public final String b() {
        return this.a;
    }

    @Override // defpackage.aoar
    public final appw h() {
        return this.c;
    }

    @Override // defpackage.aoar
    public final eooi i() {
        return this.d;
    }
}
