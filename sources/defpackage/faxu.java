package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class faxu implements eygg {
    static final eygg a = new faxu();

    private faxu() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        faxv faxvVar;
        switch (i) {
            case 0:
                faxvVar = faxv.NOT_SET;
                break;
            case 1:
                faxvVar = faxv.CPS_APP_PROCESS_GLOBAL_PROVIDER;
                break;
            case 2:
                faxvVar = faxv.NON_CPS_APP_PROCESS_GLOBAL_PROVIDER;
                break;
            case 3:
                faxvVar = faxv.LOGGER_OVERRIDE_PROVIDER;
                break;
            case 4:
                faxvVar = faxv.LOGGER_DEFERRING_PROVIDER;
                break;
            case 5:
                faxvVar = faxv.EVENT_OVERRIDE;
                break;
            case 6:
                faxvVar = faxv.EVENT_DEFERRING;
                break;
            case 7:
                faxvVar = faxv.LOG_SOURCE_MAPPED;
                break;
            case 8:
                faxvVar = faxv.SERVER_INFRASTRUCTURE;
                break;
            case 9:
                faxvVar = faxv.LOG_REQUEST_SETTER_WEB;
                break;
            case 10:
                faxvVar = faxv.PRIVACY_CONTEXT_RESOLVER;
                break;
            default:
                faxvVar = null;
                break;
        }
        return faxvVar != null;
    }
}
