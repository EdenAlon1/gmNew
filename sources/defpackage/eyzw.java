package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eyzw implements eyge {
    DNS_FAILURE_TYPE_UNKNOWN(0),
    DNS_FAILURE_TYPE_GENERIC(1),
    DNS_FAILURE_TYPE_HOST_NOT_FOUND(2),
    DNS_FAILURE_TYPE_QUERY_TYPE_NOT_FOUND(3),
    DNS_FAILURE_TYPE_TRANSIENT(4),
    DNS_FAILURE_TYPE_CLIENT_EXCEPTION(5);

    public final int g;

    eyzw(int i) {
        this.g = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
