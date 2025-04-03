package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum erdy implements eyge {
    UNKNOWN_DETECTION_TRIGGER_TYPE(0),
    MESSAGE_RECEIPT(1),
    RECLASSIFICATION(2),
    LINK_CLICK(3),
    REINFORCEMENT(4),
    UNRECOGNIZED(-1);

    private final int h;

    erdy(int i) {
        this.h = i;
    }

    public static erdy b(int i) {
        if (i == 0) {
            return UNKNOWN_DETECTION_TRIGGER_TYPE;
        }
        if (i == 1) {
            return MESSAGE_RECEIPT;
        }
        if (i == 2) {
            return RECLASSIFICATION;
        }
        if (i == 3) {
            return LINK_CLICK;
        }
        if (i != 4) {
            return null;
        }
        return REINFORCEMENT;
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
