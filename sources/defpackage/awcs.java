package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awcs {
    public static final epxp a(awcr awcrVar) {
        epxp epxpVar;
        awcrVar.getClass();
        switch (awcrVar.ordinal()) {
            case 0:
                epxpVar = epxp.PROCESSING_STEP_PRE_WARM;
                break;
            case 1:
                epxpVar = epxp.PROCESSING_STEP_AWAITING_SENDING;
                break;
            case 2:
                epxpVar = epxp.PROCESSING_STEP_FILE_RESIZING;
                break;
            case 3:
                epxpVar = epxp.PROCESSING_STEP_THUMBNAIL_RESIZING;
                break;
            case 4:
                epxpVar = epxp.PROCESSING_STEP_FILE_ENCRYPTION;
                break;
            case 5:
                epxpVar = epxp.PROCESSING_STEP_THUMBNAIL_ENCRYPTION;
                break;
            case 6:
                epxpVar = epxp.PROCESSING_STEP_UPLOAD;
                break;
            case 7:
                epxpVar = epxp.PROCESSING_STEP_SEND;
                break;
            case 8:
                epxpVar = epxp.PROCESSING_STEP_NO_OP;
                break;
            case 9:
                epxpVar = epxp.PROCESSING_STEP_FILE_AND_THUMBNAIL_COMBINER;
                break;
            case 10:
                epxpVar = epxp.PROCESSING_STEP_SEQUENTIAL_PIPELINE;
                break;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(awcrVar.toString()));
        }
        epxpVar.getClass();
        return epxpVar;
    }
}
