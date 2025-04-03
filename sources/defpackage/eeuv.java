package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeuv {
    public static String a(String str) {
        return a.a(str, "sticker-", ".pbg.gz");
    }

    public static String b(String str, Locale locale, ewnm ewnmVar) {
        return String.format(Locale.US, "%s-%s-%016X", locale, str, Long.valueOf(Arrays.hashCode(ewnmVar.toByteArray())));
    }
}
