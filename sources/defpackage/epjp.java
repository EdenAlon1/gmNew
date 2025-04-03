package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum epjp implements eyge {
    UNKNOWN_REPLY_MODE(0),
    REPLY(1),
    CONTINUATION(2);

    public final int d;

    epjp(int i) {
        this.d = i;
    }

    public static epjp b(int i) {
        if (i == 0) {
            return UNKNOWN_REPLY_MODE;
        }
        if (i == 1) {
            return REPLY;
        }
        if (i != 2) {
            return null;
        }
        return CONTINUATION;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
