package j$.time.format;

import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* loaded from: classes9.dex */
public final class DecimalStyle {
    public static final DecimalStyle d = new DecimalStyle('0', '-', '.');
    private static final ConcurrentHashMap e = new ConcurrentHashMap(16, 0.75f, 2);
    private final char a;
    private final char b;
    private final char c;

    private DecimalStyle(char c, char c2, char c3) {
        this.a = c;
        this.b = c2;
        this.c = c3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DecimalStyle of(Locale locale) {
        Objects.a(locale, "locale");
        ConcurrentHashMap concurrentHashMap = e;
        DecimalStyle decimalStyle = (DecimalStyle) concurrentHashMap.get(locale);
        if (decimalStyle != null) {
            return decimalStyle;
        }
        DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance(locale);
        char zeroDigit = decimalFormatSymbols.getZeroDigit();
        char minusSign = decimalFormatSymbols.getMinusSign();
        char decimalSeparator = decimalFormatSymbols.getDecimalSeparator();
        concurrentHashMap.putIfAbsent(locale, (zeroDigit == '0' && minusSign == '-' && decimalSeparator == '.') ? d : new DecimalStyle(zeroDigit, minusSign, decimalSeparator));
        return (DecimalStyle) concurrentHashMap.get(locale);
    }

    final String a(String str) {
        char c = this.a;
        if (c == '0') {
            return str;
        }
        int i = c - '0';
        char[] charArray = str.toCharArray();
        for (int i2 = 0; i2 < charArray.length; i2++) {
            charArray[i2] = (char) (charArray[i2] + i);
        }
        return new String(charArray);
    }

    final int b(char c) {
        int i = c - this.a;
        if (i < 0 || i > 9) {
            return -1;
        }
        return i;
    }

    public final char c() {
        return this.c;
    }

    public final char d() {
        return this.b;
    }

    public final char e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DecimalStyle)) {
            return false;
        }
        DecimalStyle decimalStyle = (DecimalStyle) obj;
        return this.a == decimalStyle.a && this.b == decimalStyle.b && this.c == decimalStyle.c;
    }

    public final int hashCode() {
        return this.a + '+' + this.b + this.c;
    }

    public final String toString() {
        return "DecimalStyle[" + this.a + '+' + this.b + this.c + "]";
    }
}
