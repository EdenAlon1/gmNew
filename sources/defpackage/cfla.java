package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public enum cfla implements eyge {
    NONE(0),
    STARTING(1),
    RUNNING(2),
    STOPPING(3),
    RESTARTING(4),
    UNRECOGNIZED(-1);

    private final int h;

    cfla(int i) {
        this.h = i;
    }

    public static cfla b(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return STARTING;
        }
        if (i == 2) {
            return RUNNING;
        }
        if (i == 3) {
            return STOPPING;
        }
        if (i != 4) {
            return null;
        }
        return RESTARTING;
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
