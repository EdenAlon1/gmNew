package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eooi implements eyge {
    UNKNOWN_BUGLE_MESSAGE_SOURCE(0),
    INCOMING(1),
    CONVERSATION_ACTIVITY(2),
    OBSOLETE_WEARABLE_REPLY(3),
    NOTIFICATION_REPLY(4),
    WIDGET_REPLY(5),
    PHONE_QUICK_REPLY(6),
    BUGLE_MESSAGE_SOURCE_NA(7),
    PHONE_SMART_REPLY(8),
    ASSISTANT_REPLY(9),
    ASSISTANT_DICTATION(15),
    MESSAGE_REACTION(10),
    MESSAGE_SEND_RETRY(11),
    SCHEDULED_SEND(12),
    EXTERNAL_MESSAGING_API(13),
    BUBBLE(14),
    MAPI_SEND_MSG(16),
    MULTI_SHARE_SEND(17),
    ANDROID_AUTO_REPLY(18),
    RBM_SUGGESTION_REPLY(19),
    MEDIA_FULL_SCREEN(20),
    DIRECT_SEND_FULL_SCREEN(21),
    CHATBOT_SUBSCRIPTION(22),
    ALL_IDENTITIES_READY_TO_SEND_AND_RECEIVE(23),
    REPORT_SEND_FAILURE(24),
    SEND_REPORTS_FOR_CONVERSATION(25),
    MARK_MESSAGE_AS_READ(26),
    PROCESS_FILE_TRANSFER_ACTION(27),
    FILE_DOWNLOAD_COMPLETED_HANDLER(28),
    INCOMING_FILE_TRANSFER_PROCESSOR(29),
    DUPLICATE_MESSAGE(30),
    INCOMING_RCS_MESSAGE_PROCESSOR(31),
    MARK_AS_READ_ACTION(32),
    CHAT_READINESS_MANAGER(33),
    INCOMING_BLOCKED_USER(34);

    public final int J;

    eooi(int i) {
        this.J = i;
    }

    public static eooi b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_BUGLE_MESSAGE_SOURCE;
            case 1:
                return INCOMING;
            case 2:
                return CONVERSATION_ACTIVITY;
            case 3:
                return OBSOLETE_WEARABLE_REPLY;
            case 4:
                return NOTIFICATION_REPLY;
            case 5:
                return WIDGET_REPLY;
            case 6:
                return PHONE_QUICK_REPLY;
            case 7:
                return BUGLE_MESSAGE_SOURCE_NA;
            case 8:
                return PHONE_SMART_REPLY;
            case 9:
                return ASSISTANT_REPLY;
            case 10:
                return MESSAGE_REACTION;
            case 11:
                return MESSAGE_SEND_RETRY;
            case 12:
                return SCHEDULED_SEND;
            case 13:
                return EXTERNAL_MESSAGING_API;
            case 14:
                return BUBBLE;
            case 15:
                return ASSISTANT_DICTATION;
            case 16:
                return MAPI_SEND_MSG;
            case 17:
                return MULTI_SHARE_SEND;
            case 18:
                return ANDROID_AUTO_REPLY;
            case 19:
                return RBM_SUGGESTION_REPLY;
            case 20:
                return MEDIA_FULL_SCREEN;
            case 21:
                return DIRECT_SEND_FULL_SCREEN;
            case 22:
                return CHATBOT_SUBSCRIPTION;
            case 23:
                return ALL_IDENTITIES_READY_TO_SEND_AND_RECEIVE;
            case 24:
                return REPORT_SEND_FAILURE;
            case 25:
                return SEND_REPORTS_FOR_CONVERSATION;
            case 26:
                return MARK_MESSAGE_AS_READ;
            case 27:
                return PROCESS_FILE_TRANSFER_ACTION;
            case 28:
                return FILE_DOWNLOAD_COMPLETED_HANDLER;
            case 29:
                return INCOMING_FILE_TRANSFER_PROCESSOR;
            case 30:
                return DUPLICATE_MESSAGE;
            case 31:
                return INCOMING_RCS_MESSAGE_PROCESSOR;
            case 32:
                return MARK_AS_READ_ACTION;
            case 33:
                return CHAT_READINESS_MANAGER;
            case 34:
                return INCOMING_BLOCKED_USER;
            default:
                return null;
        }
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.J;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.J);
    }
}
