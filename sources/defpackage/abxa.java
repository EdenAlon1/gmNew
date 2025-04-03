package defpackage;

import j$.util.Optional;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abxa {
    private final Set a;

    public abxa(String str) {
        emxf.b(!str.isEmpty(), "separators must not be empty");
        this.a = new HashSet();
        for (char c : str.toCharArray()) {
            this.a.add(Character.valueOf(c));
        }
    }

    private final Optional b(String str, int i) {
        while (i < str.length() && this.a.contains(Character.valueOf(str.charAt(i)))) {
            i++;
        }
        if (i >= str.length()) {
            return Optional.empty();
        }
        int i2 = i;
        while (i2 < str.length() && !this.a.contains(Character.valueOf(str.charAt(i2)))) {
            i2++;
        }
        return Optional.of(new abxb(str, i, i2));
    }

    public final engw a(String str) {
        int i = engw.d;
        engr engrVar = new engr();
        if (str.isEmpty()) {
            return engrVar.g();
        }
        Optional b = b(str, 0);
        while (b.isPresent()) {
            engrVar.h(b.get());
            b = b(str, ((abxb) b.get()).a + 1);
        }
        return engrVar.g();
    }
}
