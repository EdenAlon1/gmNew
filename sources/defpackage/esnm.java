package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import com.android.vcard.VCardConstants;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum esnm {
    REPORT_INITIALIZED_RESPONSE_PAYLOAD(100),
    REPORT_SETTLED_RESPONSE_PAYLOAD(EnergyProfile.EVCONNECTOR_TYPE_OTHER),
    REPORT_LOADING_ERROR_RESPONSE_PAYLOAD(102),
    REPORT_UNLOADED_RESPONSE_PAYLOAD(103),
    SHOW_NOTIFICATION_RESPONSE_PAYLOAD(104),
    SHOW_INCOMING_MESSAGE_NOTIFICATION_RESPONSE_PAYLOAD(105),
    DISMISS_NOTIFICATIONS_RESPONSE_PAYLOAD(106),
    SHOW_SWITCHER_RESPONSE_PAYLOAD(107),
    SEND_FEEDBACK_RESPONSE_PAYLOAD(108),
    SHOW_GAIA_ACCOUNT_PICKER_RESPONSE_PAYLOAD(109),
    GET_DUO_KIT_API_AVAILABILITY_RESPONSE_PAYLOAD(110),
    START_DUO_CALL_RESPONSE_PAYLOAD(111),
    PREPARE_TO_UNLOAD_RESPONSE_PAYLOAD(BasePaymentResult.ERROR_REQUEST_FAILED),
    SIGN_OUT_RESPONSE_PAYLOAD(BasePaymentResult.ERROR_REQUEST_TIMEOUT),
    UPDATE_REQUEST_TOKEN_RESPONSE_PAYLOAD(BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED),
    SWITCH_TO_CONVERSATION_RESPONSE_PAYLOAD(BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED),
    DISCONNECT_FROM_BACKEND_RESPONSE_PAYLOAD(204),
    RECONNECT_TO_BACKEND_RESPONSE_PAYLOAD(205),
    PROVIDE_FEEDBACK_LOGS_RESPONSE_PAYLOAD(206),
    DOWNLOAD_FILE_RESPONSE_PAYLOAD(207),
    NAVIGATE_BACK_RESPONSE_PAYLOAD(208),
    CHECK_HEALTH_RESPONSE_PAYLOAD(209),
    GAIA_ACCOUNT_CHANGED_RESPONSE_PAYLOAD(210),
    INCOMING_MESSAGE_NOTIFICATION_REPLY_RESPONSE_PAYLOAD(211),
    CREATE_DRAFT_MESSAGE_RESPONSE_PAYLOAD(212),
    SHOW_ERROR_MESSAGE_RESPONSE_PAYLOAD(213),
    PAYLOAD_NOT_SET(0);

    public final int B;

    esnm(int i) {
        this.B = i;
    }

    public static esnm a(int i) {
        if (i == 0) {
            return PAYLOAD_NOT_SET;
        }
        switch (i) {
            case VCardConstants.DEFAULT_PREF /* 100 */:
                return REPORT_INITIALIZED_RESPONSE_PAYLOAD;
            case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                return REPORT_SETTLED_RESPONSE_PAYLOAD;
            case 102:
                return REPORT_LOADING_ERROR_RESPONSE_PAYLOAD;
            case 103:
                return REPORT_UNLOADED_RESPONSE_PAYLOAD;
            case 104:
                return SHOW_NOTIFICATION_RESPONSE_PAYLOAD;
            case 105:
                return SHOW_INCOMING_MESSAGE_NOTIFICATION_RESPONSE_PAYLOAD;
            case 106:
                return DISMISS_NOTIFICATIONS_RESPONSE_PAYLOAD;
            case 107:
                return SHOW_SWITCHER_RESPONSE_PAYLOAD;
            case 108:
                return SEND_FEEDBACK_RESPONSE_PAYLOAD;
            case 109:
                return SHOW_GAIA_ACCOUNT_PICKER_RESPONSE_PAYLOAD;
            case 110:
                return GET_DUO_KIT_API_AVAILABILITY_RESPONSE_PAYLOAD;
            case 111:
                return START_DUO_CALL_RESPONSE_PAYLOAD;
            default:
                switch (i) {
                    case BasePaymentResult.ERROR_REQUEST_FAILED /* 200 */:
                        return PREPARE_TO_UNLOAD_RESPONSE_PAYLOAD;
                    case BasePaymentResult.ERROR_REQUEST_TIMEOUT /* 201 */:
                        return SIGN_OUT_RESPONSE_PAYLOAD;
                    case BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED /* 202 */:
                        return UPDATE_REQUEST_TOKEN_RESPONSE_PAYLOAD;
                    case BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED /* 203 */:
                        return SWITCH_TO_CONVERSATION_RESPONSE_PAYLOAD;
                    case 204:
                        return DISCONNECT_FROM_BACKEND_RESPONSE_PAYLOAD;
                    case 205:
                        return RECONNECT_TO_BACKEND_RESPONSE_PAYLOAD;
                    case 206:
                        return PROVIDE_FEEDBACK_LOGS_RESPONSE_PAYLOAD;
                    case 207:
                        return DOWNLOAD_FILE_RESPONSE_PAYLOAD;
                    case 208:
                        return NAVIGATE_BACK_RESPONSE_PAYLOAD;
                    case 209:
                        return CHECK_HEALTH_RESPONSE_PAYLOAD;
                    case 210:
                        return GAIA_ACCOUNT_CHANGED_RESPONSE_PAYLOAD;
                    case 211:
                        return INCOMING_MESSAGE_NOTIFICATION_REPLY_RESPONSE_PAYLOAD;
                    case 212:
                        return CREATE_DRAFT_MESSAGE_RESPONSE_PAYLOAD;
                    case 213:
                        return SHOW_ERROR_MESSAGE_RESPONSE_PAYLOAD;
                    default:
                        return null;
                }
        }
    }
}
