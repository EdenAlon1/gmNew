package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum fbzr implements eyge {
    USER(0),
    SIGNALING(1),
    NOTIFY(4),
    STATUS(3),
    EPHEMERAL(2),
    PUSH_ONLY(5),
    EPH_PUSH(7),
    UNRECOGNIZED(-1);

    private final int j;

    fbzr(int i2) {
        this.j = i2;
    }

    public static fbzr b(int i2) {
        if (i2 == 0) {
            return USER;
        }
        if (i2 == 1) {
            return SIGNALING;
        }
        if (i2 == 2) {
            return EPHEMERAL;
        }
        if (i2 == 3) {
            return STATUS;
        }
        if (i2 == 4) {
            return NOTIFY;
        }
        if (i2 == 5) {
            return PUSH_ONLY;
        }
        if (i2 != 7) {
            return null;
        }
        return EPH_PUSH;
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
