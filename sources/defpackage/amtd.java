package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum amtd implements eyge {
    UNKNOWN_PAL_MODE_STATE(0),
    ON(1),
    OFF(2),
    HIDDEN(3),
    TOS_NOT_CONSENTED(4),
    UNRECOGNIZED(-1);

    private final int h;

    amtd(int i) {
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
