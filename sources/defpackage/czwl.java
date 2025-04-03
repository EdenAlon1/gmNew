package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czwl {
    private final czwe a;
    private final czwi b;

    public czwl(czwe czweVar, czwi czwiVar) {
        this.a = czweVar;
        this.b = czwiVar;
    }

    public final czwk a(View view, SuggestionData suggestionData) {
        if (!(suggestionData instanceof SmartSuggestionData)) {
            czwi czwiVar = this.b;
            RbmSuggestionData rbmSuggestionData = (RbmSuggestionData) suggestionData;
            int suggestionType = rbmSuggestionData.b.getSuggestionType();
            if (suggestionType == 0) {
                return new czwj(czwiVar.a, rbmSuggestionData, view);
            }
            if (suggestionType == 1) {
                czwn czwnVar = czwiVar.b;
                Context context = czwiVar.a;
                crjp crjpVar = (crjp) czwnVar.a.b();
                crjpVar.getClass();
                context.getClass();
                rbmSuggestionData.getClass();
                view.getClass();
                return new czwm(crjpVar, context, rbmSuggestionData, view);
            }
            if (suggestionType == 2) {
                return new czwf(czwiVar.a, rbmSuggestionData, view);
            }
            if (suggestionType == 3) {
                return new czwc(czwiVar.a, rbmSuggestionData, view);
            }
            if (suggestionType == 4) {
                return new czwg(czwiVar.a, rbmSuggestionData, view);
            }
            if (suggestionType == 5) {
                return new czwh(czwiVar.a, rbmSuggestionData, view);
            }
            throw new IllegalArgumentException(a.h(suggestionType, "Unhandled suggestion type: "));
        }
        emxf.l(suggestionData instanceof SmartSuggestionItemSuggestionData);
        czwe czweVar = this.a;
        SmartSuggestionItemSuggestionData smartSuggestionItemSuggestionData = (SmartSuggestionItemSuggestionData) suggestionData;
        fbri l = smartSuggestionItemSuggestionData.l();
        int ordinal = l.ordinal();
        if (ordinal != 0 && ordinal != 1 && ordinal != 2 && ordinal != 3 && ordinal != 30 && ordinal != 40) {
            switch (ordinal) {
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    switch (ordinal) {
                        case 21:
                        case 23:
                            break;
                        case 22:
                            return new czwd(czweVar.a, smartSuggestionItemSuggestionData, view);
                        default:
                            throw new IllegalStateException("Unexpected value: " + l.a());
                    }
            }
        }
        throw new IllegalArgumentException("Unhandled suggestion type: " + l.a());
    }
}
