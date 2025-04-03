package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eyzt implements eyge {
    DNS_CLIENT_EXCEPTION_TYPE_UNKNOWN(0),
    DNS_CLIENT_EXCEPTION_TYPE_CLASS_CAST(1),
    DNS_CLIENT_EXCEPTION_TYPE_TEXT_PARSE(2),
    DNS_CLIENT_EXCEPTION_TYPE_EXCEPTION_IN_INITIALIZATION_ERROR(3),
    DNS_CLIENT_EXCEPTION_TYPE_NO_CLASS_DEF_FOUND_ERROR(4),
    DNS_CLIENT_EXCEPTION_TYPE_RUNTIME(5);

    public final int g;

    eyzt(int i) {
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
