package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum fgtb implements eyge {
    UNKNOWN(0),
    TESTING(4),
    GAIA_CALLER_ID(3),
    EMAIL_CONTACTS(5),
    TACHYGRAM(6),
    MUTUAL_CJNS(7),
    PUSH_ALERTS(8),
    UNICORN(9),
    GROUP_CALLING_TICKLE_WEB(10),
    GUESTS_SUPPORTED(11),
    SUSPECTED_SPAM_UI_SUPPORTED(12),
    SELF_GROUP_CALL_TICKLE_SUPPORTED(13),
    DUET_GROUP_CALL(14),
    SUPPORTS_LONG_LIVED_RCS_AUTH_TOKEN(15),
    SUPPORTS_24_HOUR_RCS_AUTH_TOKEN(16),
    UNRECOGNIZED(-1);

    private final int r;

    fgtb(int i) {
        this.r = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.r;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
