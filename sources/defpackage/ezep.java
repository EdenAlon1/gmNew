package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezep implements eygg {
    public static final eygg a = new ezep();

    private ezep() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        ezeq ezeqVar;
        switch (i) {
            case 0:
                ezeqVar = ezeq.CONSENT_REASON_UNKNOWN;
                break;
            case 1:
                ezeqVar = ezeq.SEAMLESS_AUTHORIZED_PROVISIONING_ALLOWED;
                break;
            case 2:
                ezeqVar = ezeq.IMEI_PII_FORMAT_NONE;
                break;
            case 3:
                ezeqVar = ezeq.IMEI_PII_FORMAT_SHORT;
                break;
            case 4:
                ezeqVar = ezeq.IMEI_PII_FORMAT_IGNORED;
                break;
            case 5:
                ezeqVar = ezeq.IMSI_PII_FORMAT_NONE;
                break;
            case 6:
                ezeqVar = ezeq.IMSI_PII_FORMAT_SHORT;
                break;
            case 7:
                ezeqVar = ezeq.IMSI_PII_FORMAT_IGNORED;
                break;
            case 8:
                ezeqVar = ezeq.CONSENT_ALREADY_GRANTED;
                break;
            case 9:
                ezeqVar = ezeq.HE_REQUEST_SUCCESSFUL;
                break;
            case 10:
                ezeqVar = ezeq.GOOGLE_TOS_DISABLED;
                break;
            case 11:
                ezeqVar = ezeq.RCS_DEFAULT_ON_ALREADY_SEEN;
                break;
            default:
                ezeqVar = null;
                break;
        }
        return ezeqVar != null;
    }
}
