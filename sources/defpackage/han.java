package defpackage;

import j$.time.format.DateTimeFormatter;
import j$.time.format.DecimalStyle;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class han {
    public static final DateTimeFormatter a(String str, Locale locale, Map map) {
        String str2 = "P:" + str + locale.toLanguageTag();
        Object obj = map.get(str2);
        if (obj == null) {
            obj = DateTimeFormatter.ofPattern(str, locale).withDecimalStyle(DecimalStyle.of(locale));
            map.put(str2, obj);
        }
        obj.getClass();
        return (DateTimeFormatter) obj;
    }
}
