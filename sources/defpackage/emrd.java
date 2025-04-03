package defpackage;

import java.util.HashMap;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emrd extends emrg {
    private static HashMap a;
    private static HashSet b;

    public emrd() {
        a = new HashMap();
        b = new HashSet();
        c("를", "을");
        c("로", "으로");
        c("와", "과");
        c("랑", "이랑");
        c("와의", "과의");
        c("라고", "이라고");
        c("라는", "이라는");
        c("고", "");
        c("가", "이");
        c("는", "은");
    }

    private static final void c(String str, String str2) {
        if (a.get(str) == null && !str.isEmpty()) {
            a.put(str, str2);
        }
        if (a.get(str2) == null && !str2.isEmpty()) {
            a.put(str2, str);
        }
        b.add(str);
    }

    @Override // defpackage.emrg
    public final emrf a(CharSequence charSequence, CharSequence charSequence2) {
        char charAt;
        if (charSequence.length() == 0) {
            return null;
        }
        emrf emrfVar = new emrf();
        CharSequence subSequence = charSequence2.subSequence(0, Math.min(charSequence2.length(), 2));
        CharSequence charSequence3 = (CharSequence) a.get(subSequence);
        if (charSequence3 == null && subSequence.length() == 2) {
            subSequence = charSequence2.subSequence(0, 1);
            charSequence3 = (CharSequence) a.get(subSequence);
        }
        if (charSequence3 == null || (charAt = charSequence.charAt(charSequence.length() - 1)) < 44032 || charAt > 55203) {
            return null;
        }
        boolean z = (charAt + 21504) % 28 == 0;
        boolean contains = b.contains(subSequence);
        if (z ^ contains) {
            emrfVar.e = charSequence3.toString();
            emrfVar.d = charSequence3.length();
        } else {
            emrfVar.e = subSequence.toString();
            emrfVar.d = subSequence.length();
        }
        emrfVar.c = charSequence.length() - 1;
        int length = subSequence.length() + charSequence3.length();
        int i = length + 2;
        if (charSequence2.length() >= i && charSequence2.charAt(emrfVar.e.length()) == '(' && charSequence2.charAt(length + 1) == ')') {
            emrfVar.d = i;
        }
        if (z == contains && emrfVar.d == subSequence.length()) {
            return null;
        }
        return emrfVar;
    }
}
