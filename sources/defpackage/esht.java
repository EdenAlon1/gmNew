package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum esht implements eyge {
    CONVERSATION_SEND_MODE_AUTO(0),
    CONVERSATION_SEND_MODE_XMS(1),
    CONVERSATION_SEND_MODE_XMS_LATCH(2),
    UNRECOGNIZED(-1);

    private final int f;

    esht(int i) {
        this.f = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
