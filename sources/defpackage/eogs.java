package defpackage;

import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eogs implements eygg {
    static final eygg a = new eogs();

    private eogs() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        eogt eogtVar;
        switch (i) {
            case -1:
                eogtVar = eogt.TEST_ACTION;
                break;
            case 0:
                eogtVar = eogt.UNKNOWN;
                break;
            case 1:
                eogtVar = eogt.GET_OR_CREATE_CONVERSATION_ACTION;
                break;
            case 2:
                eogtVar = eogt.UPDATE_CONVERSATION_INTERACTIVE_TIMESTAMP_ACTION;
                break;
            case 3:
                eogtVar = eogt.HANDLE_ASSISTANT_REQUESTION_TIMEOUT_ACTION;
                break;
            case 4:
                eogtVar = eogt.REPORT_SPAM_ACTION;
                break;
            case 5:
                eogtVar = eogt.SEND_MESSAGE_ACTION;
                break;
            case 6:
                eogtVar = eogt.READ_DRAFT_ACTION;
                break;
            case 7:
                eogtVar = eogt.HANDLE_LOW_STORAGE_ACTION;
                break;
            case 8:
                eogtVar = eogt.TWINNED_STATUS_CHANGE_ACTION;
                break;
            case 9:
                eogtVar = eogt.PROCESS_USER_ALERT_ACTION;
                break;
            case 10:
                eogtVar = eogt.UPDATE_ATTACHMENT_AFTER_RESIZING_ACTION;
                break;
            case 11:
                eogtVar = eogt.CHANGE_PARTICIPANTS_ACTION;
                break;
            case 12:
                eogtVar = eogt.MIGRATE_BLOCKED_CONTACTS_ACTION;
                break;
            case 13:
                eogtVar = eogt.FIXUP_MESSAGES_ON_STARTUP_ACTION;
                break;
            case 14:
                eogtVar = eogt.DELETE_MESSAGE_ACTION;
                break;
            case 15:
                eogtVar = eogt.REPORT_TO_SPAM_SERVICE_ACTION;
                break;
            case 16:
                eogtVar = eogt.INITIAL_ETOUFFEE_PROVISIONING;
                break;
            case 17:
                eogtVar = eogt.PARTICIPANT_BLOCK_STATUS_REFRESH_ACTION;
                break;
            case 18:
                eogtVar = eogt.RECEIVE_MMS_MESSAGE_ACTION;
                break;
            case 19:
                eogtVar = eogt.PROCESS_INCOMING_RCS_FILE_TRANSFER_COMPLETED_ACTION;
                break;
            case 20:
                eogtVar = eogt.LOG_SCOOBY_METADATA_ACTION;
                break;
            case 21:
                eogtVar = eogt.SEND_MESSAGE_TO_CONVERSATION_OR_PARTICIPANTS_ACTION;
                break;
            case 22:
                eogtVar = eogt.UPDATE_PARTICIPANT_COLOR_ACTION;
                break;
            case 23:
                eogtVar = eogt.PARTICIPANT_FULL_REFRESH_ACTION;
                break;
            case 24:
                eogtVar = eogt.CLEAR_SESSION_IDS_ACTION;
                break;
            case 25:
                eogtVar = eogt.UPDATE_CONVERSATION_ADD_CONTACT_BANNER_STATUS_ACTION;
                break;
            case 26:
                eogtVar = eogt.PROCESS_SETTINGS_UPDATE_ACTION;
                break;
            case 27:
                eogtVar = eogt.UPDATE_CLOUD_SYNC_MESSAGE_ACTION;
                break;
            case 28:
                eogtVar = eogt.CREATE_P2P_CONVERSATION_TRAINING_EXAMPLE_ACTION;
                break;
            case 29:
                eogtVar = eogt.RECEIVE_SMS_MESSAGE_ACTION;
                break;
            case 30:
            default:
                eogtVar = null;
                break;
            case 31:
                eogtVar = eogt.RECEIVE_RCS_FILE_TRANSFER_ACTION;
                break;
            case 32:
                eogtVar = eogt.INSERT_ENRICHED_CALL_ENTRY_ACTION;
                break;
            case 33:
                eogtVar = eogt.REQUEST_MORE_MESSAGES_ACTION;
                break;
            case 34:
                eogtVar = eogt.UPDATE_PARTICIPANT_SPAM_STATUS_ACTION;
                break;
            case 35:
                eogtVar = eogt.PAUSE_RCS_FILE_TRANSFER_ACTION;
                break;
            case 36:
                eogtVar = eogt.RESUME_RCS_FILE_TRANSFER_ACTION;
                break;
            case 37:
                eogtVar = eogt.REFRESH_NOTIFICATION_IF_OTP_FOUND_ACTION;
                break;
            case 38:
                eogtVar = eogt.SYNC_NOTIFICATION_CHANNEL_ACTION;
                break;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                eogtVar = eogt.EXPIRE_WAP_PUSH_SI_MESSAGE_ACTION;
                break;
            case 40:
                eogtVar = eogt.ADD_MEMBERS_TO_RCS_CONVERSATION_ACTION;
                break;
            case 41:
                eogtVar = eogt.INITIATE_CLIENT_SIDE_FALLBACK_ACTION;
                break;
            case 42:
                eogtVar = eogt.REQUEST_MESSAGE_DECORATOR_ACTION;
                break;
            case 43:
                eogtVar = eogt.RECURRING_TELEMETRY_UPLOADER_ACTION;
                break;
            case 44:
                eogtVar = eogt.FORWARD_INCOMING_TYPING_INDICATOR_TO_TACHYON_ACTION;
                break;
            case 45:
                eogtVar = eogt.UPDATE_CONVERSATION_XMS_LATCH_ACTION;
                break;
            case 46:
                eogtVar = eogt.PROCESS_PENDING_MESSAGES_ACTION;
                break;
            case 47:
                eogtVar = eogt.GET_FRECENT_CONVERSATIONS_ACTION;
                break;
            case 48:
                eogtVar = eogt.PROCESS_FILE_TRANSFER_METADATA_UPDATE_ACTION;
                break;
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                eogtVar = eogt.CHECK_PHONE_CONFIG_ACTION;
                break;
            case 50:
                eogtVar = eogt.MARK_AS_READ_ACTION;
                break;
            case 51:
                eogtVar = eogt.GET_MEDIA_DURATION_ACTION;
                break;
            case 52:
                eogtVar = eogt.LEAVE_RCS_CONVERSATION_ACTION;
                break;
            case 53:
                eogtVar = eogt.RECEIVE_CLOUD_SYNC_MESSAGE_ACTION;
                break;
            case 54:
                eogtVar = eogt.SYNC_MESSAGES_ACTION;
                break;
            case 55:
                eogtVar = eogt.LEGACY_GROUP_PROTOCOL_SWITCH_ACTION;
                break;
            case 56:
                eogtVar = eogt.UPDATE_RBM_BOT_PARTICIPANT_ACTION;
                break;
            case 57:
                eogtVar = eogt.DELETE_CONVERSATION_ACTION;
                break;
            case 58:
                eogtVar = eogt.MARK_CONVERSATION_NOT_YET_DELIVERED_ACTION;
                break;
            case 59:
                eogtVar = eogt.PROCESS_FILE_TRANSFER_ACTION;
                break;
            case 60:
                eogtVar = eogt.DOWNLOAD_MMS_ACTION;
                break;
            case 61:
                eogtVar = eogt.RECEIVE_RCS_MESSAGE_ACTION;
                break;
            case 62:
                eogtVar = eogt.RECEIVE_RBM_PAYMENT_RECEIPT_ACTION;
                break;
            case 63:
                eogtVar = eogt.FALLBACK_TO_XMS_ACTION;
                break;
            case 64:
                eogtVar = eogt.RBM_GET_MEDIA_DURATION_ACTION;
                break;
            case 65:
                eogtVar = eogt.UPDATE_CONVERSATION_OPEN_COUNT_ACTION;
                break;
            case 66:
                eogtVar = eogt.LOG_TELEPHONY_DATABASE_ACTION;
                break;
            case 67:
                eogtVar = eogt.CLEAR_CLOUD_SYNC_MESSAGES_ACTION;
                break;
            case 68:
                eogtVar = eogt.UPDATE_PARTICIPANT_RCS_AVAILABLE_ACTION;
                break;
            case 69:
                eogtVar = eogt.SYNC_TELEPHONY_THREADS_ACTION;
                break;
            case 70:
                eogtVar = eogt.UPDATE_MESSAGE_PART_SIZE_ACTION;
                break;
            case 71:
                eogtVar = eogt.WAIT_FOR_RCS_SERVICE_CONNECTION_ACTION;
                break;
            case 72:
                eogtVar = eogt.COMMMIT_PHENOTYPE_ACTION;
                break;
            case 73:
                eogtVar = eogt.MARK_AS_NOTIFIED_ACTION;
                break;
            case 74:
                eogtVar = eogt.PROCESS_PENDING_REVOCATIONS_ACTION;
                break;
            case 75:
                eogtVar = eogt.RECEIVE_WAP_PUSH_SI_MESSAGE_ACTION;
                break;
            case 76:
                eogtVar = eogt.SANITIZE_PARTICIPANTS_ACTION;
                break;
            case 77:
                eogtVar = eogt.UPLOAD_ATTACHMENTS_TO_BLOBSTORE_ACTION;
                break;
            case 78:
                eogtVar = eogt.UPDATE_CONVERSATION_ARCHIVE_STATUS_ACTION;
                break;
            case 79:
                eogtVar = eogt.DELETE_SCRATCH_FILE_ACTION;
                break;
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                eogtVar = eogt.CLEAN_TELEPHONY_RAW_MESSAGES_ACTION;
                break;
            case 81:
                eogtVar = eogt.PAIRED_DESKTOP_SCAN_ACTION;
                break;
            case 82:
                eogtVar = eogt.UPDATE_DESTINATION_BLOCKED_ACTION;
                break;
            case 83:
                eogtVar = eogt.RELOAD_CEQUINT_PARTICIPANT_ACTION;
                break;
            case 84:
                eogtVar = eogt.INSERT_NEW_MESSAGE_ACTION;
                break;
            case 85:
                eogtVar = eogt.WRITE_WATCH_VERSION_ACTION;
                break;
            case 86:
                eogtVar = eogt.RECEIVE_CONVERSATION_SUGGESTIONS_ACTION;
                break;
            case 87:
                eogtVar = eogt.WRITE_DRAFT_MESSAGE_ACTION;
                break;
            case 88:
                eogtVar = eogt.PROCESS_REVOCATION_SENT_ACTION;
                break;
            case 89:
                eogtVar = eogt.REQUEST_P2P_CONVERSATION_SUGGESTIONS_ACTION;
                break;
            case 90:
                eogtVar = eogt.REMOVE_SELF_NUMBER_FROM_CONVERSATIONS_ACTION;
                break;
            case 91:
                eogtVar = eogt.DEFER_BACKGROUND_WORK_ACTION;
                break;
            case 92:
                eogtVar = eogt.UPDATE_RCS_FILE_TRANSFER_PREVIEW_ACTION;
                break;
            case 93:
                eogtVar = eogt.REQUEST_LINK_PREVIEW_ACTION;
                break;
            case 94:
                eogtVar = eogt.PROCESS_CONVERSATION_PARTICIPANTS_UPDATE_ACTION;
                break;
            case 95:
                eogtVar = eogt.PROCESS_CONVERSATION_UPDATE_ACTION;
                break;
            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                eogtVar = eogt.PROCESS_MESSAGE_UPDATE_ACTION;
                break;
            case 97:
                eogtVar = eogt.DUMP_DATABASE_ACTION;
                break;
            case 98:
                eogtVar = eogt.PROCESS_RCS_DELIVERY_REPORT_ACTION;
                break;
            case 99:
                eogtVar = eogt.CHECK_WEARABLE_APP_VERSION_ACTION;
                break;
            case VCardConstants.DEFAULT_PREF /* 100 */:
                eogtVar = eogt.SETUP_EXPRESSIVE_STICKERS_ACTION;
                break;
            case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                eogtVar = eogt.PROCESS_DOWNLOADED_MMS_ACTION;
                break;
            case 102:
                eogtVar = eogt.PROCESS_SENT_MESSAGE_ACTION;
                break;
            case 103:
                eogtVar = eogt.UPDATE_CONVERSATION_SPAM_DISMISS_STATUS_ACTION;
                break;
            case 104:
                eogtVar = eogt.PROCESS_DELIVERY_REPORT_ACTION;
                break;
            case 105:
                eogtVar = eogt.SET_DITTO_SESSION_INACTIVE_ACTION;
                break;
            case 106:
                eogtVar = eogt.PROCESS_EXPRESSIVE_STICKER_FAVORITE_ACTION;
                break;
            case 107:
                eogtVar = eogt.REPLACE_SMS_MESSAGE_ACTION;
                break;
            case 108:
                eogtVar = eogt.SEND_REPORT_ACTION;
                break;
            case 109:
                eogtVar = eogt.UPDATE_CONVERSATION_OPTIONS_ACTION;
                break;
            case 110:
                eogtVar = eogt.UPDATE_CONTACT_DISAMBIGUATION_ACTION;
                break;
            case 111:
                eogtVar = eogt.FILL_PART_SIZE_ACTION;
                break;
            case 112:
                eogtVar = eogt.RESEND_MESSAGE_ACTION;
                break;
            case 113:
                eogtVar = eogt.CHECK_ACTIVE_DESKTOP_IS_ALIVE_ACTION;
                break;
            case 114:
                eogtVar = eogt.REDOWNLOAD_MESSAGE_ACTION;
                break;
            case 115:
                eogtVar = eogt.FIX_CONVERSATION_TYPE_ACTION;
                break;
            case 116:
                eogtVar = eogt.NO_CONFIRMATION_MESSAGE_SEND_ACTION;
                break;
            case 117:
                eogtVar = eogt.FAILED_REPORT_ACTION;
                break;
            case 118:
                eogtVar = eogt.PROCESS_EXPRESSIVE_STICKER_ATTACHMENT_ACTION;
                break;
            case 119:
                eogtVar = eogt.SELF_PARTICIPANTS_REFRESH_ACTION;
                break;
            case 120:
                eogtVar = eogt.UPDATE_UNREAD_COUNTER_ACTION;
                break;
            case 121:
                eogtVar = eogt.REFRESH_STATEFUL_NOTIFICATIONS_ACTION;
                break;
            case 122:
                eogtVar = eogt.SYNC_DATA_TO_WEARABLE_APP_ACTION;
                break;
            case 123:
                eogtVar = eogt.GENERIC_WORKER_QUEUE_ACTION;
                break;
            case 124:
                eogtVar = eogt.REBUILD_SHORTCUTS_ACTION;
                break;
            case 125:
                eogtVar = eogt.PROCESS_TELEPHONY_CHANGE_ACTION;
                break;
            case 126:
                eogtVar = eogt.COUNTRY_CODE_DETECTOR_ACTION;
                break;
            case 127:
                eogtVar = eogt.ENSURE_CONNECTIVITY_STABILIZED_ACTION;
                break;
            case 128:
                eogtVar = eogt.GET_RCS_AVAILABLE_ACTION;
                break;
            case 129:
                eogtVar = eogt.UPLOAD_KEYS_ACTION;
                break;
            case 130:
                eogtVar = eogt.LOG_MESSAGE_SENT_OR_RECEIVED;
                break;
            case 131:
                eogtVar = eogt.INSERT_RCS_MESSAGE_IN_TELEPHONY_ACTION;
                break;
            case 132:
                eogtVar = eogt.RESET_GROUP_RCS_SESSION_ID_ACTION;
                break;
            case 133:
                eogtVar = eogt.HANDLE_INCOMING_RCS_GROUP_CHAT_INVITATION_ACTION;
                break;
            case 134:
                eogtVar = eogt.INITIALIZE_P2P_CONVERSATION_TRAINING_ACTION;
                break;
            case 135:
                eogtVar = eogt.MIGRATE_RCS_CONFERENCE_INFO_INTO_BUGLE_DB_ACTION;
                break;
            case 136:
                eogtVar = eogt.HANDLE_RCS_GROUP_NOTIFY_UPDATE_ACTION;
                break;
            case 137:
                eogtVar = eogt.DO_NOTHING_ACTION;
                break;
        }
        return eogtVar != null;
    }
}
