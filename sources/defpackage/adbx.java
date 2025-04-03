package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum adbx implements eyge {
    UNKNOWN_CAPABILITY(0),
    MARK_CONVERSATION_AS_READ(1),
    MARK_MESSAGES_AS_READ(2),
    SEND_MESSAGE(3),
    SCHEDULE_MESSAGE(4),
    CREATE_ONO_ON_ONE_CONVERSATION(5),
    GET_XMS_CONFIGS(6),
    DELETE_MESSAGE(7),
    GET_USER_CONSENT_SETTING(8),
    GET_APP_SETTINGS(9),
    CREATE_MMS_GROUP_CONVERSATION(10),
    GET_THREAD_IDS_FOR_ALL_RCS_GROUPS(11),
    GET_RCS_GROUP_METADATA(12),
    SEARCH_MESSAGE(13),
    UNRECOGNIZED(-1);

    private final int q;

    adbx(int i) {
        this.q = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.q;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
