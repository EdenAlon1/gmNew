package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class epfh implements eygg {
    static final eygg a = new epfh();

    private epfh() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        epfi epfiVar;
        switch (i) {
            case 0:
                epfiVar = epfi.UNKNOWN_WORK;
                break;
            case 1:
                epfiVar = epfi.BLOCK_ON_TELEPHONY_SYNC_WORK;
                break;
            case 2:
                epfiVar = epfi.RESTORE_PARTICIPANTS_WORK;
                break;
            case 3:
                epfiVar = epfi.RESTORE_MESSAGES_WORK;
                break;
            case 4:
                epfiVar = epfi.BACKUP_WORK;
                break;
            case 5:
                epfiVar = epfi.OPT_IN_WORK;
                break;
            case 6:
                epfiVar = epfi.RESTORE_BACKUP_KEY_WORK;
                break;
            case 7:
                epfiVar = epfi.RESTORE_CONVERSATIONS_WORK;
                break;
            case 8:
                epfiVar = epfi.RESTORE_ENCRYPTION_KEY_WORK;
                break;
            case 9:
                epfiVar = epfi.OPT_IN_UNSPECIFIED_STEP_WORK;
                break;
            case 10:
                epfiVar = epfi.OPT_IN_TACHYON_REGISTRATION_WORK;
                break;
            case 11:
                epfiVar = epfi.OPT_IN_SET_STATUS_ON_SERVER_WORK;
                break;
            case 12:
                epfiVar = epfi.OPT_IN_COMPLETE_OPT_IN_MD_WORK;
                break;
            case 13:
                epfiVar = epfi.OPT_IN_COMPLETE_OPT_IN_BNR_WORK;
                break;
            case 14:
                epfiVar = epfi.OPT_OUT_UNSPECIFIED_STEP_WORK;
                break;
            case 15:
                epfiVar = epfi.OPT_OUT_SET_SERVER_STATUS_OFF_WORK;
                break;
            case 16:
                epfiVar = epfi.OPT_OUT_TACHYON_UNREGISTER_WORK;
                break;
            case 17:
                epfiVar = epfi.OPT_OUT_COMPLETE_OPT_OUT_MD_WORK;
                break;
            case 18:
                epfiVar = epfi.OPT_OUT_COMPLETE_OPT_OUT_BNR_WORK;
                break;
            case 19:
                epfiVar = epfi.OPT_OUT_CLEAR_PRIMARY_DEVICE_ID_WORK;
                break;
            case 20:
                epfiVar = epfi.OPT_OUT_CLEAR_INITIAL_SYNC_STATUS_WORK;
                break;
            case 21:
                epfiVar = epfi.OPT_OUT_RESET_BOX_WORK;
                break;
            case 22:
                epfiVar = epfi.OPT_OUT_CANCEL_CMS_WORK_MANAGER_WORK;
                break;
            case 23:
                epfiVar = epfi.OPT_OUT_COMPLETE_DOWNGRADE_MD_TO_BNR;
                break;
            case 24:
                epfiVar = epfi.OPT_OUT_CLEAR_FEATURE_TYPES_WORK;
                break;
            case 25:
                epfiVar = epfi.OPT_OUT_RETRIEVE_CMS_TIMESTAMP_WORK;
                break;
            default:
                epfiVar = null;
                break;
        }
        return epfiVar != null;
    }
}
