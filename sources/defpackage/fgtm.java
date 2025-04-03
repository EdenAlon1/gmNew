package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum fgtm implements eyge {
    UNKNOWN(0),
    VERSION_CHECK_UPGRADE_APP(1),
    VERSION_CHECK_BLOCK_APP(2),
    SPAM_SUSPEND_ACCOUNT(3),
    UNRECOGNIZED(-1);

    private final int g;

    fgtm(int i) {
        this.g = i;
    }

    public static fgtm b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return VERSION_CHECK_UPGRADE_APP;
        }
        if (i == 2) {
            return VERSION_CHECK_BLOCK_APP;
        }
        if (i != 3) {
            return null;
        }
        return SPAM_SUSPEND_ACCOUNT;
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
