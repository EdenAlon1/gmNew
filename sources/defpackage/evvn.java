package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evvn implements eygg {
    static final eygg a = new evvn();

    private evvn() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        evvo evvoVar;
        switch (i) {
            case 0:
                evvoVar = evvo.TARGETING_FAILED_REASON_UNKNOWN;
                break;
            case 1:
                evvoVar = evvo.TARGETING_FAILED_REASON_NULL_INPUT_TERM_OR_CONTEXT;
                break;
            case 2:
                evvoVar = evvo.TARGETING_FAILED_REASON_EVENT_COUNT_NOT_IN_RANGE;
                break;
            case 3:
                evvoVar = evvo.TARGETING_FAILED_REASON_MISSING_APP_STATE;
                break;
            case 4:
                evvoVar = evvo.TARGETING_FAILED_REASON_MISSING_APP_STATE_SATISFIED_RANGE;
                break;
            case 5:
                evvoVar = evvo.TARGETING_FAILED_REASON_MISSING_APP_STATE_ELEMENTS_CONTAINED;
                break;
            case 6:
                evvoVar = evvo.TARGETING_FAILED_REASON_APP_STATE_COUNT_NOT_IN_RANGE;
                break;
            case 7:
                evvoVar = evvo.TARGETING_FAILED_REASON_APP_STATE_NOT_MATCHING;
                break;
            case 8:
                evvoVar = evvo.TARGETING_FAILED_REASON_UNKNOWN_APP_STATE_KIND;
                break;
            case 9:
                evvoVar = evvo.TARGETING_FAILED_REASON_INCOMPATIBLE_ANDROID_OR_APP_SDK;
                break;
            case 10:
                evvoVar = evvo.TARGETING_FAILED_REASON_PERMISSION_ALREADY_GRANTED;
                break;
            case 11:
                evvoVar = evvo.TARGETING_FAILED_REASON_REQUEST_COUNT_BOUND_NOT_MET;
                break;
            case 12:
                evvoVar = evvo.TARGETING_FAILED_REASON_UNKNOWN_TARGETING_CLAUSE_TYPE;
                break;
            default:
                evvoVar = null;
                break;
        }
        return evvoVar != null;
    }
}
