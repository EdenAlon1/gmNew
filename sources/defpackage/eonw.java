package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eonw implements eygg {
    static final eygg a = new eonw();

    private eonw() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        eonx eonxVar;
        switch (i) {
            case 0:
                eonxVar = eonx.UNKNOWN_MESSAGE_OPTIONS_ACTION;
                break;
            case 1:
                eonxVar = eonx.OPTIONS_MENU_OPENED;
                break;
            case 2:
                eonxVar = eonx.COPY;
                break;
            case 3:
                eonxVar = eonx.DELETE;
                break;
            case 4:
                eonxVar = eonx.SHARE;
                break;
            case 5:
                eonxVar = eonx.FORWARD;
                break;
            case 6:
                eonxVar = eonx.VIEW_DETAILS;
                break;
            case 7:
                eonxVar = eonx.DOWNLOAD;
                break;
            case 8:
                eonxVar = eonx.SAVE_ATTACHMENT;
                break;
            case 9:
                eonxVar = eonx.RETRY_SEND;
                break;
            default:
                eonxVar = null;
                break;
        }
        return eonxVar != null;
    }
}
