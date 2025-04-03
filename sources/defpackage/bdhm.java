package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public enum bdhm implements eyge {
    UNKNOWN_VALUE(0),
    DISABLED(1),
    EXECUTE_UPGRADE(2),
    EXECUTE_DOWNGRADE(3),
    WIPE_APP_DATA(4),
    UNRECOGNIZED(-1);

    private final int h;

    bdhm(int i) {
        this.h = i;
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
