package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdtw implements aoas {
    private final String a;
    private final aoav b = aoav.f;
    private final Long c;
    private final String d;
    private final String e;

    public bdtw(SmartSuggestionItemSuggestionData smartSuggestionItemSuggestionData, Long l, Context context) {
        this.a = smartSuggestionItemSuggestionData.a;
        this.c = l;
        fbxa fbxaVar = smartSuggestionItemSuggestionData.c;
        String str = (fbxaVar.c == 19 ? (fbsh) fbxaVar.d : fbsh.a).e;
        str.getClass();
        this.d = str;
        this.e = context.getString(R.string.calendar_suggestion_event_description);
    }

    @Override // defpackage.aoax
    public final aoav a() {
        return this.b;
    }

    @Override // defpackage.aoax
    public final String b() {
        return this.a;
    }

    @Override // defpackage.aoas
    public final Long c() {
        return null;
    }

    @Override // defpackage.aoas
    public final Long d() {
        return this.c;
    }

    @Override // defpackage.aoas
    public final String e() {
        return this.e;
    }

    @Override // defpackage.aoas
    public final String f() {
        return this.d;
    }

    @Override // defpackage.aoas
    public final String g() {
        return null;
    }
}
