package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
class dvdb extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        evvo evvoVar = (evvo) obj;
        switch (evvoVar) {
            case TARGETING_FAILED_REASON_UNKNOWN:
                return eycp.TARGETING_FAILED_REASON_UNKNOWN;
            case TARGETING_FAILED_REASON_NULL_INPUT_TERM_OR_CONTEXT:
                return eycp.TARGETING_FAILED_REASON_NULL_INPUT_TERM_OR_CONTEXT;
            case TARGETING_FAILED_REASON_UNKNOWN_TARGETING_CLAUSE_TYPE:
                return eycp.TARGETING_FAILED_REASON_UNKNOWN_TARGETING_CLAUSE_TYPE;
            case TARGETING_FAILED_REASON_EVENT_COUNT_NOT_IN_RANGE:
                return eycp.TARGETING_FAILED_REASON_EVENT_COUNT_NOT_IN_RANGE;
            case TARGETING_FAILED_REASON_MISSING_APP_STATE:
                return eycp.TARGETING_FAILED_REASON_MISSING_APP_STATE;
            case TARGETING_FAILED_REASON_MISSING_APP_STATE_SATISFIED_RANGE:
                return eycp.TARGETING_FAILED_REASON_MISSING_APP_STATE_SATISFIED_RANGE;
            case TARGETING_FAILED_REASON_MISSING_APP_STATE_ELEMENTS_CONTAINED:
                return eycp.TARGETING_FAILED_REASON_MISSING_APP_STATE_ELEMENTS_CONTAINED;
            case TARGETING_FAILED_REASON_APP_STATE_COUNT_NOT_IN_RANGE:
                return eycp.TARGETING_FAILED_REASON_APP_STATE_COUNT_NOT_IN_RANGE;
            case TARGETING_FAILED_REASON_APP_STATE_NOT_MATCHING:
                return eycp.TARGETING_FAILED_REASON_APP_STATE_NOT_MATCHING;
            case TARGETING_FAILED_REASON_UNKNOWN_APP_STATE_KIND:
                return eycp.TARGETING_FAILED_REASON_UNKNOWN_APP_STATE_KIND;
            case TARGETING_FAILED_REASON_INCOMPATIBLE_ANDROID_OR_APP_SDK:
                return eycp.TARGETING_FAILED_REASON_INCOMPATIBLE_ANDROID_OR_APP_SDK;
            case TARGETING_FAILED_REASON_PERMISSION_ALREADY_GRANTED:
                return eycp.TARGETING_FAILED_REASON_PERMISSION_ALREADY_GRANTED;
            case TARGETING_FAILED_REASON_REQUEST_COUNT_BOUND_NOT_MET:
                return eycp.TARGETING_FAILED_REASON_REQUEST_COUNT_BOUND_NOT_MET;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(evvoVar.toString()));
        }
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        eycp eycpVar = (eycp) obj;
        switch (eycpVar) {
            case TARGETING_FAILED_REASON_UNKNOWN:
                return evvo.TARGETING_FAILED_REASON_UNKNOWN;
            case TARGETING_FAILED_REASON_NULL_INPUT_TERM_OR_CONTEXT:
                return evvo.TARGETING_FAILED_REASON_NULL_INPUT_TERM_OR_CONTEXT;
            case TARGETING_FAILED_REASON_UNKNOWN_TARGETING_CLAUSE_TYPE:
                return evvo.TARGETING_FAILED_REASON_UNKNOWN_TARGETING_CLAUSE_TYPE;
            case TARGETING_FAILED_REASON_EVENT_COUNT_NOT_IN_RANGE:
                return evvo.TARGETING_FAILED_REASON_EVENT_COUNT_NOT_IN_RANGE;
            case TARGETING_FAILED_REASON_MISSING_APP_STATE:
                return evvo.TARGETING_FAILED_REASON_MISSING_APP_STATE;
            case TARGETING_FAILED_REASON_MISSING_APP_STATE_SATISFIED_RANGE:
                return evvo.TARGETING_FAILED_REASON_MISSING_APP_STATE_SATISFIED_RANGE;
            case TARGETING_FAILED_REASON_MISSING_APP_STATE_ELEMENTS_CONTAINED:
                return evvo.TARGETING_FAILED_REASON_MISSING_APP_STATE_ELEMENTS_CONTAINED;
            case TARGETING_FAILED_REASON_APP_STATE_COUNT_NOT_IN_RANGE:
                return evvo.TARGETING_FAILED_REASON_APP_STATE_COUNT_NOT_IN_RANGE;
            case TARGETING_FAILED_REASON_APP_STATE_NOT_MATCHING:
                return evvo.TARGETING_FAILED_REASON_APP_STATE_NOT_MATCHING;
            case TARGETING_FAILED_REASON_UNKNOWN_APP_STATE_KIND:
                return evvo.TARGETING_FAILED_REASON_UNKNOWN_APP_STATE_KIND;
            case TARGETING_FAILED_REASON_INCOMPATIBLE_ANDROID_OR_APP_SDK:
                return evvo.TARGETING_FAILED_REASON_INCOMPATIBLE_ANDROID_OR_APP_SDK;
            case TARGETING_FAILED_REASON_PERMISSION_ALREADY_GRANTED:
                return evvo.TARGETING_FAILED_REASON_PERMISSION_ALREADY_GRANTED;
            case TARGETING_FAILED_REASON_REQUEST_COUNT_BOUND_NOT_MET:
                return evvo.TARGETING_FAILED_REASON_REQUEST_COUNT_BOUND_NOT_MET;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(eycpVar.toString()));
        }
    }
}
