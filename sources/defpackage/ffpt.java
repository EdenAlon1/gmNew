package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes6.dex */
class ffpt extends ffps {
    public static final char Z(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() != 0) {
            return charSequence.charAt(ffpc.u(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static final CharSequence aa(CharSequence charSequence) {
        return new StringBuilder(charSequence).reverse();
    }

    public static final String ab(String str, int i) {
        str.getClass();
        if (i < 0) {
            throw new IllegalArgumentException(a.f(i, "Requested character count ", " is less than zero."));
        }
        String substring = str.substring(ffmk.g(i, str.length()));
        substring.getClass();
        return substring;
    }

    public static final String ac(String str, int i) {
        str.getClass();
        String substring = str.substring(0, ffmk.g(i, str.length()));
        substring.getClass();
        return substring;
    }

    public static final String ad(String str, int i) {
        int length = str.length();
        String substring = str.substring(length - ffmk.g(i, length));
        substring.getClass();
        return substring;
    }
}
