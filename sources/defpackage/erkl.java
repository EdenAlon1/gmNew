package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class erkl implements eygg {
    static final eygg a = new erkl();

    private erkl() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        erkm erkmVar;
        switch (i) {
            case 0:
                erkmVar = erkm.UNKNOWN;
                break;
            case 1:
                erkmVar = erkm.GROUP_NOT_FOUND;
                break;
            case 2:
                erkmVar = erkm.NEW_BUILD_ID;
                break;
            case 3:
                erkmVar = erkm.NEW_VARIANT_ID;
                break;
            case 4:
                erkmVar = erkm.NEW_VERSION_NUMBER;
                break;
            case 5:
                erkmVar = erkm.DIFFERENT_FILES;
                break;
            case 6:
                erkmVar = erkm.DIFFERENT_STALE_LIFETIME;
                break;
            case 7:
                erkmVar = erkm.DIFFERENT_EXPIRATION_DATE;
                break;
            case 8:
                erkmVar = erkm.DIFFERENT_DOWNLOAD_CONDITIONS;
                break;
            case 9:
                erkmVar = erkm.DIFFERENT_ALLOWED_READERS;
                break;
            case 10:
                erkmVar = erkm.DIFFERENT_DOWNLOAD_POLICY;
                break;
            case 11:
                erkmVar = erkm.DIFFERENT_EXPERIMENT_INFO;
                break;
            case 12:
                erkmVar = erkm.DIFFERENT_CUSTOM_METADATA;
                break;
            default:
                erkmVar = null;
                break;
        }
        return erkmVar != null;
    }
}
