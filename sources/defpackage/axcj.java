package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum axcj implements eyge {
    CONVERSATION_CLASSIFICATION_STATE_UNSPECIFIED(0),
    CONVERSATION_CLASSIFICATION_STATE_GENERATED(1),
    CONVERSATION_CLASSIFICATION_STATE_DISMISSED(2),
    UNRECOGNIZED(-1);

    private final int f;

    axcj(int i) {
        this.f = i;
    }

    public static axcj b(int i) {
        if (i == 0) {
            return CONVERSATION_CLASSIFICATION_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return CONVERSATION_CLASSIFICATION_STATE_GENERATED;
        }
        if (i != 2) {
            return null;
        }
        return CONVERSATION_CLASSIFICATION_STATE_DISMISSED;
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
