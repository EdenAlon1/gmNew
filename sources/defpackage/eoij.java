package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eoij implements eygg {
    static final eygg a = new eoij();

    private eoij() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        eoik eoikVar;
        switch (i) {
            case 0:
                eoikVar = eoik.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_UNKNOWN;
                break;
            case 1:
                eoikVar = eoik.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_GENERIC;
                break;
            case 2:
                eoikVar = eoik.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_MESSAGES_FAIL_TO_SEND;
                break;
            case 3:
                eoikVar = eoik.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_MESSAGES_FAIL_TO_RECEIVE;
                break;
            case 4:
                eoikVar = eoik.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_MESSAGES_FAIL_TO_DOWNLOAD;
                break;
            case 5:
                eoikVar = eoik.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_MESSAGES_STUCK_IN_SENDING;
                break;
            case 6:
                eoikVar = eoik.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_MESSAGES_DUPLICATED;
                break;
            case 7:
                eoikVar = eoik.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_MESSAGES_OUT_OF_ORDER;
                break;
            case 8:
                eoikVar = eoik.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_MESSAGES_IN_WRONG_CONVERSATION;
                break;
            case 9:
                eoikVar = eoik.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_RCS_CONNECTIVITY_LOST;
                break;
            case 10:
                eoikVar = eoik.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_RCS_PROVISIONING_FAIL;
                break;
            case 11:
                eoikVar = eoik.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_MESSAGES_LOST;
                break;
            default:
                eoikVar = null;
                break;
        }
        return eoikVar != null;
    }
}
