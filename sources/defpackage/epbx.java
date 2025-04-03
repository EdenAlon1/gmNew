package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class epbx implements eygg {
    static final eygg a = new epbx();

    private epbx() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        epby epbyVar;
        switch (i) {
            case 0:
                epbyVar = epby.UNKNOWN_TRIGGER_SOURCE;
                break;
            case 1:
                epbyVar = epby.CREATE_GROUP_CHAT_COMPLETE_CALLBACK;
                break;
            case 2:
                epbyVar = epby.GROUP_NOTIFICATION;
                break;
            case 3:
                epbyVar = epby.GROUP_NOTIFICATION_VANILLA_RCS;
                break;
            case 4:
                epbyVar = epby.INCOMING_IS_COMPOSING;
                break;
            case 5:
                epbyVar = epby.INCOMING_GROUP_INVITE_HANDLER;
                break;
            case 6:
                epbyVar = epby.INCOMING_FILE_TRANSFER;
                break;
            case 7:
                epbyVar = epby.INCOMING_FILE_TRANSFER_VANILLA_RCS;
                break;
            case 8:
                epbyVar = epby.INCOMING_MESSAGE;
                break;
            case 9:
                epbyVar = epby.RESET_SESSION_ID_EVENT;
                break;
            case 10:
                epbyVar = epby.GROUP_SESSION_STARTED_EVENT;
                break;
            case 11:
                epbyVar = epby.TACHYGRAM_TO_CHAT_API_INCOMING_MESSAGE_ADAPTER;
                break;
            case 12:
                epbyVar = epby.MESSAGE_SENDING_THREAD_ID_VERIFICATION;
                break;
            case 13:
                epbyVar = epby.TACHYGRAM_GET_ROUTING_TOKEN;
                break;
            case 14:
                epbyVar = epby.GET_OR_CREATE_CONVERSATION_ACTION;
                break;
            case 15:
                epbyVar = epby.DITTO_GET_GROUP_CONVERSATION_ID;
                break;
            default:
                epbyVar = null;
                break;
        }
        return epbyVar != null;
    }
}
