package defpackage;

import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
import com.android.vcard.VCardConstants;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum epyw implements eyge {
    UNKNOWN_BUGLE_EVENT_CODE(0),
    ACTIVE_USER_SEND_MESSAGE(1),
    ACTIVE_USER_ENTER_CONVERSATION_WITH_UNREAD_MESSAGE(2),
    UMA_PERMISSION_LOCATION_ALLOWED_BY_USER(EnergyProfile.EVCONNECTOR_TYPE_OTHER),
    UMA_PERMISSION_LOCATION_DENIED_BY_USER(102),
    UMA_MESSAGE_SENDING_START(103),
    UMA_MESSAGE_SENT(104),
    UMA_MESSAGE_SENT_FAILED(105),
    UMA_MESSAGE_DOWNLOADING_START(106),
    UMA_MESSAGE_DOWNLOADED(107),
    UMA_MESSAGE_DOWNLOADED_FAILED(108),
    UMA_RCS_PROVISIONING_HTTP_REQUEST_SENT(109),
    UMA_RCS_PROVISIONING_HTTP_RESPONSE_RECEIVED(110),
    UMA_SIM_MESSAGES_ACTIVITY_LAUNCHED(111),
    UMA_RCS_PROVISIONING_UI_INTERACTION(112),
    BUGLE_APP(85),
    BUGLE_MESSAGE(86),
    BUGLE_CONTACTS_EVENT(87),
    BUGLE_SUPER_SORT_EVENT(88),
    BUGLE_FOREGROUND_SERVICE_EVENT(89),
    REACTIONS_PROMO_EVENT(90),
    BUGLE_SMART_COMPOSE(91),
    EXTERNAL_API_SERVICE_CALL_START(92),
    EXTERNAL_API_SERVICE_CALL_END(93),
    EXTERNAL_API_SERVICE_CALL_PENDING(94),
    BUGLE_E2EE_FETCH_PREKEYS_EVENT(95),
    BUGLE_CONVERSATION(3),
    BUGLE_PERFORMANCE(4),
    BUGLE_SEARCH(5),
    BUGLE_SETTING(6),
    BUGLE_USER_AND_DEVICE_INFO(8),
    BUGLE_TRANSCODING(9),
    BUGLE_RCS_PROVISIONING(11),
    BUGLE_P2P_SUGGESTION(12),
    BUGLE_APP_CONFIGURATION(13),
    BUGLE_RBM_BUSINESS_INFO(15),
    BUGLE_ANNOTATION(16),
    DITTO_GRPC_MESSAGE(17),
    BUGLE_TELEPHONY_EVENT(18),
    BUGLE_GIF_CHOOSER(19),
    BUGLE_GROUP(20),
    BUGLE_ADD_CONTACT(21),
    DITTO_IMAGE(22),
    BUGLE_CONTACT_BANNER(23),
    BUGLE_REPORT_SPAM(24),
    BUGLE_COMPOSE(25),
    BUGLE_FILE_PREVIEW_CLICK(26),
    BUGLE_INDEXING(28),
    BUGLE_PARTICIPANTS_TABLE(29),
    BUGLE_SPAM_DETECTION(32),
    BUGLE_EDIT_CONTACT(33),
    BUGLE_BLOCK_FILE_ATTACH(34),
    BUGLE_ASSISTANT(35),
    BUGLE_CONSENT(36),
    BUGLE_ICING_SEARCH(37),
    BUGLE_CONVERSATION_LATCH_STATUS_CHANGE(38),
    BUGLE_FEDERATED_LEARNING(39),
    BUGLE_MDD_LIB(40),
    BUGLE_VERIFIED_SMS(41),
    BUGLE_HAPPINESS_TRACKING_SURVEY_DOWNLOAD(42),
    BUGLE_SHAKE_TO_REPORT(43),
    BUGLE_SCYTALE_EVENT(44),
    BUGLE_SELECTED_MESSAGES_ACTION(45),
    BUGLE_REMINDER(46),
    DITTO_SESSION_INFO(47),
    DITTO_QR_CODE_PAIRING_EVENT(48),
    BUGLE_TACHYON_TRANSPORT_EVENT(49),
    BUGLE_E2EE_STATE_TRANSITION(50),
    BUGLE_E2EE_LOOKUP_REGISTERED(51),
    BUGLE_E2EE_MESSAGE_RETRY_LIMIT_EXCEEDED(52),
    BUGLE_E2EE_EMPTY_GENERATED_PREKEYS_BUT_PROVISIONED(63),
    BUGLE_CONTACT_PICKER(53),
    BUGLE_MEDIA_VIEWER(54),
    BUGLE_VIDEO_CALL_EVENT(55),
    BUGLE_NOTIFICATION(56),
    BUGLE_E2EE_IDENTITY_VERIFICATION_MESSAGE_DROPPED(57),
    BUGLE_E2EE_ATTACHMENT_FAILED_TO_DECRYPT_USING_OTMK(58),
    BUGLE_WELCOME_EVENT(59),
    DITTO_BINDING_STATUS(60),
    ICING_INDEX_UPDATE_EVENT(61),
    TELEPHONY_DATABASE_EVENT(62),
    TELEPHONY_DATABASE_ACTION_EVENT(116),
    BUGLE_BUSINESS_MESSAGING_EVENT(64),
    BUGLE_ADVANCED_FEEDBACK_EVENT(65),
    BUGLE_REPORT_ISSUE_EVENT(66),
    SPAM_FOLDER_EVENT(68),
    AVAILABILITY_LOG(69),
    SEARCH_QUERY(70),
    HOME_SCREEN(71),
    BUGLE_MULTI_DEVICE_EVENT(73),
    ICING_INDEX_REBUILD(74),
    RCS_EVENT(75),
    TELEPHONY_WIPEOUT_DETECTOR_EXECUTION_EVENT(76),
    MMS_METADATA_EXPERIMENT(77),
    HADES_SDK_EVENT(78),
    CUSTODIAN_REPORT(79),
    TELEPHONY_REVERSE_SYNC_STARTED_EVENT(80),
    TELEPHONY_REVERSE_SYNC_RESUMED_EVENT(81),
    TELEPHONY_REVERSE_SYNC_COMPLETED_EVENT(82),
    TELEPHONY_REVERSE_SYNC_FAILED_EVENT(83),
    TELEPHONY_REVERSE_SYNC_NOT_ATTEMPTED_EVENT(114),
    DATA_DONATION_EVENT(84),
    BUGLE_SMART_COMPOSE_MODEL_EVAL(115),
    SCHEDULED_SEND_EVENT(117),
    JIBE_SERVICE_CONNECTION(118),
    DATABASE_UPGRADE(119),
    FORWARD_TELEPHONY_SYNC(120),
    RBM_EVENT(121),
    TOGGLE_CHAT_FEATURES_EVENT(122),
    SYNC_TELEPHONY_THREADS(123),
    FUZZY_MATCH_LENGTH(124),
    BUGLE_TABLET_MODE_SWITCH(125),
    RCS_PROVISIONING(126),
    BUGLE_CONVERSATION_MATCHING(127),
    BUGLE_HATS_NEXT_CLIENT_EVENT(128),
    BUGLE_WEAR_GMS_RPC_RELIABILITY(129),
    BUGLE_EXTERNAL_SEARCH_MESSAGE_EVENT(130),
    WEAR_FAILURE_EVENT(131),
    BUGLE_STAR_EVENT(132),
    BUBBLE_SETTING_EVENT(133),
    XSL_REQUEST_EVENT(134),
    PIN_TO_TOP_EVENT(135),
    TACHYGRAM_EVENT(136),
    BUGLE_E2EE_IDENTITY_VERIFICATION_EVENT(137),
    COMPOSE_BOX_HINT_TEXT_FLICKER_EVENT(138),
    BUGLE_MESSAGE_CLASSIFICATION(139),
    BANNER_EVENT(140),
    BUGLE_INTERNET_CONNECTIVITY_CHECK_EVENT(141),
    RCS_CHAT_SESSION_SERVICE(142),
    SPAM_ABUSE_EVENT(143),
    BUGLE_CONVERSATION_CLASSIFICATION(144),
    BUGLE_BIRTHDAY_CONVERSATION_INFO(153),
    BUGLE_BIRTHDAY_SUGGESTION_INFO(155),
    GOOGLE_PHOTOS_CREATE_SHARE_LINK_EVENT(145),
    GOOGLE_PHOTOS_ONBOARDING_EVENT(146),
    GOOGLE_PHOTOS_OPTION_TRAY_EVENT(147),
    RCS_CONTACTS_CALLER_EVENT(148),
    NOTIFICATION_METRICS_EVENT(149),
    BUGLE_GAIA_INTEGRATION_EVENT(150),
    WEAR_USER_AND_DEVICE_INFO(151),
    LIGHTER_EVENT(152),
    BUGLE_YOUTUBE_EVENT(154),
    BUGLE_SMARTS_SILENT_EXCEPTIONS_EVENT(156),
    DUPLICATE_RCS_MESSAGE_ID_EVENT(157),
    WELCOME_FLOW_UI_EVENT(158),
    BUGLE_CONTACTS_BIRTHDAY_COVERAGE_INFO(159),
    BUGLE_CAPABILITIES_EVENT(160),
    WELCOME_FLOW_PAGE_EVENT(161),
    WELCOME_FLOW_RELATED_SUPPRESSION_EVENT(162),
    WELCOME_FLOW_LAUNCH_EVENT(163),
    VMT_SESSION_EVENT(164),
    BUGLE_SMS_CAPABILITY_EVENT(165),
    BUGLE_APP_CONTROL_EVENT(166),
    CONVERSATION_E2EE_STATUS_UPDATE(167),
    PHENOTYPE_FIRST_REREGISTRATION_EVENT(168),
    PROFILE_EVENT(169),
    IN_APP_UPDATE_EVENT(170),
    HOME_SCREEN_METRICS_EVENT(171),
    BUGLE_MOBILE_CONFIGURATION_CLIENT_EVENT(172),
    MMS_GROUP_UPGRADE_ELIGIBILITY_INFO(173),
    BUGLE_WEAR_CONVERSATION_SYNC_EVENT(174),
    CONVERSATION_SCREEN_METRIC_EVENT(175),
    DATABASE_OPERATION(176),
    THREAD_UTILIZATION(177),
    BUGLE_EXPRESS_SIGN_IN_EVENT(178),
    BUGLE_CONVERSATION_READ_STATUS_EVENT(179),
    MODIFIED_BY_EVENT(180),
    BUGLE_CONVERSATION_MERGING_MATCHED_CONVERSATIONS_INFO(181),
    MAGIC_COMPOSE_FEEDBACK(182),
    MAGIC_COMPOSE_CONSENT(184),
    SIM_STATE_TRACKER_EVENT(183),
    BUGLE_CARRIER_CONFIG_MISMATCH_EVENT(185),
    BUGLE_SYSTEM_BACKUP_EVENT(186),
    MAGIC_COMPOSE_ERROR(187),
    MAGIC_COMPOSE_EVENT(188),
    MAGIC_COMPOSE_DISPLAY(189),
    BUGLE_ALARM_DELAY_METRICS_EVENT(190),
    HOME_SCREEN_FIRST_VISIT(191),
    DANGLING_PARTS_EVENT(192),
    MAGIC_COMPOSE_ICON_EVENT(193),
    MAGIC_COMPOSE_SETTING(194),
    SMS_SUBJECT_REPORT_EVENT(195),
    MULTI_SHARE_EVENT(196),
    BUGLE_CMS_DATA_PROVIDER_EVENT(197),
    TOGGLE_RCS_CHATS_EVENT(198),
    EMOTIFY_CREATE_EVENT(199),
    EMOTIFY_IMPRESSION_EVENT(BasePaymentResult.ERROR_REQUEST_FAILED),
    EMOTIFY_MESSAGE_SEND_EVENT(BasePaymentResult.ERROR_REQUEST_TIMEOUT),
    EMOTIFY_DELETE_EVENT(BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED),
    BUGLE_CARRIER_CONFIG_LOAD_LATENCY_EVENT(BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED),
    BUGLE_RCS_GROUP_SELF_PARTICIPANT_INCLUSION(204),
    MEET_CALLING_EVENT(205),
    RCS_PROVISIONING_MANAGER_EVENT(206),
    VOICE_MOOD_EVENT(207),
    BARD_EVENT(208),
    MAGIC_COMPOSE_INPUT_TOKEN_METRIC(209),
    DOUBLE_TAP_REACT_PROMOTION_EVENT(210),
    REVOKE_CONSENT_EVENT(211),
    RCS_LOCAL_IDENTITY_EVENT(212),
    D2D_BACKUP_AND_RESTORE_EVENT(213),
    PARTICIPANTS_TABLE_VALIDATION_EVENT(214),
    GAIA_SIGN_IN_EVENT(215),
    SELFIE_GIF_EVENT(216),
    GAIA_SIGN_IN_STATE(217),
    SATELLITE_EVENT(218),
    MMS_GROUP_UPGRADE_EVENT(219),
    RESTORE_WORKFLOW_EVENT(220),
    BACKUP_WORKFLOW_EVENT(221),
    VIDEO_CALLING_EVENT(222),
    TELEPHONY_PERSISTENCE_EVENT(223),
    MMS_GROUP_EVENT(224),
    OPEN_PENPAL_CHAT_EVENT(225),
    BUGLE_COMPOSE_DISABLED_EVENT(226),
    GAIA_REPORT_EVENT(227),
    MMS_MERGING_EVENT(228),
    BUGLE_FILE_PROCESSING(229),
    CONVERSATION_SCREEN_FIRST_VISIT(230),
    TYCHO_GRPC_EVENT(231),
    SCREEN_EFFECTS_EVENT(232),
    TOOLSTONE_EVENT(233),
    RCS_AVAILABILITY_ON_FIRST_APP_OPEN(234),
    BUGLE_WELCOME_V1_EVENT(235);


    /* renamed from: do, reason: not valid java name */
    public final int f11do;

    epyw(int i) {
        this.f11do = i;
    }

    public static epyw b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_BUGLE_EVENT_CODE;
            case 1:
                return ACTIVE_USER_SEND_MESSAGE;
            case 2:
                return ACTIVE_USER_ENTER_CONVERSATION_WITH_UNREAD_MESSAGE;
            case 3:
                return BUGLE_CONVERSATION;
            case 4:
                return BUGLE_PERFORMANCE;
            case 5:
                return BUGLE_SEARCH;
            case 6:
                return BUGLE_SETTING;
            case 7:
            case 10:
            case 14:
            case 27:
            case 30:
            case 31:
            case 67:
            case 72:
            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
            case 97:
            case 98:
            case 99:
            case VCardConstants.DEFAULT_PREF /* 100 */:
            case 113:
            default:
                return null;
            case 8:
                return BUGLE_USER_AND_DEVICE_INFO;
            case 9:
                return BUGLE_TRANSCODING;
            case 11:
                return BUGLE_RCS_PROVISIONING;
            case 12:
                return BUGLE_P2P_SUGGESTION;
            case 13:
                return BUGLE_APP_CONFIGURATION;
            case 15:
                return BUGLE_RBM_BUSINESS_INFO;
            case 16:
                return BUGLE_ANNOTATION;
            case 17:
                return DITTO_GRPC_MESSAGE;
            case 18:
                return BUGLE_TELEPHONY_EVENT;
            case 19:
                return BUGLE_GIF_CHOOSER;
            case 20:
                return BUGLE_GROUP;
            case 21:
                return BUGLE_ADD_CONTACT;
            case 22:
                return DITTO_IMAGE;
            case 23:
                return BUGLE_CONTACT_BANNER;
            case 24:
                return BUGLE_REPORT_SPAM;
            case 25:
                return BUGLE_COMPOSE;
            case 26:
                return BUGLE_FILE_PREVIEW_CLICK;
            case 28:
                return BUGLE_INDEXING;
            case 29:
                return BUGLE_PARTICIPANTS_TABLE;
            case 32:
                return BUGLE_SPAM_DETECTION;
            case 33:
                return BUGLE_EDIT_CONTACT;
            case 34:
                return BUGLE_BLOCK_FILE_ATTACH;
            case 35:
                return BUGLE_ASSISTANT;
            case 36:
                return BUGLE_CONSENT;
            case 37:
                return BUGLE_ICING_SEARCH;
            case 38:
                return BUGLE_CONVERSATION_LATCH_STATUS_CHANGE;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                return BUGLE_FEDERATED_LEARNING;
            case 40:
                return BUGLE_MDD_LIB;
            case 41:
                return BUGLE_VERIFIED_SMS;
            case 42:
                return BUGLE_HAPPINESS_TRACKING_SURVEY_DOWNLOAD;
            case 43:
                return BUGLE_SHAKE_TO_REPORT;
            case 44:
                return BUGLE_SCYTALE_EVENT;
            case 45:
                return BUGLE_SELECTED_MESSAGES_ACTION;
            case 46:
                return BUGLE_REMINDER;
            case 47:
                return DITTO_SESSION_INFO;
            case 48:
                return DITTO_QR_CODE_PAIRING_EVENT;
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                return BUGLE_TACHYON_TRANSPORT_EVENT;
            case 50:
                return BUGLE_E2EE_STATE_TRANSITION;
            case 51:
                return BUGLE_E2EE_LOOKUP_REGISTERED;
            case 52:
                return BUGLE_E2EE_MESSAGE_RETRY_LIMIT_EXCEEDED;
            case 53:
                return BUGLE_CONTACT_PICKER;
            case 54:
                return BUGLE_MEDIA_VIEWER;
            case 55:
                return BUGLE_VIDEO_CALL_EVENT;
            case 56:
                return BUGLE_NOTIFICATION;
            case 57:
                return BUGLE_E2EE_IDENTITY_VERIFICATION_MESSAGE_DROPPED;
            case 58:
                return BUGLE_E2EE_ATTACHMENT_FAILED_TO_DECRYPT_USING_OTMK;
            case 59:
                return BUGLE_WELCOME_EVENT;
            case 60:
                return DITTO_BINDING_STATUS;
            case 61:
                return ICING_INDEX_UPDATE_EVENT;
            case 62:
                return TELEPHONY_DATABASE_EVENT;
            case 63:
                return BUGLE_E2EE_EMPTY_GENERATED_PREKEYS_BUT_PROVISIONED;
            case 64:
                return BUGLE_BUSINESS_MESSAGING_EVENT;
            case 65:
                return BUGLE_ADVANCED_FEEDBACK_EVENT;
            case 66:
                return BUGLE_REPORT_ISSUE_EVENT;
            case 68:
                return SPAM_FOLDER_EVENT;
            case 69:
                return AVAILABILITY_LOG;
            case 70:
                return SEARCH_QUERY;
            case 71:
                return HOME_SCREEN;
            case 73:
                return BUGLE_MULTI_DEVICE_EVENT;
            case 74:
                return ICING_INDEX_REBUILD;
            case 75:
                return RCS_EVENT;
            case 76:
                return TELEPHONY_WIPEOUT_DETECTOR_EXECUTION_EVENT;
            case 77:
                return MMS_METADATA_EXPERIMENT;
            case 78:
                return HADES_SDK_EVENT;
            case 79:
                return CUSTODIAN_REPORT;
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                return TELEPHONY_REVERSE_SYNC_STARTED_EVENT;
            case 81:
                return TELEPHONY_REVERSE_SYNC_RESUMED_EVENT;
            case 82:
                return TELEPHONY_REVERSE_SYNC_COMPLETED_EVENT;
            case 83:
                return TELEPHONY_REVERSE_SYNC_FAILED_EVENT;
            case 84:
                return DATA_DONATION_EVENT;
            case 85:
                return BUGLE_APP;
            case 86:
                return BUGLE_MESSAGE;
            case 87:
                return BUGLE_CONTACTS_EVENT;
            case 88:
                return BUGLE_SUPER_SORT_EVENT;
            case 89:
                return BUGLE_FOREGROUND_SERVICE_EVENT;
            case 90:
                return REACTIONS_PROMO_EVENT;
            case 91:
                return BUGLE_SMART_COMPOSE;
            case 92:
                return EXTERNAL_API_SERVICE_CALL_START;
            case 93:
                return EXTERNAL_API_SERVICE_CALL_END;
            case 94:
                return EXTERNAL_API_SERVICE_CALL_PENDING;
            case 95:
                return BUGLE_E2EE_FETCH_PREKEYS_EVENT;
            case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                return UMA_PERMISSION_LOCATION_ALLOWED_BY_USER;
            case 102:
                return UMA_PERMISSION_LOCATION_DENIED_BY_USER;
            case 103:
                return UMA_MESSAGE_SENDING_START;
            case 104:
                return UMA_MESSAGE_SENT;
            case 105:
                return UMA_MESSAGE_SENT_FAILED;
            case 106:
                return UMA_MESSAGE_DOWNLOADING_START;
            case 107:
                return UMA_MESSAGE_DOWNLOADED;
            case 108:
                return UMA_MESSAGE_DOWNLOADED_FAILED;
            case 109:
                return UMA_RCS_PROVISIONING_HTTP_REQUEST_SENT;
            case 110:
                return UMA_RCS_PROVISIONING_HTTP_RESPONSE_RECEIVED;
            case 111:
                return UMA_SIM_MESSAGES_ACTIVITY_LAUNCHED;
            case 112:
                return UMA_RCS_PROVISIONING_UI_INTERACTION;
            case 114:
                return TELEPHONY_REVERSE_SYNC_NOT_ATTEMPTED_EVENT;
            case 115:
                return BUGLE_SMART_COMPOSE_MODEL_EVAL;
            case 116:
                return TELEPHONY_DATABASE_ACTION_EVENT;
            case 117:
                return SCHEDULED_SEND_EVENT;
            case 118:
                return JIBE_SERVICE_CONNECTION;
            case 119:
                return DATABASE_UPGRADE;
            case 120:
                return FORWARD_TELEPHONY_SYNC;
            case 121:
                return RBM_EVENT;
            case 122:
                return TOGGLE_CHAT_FEATURES_EVENT;
            case 123:
                return SYNC_TELEPHONY_THREADS;
            case 124:
                return FUZZY_MATCH_LENGTH;
            case 125:
                return BUGLE_TABLET_MODE_SWITCH;
            case 126:
                return RCS_PROVISIONING;
            case 127:
                return BUGLE_CONVERSATION_MATCHING;
            case 128:
                return BUGLE_HATS_NEXT_CLIENT_EVENT;
            case 129:
                return BUGLE_WEAR_GMS_RPC_RELIABILITY;
            case 130:
                return BUGLE_EXTERNAL_SEARCH_MESSAGE_EVENT;
            case 131:
                return WEAR_FAILURE_EVENT;
            case 132:
                return BUGLE_STAR_EVENT;
            case 133:
                return BUBBLE_SETTING_EVENT;
            case 134:
                return XSL_REQUEST_EVENT;
            case 135:
                return PIN_TO_TOP_EVENT;
            case 136:
                return TACHYGRAM_EVENT;
            case 137:
                return BUGLE_E2EE_IDENTITY_VERIFICATION_EVENT;
            case 138:
                return COMPOSE_BOX_HINT_TEXT_FLICKER_EVENT;
            case 139:
                return BUGLE_MESSAGE_CLASSIFICATION;
            case 140:
                return BANNER_EVENT;
            case 141:
                return BUGLE_INTERNET_CONNECTIVITY_CHECK_EVENT;
            case 142:
                return RCS_CHAT_SESSION_SERVICE;
            case 143:
                return SPAM_ABUSE_EVENT;
            case 144:
                return BUGLE_CONVERSATION_CLASSIFICATION;
            case 145:
                return GOOGLE_PHOTOS_CREATE_SHARE_LINK_EVENT;
            case 146:
                return GOOGLE_PHOTOS_ONBOARDING_EVENT;
            case 147:
                return GOOGLE_PHOTOS_OPTION_TRAY_EVENT;
            case 148:
                return RCS_CONTACTS_CALLER_EVENT;
            case 149:
                return NOTIFICATION_METRICS_EVENT;
            case 150:
                return BUGLE_GAIA_INTEGRATION_EVENT;
            case 151:
                return WEAR_USER_AND_DEVICE_INFO;
            case 152:
                return LIGHTER_EVENT;
            case 153:
                return BUGLE_BIRTHDAY_CONVERSATION_INFO;
            case 154:
                return BUGLE_YOUTUBE_EVENT;
            case 155:
                return BUGLE_BIRTHDAY_SUGGESTION_INFO;
            case 156:
                return BUGLE_SMARTS_SILENT_EXCEPTIONS_EVENT;
            case 157:
                return DUPLICATE_RCS_MESSAGE_ID_EVENT;
            case 158:
                return WELCOME_FLOW_UI_EVENT;
            case 159:
                return BUGLE_CONTACTS_BIRTHDAY_COVERAGE_INFO;
            case 160:
                return BUGLE_CAPABILITIES_EVENT;
            case 161:
                return WELCOME_FLOW_PAGE_EVENT;
            case 162:
                return WELCOME_FLOW_RELATED_SUPPRESSION_EVENT;
            case 163:
                return WELCOME_FLOW_LAUNCH_EVENT;
            case 164:
                return VMT_SESSION_EVENT;
            case 165:
                return BUGLE_SMS_CAPABILITY_EVENT;
            case 166:
                return BUGLE_APP_CONTROL_EVENT;
            case 167:
                return CONVERSATION_E2EE_STATUS_UPDATE;
            case 168:
                return PHENOTYPE_FIRST_REREGISTRATION_EVENT;
            case 169:
                return PROFILE_EVENT;
            case 170:
                return IN_APP_UPDATE_EVENT;
            case 171:
                return HOME_SCREEN_METRICS_EVENT;
            case 172:
                return BUGLE_MOBILE_CONFIGURATION_CLIENT_EVENT;
            case 173:
                return MMS_GROUP_UPGRADE_ELIGIBILITY_INFO;
            case 174:
                return BUGLE_WEAR_CONVERSATION_SYNC_EVENT;
            case 175:
                return CONVERSATION_SCREEN_METRIC_EVENT;
            case 176:
                return DATABASE_OPERATION;
            case 177:
                return THREAD_UTILIZATION;
            case 178:
                return BUGLE_EXPRESS_SIGN_IN_EVENT;
            case 179:
                return BUGLE_CONVERSATION_READ_STATUS_EVENT;
            case 180:
                return MODIFIED_BY_EVENT;
            case 181:
                return BUGLE_CONVERSATION_MERGING_MATCHED_CONVERSATIONS_INFO;
            case 182:
                return MAGIC_COMPOSE_FEEDBACK;
            case 183:
                return SIM_STATE_TRACKER_EVENT;
            case 184:
                return MAGIC_COMPOSE_CONSENT;
            case 185:
                return BUGLE_CARRIER_CONFIG_MISMATCH_EVENT;
            case 186:
                return BUGLE_SYSTEM_BACKUP_EVENT;
            case 187:
                return MAGIC_COMPOSE_ERROR;
            case 188:
                return MAGIC_COMPOSE_EVENT;
            case 189:
                return MAGIC_COMPOSE_DISPLAY;
            case 190:
                return BUGLE_ALARM_DELAY_METRICS_EVENT;
            case 191:
                return HOME_SCREEN_FIRST_VISIT;
            case 192:
                return DANGLING_PARTS_EVENT;
            case 193:
                return MAGIC_COMPOSE_ICON_EVENT;
            case 194:
                return MAGIC_COMPOSE_SETTING;
            case 195:
                return SMS_SUBJECT_REPORT_EVENT;
            case 196:
                return MULTI_SHARE_EVENT;
            case 197:
                return BUGLE_CMS_DATA_PROVIDER_EVENT;
            case 198:
                return TOGGLE_RCS_CHATS_EVENT;
            case 199:
                return EMOTIFY_CREATE_EVENT;
            case BasePaymentResult.ERROR_REQUEST_FAILED /* 200 */:
                return EMOTIFY_IMPRESSION_EVENT;
            case BasePaymentResult.ERROR_REQUEST_TIMEOUT /* 201 */:
                return EMOTIFY_MESSAGE_SEND_EVENT;
            case BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED /* 202 */:
                return EMOTIFY_DELETE_EVENT;
            case BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED /* 203 */:
                return BUGLE_CARRIER_CONFIG_LOAD_LATENCY_EVENT;
            case 204:
                return BUGLE_RCS_GROUP_SELF_PARTICIPANT_INCLUSION;
            case 205:
                return MEET_CALLING_EVENT;
            case 206:
                return RCS_PROVISIONING_MANAGER_EVENT;
            case 207:
                return VOICE_MOOD_EVENT;
            case 208:
                return BARD_EVENT;
            case 209:
                return MAGIC_COMPOSE_INPUT_TOKEN_METRIC;
            case 210:
                return DOUBLE_TAP_REACT_PROMOTION_EVENT;
            case 211:
                return REVOKE_CONSENT_EVENT;
            case 212:
                return RCS_LOCAL_IDENTITY_EVENT;
            case 213:
                return D2D_BACKUP_AND_RESTORE_EVENT;
            case 214:
                return PARTICIPANTS_TABLE_VALIDATION_EVENT;
            case 215:
                return GAIA_SIGN_IN_EVENT;
            case 216:
                return SELFIE_GIF_EVENT;
            case 217:
                return GAIA_SIGN_IN_STATE;
            case 218:
                return SATELLITE_EVENT;
            case 219:
                return MMS_GROUP_UPGRADE_EVENT;
            case 220:
                return RESTORE_WORKFLOW_EVENT;
            case 221:
                return BACKUP_WORKFLOW_EVENT;
            case 222:
                return VIDEO_CALLING_EVENT;
            case 223:
                return TELEPHONY_PERSISTENCE_EVENT;
            case 224:
                return MMS_GROUP_EVENT;
            case 225:
                return OPEN_PENPAL_CHAT_EVENT;
            case 226:
                return BUGLE_COMPOSE_DISABLED_EVENT;
            case 227:
                return GAIA_REPORT_EVENT;
            case 228:
                return MMS_MERGING_EVENT;
            case 229:
                return BUGLE_FILE_PROCESSING;
            case 230:
                return CONVERSATION_SCREEN_FIRST_VISIT;
            case 231:
                return TYCHO_GRPC_EVENT;
            case 232:
                return SCREEN_EFFECTS_EVENT;
            case 233:
                return TOOLSTONE_EVENT;
            case 234:
                return RCS_AVAILABILITY_ON_FIRST_APP_OPEN;
            case 235:
                return BUGLE_WELCOME_V1_EVENT;
        }
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.f11do;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11do);
    }
}
