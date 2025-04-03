package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import com.android.vcard.VCardConstants;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esnj {
    public static /* synthetic */ String a(int i) {
        if (i == 1) {
            return "PAYLOAD_NOT_SET";
        }
        switch (i) {
            case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                return "REPORT_INITIALIZED_REQUEST_PAYLOAD";
            case 102:
                return "REPORT_SETTLED_REQUEST_PAYLOAD";
            case 103:
                return "REPORT_LOADING_ERROR_REQUEST_PAYLOAD";
            case 104:
                return "REPORT_UNLOADED_REQUEST_PAYLOAD";
            case 105:
                return "SHOW_NOTIFICATION_REQUEST_PAYLOAD";
            case 106:
                return "SHOW_INCOMING_MESSAGE_NOTIFICATION_REQUEST_PAYLOAD";
            case 107:
                return "DISMISS_NOTIFICATIONS_REQUEST_PAYLOAD";
            case 108:
                return "SHOW_SWITCHER_REQUEST_PAYLOAD";
            case 109:
                return "SEND_FEEDBACK_REQUEST_PAYLOAD";
            case 110:
                return "SHOW_GAIA_ACCOUNT_PICKER_REQUEST_PAYLOAD";
            case 111:
                return "GET_DUO_KIT_API_AVAILABILITY_REQUEST_PAYLOAD";
            case 112:
                return "START_DUO_CALL_REQUEST_PAYLOAD";
            default:
                switch (i) {
                    case BasePaymentResult.ERROR_REQUEST_TIMEOUT /* 201 */:
                        return "PREPARE_TO_UNLOAD_REQUEST_PAYLOAD";
                    case BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED /* 202 */:
                        return "SIGN_OUT_REQUEST_PAYLOAD";
                    case BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED /* 203 */:
                        return "UPDATE_FCM_TOKEN_REQUEST_PAYLOAD";
                    case 204:
                        return "SWITCH_TO_CONVERSATION_REQUEST_PAYLOAD";
                    case 205:
                        return "DISCONNECT_FROM_BACKEND_REQUEST_PAYLOAD";
                    case 206:
                        return "RECONNECT_TO_BACKEND_REQUEST_PAYLOAD";
                    case 207:
                        return "PROVIDE_FEEDBACK_LOGS_REQUEST_PAYLOAD";
                    case 208:
                        return "DOWNLOAD_FILE_REQUEST_PAYLOAD";
                    case 209:
                        return "NAVIGATE_BACK_REQUEST_PAYLOAD";
                    case 210:
                        return "CHECK_HEALTH_REQUEST_PAYLOAD";
                    case 211:
                        return "GAIA_ACCOUNT_CHANGED_REQUEST_PAYLOAD";
                    case 212:
                        return "INCOMING_MESSAGE_NOTIFICATION_REPLY_REQUEST_PAYLOAD";
                    case 213:
                        return "CREATE_DRAFT_MESSAGE_REQUEST_PAYLOAD";
                    case 214:
                        return "SHOW_ERROR_MESSAGE_REQUEST_PAYLOAD";
                    default:
                        return "null";
                }
        }
    }

    public static int b(int i) {
        return i - 1;
    }

    public static int c(int i) {
        if (i == 0) {
            return 1;
        }
        switch (i) {
            case VCardConstants.DEFAULT_PREF /* 100 */:
                return EnergyProfile.EVCONNECTOR_TYPE_OTHER;
            case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                return 102;
            case 102:
                return 103;
            case 103:
                return 104;
            case 104:
                return 105;
            case 105:
                return 106;
            case 106:
                return 107;
            case 107:
                return 108;
            case 108:
                return 109;
            case 109:
                return 110;
            case 110:
                return 111;
            case 111:
                return 112;
            default:
                switch (i) {
                    case BasePaymentResult.ERROR_REQUEST_FAILED /* 200 */:
                        return BasePaymentResult.ERROR_REQUEST_TIMEOUT;
                    case BasePaymentResult.ERROR_REQUEST_TIMEOUT /* 201 */:
                        return BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED;
                    case BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED /* 202 */:
                        return BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED;
                    case BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED /* 203 */:
                        return 204;
                    case 204:
                        return 205;
                    case 205:
                        return 206;
                    case 206:
                        return 207;
                    case 207:
                        return 208;
                    case 208:
                        return 209;
                    case 209:
                        return 210;
                    case 210:
                        return 211;
                    case 211:
                        return 212;
                    case 212:
                        return 213;
                    case 213:
                        return 214;
                    default:
                        return 0;
                }
        }
    }
}
