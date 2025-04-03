package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum ezaa implements eyge {
    DNS_QUERY_TYPE_UNKNOWN(0),
    DNS_QUERY_TYPE_NAPTR(1),
    DNS_QUERY_TYPE_SRV(2),
    DNS_QUERY_TYPE_A(3),
    DNS_QUERY_TYPE_AAAA(4);

    public final int f;

    ezaa(int i) {
        this.f = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
