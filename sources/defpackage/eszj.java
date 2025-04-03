package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eszj {
    OBJECT_EVENT,
    CONVERSATION_EVENT,
    CONVERSATION_PARTICIPANT_EVENT,
    PARTICIPANT_EVENT,
    OBJECTS_LIST_EVENT,
    RESET_BOX_EVENT,
    FILE_EVENT,
    BOX_METADATA_EVENT,
    STORAGE_INFO_CHANGE_EVENT,
    BOX_RESET_EVENT,
    EVENT_NOT_SET;

    public static eszj a(int i) {
        if (i == 9) {
            return BOX_METADATA_EVENT;
        }
        if (i == 12) {
            return STORAGE_INFO_CHANGE_EVENT;
        }
        if (i == 15) {
            return BOX_RESET_EVENT;
        }
        switch (i) {
            case 0:
                return EVENT_NOT_SET;
            case 1:
                return OBJECT_EVENT;
            case 2:
                return CONVERSATION_EVENT;
            case 3:
                return CONVERSATION_PARTICIPANT_EVENT;
            case 4:
                return PARTICIPANT_EVENT;
            case 5:
                return OBJECTS_LIST_EVENT;
            case 6:
                return RESET_BOX_EVENT;
            case 7:
                return FILE_EVENT;
            default:
                return null;
        }
    }
}
