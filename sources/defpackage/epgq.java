package defpackage;

import androidx.car.app.navigation.model.Maneuver;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class epgq implements eygg {
    static final eygg a = new epgq();

    private epgq() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        epgr epgrVar;
        switch (i) {
            case 0:
                epgrVar = epgr.RCS_PROVISIONING_UNKNOWN_INTERACTION;
                break;
            case 1:
                epgrVar = epgr.RCS_PROVISIONING_PROMPT_SEEN;
                break;
            case 2:
                epgrVar = epgr.RCS_PROVISIONING_PROMPT_ACCEPTED;
                break;
            case 3:
                epgrVar = epgr.RCS_PROVISIONING_PROMPT_DECLINED;
                break;
            case 4:
                epgrVar = epgr.RCS_PROVISIONING_PROMPT_TERMS_AND_CONDITION_CLICKED;
                break;
            case 5:
                epgrVar = epgr.RCS_PROVISIONING_PROMPT_PRIVACY_AND_POLICY_CLICKED;
                break;
            case 6:
                epgrVar = epgr.RCS_PROVISIONING_RCS_PROMO_SEEN;
                break;
            case 7:
                epgrVar = epgr.RCS_PROVISIONING_RCS_PROMO_TERM_AND_CONDITION_CLICKED;
                break;
            case 8:
                epgrVar = epgr.RCS_PROVISIONING_RCS_PROMO_ACCEPTED;
                break;
            case 9:
                epgrVar = epgr.RCS_PROVISIONING_RCS_PROMO_DECLINED;
                break;
            case 10:
                epgrVar = epgr.RCS_PROVISIONING_RCS_PROMO_LEARNING_MORE_CLICKED;
                break;
            case 11:
                epgrVar = epgr.RCS_PROVISIONING_BOEW_SEEN;
                break;
            case 12:
                epgrVar = epgr.RCS_PROVISIONING_BOEW_ACCEPTED;
                break;
            case 13:
                epgrVar = epgr.RCS_PROVISIONING_BOEW_REJECTED;
                break;
            case 14:
                epgrVar = epgr.RCS_PROVISIONING_SUCCESS_POPUP_SEEN;
                break;
            case 15:
                epgrVar = epgr.RCS_PROVISIONING_SUCCESS_POPUP_DISMISSED;
                break;
            case 16:
                epgrVar = epgr.RCS_PROVISIONING_SUCCESS_POPUP_IGNORED;
                break;
            case 17:
                epgrVar = epgr.RCS_PROVISIONING_DOUBLE_CHECK_DIALOG_ACCEPTED;
                break;
            case 18:
                epgrVar = epgr.RCS_PROVISIONING_DOUBLE_CHECK_DIALOG_REJECTED;
                break;
            case 19:
                epgrVar = epgr.RCS_PROVISIONING_MANUAL_MSISDN_ENTRY_SEEN;
                break;
            case 20:
                epgrVar = epgr.RCS_PROVISIONING_MANUAL_MSISDN_ENTRY_ACCEPTED;
                break;
            case 21:
                epgrVar = epgr.RCS_PROVISIONING_MANUAL_MSISDN_ENTRY_REJECTED;
                break;
            case 22:
                epgrVar = epgr.RCS_PROVISIONING_MANUAL_MSISDN_COUNTRY_CHANGED;
                break;
            case 23:
                epgrVar = epgr.RCS_PROVISIONING_PROMPT_LEARN_MORE_CLICKED;
                break;
            case 24:
                epgrVar = epgr.RCS_PROVISIONING_BACK_BUTTON_CLICKED;
                break;
            case 25:
                epgrVar = epgr.RCS_PROVISIONING_HOME_BUTTON_CLICKED;
                break;
            case 26:
                epgrVar = epgr.RCS_PROVISIONING_PROMPT_TERMS_SUMMARY_CLICKED;
                break;
            case 27:
                epgrVar = epgr.RCS_PROVISIONING_PROMPT_SUPPRESSED;
                break;
            case 28:
                epgrVar = epgr.RCS_PROVISIONING_PROMPT_ELIGIBLE_FOR_SUPPRESSION;
                break;
            case 29:
                epgrVar = epgr.RCS_PROVISIONING_SETTINGS_CHAT_FEATURES_SCREEN_SEEN;
                break;
            case 30:
                epgrVar = epgr.RCS_PROVISIONING_PROMPT_COUNTERFACTUAL_APPLIED;
                break;
            case 31:
                epgrVar = epgr.RCS_PROVISIONING_PHONE_NUMBER_PROMO_PRESENTED;
                break;
            case 32:
                epgrVar = epgr.RCS_PROVISIONING_PHONE_NUMBER_PROMO_ACCEPTED;
                break;
            case 33:
                epgrVar = epgr.RCS_PROVISIONING_PHONE_NUMBER_PROMO_DISMISSED;
                break;
            case 34:
                epgrVar = epgr.RCS_PROVISIONING_GOOGLE_TOS_BANNER_PRESENTED;
                break;
            case 35:
                epgrVar = epgr.RCS_PROVISIONING_GOOGLE_TOS_BANNER_ACCEPTED;
                break;
            case 36:
                epgrVar = epgr.RCS_PROVISIONING_GOOGLE_TOS_BANNER_DISMISSED;
                break;
            case 37:
                epgrVar = epgr.RCS_PROVISIONING_LEGAL_FYI_BOTTOMSHEET_SEEN;
                break;
            case 38:
                epgrVar = epgr.RCS_PROVISIONING_LEGAL_FYI_BANNER_IN_SETTINGS_SEEN;
                break;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                epgrVar = epgr.RCS_PROVISIONING_LEGAL_FYI_BOTTOMSHEET_LEARN_MORE_CLICKED;
                break;
            case 40:
                epgrVar = epgr.RCS_PROVISIONING_LEGAL_FYI_BANNER_IN_SETTINGS_LEARN_MORE_CLICKED;
                break;
            case 41:
                epgrVar = epgr.RCS_PROVISIONING_LEGAL_FYI_BOTTOMSHEET_SETTINGS_CLICKED;
                break;
            case 42:
                epgrVar = epgr.RCS_PROVISIONING_LEGAL_FYI_BOTTOMSHEET_DISMISSED;
                break;
            case 43:
                epgrVar = epgr.RCS_PROVISIONING_WELCOME_MESSAGE_SEEN;
                break;
            case 44:
                epgrVar = epgr.RCS_PROVISIONING_WELCOME_MESSAGE_ACCEPTED;
                break;
            case 45:
                epgrVar = epgr.RCS_PROVISIONING_WELCOME_MESSAGE_SETTINGS_CLICKED;
                break;
            default:
                epgrVar = null;
                break;
        }
        return epgrVar != null;
    }
}
