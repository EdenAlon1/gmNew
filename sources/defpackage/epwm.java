package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class epwm implements eygg {
    static final eygg a = new epwm();

    private epwm() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        epwn epwnVar;
        switch (i) {
            case 0:
                epwnVar = epwn.UNKNOWN;
                break;
            case 1:
                epwnVar = epwn.TOO_MANY_PARTICIPANTS_IN_ONE_ON_ONE_CONVERSATION;
                break;
            case 2:
                epwnVar = epwn.RCS_GROUP_ID_UPDATED;
                break;
            case 3:
                epwnVar = epwn.NEW_CONVERSATION_WITH_EXISTING_RCS_GROUP_ID;
                break;
            case 4:
                epwnVar = epwn.NEW_CONVERSATION_CREATED;
                break;
            case 5:
                epwnVar = epwn.CONVERSATION_FORKING;
                break;
            case 6:
                epwnVar = epwn.MIXED_UP_PARTICIPANT;
                break;
            default:
                epwnVar = null;
                break;
        }
        return epwnVar != null;
    }
}
