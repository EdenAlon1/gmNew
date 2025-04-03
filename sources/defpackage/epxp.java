package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum epxp implements eyge {
    PROCESSING_STEP_UNKNOWN(0),
    PROCESSING_STEP_PRE_WARM(1),
    PROCESSING_STEP_AWAITING_SENDING(2),
    PROCESSING_STEP_FILE_RESIZING(3),
    PROCESSING_STEP_THUMBNAIL_RESIZING(4),
    PROCESSING_STEP_FILE_ENCRYPTION(5),
    PROCESSING_STEP_THUMBNAIL_ENCRYPTION(6),
    PROCESSING_STEP_UPLOAD(7),
    PROCESSING_STEP_SEND(8),
    PROCESSING_STEP_NO_OP(9),
    PROCESSING_STEP_FILE_AND_THUMBNAIL_COMBINER(10),
    PROCESSING_STEP_SEQUENTIAL_PIPELINE(11);

    public final int m;

    epxp(int i) {
        this.m = i;
    }

    public static epxp b(int i) {
        switch (i) {
            case 0:
                return PROCESSING_STEP_UNKNOWN;
            case 1:
                return PROCESSING_STEP_PRE_WARM;
            case 2:
                return PROCESSING_STEP_AWAITING_SENDING;
            case 3:
                return PROCESSING_STEP_FILE_RESIZING;
            case 4:
                return PROCESSING_STEP_THUMBNAIL_RESIZING;
            case 5:
                return PROCESSING_STEP_FILE_ENCRYPTION;
            case 6:
                return PROCESSING_STEP_THUMBNAIL_ENCRYPTION;
            case 7:
                return PROCESSING_STEP_UPLOAD;
            case 8:
                return PROCESSING_STEP_SEND;
            case 9:
                return PROCESSING_STEP_NO_OP;
            case 10:
                return PROCESSING_STEP_FILE_AND_THUMBNAIL_COMBINER;
            case 11:
                return PROCESSING_STEP_SEQUENTIAL_PIPELINE;
            default:
                return null;
        }
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.m;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.m);
    }
}
