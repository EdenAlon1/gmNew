package defpackage;

import android.database.sqlite.SQLiteException;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.navigation.model.Maneuver;
import io.grpc.Status;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axdy {
    public static epeg a(Throwable th) {
        return (!(th instanceof ExecutionException) || th.getCause() == null) ? b(th) : b(th.getCause());
    }

    private static epeg b(Throwable th) {
        if (th instanceof IllegalArgumentException) {
            return epeg.ILLEGAL_ARGUMENT;
        }
        if (th instanceof IllegalStateException) {
            return epeg.ILLEGAL_STATE;
        }
        if (th instanceof UnsupportedOperationException) {
            return epeg.UNSUPPORTED_OPERATION;
        }
        if (th instanceof NullPointerException) {
            return epeg.NULL_POINTER;
        }
        if (th instanceof fedn) {
            Status.Code code = Status.Code.OK;
            fawk fawkVar = fawk.BAD_URL;
            int ordinal = ((fedn) th).a.getCode().ordinal();
            return ordinal != 3 ? ordinal != 4 ? ordinal != 5 ? ordinal != 6 ? ordinal != 7 ? ordinal != 9 ? ordinal != 16 ? ordinal != 13 ? ordinal != 14 ? epeg.SERVER_STATUS_OTHER : epeg.SERVER_STATUS_UNAVAILABLE : epeg.SERVER_STATUS_INTERNAL : epeg.SERVER_STATUS_UNAUTHENTICATED : epeg.SERVER_STATUS_FAILED_PRECONDITION : epeg.SERVER_STATUS_PERMISSION_DENIED : epeg.SERVER_STATUS_ALREADY_EXISTS : epeg.SERVER_STATUS_NOT_FOUND : epeg.SERVER_STATUS_DEADLINE_EXCEEDED : epeg.SERVER_STATUS_INVALID_ARGUMENT;
        }
        if (th instanceof SQLiteException) {
            return epeg.SQLITE_EXCEPTION;
        }
        if (!(th instanceof csgy)) {
            if (th instanceof ExecutionException) {
                return epeg.EXECUTION_EXCEPTION;
            }
            if (!(th instanceof fawl)) {
                return epeg.INTERNAL;
            }
            Status.Code code2 = Status.Code.OK;
            fawk fawkVar2 = fawk.BAD_URL;
            int ordinal2 = ((fawl) th).a.ordinal();
            if (ordinal2 == 0) {
                return epeg.MEDIA_UPLOAD_TRANSFER_EXCEPTION_BAD_URL;
            }
            if (ordinal2 == 1) {
                return epeg.MEDIA_UPLOAD_TRANSFER_EXCEPTION_CANCELED;
            }
            if (ordinal2 == 2) {
                return epeg.MEDIA_UPLOAD_TRANSFER_EXCEPTION_REQUEST_BODY_READ_ERROR;
            }
            if (ordinal2 == 3) {
                return epeg.MEDIA_UPLOAD_TRANSFER_EXCEPTION_CONNECTION_ERROR;
            }
            if (ordinal2 == 4) {
                return epeg.MEDIA_UPLOAD_TRANSFER_EXCEPTION_SERVER_ERROR;
            }
            if (ordinal2 == 5) {
                return epeg.INTERNAL;
            }
            throw new AssertionError("should not reach here.");
        }
        Status.Code code3 = Status.Code.OK;
        fawk fawkVar3 = fawk.BAD_URL;
        int i = ((csgy) th).c;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 0:
                return epeg.ACCOUNT_NOT_LINKED;
            case 1:
                return epeg.CMS_CIPHER_EXCEPTION;
            case 2:
                return epeg.SMS_NOTIFICATION_NOT_FOUND;
            case 3:
                return epeg.MMS_NOTIFICATION_NOT_FOUND;
            case 4:
                return epeg.MMS_TRANSACTION_ID_FORMAT;
            case 5:
                return epeg.CMS_DEVICE_NOT_ALLOWED;
            case 6:
                return epeg.BACKUP_ITEM_SKIPPED;
            case 7:
                return epeg.BACKUP_ITEM_SKIPPED_EMPTY;
            case 8:
                return epeg.BACKUP_ITEM_SKIPPED_EXCLUDED;
            case 9:
                return epeg.BACKUP_ITEM_FAILED_REQUEST_VALIDATION;
            case 10:
                return epeg.LOCAL_ROW_MISSING;
            case 11:
                return epeg.CMS_DEPENDENCY_MISSING;
            case 12:
                return epeg.BACKUP_REACHES_MAX_RETRY;
            case 13:
                return epeg.CMS_ID_SAVE_FAILURE;
            case 14:
                return epeg.CMS_ENTITY_ALREADY_EXISTS;
            case 15:
                return epeg.WORK_ITEM_ID_MISSING;
            case 16:
                return epeg.PARTICIPANT_HAS_EMPTY_NORM_DEST;
            case 17:
                return epeg.PARTICIPANT_HAS_EMPTY_NORM_AND_SEND_DEST;
            case 18:
                return epeg.PARTICIPANT_LIST_DOES_NOT_MATCH_CONVERSATION_ID;
            case 19:
                return epeg.PARTICIPANT_LIST_DOES_NOT_MATCH_CONVERSATION_CORRELATION_ID;
            case 20:
                return epeg.CONVERSATION_RCS_GROUP_ID_IS_NULL;
            case 21:
                return epeg.BACKUP_ENCOUNTERED_FORKED_CONVERSATION;
            case 22:
                return epeg.UPDATE_CONVERSATION_ALREADY_EXISTS;
            case 23:
                return epeg.FOUND_NO_SELF_PARTICIPANT;
            case 24:
                return epeg.SERVER_RETURNED_INCOMPLETE_DATA_FOR_BATCH;
            case 25:
                return epeg.EXISTING_ID_LOOKUP_FAILED;
            case 26:
                return epeg.EXISTING_CONVERSATION_ID_LOOKUP_FAILED;
            case 27:
                return epeg.OPT_IN_STEP_IS_UNSPECIFIED;
            case 28:
                return epeg.OPT_IN_INVALID_FEATURE_STATE;
            case 29:
                return epeg.OPT_IN_STEP_NOT_FOUND;
            case 30:
                return epeg.OPT_IN_STEP_EXCEEDS_MAX_RETRY;
            case 31:
                return epeg.OPT_IN_STEP_NOT_HAVE_FEATURE;
            case 32:
                return epeg.OPT_IN_STEP_HAS_UNDEFINED_FEATURE;
            case 33:
                return epeg.OPT_OUT_STEP_IS_UNSPECIFIED;
            case 34:
                return epeg.OPT_OUT_INVALID_FEATURE_STATE;
            case 35:
                return epeg.OPT_OUT_STEP_NOT_FOUND;
            case 36:
                return epeg.OPT_OUT_STEP_EXCEEDS_MAX_RETRY;
            case 37:
                return epeg.OPT_OUT_STEP_NOT_HAVE_FEATURE;
            case 38:
                return epeg.OPT_OUT_STEP_HAS_UNDEFINED_FEATURE;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                return epeg.MESSAGE_MODEL_MISSING;
            case 40:
                return epeg.FREQ_CHANGED_MESSAGE_FIELDS_MISSING;
            case 41:
                return epeg.CMS_DECRYPTION_EXCEPTION;
            case 42:
                return epeg.INVALID_PROTO;
            case 43:
                return epeg.SQLITE_EXCEPTION;
            case 44:
                return epeg.RESTORE_EMPTY_CMS_ID;
            case 45:
                return epeg.BACKUP_KEY_NOT_FOUND;
            case 46:
                return epeg.ENCRYPTION_KEY_NOT_FOUND;
            case 47:
                return epeg.ENCRYPTION_KEY_NOT_FOUND_FROM_CACHE_WHEN_DECRYPT;
            case 48:
                return epeg.ENCRYPTION_KEY_NOT_FOUND_WHEN_CREATE_CACHE;
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                return epeg.ENCRYPTION_KEY_NOT_FOUND_INITIAL_BACKUP;
            case 50:
                return epeg.ENCRYPTION_KEY_NOT_FOUND_INCREMENTAL_BACKUP;
            case 51:
                return epeg.RESTORE_CONV_MISSING_RCS_GRP_CONTRIBUTION_ID;
            case 52:
                return epeg.RESTORE_CONV_WRONG_CODE_PATH;
            case 53:
                return epeg.RESTORE_CONV_CONVERSATION_WITH_EMPTY_PARTICIPANTS;
            case 54:
                return epeg.RESTORE_CONV_PARTICIPANT_NOT_FOUND;
            case 55:
                return epeg.RESTORE_CONV_EMPTY_NORMALIZED_DESTINATION;
            case 56:
                return epeg.RESTORE_MSG_EMPTY_TELEPHONY_URI;
            case 57:
                return epeg.RESTORE_MSG_MSG_WITH_TELEPHONY_URI_NOT_FOUND;
            case 58:
                return epeg.RESTORE_MSG_CONVERSATION_MISSING;
            case 59:
                return epeg.RESTORE_MSG_DUPLICATE_MSG_ID_MISSING;
            case 60:
                return epeg.RESTORE_MSG_PARTICIPANT_MISSING;
            case 61:
                return epeg.RESTORE_MSG_SMS_WITH_EMPTY_TEXT;
            case 62:
                return epeg.RESTORE_MSG_MMS_TEXT_WITH_EMPTY_TEXT;
            case 63:
                return epeg.RESTORE_MSG_DELETE_FAILED_BEFORE_INSERT;
            case 64:
                return epeg.RESTORE_MSG_DELETE_FAILED_AFTER_INSERT;
            case 65:
                return epeg.RESTORE_MSG_TELEPHONY_INSERT_FAILURE;
            case 66:
                return epeg.KEY_SYNC_STEP_NOT_FOUND;
            case 67:
                return epeg.KEY_SYNC_STEP_IS_UNSPECIFIED;
            case 68:
                return epeg.KEY_SYNC_STEP_EXCEEDS_MAX_RETRY;
            case 69:
                return epeg.KEY_SYNC_KEY_NOT_READY_BEFORE_SYNC;
            case 70:
                return epeg.KEY_SYNC_MORE_THAN_ONE_KEY;
            case 71:
                return epeg.KEY_SYNC_NO_HANDLER;
            case 72:
                return epeg.KEY_SYNC_NO_FOLSOM_KEYS;
            case 73:
                return epeg.KEY_SYNC_CANNOT_INSTANTIATE_GMS_CRYPTOR;
            case 74:
                return epeg.KEY_SYNC_NO_BACKUP_KEY;
            case 75:
                return epeg.KEY_SYNC_FAILED_TO_ENCRYPT_BACKUP_KEY;
            case 76:
                return epeg.NO_SQS_STORAGE_QUOTA_FOR_MEDIA;
            case 77:
                return epeg.NO_SQS_STORAGE_QUOTA_FOR_COMPRESSED_IMAGE;
            case 78:
                return epeg.RESTORE_MSG_BUGLEDB_BULK_INSERT_MESSAGE_IDS_FAILURE;
            case 79:
                return epeg.RESTORE_MSG_BUGLEDB_BULK_INSERT_PART_IDS_FAILURE;
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                return epeg.RESTORE_MSG_BUGLEDB_BULK_INSERT_PART_IDS_LENGTH_FAILURE;
            case 81:
                return epeg.KEY_D2D_RESTORE_LOCAL_DELETE_FAILURE;
            case 82:
                return epeg.PARTICIPANT_D2D_RESTORE_LOCAL_DELETE_FAILURE;
            case 83:
                return epeg.CONVERSATION_D2D_RESTORE_LOCAL_DELETE_FAILURE;
            case 84:
                return epeg.MESSAGE_D2D_RESTORE_LOCAL_DELETE_FAILURE;
            case 85:
                return epeg.PAGE_TOKEN_CYCLE_EXCEPTION;
            default:
                throw new IllegalArgumentException("Code not expected to exit exhaustive switch statement");
        }
    }
}
