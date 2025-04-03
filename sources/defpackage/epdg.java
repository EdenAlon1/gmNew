package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class epdg implements eygg {
    static final eygg a = new epdg();

    private epdg() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        epdh epdhVar;
        switch (i) {
            case 0:
                epdhVar = epdh.UNDEFINED;
                break;
            case 1:
                epdhVar = epdh.XMS_MESSAGE_ON_RCS_GROUP;
                break;
            case 2:
                epdhVar = epdh.RECIPIENT_LOST_RCS;
                break;
            case 3:
                epdhVar = epdh.ATTACHMENT_FAILED_TO_SEND;
                break;
            case 4:
                epdhVar = epdh.MESSAGE_TO_NON_ENCRYPTED_RECIPIENT;
                break;
            case 5:
                epdhVar = epdh.RECIPIENT_DID_NOT_DECRYPT;
                break;
            case 6:
                epdhVar = epdh.ATTACHMENT_PROCESS_FAILED;
                break;
            case 7:
                epdhVar = epdh.APP_RESTART;
                break;
            case 8:
                epdhVar = epdh.EMERGENCY_NUMBER;
                break;
            case 9:
                epdhVar = epdh.CANCELED;
                break;
            case 10:
                epdhVar = epdh.SENDING_TIMEOUT;
                break;
            case 11:
                epdhVar = epdh.DELIVERY_TIMEOUT;
                break;
            case 12:
                epdhVar = epdh.RECIPIENT_NEGATIVE_DELIVERY;
                break;
            default:
                epdhVar = null;
                break;
        }
        return epdhVar != null;
    }
}
