package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evkh {
    public static final evkh a = new evkh("", "", false);
    public final String b;
    public final String c;
    public final boolean d;

    static {
        new evkh("\n", "  ", true);
    }

    private evkh(String str, String str2, boolean z) {
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.b = str;
        this.c = str2;
        this.d = z;
    }
}
