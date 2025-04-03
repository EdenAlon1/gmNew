package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eyyh implements eyge {
    AUTHENTICATION_TYPE_UNKNOWN(0),
    AUTHENTICATION_TYPE_NONE(1),
    AUTHENTICATION_TYPE_BASIC(2),
    AUTHENTICATION_TYPE_DIGEST(3),
    AUTHENTICATION_TYPE_GBA(4);

    public final int f;

    eyyh(int i) {
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
