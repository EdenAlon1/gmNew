package defpackage;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hap {
    public static final String a(long j, String str, Locale locale, Map map) {
        String format;
        DateFormat instanceForSkeleton;
        DisplayContext displayContext;
        TimeZone timeZone;
        String str2 = "S:" + str + locale.toLanguageTag();
        Object obj = map.get(str2);
        Object obj2 = obj;
        if (obj == null) {
            instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
            displayContext = DisplayContext.CAPITALIZATION_FOR_STANDALONE;
            instanceForSkeleton.setContext(displayContext);
            timeZone = TimeZone.GMT_ZONE;
            instanceForSkeleton.setTimeZone(timeZone);
            map.put(str2, instanceForSkeleton);
            obj2 = instanceForSkeleton;
        }
        obj2.getClass();
        format = iy$$ExternalSyntheticApiModelOutline3.m(obj2).format(new Date(j));
        return format;
    }
}
