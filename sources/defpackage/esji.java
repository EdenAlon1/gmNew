package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum esji implements eyge {
    STATUS_UNKNOWN(0),
    OUTGOING_COMPLETE(1),
    OUTGOING_DELIVERED(2),
    OUTGOING_DISPLAYED(11),
    OUTGOING_DRAFT(3),
    OUTGOING_SEND_AFTER_PROCESSING(10),
    OUTGOING_YET_TO_SEND(4),
    OUTGOING_SENDING(5),
    OUTGOING_RESENDING(6),
    OUTGOING_AWAITING_RETRY(7),
    OUTGOING_FAILED_GENERIC(8),
    OUTGOING_FAILED_EMERGENCY_NUMBER(9),
    OUTGOING_CANCELED(12),
    OUTGOING_FAILED_TOO_LARGE(13),
    OUTGOING_NOT_DELIVERED_YET(14),
    OUTGOING_REVOCATION_PENDING(15),
    OUTGOING_SCHEDULED(16),
    OUTGOING_FAILED_RECIPIENT_LOST_RCS(17),
    OUTGOING_FAILED_NO_RETRY_NO_FALLBACK(18),
    OUTGOING_FAILED_RECIPIENT_DID_NOT_DECRYPT(19),
    OUTGOING_VALIDATING(20),
    OUTGOING_FAILED_RECIPIENT_LOST_ENCRYPTION(21),
    OUTGOING_FAILED_RECIPIENT_DID_NOT_DECRYPT_NO_MORE_RETRY(22),
    OUTGOING_DELETED(23),
    OUTGOING_FAILED_RECIPIENT_NEGATIVE_DELIVERY(24),
    MESSAGE_STATUS_OUTGOING_FAILED_EMERGENCY_PROTOCOL_DETERMINATION_MESSAGE(25),
    INCOMING_COMPLETE(100),
    INCOMING_YET_TO_MANUAL_DOWNLOAD(EnergyProfile.EVCONNECTOR_TYPE_OTHER),
    INCOMING_RETRYING_MANUAL_DOWNLOAD(102),
    INCOMING_MANUAL_DOWNLOADING(103),
    INCOMING_RETRYING_AUTO_DOWNLOAD(104),
    INCOMING_AUTO_DOWNLOADING(105),
    INCOMING_DOWNLOAD_FAILED(106),
    INCOMING_EXPIRED_OR_NOT_AVAILABLE(107),
    INCOMING_DELIVERED(108),
    INCOMING_DISPLAYED(109),
    INCOMING_DOWNLOAD_CANCELED(110),
    INCOMING_DOWNLOAD_FAILED_TOO_LARGE(111),
    INCOMING_DOWNLOAD_FAILED_SIM_HAS_NO_DATA(112),
    INCOMING_FAILED_TO_DECRYPT(113),
    INCOMING_DECRYPTION_ABORTED(114),
    INCOMING_AWAITING_AUTO_DOWNLOAD(115),
    INCOMING_UNKNOWN_CONTENT_TYPE(116),
    INCOMING_DELETED(117),
    TOMBSTONE_PARTICIPANT_JOINED(BasePaymentResult.ERROR_REQUEST_FAILED),
    TOMBSTONE_PARTICIPANT_LEFT(BasePaymentResult.ERROR_REQUEST_TIMEOUT),
    TOMBSTONE_SELF_LEFT(BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED),
    TOMBSTONE_RCS_GROUP_CREATED(BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED),
    TOMBSTONE_MMS_GROUP_CREATED(204),
    TOMBSTONE_SMS_BROADCAST_CREATED(205),
    TOMBSTONE_ONE_ON_ONE_SMS_CREATED(206),
    TOMBSTONE_ONE_ON_ONE_RCS_CREATED(207),
    TOMBSTONE_SWITCH_TO_GROUP_MMS(208),
    TOMBSTONE_SWITCH_TO_BROADCAST_SMS(209),
    TOMBSTONE_SHOW_LINK_PREVIEWS(210),
    TOMBSTONE_GROUP_RENAMED_LOCAL(211),
    TOMBSTONE_VERIFIED_SMS_APPLICABLE(212),
    TOMBSTONE_ENCRYPTED_ONE_ON_ONE_RCS_CREATED(213),
    TOMBSTONE_PROTOCOL_SWITCH_TO_TEXT(214),
    TOMBSTONE_PROTOCOL_SWITCH_TO_RCS(215),
    TOMBSTONE_PROTOCOL_SWITCH_TO_ENCRYPTED_RCS(216),
    TOMBSTONE_GROUP_RENAMED_GLOBAL(217),
    TOMBSTONE_GROUP_NAME_CLEARED_GLOBAL(218),
    TOMBSTONE_PROTOCOL_SWITCH_TO_ENCRYPTED_RCS_INFO(219),
    TOMBSTONE_SELF_REMOVED_FROM_GROUP(220),
    MESSAGE_STATUS_TOMBSTONE_PARTICIPANT_REMOVED_FROM_GROUP(221),
    MESSAGE_STATUS_TOMBSTONE_SMS_NORM_PARTICIPANT_UPGRADED(222),
    MESSAGE_STATUS_TOMBSTONE_RCS_NORM_PARTICIPANT_UPGRADED(223),
    MESSAGE_STATUS_TOMBSTONE_ENCRYPTED_RCS_NORM_PARTICIPANT_UPGRADED(224),
    MESSAGE_STATUS_TOMBSTONE_ENCRYPTED_GROUP_PARTICIPANT_JOINED(225),
    MESSAGE_STATUS_TOMBSTONE_ENCRYPTED_GROUP_PARTICIPANT_JOINED_INFO(226),
    MESSAGE_STATUS_TOMBSTONE_ENCRYPTED_GROUP_PARTICIPANT_LEFT(227),
    MESSAGE_STATUS_TOMBSTONE_ENCRYPTED_GROUP_SELF_LEFT(228),
    MESSAGE_STATUS_TOMBSTONE_ENCRYPTED_GROUP_CREATED(229),
    MESSAGE_STATUS_TOMBSTONE_SELF_REMOVED_FROM_ENCRYPTED_GROUP(230),
    MESSAGE_STATUS_TOMBSTONE_PARTICIPANT_REMOVED_FROM_ENCRYPTED_GROUP(231),
    MESSAGE_STATUS_TOMBSTONE_SUGGESTION_SHORTCUT_STAR_TOOLSTONE(232),
    MESSAGE_STATUS_TOMBSTONE_GROUP_PROTOCOL_SWITCH_RCS_TO_E2EE(233),
    MESSAGE_STATUS_TOMBSTONE_GROUP_PROTOCOL_SWITCH_E2EE_TO_RCS(234),
    MESSAGE_STATUS_TOMBSTONE_PROTOCOL_SWITCH_TEXT_TO_E2EE(235),
    MESSAGE_STATUS_TOMBSTONE_PROTOCOL_SWITCH_E2EE_TO_TEXT(236),
    MESSAGE_STATUS_TOMBSTONE_PROTOCOL_SWITCH_RCS_TO_E2EE(237),
    MESSAGE_STATUS_TOMBSTONE_PROTOCOL_SWITCH_E2EE_TO_RCS(238),
    MESSAGE_STATUS_TOMBSTONE_SATELLITE_EDUCATION(239),
    MESSAGE_STATUS_TOMBSTONE_RBM_SIM_SWITCH(240),
    MESSAGE_STATUS_TOMBSTONE_RBM_PRIVACY_NOTICE(241),
    MESSAGE_STATUS_TOMBSTONE_PENPAL_CONVERSATION_NOTICE(242),
    MESSAGE_STATUS_TOMBSTONE_MEET_OTHER_PARTICIPANT_REACHABLE(243),
    MESSAGE_STATUS_TOMBSTONE_MISSED_VIDEO_CALL(244),
    MESSAGE_STATUS_TOMBSTONE_PARTICIPANT_THEME_CHANGE(245),
    MESSAGE_STATUS_TOMBSTONE_SATELLITE_END_OF_EMERGENCY_SUCCESS_HELP_STILL_NEEDED(246),
    MESSAGE_STATUS_TOMBSTONE_SATELLITE_END_OF_EMERGENCY_SUCCESS_HELP_NO_LONGER_NEEDED(247),
    MESSAGE_STATUS_TOMBSTONE_SATELLITE_END_OF_EMERGENCY_FAILURE_HELP_STILL_NEEDED(248),
    MESSAGE_STATUS_TOMBSTONE_SATELLITE_END_OF_EMERGENCY_FAILURE_HELP_NO_LONGER_NEEDED(249),
    MESSAGE_STATUS_TOMBSTONE_SATELLITE_END_OF_EMERGENCY_UNEXPECTED_END(250),
    MESSAGE_STATUS_TOMBSTONE_SATELLITE_MESSAGING_TOOLSTONE(251),
    MESSAGE_STATUS_TOMBSTONE_GROUP_PROTOCOL_SWITCH_E2EE_TO_MMS(252),
    MESSAGE_STATUS_TOMBSTONE_PENPAL_PROACTIVE_MESSAGE_NOTICE(253),
    MESSAGE_STATUS_TOMBSTONE_SUGGESTION_POSSIBLE_SCAM_TOOLSTONE(254),
    MESSAGE_STATUS_TOMBSTONE_CHATBOT_UNSUBSCRIBE_SENT(PrivateKeyType.INVALID),
    MESSAGE_STATUS_TOMBSTONE_CHATBOT_SUBSCRIBE_SENT(256),
    MESSAGE_STATUS_TOMBSTONE_CHATBOT_UNSUBSCRIBE_CONFIRMED(257),
    MESSAGE_STATUS_TOMBSTONE_CHATBOT_SUBSCRIBE_CONFIRMED(258),
    MESSAGE_STATUS_TOMBSTONE_ACTIVE_SELF_IDENTITY_CHANGED(259),
    MESSAGE_STATUS_TOMBSTONE_GROUP_ICON_CHANGED_GLOBAL(260),
    MESSAGE_STATUS_TOMBSTONE_GROUP_ICON_CLEARED_GLOBAL(261),
    MESSAGE_STATUS_TOMBSTONE_CHATBOT_UNSUBSCRIBE_ERROR(262),
    MESSAGE_STATUS_TOMBSTONE_CHATBOT_SUBSCRIBE_ERROR(263),
    MESSAGE_STATUS_TOMBSTONE_EMERGENCY_CONVERSATION_CREATED(264),
    MESSAGE_STATUS_TOMBSTONE_SENSITIVE_CONTENT_WARNING_TOOLSTONE(265),
    MESSAGE_STATUS_TOMBSTONE_CHATBOT_UNSUBSCRIBE_CONFIRMED_NO_LINK(266),
    MESSAGE_STATUS_TOMBSTONE_CHATBOT_SUBSCRIBE_CONFIRMED_NO_LINK(267),
    DELETED(300),
    UNRECOGNIZED(-1);

    private final int bl;

    esji(int i) {
        this.bl = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.bl;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
