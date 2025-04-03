package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public interface cebg {
    public static final Map a;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k(ceaj.CANCEL_CMS_WORK_MANAGER_WORK, csfz.BACKUP_AND_RESTORE);
        enhdVar.k(ceaj.CLEAR_INITIAL_SYNC_STATUS, csfz.BACKUP_AND_RESTORE);
        enhdVar.k(ceaj.CLEAR_PRIMARY_DEVICE_ID, csfz.BACKUP_AND_RESTORE);
        enhdVar.k(ceaj.SET_SERVER_STATUS_OFF, csfz.MULTI_DEVICE);
        enhdVar.k(ceaj.TACHYON_UNREGISTER, csfz.BACKUP_AND_RESTORE);
        enhdVar.k(ceaj.RESET_BOX, csfz.BACKUP_AND_RESTORE);
        enhdVar.k(ceaj.CLEAR_FEATURE_TYPES, csfz.BACKUP_AND_RESTORE);
        enhdVar.k(ceaj.RETRIEVE_CMS_TIMESTAMP, csfz.BACKUP_AND_RESTORE);
        enhdVar.k(ceaj.COMPLETE_OPT_OUT_MD, csfz.MULTI_DEVICE);
        enhdVar.k(ceaj.UNSPECIFIED_STEP, csfz.UNDEFINED);
        enhdVar.k(ceaj.COMPLETE_OPT_OUT_BNR, csfz.BACKUP_AND_RESTORE);
        enhdVar.k(ceaj.COMPLETE_DOWNGRADE_MD_TO_BNR, csfz.MULTI_DEVICE);
        a = enhdVar.c();
    }
}
