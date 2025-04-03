package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eruv implements eyge {
    UNKNOWN(0),
    ACTIVE(1),
    ARCHIVED(2),
    DELETED(3),
    KEEP_ARCHIVED(4),
    SPAM_FOLDER(5),
    BLOCKED_FOLDER(6),
    CROSS_COUNTRY_FOLDER(7),
    UNRECOGNIZED(-1);

    private final int k;

    eruv(int i) {
        this.k = i;
    }

    public static eruv b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return ACTIVE;
            case 2:
                return ARCHIVED;
            case 3:
                return DELETED;
            case 4:
                return KEEP_ARCHIVED;
            case 5:
                return SPAM_FOLDER;
            case 6:
                return BLOCKED_FOLDER;
            case 7:
                return CROSS_COUNTRY_FOLDER;
            default:
                return null;
        }
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.k;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
