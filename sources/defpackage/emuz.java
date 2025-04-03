package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emuz {
    public static char a(char c) {
        return g(c) ? (char) (c ^ ' ') : c;
    }

    public static char b(char c) {
        return f(c) ? (char) (c ^ ' ') : c;
    }

    public static String c(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (g(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (g(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static String d(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (f(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (f(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static boolean e(CharSequence charSequence, CharSequence charSequence2) {
        int h;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            char charAt2 = charSequence2.charAt(i);
            if (charAt != charAt2 && ((h = h(charAt)) >= 26 || h != h(charAt2))) {
                return false;
            }
        }
        return true;
    }

    public static boolean f(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static boolean g(char c) {
        return c >= 'A' && c <= 'Z';
    }

    private static int h(char c) {
        return (char) ((c | ' ') - 97);
    }
}
