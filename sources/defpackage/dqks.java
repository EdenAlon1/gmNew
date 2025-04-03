package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqks {
    public static final String a(Locale locale) {
        String language;
        locale.getClass();
        String country = locale.getCountry();
        country.getClass();
        if (ffpc.J(country)) {
            language = locale.getLanguage();
        } else {
            language = locale.getLanguage() + "_" + locale.getCountry();
        }
        language.getClass();
        String lowerCase = language.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }
}
