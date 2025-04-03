package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.EnumMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duml {
    public final String a;
    public final Context b;
    public final EnumMap c = new EnumMap(dumn.class);
    private final dumm d;

    public duml(Context context, dumm dummVar) {
        if (TextUtils.isEmpty("BundledEmojiListLoader")) {
            throw new IllegalArgumentException();
        }
        this.b = context;
        this.a = "BundledEmojiListLoader";
        this.d = dummVar;
    }

    public static String a(String str, char c) {
        String valueOf = String.valueOf(emuz.d(Integer.toHexString(c)));
        emvp emvpVar = new emvp(c);
        String concat = "%".concat(valueOf);
        int length = concat.length();
        int i = 0;
        if (length != 0) {
            if (length == 1) {
                return str.toString().replace(emvpVar.a, concat.charAt(0));
            }
            String charSequence = str.toString();
            int d = emvpVar.d(charSequence);
            if (d == -1) {
                return charSequence;
            }
            int length2 = charSequence.length();
            StringBuilder sb = new StringBuilder(((length2 * 3) / 2) + 16);
            do {
                sb.append((CharSequence) charSequence, i, d);
                sb.append((CharSequence) concat);
                i = d + 1;
                d = emvpVar.e(charSequence, i);
            } while (d != -1);
            sb.append((CharSequence) charSequence, i, length2);
            return sb.toString();
        }
        String charSequence2 = str.toString();
        int d2 = emvpVar.d(charSequence2);
        if (d2 == -1) {
            return charSequence2;
        }
        char[] charArray = charSequence2.toCharArray();
        int i2 = 1;
        while (true) {
            d2++;
            while (d2 != charArray.length) {
                char c2 = charArray[d2];
                if (emvpVar.c(c2)) {
                    break;
                }
                charArray[d2 - i2] = c2;
                d2++;
            }
            return new String(charArray, 0, d2 - i2);
            i2++;
        }
    }

    public static String b(String str) {
        return a(a(a(str, '%'), '|'), '>');
    }

    public final void c() {
        this.c.put((EnumMap) dumn.APP, (dumn) Long.toString(this.d.b));
    }

    public final void d() {
        this.c.put((EnumMap) dumn.OS, (dumn) this.d.a);
    }
}
