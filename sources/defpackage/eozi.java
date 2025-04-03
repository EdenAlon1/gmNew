package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eozi implements eygg {
    static final eygg a = new eozi();

    private eozi() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        eozj eozjVar;
        switch (i) {
            case 0:
                eozjVar = eozj.UNKNOWN;
                break;
            case 1:
                eozjVar = eozj.SENDERS_IDENTITY_INCORRECT;
                break;
            case 2:
                eozjVar = eozj.IDENTITY_VERIFICATION_RETRY_LIMIT_REACHED;
                break;
            case 3:
                eozjVar = eozj.SENDERS_USER_ID_INCORRECT;
                break;
            case 4:
                eozjVar = eozj.TACHYON_DOWNLOAD_FAILED;
                break;
            case 5:
                eozjVar = eozj.OTHER_EXCEPTION;
                break;
            case 6:
                eozjVar = eozj.SUCCESS;
                break;
            case 7:
                eozjVar = eozj.SENDERS_USER_ID_EMPTY;
                break;
            default:
                eozjVar = null;
                break;
        }
        return eozjVar != null;
    }
}
