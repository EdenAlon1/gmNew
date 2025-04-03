package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum cxyw implements eyge {
    UNKNOWN(0),
    CONVERSATION(1),
    CONVERSATION_DETAILS(2);

    public final int d;

    cxyw(int i) {
        this.d = i;
    }

    public static cxyw b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return CONVERSATION;
        }
        if (i != 2) {
            return null;
        }
        return CONVERSATION_DETAILS;
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
