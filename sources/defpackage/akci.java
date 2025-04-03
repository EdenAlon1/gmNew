package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum akci implements eyge {
    UNKNOWN(0),
    CREATED(1),
    DATABASE_RESTORING(2),
    ATTACHMENTS_RESTORING(3),
    WAITING_ON_APP_UPDATE(4),
    WAITING_ON_APP_UPDATE_INITIAL_PROMPT_SHOWN(5),
    WAITING_FOR_APP_UPDATE_READY_FOR_REPROMPT(6),
    DATABASE_RESTORE_COMPLETE(7),
    STALLED(8),
    COMPLETE_SUCCESS(100),
    COMPLETE_FAILED(EnergyProfile.EVCONNECTOR_TYPE_OTHER),
    INCOMPLETE(102),
    CLEARED(103),
    COMPLETE_FAILED_APP_UPDATE(104),
    AUTOMATICALLY_CLOSED_EXPIRED(105),
    COMPLETE_APP_UPDATE_REPROMPT_DECLINED(106);

    public final int q;

    akci(int i) {
        this.q = i;
    }

    public static akci b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return CREATED;
            case 2:
                return DATABASE_RESTORING;
            case 3:
                return ATTACHMENTS_RESTORING;
            case 4:
                return WAITING_ON_APP_UPDATE;
            case 5:
                return WAITING_ON_APP_UPDATE_INITIAL_PROMPT_SHOWN;
            case 6:
                return WAITING_FOR_APP_UPDATE_READY_FOR_REPROMPT;
            case 7:
                return DATABASE_RESTORE_COMPLETE;
            case 8:
                return STALLED;
            default:
                switch (i) {
                    case VCardConstants.DEFAULT_PREF /* 100 */:
                        return COMPLETE_SUCCESS;
                    case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                        return COMPLETE_FAILED;
                    case 102:
                        return INCOMPLETE;
                    case 103:
                        return CLEARED;
                    case 104:
                        return COMPLETE_FAILED_APP_UPDATE;
                    case 105:
                        return AUTOMATICALLY_CLOSED_EXPIRED;
                    case 106:
                        return COMPLETE_APP_UPDATE_REPROMPT_DECLINED;
                    default:
                        return null;
                }
        }
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.q;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.q);
    }
}
