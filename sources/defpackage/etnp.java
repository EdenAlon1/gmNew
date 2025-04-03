package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etnp {
    public static final etnp a = new etnp("NIST_P256");
    public static final etnp b = new etnp("NIST_P384");
    public static final etnp c = new etnp("NIST_P521");
    public static final etnp d = new etnp("X25519");
    private final String e;

    private etnp(String str) {
        this.e = str;
    }

    public final String toString() {
        return this.e;
    }
}
