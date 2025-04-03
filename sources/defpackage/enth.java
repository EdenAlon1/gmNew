package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum enth {
    STRING('s', entj.GENERAL, "-#", true),
    BOOLEAN('b', entj.BOOLEAN, "-", true),
    CHAR('c', entj.CHARACTER, "-", true),
    DECIMAL('d', entj.INTEGRAL, "-0+ ,(", false),
    OCTAL('o', entj.INTEGRAL, "-#0(", false),
    HEX('x', entj.INTEGRAL, "-#0(", true),
    FLOAT('f', entj.FLOAT, "-#0+ ,(", false),
    EXPONENT('e', entj.FLOAT, "-#0+ (", true),
    GENERAL('g', entj.FLOAT, "-0+ ,(", true),
    EXPONENT_HEX('a', entj.FLOAT, "-#0+ ", true);

    public static final enth[] k = new enth[26];
    public final char l;
    public final entj m;
    public final int n;
    public final String o;

    static {
        for (enth enthVar : values()) {
            k[a(enthVar.l)] = enthVar;
        }
    }

    enth(char c, entj entjVar, String str, boolean z) {
        this.l = c;
        this.m = entjVar;
        enti entiVar = enti.a;
        int i = true != z ? 0 : 128;
        for (int i2 = 0; i2 < str.length(); i2++) {
            int a = enti.a(str.charAt(i2));
            if (a < 0) {
                throw new IllegalArgumentException("invalid flags: ".concat(str));
            }
            i |= 1 << a;
        }
        this.n = i;
        this.o = "%" + c;
    }

    public static int a(char c) {
        return (c | ' ') - 97;
    }
}
