package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum drqq implements eyge {
    MEDIA_QUALITY_UNKNOWN(0),
    VERY_LOW(1),
    LOW(2),
    HIGH(3),
    ORIGINAL(4),
    UNRECOGNIZED(-1);

    private final int h;

    drqq(int i) {
        this.h = i;
    }

    public static drqq b(int i) {
        if (i == 0) {
            return MEDIA_QUALITY_UNKNOWN;
        }
        if (i == 1) {
            return VERY_LOW;
        }
        if (i == 2) {
            return LOW;
        }
        if (i == 3) {
            return HIGH;
        }
        if (i != 4) {
            return null;
        }
        return ORIGINAL;
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
