package defpackage;

import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emqq {
    public static final String a(Locale locale, String str, enhk enhkVar, boolean z) {
        String a;
        char charAt;
        char upperCase;
        int i;
        int i2 = engw.d;
        engr engrVar = new engr();
        enqu listIterator = enhkVar.entrySet().listIterator();
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            engrVar.h(entry.getKey());
            emnh emnhVar = (emnh) entry.getValue();
            engrVar.h(emnhVar.d().isEmpty() ? emnhVar.f() : emnhVar.d());
        }
        Object[] array = engrVar.g().toArray();
        emrg emrgVar = (emrg) emre.a.get(locale);
        if (emrgVar == null && !locale.getCountry().isEmpty()) {
            emrgVar = (emrg) emre.a.get(new Locale(locale.getLanguage()));
        }
        if (emrgVar != null) {
            a = emqp.a(str.replaceAll("\\{[^{}\\s]+\\}", "\ufdd5$0\ufdd5"), array);
            int indexOf = a.indexOf("\ufdd5");
            if (indexOf >= 0) {
                StringBuilder sb = new StringBuilder(a.substring(0, indexOf));
                while (true) {
                    i = indexOf + 1;
                    int indexOf2 = a.indexOf("\ufdd5", i);
                    if (indexOf2 < 0) {
                        break;
                    }
                    emre.a(emrgVar, sb, a.substring(i, indexOf2));
                    indexOf = indexOf2;
                }
                emre.a(emrgVar, sb, a.substring(i));
                a = sb.toString();
            }
        } else {
            a = emqp.a(str, array);
        }
        if (!z || a.length() == 0 || charAt == (upperCase = Character.toUpperCase((charAt = a.charAt(0))))) {
            return a;
        }
        return upperCase + a.substring(1);
    }
}
