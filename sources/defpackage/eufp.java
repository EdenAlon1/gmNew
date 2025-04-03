package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eufp {
    public static final eufp a = new eufp("SHA1");
    public static final eufp b = new eufp("SHA256");
    public static final eufp c = new eufp("SHA512");
    private final String d;

    private eufp(String str) {
        this.d = str;
    }

    public final String toString() {
        return this.d;
    }
}
