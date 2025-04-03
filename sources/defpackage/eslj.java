package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eslj implements eyge {
    NONE(0),
    UKEY2_ALERT_ERROR(1),
    REQUEST_OUT_OF_DATE(2),
    REQUEST_NOT_RECEIVED_QUICKLY(3),
    INVALID_USER(4),
    WRONG_VERIFICATION_CODE_SELECTED(5),
    VERIFICATION_TIMED_OUT(6),
    USER_CANCELED_VERIFICATION(7),
    UKEY2_OTHER_ERROR(8),
    VERIFICATION_EMOJI_DOWNLOAD_FAILED(9),
    NOT_LATEST_ATTEMPT(10),
    VERIFICATION_DATA_SERVICE_NOT_PRESENT(11),
    VERIFICATION_INTENTS_NOT_PRESENT(12),
    WRONG_UKEY2_MESSAGE_TYPE(13),
    REQUEST_COMPLETE_WITH_UNKNOWN_RESULT(14),
    PHONE_NOT_AWAITING_CONFIRMATION(15),
    UKEY2_MESSAGE_MISSING(16),
    CLIENT_INIT_TIMEOUT(17),
    CLIENT_FINISHED_TIMEOUT(18),
    UNKNOWN(19),
    WEB_CANCEL_BUTTON_CLICKED(20),
    WEB_BACK_BUTTON_CLICKED(21),
    WEB_LEAVE_PAIR_PAGE(22),
    NEW_REQUEST_WHILE_WAITING_FOR_VERIFICATION(23),
    UKEY2_HANDSHAKE_ERROR(24),
    VERIFICATION_CODE_REVISION_MISMATCH(25),
    USER_CANCELED_VERIFICATION_ON_WEB(26),
    USER_DENIED_VERIFICATION_NOT_ME(27),
    KEY_DERIVATION_REVISION_MISMATCH(28),
    CMS_BACKUP_KEY_NOT_FOUND(29),
    UNABLE_TO_ENCRYPT_CMS_BACKUP_KEY(30),
    UNABLE_TO_DECRYPT_CMS_BACKUP_KEY(31),
    UNRECOGNIZED(-1);

    private final int I;

    eslj(int i) {
        this.I = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.I;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
