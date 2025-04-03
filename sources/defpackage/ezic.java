package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum ezic implements eyge {
    CUSTOM_STORAGE_TYPE_UNKNOWN(0),
    CUSTOM_STORAGE_TYPE_PROTODATASTORE(1),
    CUSTOM_STORAGE_TYPE_GDD(2);

    private final int e;

    ezic(int i) {
        this.e = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
