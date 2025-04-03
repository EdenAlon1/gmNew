package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evq {
    public static final int a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static final int b(CharSequence charSequence, int i) {
        while (i > 0) {
            int i2 = i - 1;
            if (charSequence.charAt(i2) == '\n') {
                return i;
            }
            i = i2;
        }
        return 0;
    }
}
