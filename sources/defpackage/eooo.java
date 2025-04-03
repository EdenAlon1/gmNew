package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eooo implements eyge {
    UNKNOWN_WAS_RCS_CONVERSATION(0),
    WAS_RCS_CONVERSATION(1),
    HAS_ALWAYS_BEEN_XMS_CONVERSATION(2);

    public final int d;

    eooo(int i) {
        this.d = i;
    }

    public static eooo b(int i) {
        if (i == 0) {
            return UNKNOWN_WAS_RCS_CONVERSATION;
        }
        if (i == 1) {
            return WAS_RCS_CONVERSATION;
        }
        if (i != 2) {
            return null;
        }
        return HAS_ALWAYS_BEEN_XMS_CONVERSATION;
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
