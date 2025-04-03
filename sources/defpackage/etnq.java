package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etnq {
    public static final etnq a = new etnq("SHA1");
    public static final etnq b = new etnq("SHA224");
    public static final etnq c = new etnq("SHA256");
    public static final etnq d = new etnq("SHA384");
    public static final etnq e = new etnq("SHA512");
    private final String f;

    private etnq(String str) {
        this.f = str;
    }

    public final String toString() {
        return this.f;
    }
}
