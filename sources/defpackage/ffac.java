package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffac {
    public static final void a(String str, String str2, feza fezaVar) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt <= 31 || charAt >= 127) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i2), str));
            }
        }
        if (str2 == null) {
            throw new IllegalArgumentException("value == null");
        }
        for (int i3 = 0; i3 < str2.length(); i3++) {
            char charAt2 = str2.charAt(i3);
            if (charAt2 <= 31 || charAt2 >= 127) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", Integer.valueOf(charAt2), Integer.valueOf(i3), str2));
            }
        }
        while (i < fezaVar.a.size()) {
            if (str.equalsIgnoreCase((String) fezaVar.a.get(i))) {
                fezaVar.a.remove(i);
                fezaVar.a.remove(i);
                i -= 2;
            }
            i += 2;
        }
        fezaVar.a.add(str);
        fezaVar.a.add(str2.trim());
    }
}
