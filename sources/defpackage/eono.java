package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eono implements eygg {
    static final eygg a = new eono();

    private eono() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        eonp eonpVar;
        switch (i) {
            case 0:
                eonpVar = eonp.UNKNOWN_CLOUD_SYNC_STATUS;
                break;
            case 1:
                eonpVar = eonp.NOT_ENABLED;
                break;
            case 2:
                eonpVar = eonp.ENABLED;
                break;
            case 3:
                eonpVar = eonp.IN_INITIAL_SYNC;
                break;
            case 4:
                eonpVar = eonp.FI_ENABLED;
                break;
            case 5:
                eonpVar = eonp.FI_INITIAL_SYNC_IN_PROGRESS;
                break;
            case 6:
                eonpVar = eonp.BNR_ENABLED;
                break;
            case 7:
                eonpVar = eonp.BNR_INITIAL_SYNC_IN_PROGRESS;
                break;
            default:
                eonpVar = null;
                break;
        }
        return eonpVar != null;
    }
}
