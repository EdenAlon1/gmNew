package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eorv implements eygg {
    static final eygg a = new eorv();

    private eorv() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        eorw eorwVar;
        switch (i) {
            case 0:
                eorwVar = eorw.UNKNOWN_BIZINFO_EVENT_SOURCE;
                break;
            case 1:
                eorwVar = eorw.BIZINFO_SOURCE_CONVERSATION_LIST_AVATAR;
                break;
            case 2:
                eorwVar = eorw.BIZINFO_SOURCE_CONVERSATION_AVATAR;
                break;
            case 3:
                eorwVar = eorw.BIZINFO_SOURCE_CONVERSATION_START;
                break;
            case 4:
                eorwVar = eorw.BIZINFO_SOURCE_CONVERSATION_OVERFLOW_MENU;
                break;
            case 5:
                eorwVar = eorw.BIZINFO_SOURCE_CONVERSATION_ACTION_BAR;
                break;
            case 6:
                eorwVar = eorw.BIZINFO_SOURCE_CONVERSATION_TITLE;
                break;
            case 7:
                eorwVar = eorw.BIZINFO_SOURCE_SIM_SWITCHED_TOMBSTONE;
                break;
            default:
                eorwVar = null;
                break;
        }
        return eorwVar != null;
    }
}
