package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eoko implements eyge {
    UNKNOWN_BUGLE_CONVERSATION_ORIGIN(0),
    CONVERSATION_FROM_LIST(1),
    CONVERSATION_FROM_COMPOSE(2),
    CONVERSATION_FROM_LIST_SWIPE(3),
    CONVERSATION_FROM_MORE_BUTTON(4),
    CONVERSATION_FROM_UNBLOCK_ACTION(5),
    CONVERSATION_FROM_WEARABLE_ACTION(6),
    CONVERSATION_FROM_WEB_ACTION(7),
    CONVERSATION_FROM_UNSPAM_ACTION(8),
    CONVERSATION_FROM_SPAM_DETECTION(9),
    CONVERSATION_FROM_CMS_ACTION(10),
    CONVERSATION_FROM_BUBBLE(11),
    CONVERSATION_FROM_BG_STARTUP_TASK(12),
    CONVERSATION_FROM_METADATA_UPDATE(13),
    CONVERSATION_FROM_DELETION_LOGGING(14),
    CONVERSATION_FROM_DELETION_DURING_CMS_RESTORE_D2D(15),
    CONVERSATION_FROM_RBM_SUGGESTED_ACTION(16),
    CONVERSATION_FROM_CROSS_COUNTRY_HIDE(17),
    CONVERSATION_FROM_CROSS_COUNTRY_USER_ACTION(18),
    CONVERSATION_FROM_CHATBOT_UNSUBSCRIBE_ACTION(19);

    public final int u;

    eoko(int i) {
        this.u = i;
    }

    public static eoko b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_BUGLE_CONVERSATION_ORIGIN;
            case 1:
                return CONVERSATION_FROM_LIST;
            case 2:
                return CONVERSATION_FROM_COMPOSE;
            case 3:
                return CONVERSATION_FROM_LIST_SWIPE;
            case 4:
                return CONVERSATION_FROM_MORE_BUTTON;
            case 5:
                return CONVERSATION_FROM_UNBLOCK_ACTION;
            case 6:
                return CONVERSATION_FROM_WEARABLE_ACTION;
            case 7:
                return CONVERSATION_FROM_WEB_ACTION;
            case 8:
                return CONVERSATION_FROM_UNSPAM_ACTION;
            case 9:
                return CONVERSATION_FROM_SPAM_DETECTION;
            case 10:
                return CONVERSATION_FROM_CMS_ACTION;
            case 11:
                return CONVERSATION_FROM_BUBBLE;
            case 12:
                return CONVERSATION_FROM_BG_STARTUP_TASK;
            case 13:
                return CONVERSATION_FROM_METADATA_UPDATE;
            case 14:
                return CONVERSATION_FROM_DELETION_LOGGING;
            case 15:
                return CONVERSATION_FROM_DELETION_DURING_CMS_RESTORE_D2D;
            case 16:
                return CONVERSATION_FROM_RBM_SUGGESTED_ACTION;
            case 17:
                return CONVERSATION_FROM_CROSS_COUNTRY_HIDE;
            case 18:
                return CONVERSATION_FROM_CROSS_COUNTRY_USER_ACTION;
            case 19:
                return CONVERSATION_FROM_CHATBOT_UNSUBSCRIBE_ACTION;
            default:
                return null;
        }
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.u;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.u);
    }
}
