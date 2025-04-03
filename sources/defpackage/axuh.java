package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import com.android.vcard.VCardConstants;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axuh {
    public static final engw a = engw.B(206, 207, 213, 214, 215, 216, 219, 238, 237, 235, 236);
    public static final enip b = enip.r(3, 16);
    public static final enip c = enip.r(117, 23);
    public static final enip d = enip.u(1, 2, 11, 15, 14);
    public static final enip e = enip.t(5, 6, 105, 103);
    private static final engw h = engw.s("address", "charset");
    public static final engw f = engw.t("address", "charset", BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
    public static final engw g = engw.r("address");

    public static String a(int i) {
        if (i == 240) {
            return "MESSAGE_STATUS_TOMBSTONE_RBM_SIM_SWITCH";
        }
        if (i == 252) {
            return "MESSAGE_STATUS_TOMBSTONE_GROUP_PROTOCOL_SWITCH_E2EE_TO_MMS";
        }
        if (i == 253) {
            return "MESSAGE_STATUS_TOMBSTONE_PENPAL_PROACTIVE_MESSAGE_NOTICE";
        }
        if (i == 266) {
            return "MESSAGE_STATUS_TOMBSTONE_CHATBOT_UNSUBSCRIBE_CONFIRMED_NO_LINK";
        }
        if (i == 267) {
            return "MESSAGE_STATUS_TOMBSTONE_CHATBOT_SUBSCRIBE_CONFIRMED_NO_LINK";
        }
        switch (i) {
            case 1:
                return "MESSAGE_STATUS_OUTGOING_COMPLETE";
            case 2:
                return "MESSAGE_STATUS_OUTGOING_DELIVERED";
            case 3:
                return "MESSAGE_STATUS_OUTGOING_DRAFT";
            case 4:
                return "MESSAGE_STATUS_OUTGOING_YET_TO_SEND";
            case 5:
                return "MESSAGE_STATUS_OUTGOING_SENDING";
            case 6:
                return "MESSAGE_STATUS_OUTGOING_RESENDING";
            case 7:
                return "MESSAGE_STATUS_OUTGOING_AWAITING_RETRY";
            case 8:
                return "MESSAGE_STATUS_OUTGOING_FAILED";
            case 9:
                return "MESSAGE_STATUS_OUTGOING_FAILED_EMERGENCY_NUMBER";
            case 10:
                return "MESSAGE_STATUS_OUTGOING_SEND_AFTER_PROCESSING";
            case 11:
                return "MESSAGE_STATUS_OUTGOING_DISPLAYED";
            case 12:
                return "MESSAGE_STATUS_OUTGOING_CANCELED";
            case 13:
                return "MESSAGE_STATUS_OUTGOING_FAILED_TOO_LARGE";
            case 14:
                return "MESSAGE_STATUS_OUTGOING_NOT_DELIVERED_YET";
            case 15:
                return "MESSAGE_STATUS_OUTGOING_REVOCATION_PENDING";
            case 16:
                return "MESSAGE_STATUS_OUTGOING_SCHEDULED";
            case 17:
                return "MESSAGE_STATUS_OUTGOING_FAILED_RECIPIENT_LOST_RCS";
            case 18:
                return "MESSAGE_STATUS_OUTGOING_FAILED_NO_RETRY_NO_FALLBACK";
            case 19:
                return "MESSAGE_STATUS_OUTGOING_FAILED_RECIPIENT_DID_NOT_DECRYPT";
            case 20:
                return "MESSAGE_STATUS_OUTGOING_VALIDATING";
            case 21:
                return "MESSAGE_STATUS_OUTGOING_FAILED_RECIPIENT_LOST_ENCRYPTION";
            case 22:
                return "MESSAGE_STATUS_OUTGOING_FAILED_RECIPIENT_DID_NOT_DECRYPT_NO_MORE_RETRY";
            case 23:
                return "MESSAGE_STATUS_OUTGOING_DELETED";
            case 24:
                return "MESSAGE_STATUS_OUTGOING_FAILED_RECIPIENT_NEGATIVE_DELIVERY";
            default:
                switch (i) {
                    case VCardConstants.DEFAULT_PREF /* 100 */:
                        return "MESSAGE_STATUS_INCOMING_COMPLETE";
                    case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                        return "MESSAGE_STATUS_INCOMING_YET_TO_MANUAL_DOWNLOAD";
                    case 102:
                        return "MESSAGE_STATUS_INCOMING_RETRYING_MANUAL_DOWNLOAD";
                    case 103:
                        return "MESSAGE_STATUS_INCOMING_MANUAL_DOWNLOADING";
                    case 104:
                        return "MESSAGE_STATUS_INCOMING_RETRYING_AUTO_DOWNLOAD";
                    case 105:
                        return "MESSAGE_STATUS_INCOMING_AUTO_DOWNLOADING";
                    case 106:
                        return "MESSAGE_STATUS_INCOMING_DOWNLOAD_FAILED";
                    case 107:
                        return "MESSAGE_STATUS_INCOMING_EXPIRED_OR_NOT_AVAILABLE";
                    case 108:
                        return "MESSAGE_STATUS_INCOMING_DELIVERED";
                    case 109:
                        return "MESSAGE_STATUS_INCOMING_DISPLAYED";
                    case 110:
                        return "MESSAGE_STATUS_INCOMING_DOWNLOAD_CANCELED";
                    case 111:
                        return "MESSAGE_STATUS_INCOMING_DOWNLOAD_FAILED_TOO_LARGE";
                    case 112:
                        return "MESSAGE_STATUS_INCOMING_DOWNLOAD_FAILED_SIM_HAS_NO_DATA";
                    case 113:
                    case 114:
                        break;
                    case 115:
                        return "MESSAGE_STATUS_INCOMING_AWAITING_AUTO_DOWNLOAD";
                    case 116:
                        return "MESSAGE_STATUS_INCOMING_UNKNOWN_CONTENT_TYPE";
                    case 117:
                        return "MESSAGE_STATUS_INCOMING_DELETED";
                    default:
                        switch (i) {
                            case BasePaymentResult.ERROR_REQUEST_FAILED /* 200 */:
                                return "MESSAGE_STATUS_TOMBSTONE_PARTICIPANT_JOINED";
                            case BasePaymentResult.ERROR_REQUEST_TIMEOUT /* 201 */:
                                return "MESSAGE_STATUS_TOMBSTONE_PARTICIPANT_LEFT";
                            case BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED /* 202 */:
                                return "MESSAGE_STATUS_TOMBSTONE_SELF_LEFT";
                            case BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED /* 203 */:
                                return "MESSAGE_STATUS_TOMBSTONE_RCS_GROUP_CREATED";
                            case 204:
                                return "MESSAGE_STATUS_TOMBSTONE_MMS_GROUP_CREATED";
                            case 205:
                                return "MESSAGE_STATUS_TOMBSTONE_SMS_BROADCAST_CREATED";
                            case 206:
                                return "MESSAGE_STATUS_TOMBSTONE_ONE_ON_ONE_SMS_CREATED";
                            case 207:
                                return "MESSAGE_STATUS_TOMBSTONE_ONE_ON_ONE_RCS_CREATED";
                            case 208:
                                return "MESSAGE_STATUS_TOMBSTONE_SWITCH_TO_GROUP_MMS";
                            case 209:
                                return "MESSAGE_STATUS_TOMBSTONE_SWITCH_TO_BROADCAST_SMS";
                            case 210:
                                return "MESSAGE_STATUS_TOMBSTONE_SHOW_LINK_PREVIEWS";
                            case 211:
                                return "MESSAGE_STATUS_TOMBSTONE_GROUP_RENAMED_LOCAL";
                            case 212:
                                return "MESSAGE_STATUS_TOMBSTONE_VERIFIED_SMS_APPLICABLE";
                            case 213:
                            case 216:
                            case 219:
                                break;
                            case 214:
                                return "MESSAGE_STATUS_TOMBSTONE_PROTOCOL_SWITCH_TO_TEXT";
                            case 215:
                                return "MESSAGE_STATUS_TOMBSTONE_PROTOCOL_SWITCH_TO_RCS";
                            case 217:
                                return "MESSAGE_STATUS_TOMBSTONE_GROUP_RENAMED_GLOBAL";
                            case 218:
                                return "MESSAGE_STATUS_TOMBSTONE_GROUP_NAME_CLEARED_GLOBAL";
                            case 220:
                                return "MESSAGE_STATUS_TOMBSTONE_SELF_REMOVED_FROM_GROUP";
                            case 221:
                                return "MESSAGE_STATUS_TOMBSTONE_PARTICIPANT_REMOVED_FROM_GROUP";
                            default:
                                switch (i) {
                                    case 225:
                                        return "MESSAGE_STATUS_TOMBSTONE_ENCRYPTED_GROUP_PARTICIPANT_JOINED";
                                    case 226:
                                        return "MESSAGE_STATUS_TOMBSTONE_ENCRYPTED_GROUP_PARTICIPANT_JOINED_INFO";
                                    case 227:
                                        return "MESSAGE_STATUS_TOMBSTONE_ENCRYPTED_GROUP_PARTICIPANT_LEFT";
                                    case 228:
                                        return "MESSAGE_STATUS_TOMBSTONE_ENCRYPTED_GROUP_SELF_LEFT";
                                    case 229:
                                        return "MESSAGE_STATUS_TOMBSTONE_ENCRYPTED_GROUP_CREATED";
                                    case 230:
                                        return "MESSAGE_STATUS_TOMBSTONE_SELF_REMOVED_FROM_ENCRYPTED_GROUP";
                                    case 231:
                                        return "MESSAGE_STATUS_TOMBSTONE_PARTICIPANT_REMOVED_FROM_ENCRYPTED_GROUP";
                                    default:
                                        switch (i) {
                                            case 233:
                                                return "MESSAGE_STATUS_TOMBSTONE_GROUP_PROTOCOL_SWITCH_RCS_TO_E2EE";
                                            case 234:
                                                return "MESSAGE_STATUS_TOMBSTONE_GROUP_PROTOCOL_SWITCH_E2EE_TO_RCS";
                                            case 235:
                                                return "MESSAGE_STATUS_TOMBSTONE_PROTOCOL_SWITCH_TEXT_TO_E2EE";
                                            case 236:
                                                return "MESSAGE_STATUS_TOMBSTONE_PROTOCOL_SWITCH_E2EE_TO_TEXT";
                                            case 237:
                                                return "MESSAGE_STATUS_TOMBSTONE_PROTOCOL_SWITCH_RCS_TO_E2EE";
                                            case 238:
                                                return "MESSAGE_STATUS_TOMBSTONE_PROTOCOL_SWITCH_E2EE_TO_RCS";
                                            default:
                                                switch (i) {
                                                    case 246:
                                                        return "MESSAGE_STATUS_TOMBSTONE_SATELLITE_END_OF_EMERGENCY_SUCCESS_HELP_STILL_NEEDED";
                                                    case 247:
                                                        return "MESSAGE_STATUS_TOMBSTONE_SATELLITE_END_OF_EMERGENCY_SUCCESS_HELP_NO_LONGER_NEEDED";
                                                    case 248:
                                                        return "MESSAGE_STATUS_TOMBSTONE_SATELLITE_END_OF_EMERGENCY_FAILURE_HELP_STILL_NEEDED";
                                                    case 249:
                                                        return "MESSAGE_STATUS_TOMBSTONE_SATELLITE_END_OF_EMERGENCY_FAILURE_HELP_NO_LONGER_NEEDED";
                                                    case 250:
                                                        return "MESSAGE_STATUS_TOMBSTONE_SATELLITE_END_OF_EMERGENCY_UNEXPECTED_END";
                                                    default:
                                                        switch (i) {
                                                            case PrivateKeyType.INVALID /* 255 */:
                                                                return "MESSAGE_STATUS_TOMBSTONE_CHATBOT_UNSUBSCRIBE_SENT";
                                                            case 256:
                                                                return "MESSAGE_STATUS_TOMBSTONE_CHATBOT_SUBSCRIBE_SENT";
                                                            case 257:
                                                                return "MESSAGE_STATUS_TOMBSTONE_CHATBOT_UNSUBSCRIBE_SUCCESS";
                                                            case 258:
                                                                return "MESSAGE_STATUS_TOMBSTONE_CHATBOT_SUBSCRIBE_SUCCESS";
                                                            case 259:
                                                                return "MESSAGE_STATUS_TOMBSTONE_ACTIVE_SELF_IDENTITY_CHANGED";
                                                            case 260:
                                                                return "MESSAGE_STATUS_TOMBSTONE_GROUP_ICON_CHANGED_GLOBAL";
                                                            case 261:
                                                                return "MESSAGE_STATUS_TOMBSTONE_GROUP_ICON_CLEARED_GLOBAL";
                                                            case 262:
                                                                return "MESSAGE_STATUS_TOMBSTONE_CHATBOT_UNSUBSCRIBE_ERROR";
                                                            case 263:
                                                                return "MESSAGE_STATUS_TOMBSTONE_CHATBOT_SUBSCRIBE_ERROR";
                                                            default:
                                                                return a.f(i, "MESSAGE_STATUS_UNKNOWN (", ")");
                                                        }
                                                }
                                        }
                                }
                        }
                }
                return a.f(i, "MESSAGE_STATUS (", ")");
        }
    }

    public static String[] b() {
        engw engwVar = h;
        return (String[]) engwVar.toArray(new String[((enou) engwVar).c]);
    }
}
