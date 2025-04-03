package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eytd implements eyge {
    TYPE_UNSPECIFIED(0),
    SEND_KEEPALIVE(1),
    REQUEST_RECONFIGURATION(2),
    RESET_PROVISIONING_ENGINE(3),
    UNRECOGNIZED(-1);

    private final int g;

    eytd(int i) {
        this.g = i;
    }

    public static eytd b(int i) {
        if (i == 0) {
            return TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return SEND_KEEPALIVE;
        }
        if (i == 2) {
            return REQUEST_RECONFIGURATION;
        }
        if (i != 3) {
            return null;
        }
        return RESET_PROVISIONING_ENGINE;
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
