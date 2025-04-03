package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class plh {
    public static final plh a = new plh(0);
    public static final plh b = new plh(1);
    public static final plh c = new plh(2);
    private final int d;

    private plh(int i) {
        this.d = i;
    }

    public final String toString() {
        int i = this.d;
        return i != 0 ? i != 1 ? "SplitSupportStatus: ERROR_SPLIT_PROPERTY_NOT_DECLARED" : "SplitSupportStatus: UNAVAILABLE" : "SplitSupportStatus: AVAILABLE";
    }
}
