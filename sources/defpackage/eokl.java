package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eokl implements eyge {
    UNKNOWN_LATCH_REASON(0),
    DELIVERY_MESSAGE_TIMEOUT(1),
    SEND_MESSAGE_FAILED(2),
    DEBUG_MENU_COMMAND_FAIL_SEND(3),
    MANUAL_RETRY_FORCES_FALLBACK(4),
    DITTO_CHANNEL_RESEND(5),
    RCS_FILE_TRANSFER_METADATA_UPDATE(6),
    SEND_MESSAGE_TIMEOUT_AUTO_FALLBACK(7),
    XMS_IN_RCS_CONVO(8),
    EMERGENCY_RCS_PROTOCOL_DETERMINATION_MESSAGE_FAILED(9);

    public final int k;

    eokl(int i) {
        this.k = i;
    }

    public static eokl b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_LATCH_REASON;
            case 1:
                return DELIVERY_MESSAGE_TIMEOUT;
            case 2:
                return SEND_MESSAGE_FAILED;
            case 3:
                return DEBUG_MENU_COMMAND_FAIL_SEND;
            case 4:
                return MANUAL_RETRY_FORCES_FALLBACK;
            case 5:
                return DITTO_CHANNEL_RESEND;
            case 6:
                return RCS_FILE_TRANSFER_METADATA_UPDATE;
            case 7:
                return SEND_MESSAGE_TIMEOUT_AUTO_FALLBACK;
            case 8:
                return XMS_IN_RCS_CONVO;
            case 9:
                return EMERGENCY_RCS_PROTOCOL_DETERMINATION_MESSAGE_FAILED;
            default:
                return null;
        }
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.k);
    }
}
