package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eshs implements eyge {
    UNKNOWN_CONVERSATION_JOIN_STATE(0),
    CONVERSATION_JOIN_STATE_JOINED(1),
    CONVERSATION_JOIN_STATE_INVITED(2),
    CONVERSATION_JOIN_STATE_LEFT(3),
    CONVERSATION_JOIN_STATE_DIFFERENT_CONFIG(4),
    CONVERSATION_JOIN_STATE_RECOVERED_FROM_TELEPHONY(5),
    CONVERSATION_JOIN_STATE_RCS_GROUP_CREATION_FAILED(6),
    CONVERSATION_JOIN_STATE_FORKED(7),
    CONVERSATION_JOIN_STATE_SETTING_UP_FOR_VANILLA_RCS(8),
    CONVERSATION_JOIN_STATE_RCS_GROUP_CREATION_IN_PROGRESS(9),
    CONVERSATION_JOIN_STATE_SATELLITE_ENDED(10),
    UNRECOGNIZED(-1);

    private final int n;

    eshs(int i) {
        this.n = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.n;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
