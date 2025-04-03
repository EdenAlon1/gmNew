package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum esiz implements eyge {
    ETOUFFEE_STATUS_UNKNOWN(0),
    UNENCRYPTED(1),
    ENCRYPTED(2),
    CAN_FALLBACK(3),
    UNRECOGNIZED(-1);

    private final int g;

    esiz(int i) {
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
