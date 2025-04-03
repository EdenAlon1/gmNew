package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum esjj implements eyge {
    TYPE_UNKNOWN(0),
    SMS(1),
    MMS(2),
    MMS_PUSH_NOTIFICATION(3),
    RCS(4),
    TOMBSTONE(5),
    CLOUD_SYNC(6),
    UNRECOGNIZED(-1);

    private final int j;

    esjj(int i2) {
        this.j = i2;
    }

    public static esjj b(int i2) {
        switch (i2) {
            case 0:
                return TYPE_UNKNOWN;
            case 1:
                return SMS;
            case 2:
                return MMS;
            case 3:
                return MMS_PUSH_NOTIFICATION;
            case 4:
                return RCS;
            case 5:
                return TOMBSTONE;
            case 6:
                return CLOUD_SYNC;
            default:
                return null;
        }
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.j;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
