package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum fbkd implements eyge {
    UNKNOWN(0),
    READ_RECEIPT_OPT_IN(1),
    REVIEW_PRIVATE_REPLY_OPT_IN(2),
    UNRECOGNIZED(-1);

    private final int f;

    fbkd(int i) {
        this.f = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
