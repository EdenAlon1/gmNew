package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eudp {
    public static final eudp a = new eudp("TINK");
    public static final eudp b = new eudp("CRUNCHY");
    public static final eudp c = new eudp("LEGACY");
    public static final eudp d = new eudp("NO_PREFIX");
    private final String e;

    private eudp(String str) {
        this.e = str;
    }

    public final String toString() {
        return this.e;
    }
}
