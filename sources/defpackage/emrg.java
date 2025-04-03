package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class emrg {
    private final Map a = new HashMap();

    private final void c(String str, String str2, String str3) {
        Map map = (Map) this.a.get(str);
        if (map == null) {
            map = new HashMap();
            this.a.put(str, map);
        }
        map.put(str2, str3);
    }

    public emrf a(CharSequence charSequence, CharSequence charSequence2) {
        int i;
        emrf emrfVar = new emrf();
        emrfVar.a = charSequence.length() - 1;
        while (true) {
            int i2 = emrfVar.a;
            if (i2 < 0 || !Character.isWhitespace(charSequence.charAt(i2))) {
                break;
            }
            emrfVar.a--;
        }
        emrfVar.b = 0;
        while (emrfVar.b < charSequence2.length() && Character.isWhitespace(charSequence2.charAt(emrfVar.b))) {
            emrfVar.b++;
        }
        if (emrfVar.a < 0 || emrfVar.b == charSequence2.length()) {
            return null;
        }
        int length = charSequence.length();
        int i3 = emrfVar.a;
        String format = String.format("%c%s%c", Integer.valueOf(Character.codePointBefore(charSequence, i3 + 1)), ((length - i3) + emrfVar.b) + (-1) > 0 ? " " : "", Integer.valueOf(Character.codePointAt(charSequence2, emrfVar.b)));
        Map map = (Map) this.a.get(format);
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            int indexOf = str.indexOf(format) - 1;
            int length2 = format.length() + indexOf;
            emrfVar.c = emrfVar.a - 1;
            while (indexOf >= 0 && emrfVar.c >= 0) {
                int codePointBefore = str.codePointBefore(indexOf + 1);
                int codePointBefore2 = Character.codePointBefore(charSequence, emrfVar.c + 1);
                if (codePointBefore == 124) {
                    if (Character.isLetterOrDigit(codePointBefore2)) {
                        codePointBefore = 124;
                    } else {
                        continue;
                        indexOf -= Character.charCount(codePointBefore2);
                        emrfVar.c -= Character.charCount(codePointBefore2);
                    }
                }
                if (codePointBefore != codePointBefore2) {
                    break;
                }
                indexOf -= Character.charCount(codePointBefore2);
                emrfVar.c -= Character.charCount(codePointBefore2);
            }
            if (emrfVar.c < 0 && indexOf >= 0 && str.charAt(indexOf) == '|') {
                indexOf--;
            }
            if (indexOf < 0) {
                int i4 = length2 + 1;
                emrfVar.d = emrfVar.b + 1;
                while (i4 < str.length() && emrfVar.d < charSequence2.length()) {
                    int codePointAt = str.codePointAt(i4);
                    int codePointAt2 = Character.codePointAt(charSequence2, emrfVar.d);
                    if (codePointAt == 124) {
                        if (Character.isLetterOrDigit(codePointAt2)) {
                            codePointAt = 124;
                        } else {
                            continue;
                            i4 += Character.charCount(codePointAt2);
                            emrfVar.d += Character.charCount(codePointAt2);
                        }
                    }
                    if (codePointAt != codePointAt2) {
                        break;
                    }
                    i4 += Character.charCount(codePointAt2);
                    emrfVar.d += Character.charCount(codePointAt2);
                }
                if (emrfVar.d == charSequence2.length() && i4 < str.length() && str.charAt(i4) == '|') {
                    emrfVar.d++;
                    i4++;
                }
                if (i4 >= str.length()) {
                    if (str.charAt(0) == '|' && (i = emrfVar.c) >= 0) {
                        emrfVar.c = i + 1;
                    }
                    if (str.charAt(str.length() - 1) == '|') {
                        emrfVar.d--;
                    }
                    emrfVar.a++;
                    emrfVar.e = (String) entry.getValue();
                    return emrfVar;
                }
            }
        }
        return null;
    }

    final void b(String str, String str2) {
        int indexOf = str.indexOf(32);
        if (indexOf > 0 && indexOf < str.length() - 1) {
            c(str.substring(str.offsetByCodePoints(indexOf, -1), str.offsetByCodePoints(indexOf, 2)), str, str2);
            return;
        }
        int offsetByCodePoints = str.offsetByCodePoints(str.length(), -1);
        int i = 0;
        while (i < offsetByCodePoints) {
            c(str.substring(i, str.offsetByCodePoints(i, 2)), str, str2);
            i = str.offsetByCodePoints(i, 1);
        }
    }
}
