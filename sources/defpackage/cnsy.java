package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public enum cnsy implements eyge {
    HELP_STATE_UNSPECIFIED(0),
    HELP_NOT_LONGER_NEED(1),
    WAITING_FOR_HELP(2),
    UNRECOGNIZED(-1);

    private final int f;

    cnsy(int i) {
        this.f = i;
    }

    public static cnsy b(int i) {
        if (i == 0) {
            return HELP_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return HELP_NOT_LONGER_NEED;
        }
        if (i != 2) {
            return null;
        }
        return WAITING_FOR_HELP;
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
