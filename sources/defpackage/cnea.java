package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public enum cnea implements eyge {
    STATUS_UNSPECIFIED(0),
    SUCCESS(1),
    FAIL_MMS_UNAVAILABLE(2),
    FAIL_ENABLE_MMS_IN_GROUP(3),
    UNRECOGNIZED(-1);

    private final int g;

    cnea(int i) {
        this.g = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
