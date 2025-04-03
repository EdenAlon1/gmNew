package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jp {
    static kqx a(Configuration configuration) {
        LocaleList locales;
        String languageTags;
        locales = configuration.getLocales();
        languageTags = locales.toLanguageTags();
        return kqx.c(languageTags);
    }

    static void b(Configuration configuration, kqx kqxVar) {
        LocaleList forLanguageTags;
        forLanguageTags = LocaleList.forLanguageTags(kqxVar.e());
        configuration.setLocales(forLanguageTags);
    }
}
