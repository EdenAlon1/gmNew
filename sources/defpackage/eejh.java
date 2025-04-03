package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eejh {
    public String f;
    public int g = 0;
    public int h;

    public static boolean s(char c) {
        return Character.isUpperCase(c) || Character.isLowerCase(c);
    }

    public static boolean t(char c) {
        if (c > 127) {
            return Character.isLowerCase(c) || Character.isUpperCase(c) || Character.isDigit(c);
        }
        if (c >= 'a' && c <= 'z') {
            return true;
        }
        if (c < 'A' || c > 'Z') {
            return c <= '9' && c >= '0';
        }
        return true;
    }

    public static boolean u(char c) {
        char upperCase;
        return Character.isDigit(c) || (upperCase = Character.toUpperCase(c)) == 'A' || upperCase == 'B' || upperCase == 'C' || upperCase == 'D' || upperCase == 'E' || upperCase == 'F';
    }

    public final char n() {
        if (this.g >= this.f.length()) {
            throw new eeje(String.valueOf(this.f).concat(" getNextChar: End of buffer"));
        }
        String str = this.f;
        int i = this.g;
        this.g = i + 1;
        return str.charAt(i);
    }

    public final char o(int i) {
        if (this.g + i < this.f.length()) {
            return this.f.charAt(this.g + i);
        }
        return (char) 0;
    }

    public final String p(char c) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            char o = o(0);
            if (o == c) {
                return sb.toString();
            }
            if (o == 0) {
                throw new eeje("EOL reached");
            }
            sb.append(this.f.charAt(this.g));
            q(1);
        }
    }

    public final void q(int i) {
        this.g += i;
    }

    public final boolean r() {
        return this.g < this.f.length();
    }
}
