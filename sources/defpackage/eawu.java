package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum eawu {
    APP_CUSTOM,
    YELLOW_ALERT,
    RED_ALERT,
    UPLOAD_ARROW,
    PAUSED_UPLOAD_ARROW,
    COMPLETED_CHECKMARK,
    SYNCING_OFF,
    OBAKE;

    final Integer a() {
        switch (this) {
            case APP_CUSTOM:
            case OBAKE:
                return 0;
            case YELLOW_ALERT:
                return 3;
            case RED_ALERT:
                return 4;
            case UPLOAD_ARROW:
            case COMPLETED_CHECKMARK:
                return 1;
            case PAUSED_UPLOAD_ARROW:
            case SYNCING_OFF:
                return 2;
            default:
                return 0;
        }
    }
}
