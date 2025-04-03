package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eqyz implements eygg {
    static final eygg a = new eqyz();

    private eqyz() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        eqza eqzaVar;
        switch (i) {
            case 0:
                eqzaVar = eqza.UNDEFINED_EVENT;
                break;
            case 1:
                eqzaVar = eqza.REQUEST_BUGLE_DATABASE_RESTORE;
                break;
            case 2:
                eqzaVar = eqza.REQUEST_ATTACHMENTS_RESTORE;
                break;
            case 3:
                eqzaVar = eqza.COMPLETE_RESTORE;
                break;
            case 4:
                eqzaVar = eqza.DO_COMPLETE_RESTORE;
                break;
            case 5:
                eqzaVar = eqza.DO_BUGLE_DATABASE_RESTORE;
                break;
            case 6:
                eqzaVar = eqza.DO_ATTACHMENTS_RESTORE;
                break;
            case 7:
                eqzaVar = eqza.REQUEST_RESTORE_AFTER_APP_UPDATE;
                break;
            case 8:
                eqzaVar = eqza.INITIALIZE_RESTORE_WORKFLOW;
                break;
            case 9:
                eqzaVar = eqza.CLEAN_UP;
                break;
            case 10:
                eqzaVar = eqza.COMPLETE_FROM_STALLED_RESTORE;
                break;
            case 11:
                eqzaVar = eqza.FIX_UP_PARTS_TABLE_CONVERSATION_IDS;
                break;
            case 12:
                eqzaVar = eqza.WAITING_FOR_APP_UPDATE_INITIAL_PROMPT_SHOWN;
                break;
            case 13:
                eqzaVar = eqza.WAITING_FOR_APP_UPDATE_READY_FOR_REPROMPT;
                break;
            default:
                eqzaVar = null;
                break;
        }
        return eqzaVar != null;
    }
}
