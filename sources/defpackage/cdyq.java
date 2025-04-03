package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
class cdyq implements emwl {
    @Override // defpackage.emwl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        ceaj ceajVar = (ceaj) obj;
        switch (ceajVar) {
            case UNSPECIFIED_STEP:
                return epfi.OPT_OUT_UNSPECIFIED_STEP_WORK;
            case TACHYON_UNREGISTER:
                return epfi.OPT_OUT_TACHYON_UNREGISTER_WORK;
            case SET_SERVER_STATUS_OFF:
                return epfi.OPT_OUT_SET_SERVER_STATUS_OFF_WORK;
            case COMPLETE_OPT_OUT_MD:
                return epfi.OPT_OUT_COMPLETE_OPT_OUT_MD_WORK;
            case CLEAR_PRIMARY_DEVICE_ID:
                return epfi.OPT_OUT_CLEAR_PRIMARY_DEVICE_ID_WORK;
            case CLEAR_INITIAL_SYNC_STATUS:
                return epfi.OPT_OUT_CLEAR_INITIAL_SYNC_STATUS_WORK;
            case RESET_BOX:
                return epfi.OPT_OUT_RESET_BOX_WORK;
            case CANCEL_CMS_WORK_MANAGER_WORK:
                return epfi.OPT_OUT_CANCEL_CMS_WORK_MANAGER_WORK;
            case COMPLETE_OPT_OUT_BNR:
                return epfi.OPT_OUT_COMPLETE_OPT_OUT_BNR_WORK;
            case COMPLETE_DOWNGRADE_MD_TO_BNR:
                return epfi.OPT_OUT_COMPLETE_DOWNGRADE_MD_TO_BNR;
            case CLEAR_FEATURE_TYPES:
                return epfi.OPT_OUT_CLEAR_FEATURE_TYPES_WORK;
            case RETRIEVE_CMS_TIMESTAMP:
                return epfi.OPT_OUT_RETRIEVE_CMS_TIMESTAMP_WORK;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(ceajVar))));
        }
    }
}
