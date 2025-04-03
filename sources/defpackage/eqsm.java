package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eqsm implements eygg {
    static final eygg a = new eqsm();

    private eqsm() {
    }

    @Override // defpackage.eygg
    public final boolean a(int i) {
        eqsn eqsnVar;
        switch (i) {
            case 0:
                eqsnVar = eqsn.MAGIC_COMPOSE_ERROR_SUB_TYPE_UNSPECIFIED;
                break;
            case 1:
                eqsnVar = eqsn.MAGIC_COMPOSE_FILTERED_BY_SAFETY_BLOCKLIST;
                break;
            case 2:
                eqsnVar = eqsn.MAGIC_COMPOSE_COULD_NOT_GENERATE_RESULTS;
                break;
            case 3:
                eqsnVar = eqsn.MAGIC_COMPOSE_NETWORK_UNAVAILABLE_STATUS;
                break;
            case 4:
                eqsnVar = eqsn.MAGIC_COMPOSE_SEVER_ERROR_STATUS;
                break;
            case 5:
                eqsnVar = eqsn.MAGIC_COMPOSE_RATE_LIMITED_STATUS;
                break;
            case 6:
                eqsnVar = eqsn.MAGIC_COMPOSE_DEADLINE_EXCEEDED_STATUS;
                break;
            case 7:
                eqsnVar = eqsn.MAGIC_COMPOSE_UNAUTHORIZED_STATUS;
                break;
            case 8:
                eqsnVar = eqsn.MAGIC_COMPOSE_UNKNOWN_STATUS;
                break;
            case 9:
                eqsnVar = eqsn.MAGIC_COMPOSE_SERVER_THROTTLED;
                break;
            case 10:
                eqsnVar = eqsn.MAGIC_COMPOSE_MAGIC_REWRITE_WITHOUT_DRAFT;
                break;
            case 11:
                eqsnVar = eqsn.MAGIC_COMPOSE_FEATURE_DOWNLOADING;
                break;
            default:
                eqsnVar = null;
                break;
        }
        return eqsnVar != null;
    }
}
