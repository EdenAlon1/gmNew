package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public enum cgrr implements eyge {
    UNSPECIFIED_DELETION(0),
    TOOLSTONE_DELETION(1),
    MESSAGE_NOT_DELIVERED_WEAR_DELETION(2),
    MESSAGE_NOT_DELIVERED_PHONE_DELETION(3),
    RICH_CARD_DELETION(4),
    EXTERNAL_API_DELETION(5),
    MESSAGE_LIST_MANUAL_DELETION(6),
    MESSAGE_LIST_CONVO_V2_MANUAL_DELETION(7),
    METATEXT_MESSAGE_MANUAL_DELETION(8),
    EMERGENCY_MESSAGE_MANUAL_DELETION(9),
    OTP_DELETION(10),
    OBJECT_EVENT_TACHYON_DELETION(11),
    DUPLICATE_MESSAGE_RESTORE_DELETION(12),
    DITTO_DELETION(13),
    ATT_CLOUD_SYNC_DELETION(14),
    SET_PROTOCOL_CHANGE_TOMBSTONE_DELETION(15),
    AFTER_MESSAGE_MOVE_TOMBSTONE_DELETION(16),
    PREVIOUS_TOMBSTONE_DELETION(17),
    UPDATE_CONVERSATION_CREATION_TOMBSTONE_DELETION(18),
    INSERT_OR_UPDATE_AT_BOTTOM_TOMBSTONE_DELETION(19),
    UNRECOGNIZED(-1);

    private final int w;

    cgrr(int i) {
        this.w = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.w;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
