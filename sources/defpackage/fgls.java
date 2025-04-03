package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgls implements eygg {
    static final eygg a = new fgls();

    private fgls() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        fglt fgltVar;
        switch (i) {
            case 0:
                fgltVar = fglt.UNKNOWN_CLOUD_SYNC_STATUS;
                break;
            case 1:
                fgltVar = fglt.NOT_ENABLED;
                break;
            case 2:
                fgltVar = fglt.ENABLED;
                break;
            case 3:
                fgltVar = fglt.IN_INITIAL_SYNC;
                break;
            case 4:
                fgltVar = fglt.FI_ENABLED;
                break;
            case 5:
                fgltVar = fglt.FI_INITIAL_SYNC_IN_PROGRESS;
                break;
            case 6:
                fgltVar = fglt.BNR_ENABLED;
                break;
            case 7:
                fgltVar = fglt.BNR_INITIAL_SYNC_IN_PROGRESS;
                break;
            default:
                fgltVar = null;
                break;
        }
        return fgltVar != null;
    }
}
