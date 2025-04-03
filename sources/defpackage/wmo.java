package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wmo {
    public static final eqsn a(Throwable th) {
        return th instanceof aizg ? eqsn.MAGIC_COMPOSE_FILTERED_BY_SAFETY_BLOCKLIST : ((th instanceof aiye) || (th instanceof aiyd)) ? eqsn.MAGIC_COMPOSE_COULD_NOT_GENERATE_RESULTS : th instanceof aize ? eqsn.MAGIC_COMPOSE_NETWORK_UNAVAILABLE_STATUS : th instanceof aizj ? eqsn.MAGIC_COMPOSE_SEVER_ERROR_STATUS : th instanceof aizi ? eqsn.MAGIC_COMPOSE_RATE_LIMITED_STATUS : th instanceof aiyf ? eqsn.MAGIC_COMPOSE_DEADLINE_EXCEEDED_STATUS : th instanceof aizm ? eqsn.MAGIC_COMPOSE_UNAUTHORIZED_STATUS : th instanceof aizn ? eqsn.MAGIC_COMPOSE_UNKNOWN_STATUS : th instanceof aizk ? eqsn.MAGIC_COMPOSE_SERVER_THROTTLED : th instanceof aiyi ? eqsn.MAGIC_COMPOSE_FEATURE_DOWNLOADING : eqsn.MAGIC_COMPOSE_ERROR_SUB_TYPE_UNSPECIFIED;
    }

    public static final int b(Throwable th) {
        if (th instanceof aizf) {
            return 2;
        }
        return ((th instanceof aizl) || (th instanceof aiyi)) ? 3 : 1;
    }
}
