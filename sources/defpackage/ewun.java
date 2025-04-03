package defpackage;

import android.content.Context;
import android.os.LocaleList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewun {
    public static String a(Context context) {
        LocaleList locales;
        String languageTags;
        locales = context.getResources().getConfiguration().getLocales();
        languageTags = locales.toLanguageTags();
        return languageTags;
    }
}
