package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etuk {
    public static final etuk a = new etuk("SHA1");
    public static final etuk b = new etuk("SHA224");
    public static final etuk c = new etuk("SHA256");
    public static final etuk d = new etuk("SHA384");
    public static final etuk e = new etuk("SHA512");
    private final String f;

    private etuk(String str) {
        this.f = str;
    }

    public final String toString() {
        return this.f;
    }
}
