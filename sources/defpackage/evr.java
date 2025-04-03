package defpackage;

import androidx.car.app.model.Alert;
import java.text.BreakIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evr {
    public static final int a(String str, int i) {
        String str2;
        int i2;
        lgl c = c();
        Integer num = null;
        if (c != null) {
            ksw.d(c.i(), "Not initialized yet");
            ksw.i(str, "charSequence cannot be null");
            lgs lgsVar = c.f.a;
            if (i < 0 || i >= str.length()) {
                str2 = str;
                i2 = -1;
            } else {
                str2 = str;
                i2 = ((lgp) lgsVar.a(str2, Math.max(0, i - 16), Math.min(str.length(), i + 16), Alert.DURATION_SHOW_INDEFINITELY, true, new lgp(i))).b;
            }
            Integer valueOf = Integer.valueOf(i2);
            if (valueOf.intValue() != -1) {
                num = valueOf;
            }
        } else {
            str2 = str;
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str2);
        return characterInstance.following(i);
    }

    public static final int b(String str, int i) {
        lgl c = c();
        Integer num = null;
        if (c != null) {
            Integer valueOf = Integer.valueOf(c.a(str, Math.max(0, i - 1)));
            if (valueOf.intValue() != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    private static final lgl c() {
        if (!lgl.h()) {
            return null;
        }
        lgl c = lgl.c();
        if (c.b() == 1) {
            return c;
        }
        return null;
    }
}
