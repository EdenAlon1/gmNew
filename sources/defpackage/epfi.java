package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum epfi implements eyge {
    UNKNOWN_WORK(0),
    BLOCK_ON_TELEPHONY_SYNC_WORK(1),
    RESTORE_PARTICIPANTS_WORK(2),
    RESTORE_MESSAGES_WORK(3),
    BACKUP_WORK(4),
    OPT_IN_WORK(5),
    RESTORE_BACKUP_KEY_WORK(6),
    RESTORE_CONVERSATIONS_WORK(7),
    RESTORE_ENCRYPTION_KEY_WORK(8),
    OPT_IN_UNSPECIFIED_STEP_WORK(9),
    OPT_IN_TACHYON_REGISTRATION_WORK(10),
    OPT_IN_SET_STATUS_ON_SERVER_WORK(11),
    OPT_IN_COMPLETE_OPT_IN_MD_WORK(12),
    OPT_IN_COMPLETE_OPT_IN_BNR_WORK(13),
    OPT_OUT_UNSPECIFIED_STEP_WORK(14),
    OPT_OUT_SET_SERVER_STATUS_OFF_WORK(15),
    OPT_OUT_TACHYON_UNREGISTER_WORK(16),
    OPT_OUT_COMPLETE_OPT_OUT_MD_WORK(17),
    OPT_OUT_COMPLETE_OPT_OUT_BNR_WORK(18),
    OPT_OUT_CLEAR_PRIMARY_DEVICE_ID_WORK(19),
    OPT_OUT_CLEAR_INITIAL_SYNC_STATUS_WORK(20),
    OPT_OUT_RESET_BOX_WORK(21),
    OPT_OUT_CANCEL_CMS_WORK_MANAGER_WORK(22),
    OPT_OUT_COMPLETE_DOWNGRADE_MD_TO_BNR(23),
    OPT_OUT_CLEAR_FEATURE_TYPES_WORK(24),
    OPT_OUT_RETRIEVE_CMS_TIMESTAMP_WORK(25);

    public final int A;

    epfi(int i) {
        this.A = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.A;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.A);
    }
}
