package defpackage;

import android.content.Context;
import android.os.LocaleList;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyhq {
    public static String a(Context context) {
        LocaleList locales;
        Locale locale;
        locales = context.getResources().getConfiguration().getLocales();
        locale = locales.get(0);
        return locale.toLanguageTag();
    }
}
