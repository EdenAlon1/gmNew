package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum esms implements eyge {
    UNKNOWN(0),
    NOT_AUTHENTICATED(1),
    INCOMING_CHANNEL_CONNECTED(2),
    INCOMING_CHANNEL_DISCONNECTED(3),
    UNRECOGNIZED(-1);

    private final int g;

    esms(int i) {
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
