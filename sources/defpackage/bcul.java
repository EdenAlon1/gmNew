package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public enum bcul {
    SETTING_NOTIFICATION_ENABLED,
    SETTING_NOTIFICATION_SOUND_URI,
    SETTING_NOTIFICATION_VIBRATION,
    SETTING_NOTIFICATION,
    SETTING_APP_SETTINGS,
    SETTING_XMS_MODE,
    SETTING_SECURITY_KEY,
    SETTING_BLOCKED,
    SETTING_PRIVACY_POLICY,
    SETTING_TERMS_OF_SERVICE,
    SETTING_LEARN_MORE_BUSINESS_MESSAGING,
    SETTING_SPAM_REPORTING,
    SETTING_CHANGE_ACTIVE_SIM;

    public static engw a() {
        int i = engw.d;
        engr engrVar = new engr();
        engrVar.h(SETTING_NOTIFICATION);
        if (!adhu.a()) {
            engrVar.h(SETTING_APP_SETTINGS);
        }
        engrVar.i(SETTING_XMS_MODE, SETTING_BLOCKED, SETTING_SECURITY_KEY, SETTING_SPAM_REPORTING);
        return engrVar.g();
    }

    public static boolean b(bcul bculVar) {
        switch (bculVar) {
            case SETTING_NOTIFICATION_ENABLED:
            case SETTING_NOTIFICATION_SOUND_URI:
            case SETTING_NOTIFICATION_VIBRATION:
            case SETTING_NOTIFICATION:
            case SETTING_APP_SETTINGS:
                return true;
            case SETTING_XMS_MODE:
            default:
                csix.c("ConversationSettingsItemData.isRbmGeneralSetting invalid setting: ".concat(String.valueOf(String.valueOf(bculVar))));
            case SETTING_SECURITY_KEY:
            case SETTING_BLOCKED:
            case SETTING_PRIVACY_POLICY:
            case SETTING_TERMS_OF_SERVICE:
            case SETTING_LEARN_MORE_BUSINESS_MESSAGING:
            case SETTING_SPAM_REPORTING:
            case SETTING_CHANGE_ACTIVE_SIM:
                return false;
        }
    }
}
