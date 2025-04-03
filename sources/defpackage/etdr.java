package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etdr {
    public static /* synthetic */ String a(int i) {
        switch (i) {
            case 2:
                return "PENPAL_REASON_CODE_DEFAULT";
            case 3:
                return "ALS_EXCEPTION";
            case 4:
                return "ALS_FALLBACK";
            case 5:
                return "ALS_ALL_RESPONSES_FILTERED";
            case 6:
                return "ALS_EMPTY_RESPONSE";
            case 7:
                return "INPUT_FILTERED";
            case 8:
                return "ALS_OUTPUT_INCORRECT_RESPONSE_FORMAT";
            case 9:
                return "ALS_OUTPUT_BLOCKED_BY_ALS_BLOCKLIST";
            case 10:
                return "ALS_OUTPUT_BLOCKED_BY_PENPAL_SAFETY_BLOCKLIST";
            case 11:
                return "INPUT_BLOCKED_BY_PENPAL_SAFETY_BLOCKLIST";
            case 12:
                return "SERVER_THROTTLED";
            case 13:
                return "INPUT_BLOCKED_FORBIDDEN_LANGUAGE";
            default:
                return "UNRECOGNIZED";
        }
    }

    public static int b(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int c(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            case 10:
                return 12;
            case 11:
                return 13;
            default:
                return 0;
        }
    }
}
