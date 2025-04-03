package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public enum ceaj implements eyge {
    UNSPECIFIED_STEP(0),
    TACHYON_UNREGISTER(1),
    SET_SERVER_STATUS_OFF(2),
    COMPLETE_OPT_OUT_MD(3),
    CLEAR_PRIMARY_DEVICE_ID(4),
    CLEAR_INITIAL_SYNC_STATUS(5),
    RESET_BOX(6),
    CANCEL_CMS_WORK_MANAGER_WORK(7),
    COMPLETE_OPT_OUT_BNR(8),
    COMPLETE_DOWNGRADE_MD_TO_BNR(9),
    CLEAR_FEATURE_TYPES(10),
    RETRIEVE_CMS_TIMESTAMP(11);

    public final int m;

    ceaj(int i) {
        this.m = i;
    }

    public static ceaj b(int i) {
        switch (i) {
            case 0:
                return UNSPECIFIED_STEP;
            case 1:
                return TACHYON_UNREGISTER;
            case 2:
                return SET_SERVER_STATUS_OFF;
            case 3:
                return COMPLETE_OPT_OUT_MD;
            case 4:
                return CLEAR_PRIMARY_DEVICE_ID;
            case 5:
                return CLEAR_INITIAL_SYNC_STATUS;
            case 6:
                return RESET_BOX;
            case 7:
                return CANCEL_CMS_WORK_MANAGER_WORK;
            case 8:
                return COMPLETE_OPT_OUT_BNR;
            case 9:
                return COMPLETE_DOWNGRADE_MD_TO_BNR;
            case 10:
                return CLEAR_FEATURE_TYPES;
            case 11:
                return RETRIEVE_CMS_TIMESTAMP;
            default:
                return null;
        }
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.m;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.m);
    }
}
