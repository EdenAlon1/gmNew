package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum alaw implements eyge {
    UNKNOWN_SAMPLING_MODE(0),
    ALWAYS_LOGGING(3),
    PER_EVENT_THROTTLING(1),
    ONCE_PER_APP_START(2),
    NO_LOGGING(4);

    private final int g;

    alaw(int i) {
        this.g = i;
    }

    public static alaw b(int i) {
        if (i == 0) {
            return UNKNOWN_SAMPLING_MODE;
        }
        if (i == 1) {
            return PER_EVENT_THROTTLING;
        }
        if (i == 2) {
            return ONCE_PER_APP_START;
        }
        if (i == 3) {
            return ALWAYS_LOGGING;
        }
        if (i != 4) {
            return null;
        }
        return NO_LOGGING;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
