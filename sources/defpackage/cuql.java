package defpackage;

import android.content.Context;
import android.os.LocaleList;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuql {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/util/spam/hades/analytics/LanguageComparisonUtils");
    private final ffbr b;
    private final Context c;

    public cuql(ffbr ffbrVar, Context context) {
        ffbrVar.getClass();
        context.getClass();
        this.b = ffbrVar;
        this.c = context;
    }

    public final void a(String str) {
        LocaleList locales;
        Locale locale;
        if (str == null || str.length() == 0) {
            return;
        }
        try {
            locales = this.c.getResources().getConfiguration().getLocales();
            locale = locales.get(0);
            String language = locale.getLanguage();
            if (language != null && language.length() != 0) {
                if (ffpc.j(str, language, true)) {
                    ((akzt) this.b.b()).e("Bugle.DetectedAndSystemLanguages.Incoming.Count", 1);
                    return;
                } else {
                    ((akzt) this.b.b()).e("Bugle.DetectedAndSystemLanguages.Incoming.Count", 2);
                    return;
                }
            }
            cuqk.a(null);
        } catch (Exception e) {
            cuqk.a(e);
        }
    }
}
