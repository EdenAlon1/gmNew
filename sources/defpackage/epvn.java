package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class epvn implements eygg {
    static final eygg a = new epvn();

    private epvn() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        epvo epvoVar;
        switch (i) {
            case 0:
                epvoVar = epvo.UNKNOWN_TRIGGER;
                break;
            case 1:
                epvoVar = epvo.PERIODIC_JOB_BASED_ON_TELEPHONY;
                break;
            case 2:
                epvoVar = epvo.RECEIVE_SMS_MESSAGE_HELPER;
                break;
            case 3:
                epvoVar = epvo.PROCESS_DOWNLOADED_MMS_ACTION_THREAD_DATA_RECIPIENTS;
                break;
            case 4:
                epvoVar = epvo.PROCESS_DOWNLOADED_MMS_ACTION_TELEPHONY_MANAGER_ADDRESSES;
                break;
            case 5:
                epvoVar = epvo.RECEIVE_MMS_MESSAGE_USE_SENDER_RAW;
                break;
            case 6:
                epvoVar = epvo.RECEIVE_MMS_MESSAGE_USE_SENDER_NORMALIZED;
                break;
            case 7:
                epvoVar = epvo.RECEIVE_MMS_MESSAGE_USE_THREAD_DATA_RECIPIENTS;
                break;
            case 8:
                epvoVar = epvo.RECEIVE_RCS_MESSAGE_ONE_ON_ONE;
                break;
            case 9:
                epvoVar = epvo.RECEIVE_RCS_MESSAGE_ONE_ON_ONE_LEGACY;
                break;
            case 10:
                epvoVar = epvo.RECEIVE_RCS_MESSAGE_ONE_ON_ONE_ALTOGETHER;
                break;
            case 11:
                epvoVar = epvo.PROCESS_DOWNLOADED_MMS_ACTION_MESSAGE_RECIPIENTS;
                break;
            case 12:
                epvoVar = epvo.GET_OR_CREATE_THREAD_ID_FOR_CONVERSATION;
                break;
            default:
                epvoVar = null;
                break;
        }
        return epvoVar != null;
    }
}
