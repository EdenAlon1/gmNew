package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eqwy implements eyge {
    CHAT_API_UNKNOWN(0),
    CHAT_API_OK(1),
    CHAT_API_PENDING(2),
    CHAT_API_FAILED_TRANSIENTLY(3),
    CHAT_API_FAILED_PERMANENTLY(4);

    public final int f;

    eqwy(int i) {
        this.f = i;
    }

    public static eqwy b(int i) {
        if (i == 0) {
            return CHAT_API_UNKNOWN;
        }
        if (i == 1) {
            return CHAT_API_OK;
        }
        if (i == 2) {
            return CHAT_API_PENDING;
        }
        if (i == 3) {
            return CHAT_API_FAILED_TRANSIENTLY;
        }
        if (i != 4) {
            return null;
        }
        return CHAT_API_FAILED_PERMANENTLY;
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
