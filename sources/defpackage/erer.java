package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum erer implements eyge {
    UNKNOWN_SPAM_VERDICT(0),
    SPAM(1),
    NOT_SPAM(2),
    NO_VERDICT(3),
    UNRECOGNIZED(-1);

    private final int g;

    erer(int i) {
        this.g = i;
    }

    public static erer b(int i) {
        if (i == 0) {
            return UNKNOWN_SPAM_VERDICT;
        }
        if (i == 1) {
            return SPAM;
        }
        if (i == 2) {
            return NOT_SPAM;
        }
        if (i != 3) {
            return null;
        }
        return NO_VERDICT;
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
