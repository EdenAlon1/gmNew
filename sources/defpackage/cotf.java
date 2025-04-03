package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public enum cotf implements eyge {
    FALLBACK_UNKNOWN(0),
    FALLBACK_DEFAULT(1),
    FALLBACK_REQUIRED(2),
    FALLBACK_NOT_ALLOWED(3);

    public final int e;

    cotf(int i) {
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
