package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eqsn implements eyge {
    MAGIC_COMPOSE_ERROR_SUB_TYPE_UNSPECIFIED(0),
    MAGIC_COMPOSE_FILTERED_BY_SAFETY_BLOCKLIST(1),
    MAGIC_COMPOSE_COULD_NOT_GENERATE_RESULTS(2),
    MAGIC_COMPOSE_NETWORK_UNAVAILABLE_STATUS(3),
    MAGIC_COMPOSE_SEVER_ERROR_STATUS(4),
    MAGIC_COMPOSE_RATE_LIMITED_STATUS(5),
    MAGIC_COMPOSE_DEADLINE_EXCEEDED_STATUS(6),
    MAGIC_COMPOSE_UNAUTHORIZED_STATUS(7),
    MAGIC_COMPOSE_UNKNOWN_STATUS(8),
    MAGIC_COMPOSE_SERVER_THROTTLED(9),
    MAGIC_COMPOSE_MAGIC_REWRITE_WITHOUT_DRAFT(10),
    MAGIC_COMPOSE_FEATURE_DOWNLOADING(11);

    public final int m;

    eqsn(int i) {
        this.m = i;
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
