package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public enum cmes implements eyge {
    RCS_SUCCESS_NOTIFICATION_STATE_UNSPECIFIED(0),
    RCS_SUCCESS_NOTIFICATION_STATE_SUCCESS_AWAITING_NOTIFY(1),
    RCS_SUCCESS_NOTIFICATION_STATE_NOTIFIED(2),
    UNRECOGNIZED(-1);

    public static final eygf e = new eygf() { // from class: cmer
        @Override // defpackage.eygf
        public final /* synthetic */ eyge a(int i) {
            if (i == 0) {
                return cmes.RCS_SUCCESS_NOTIFICATION_STATE_UNSPECIFIED;
            }
            if (i == 1) {
                return cmes.RCS_SUCCESS_NOTIFICATION_STATE_SUCCESS_AWAITING_NOTIFY;
            }
            if (i != 2) {
                return null;
            }
            return cmes.RCS_SUCCESS_NOTIFICATION_STATE_NOTIFIED;
        }
    };
    private final int g;

    cmes(int i) {
        this.g = i;
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
