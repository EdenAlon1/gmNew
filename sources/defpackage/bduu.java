package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bduu {
    public static final Set a = fffi.d(fbri.CALENDAR, fbri.DUO_CALL, fbri.REMINDER, fbri.STARRING);
    public static final Set b = fffi.d(fbri.COPY_OTP, fbri.SCRIPTED_REPLY);
    public static final Set c = fffi.d(fbri.COPY_OTP, fbri.CALENDAR);

    public static final fbri a(fbri fbriVar) {
        fbriVar.getClass();
        switch (fbriVar.ordinal()) {
            case 0:
            case 8:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
            case 33:
            case 40:
                return fbri.UNKNOWN_SUGGESTION_TYPE;
            case 1:
            case 2:
            case 15:
            case 31:
                return fbri.CATEGORY_TEXT;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
            case 13:
            case 22:
            case 23:
            case 25:
            case 30:
            case 32:
            case 35:
            case 36:
            case 37:
            case 38:
            case Maneuver.TYPE_DESTINATION /* 39 */:
                return fbri.CATEGORY_ACTION;
            case 12:
            case 16:
                return fbri.CATEGORY_EMOTIVE;
            case 34:
                return fbri.BARD;
            default:
                throw new ffcd();
        }
    }

    public static final fbri b(SuggestionData suggestionData) {
        SmartSuggestionItemSuggestionData smartSuggestionItemSuggestionData = suggestionData instanceof SmartSuggestionItemSuggestionData ? (SmartSuggestionItemSuggestionData) suggestionData : null;
        return smartSuggestionItemSuggestionData != null ? smartSuggestionItemSuggestionData.l() : fbri.UNKNOWN_SUGGESTION_TYPE;
    }

    public static final boolean c(SuggestionData suggestionData) {
        return a(b(suggestionData)) == fbri.CATEGORY_TEXT;
    }
}
