package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
class babv extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        eonp eonpVar = (eonp) obj;
        switch (eonpVar) {
            case UNKNOWN_CLOUD_SYNC_STATUS:
                return fglt.UNKNOWN_CLOUD_SYNC_STATUS;
            case NOT_ENABLED:
                return fglt.NOT_ENABLED;
            case ENABLED:
                return fglt.ENABLED;
            case IN_INITIAL_SYNC:
                return fglt.IN_INITIAL_SYNC;
            case FI_ENABLED:
                return fglt.FI_ENABLED;
            case FI_INITIAL_SYNC_IN_PROGRESS:
                return fglt.FI_INITIAL_SYNC_IN_PROGRESS;
            case BNR_ENABLED:
                return fglt.BNR_ENABLED;
            case BNR_INITIAL_SYNC_IN_PROGRESS:
                return fglt.BNR_INITIAL_SYNC_IN_PROGRESS;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(eonpVar.toString()));
        }
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        fglt fgltVar = (fglt) obj;
        switch (fgltVar) {
            case UNKNOWN_CLOUD_SYNC_STATUS:
                return eonp.UNKNOWN_CLOUD_SYNC_STATUS;
            case NOT_ENABLED:
                return eonp.NOT_ENABLED;
            case ENABLED:
                return eonp.ENABLED;
            case IN_INITIAL_SYNC:
                return eonp.IN_INITIAL_SYNC;
            case FI_ENABLED:
                return eonp.FI_ENABLED;
            case FI_INITIAL_SYNC_IN_PROGRESS:
                return eonp.FI_INITIAL_SYNC_IN_PROGRESS;
            case BNR_ENABLED:
                return eonp.BNR_ENABLED;
            case BNR_INITIAL_SYNC_IN_PROGRESS:
                return eonp.BNR_INITIAL_SYNC_IN_PROGRESS;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(fgltVar.toString()));
        }
    }
}
