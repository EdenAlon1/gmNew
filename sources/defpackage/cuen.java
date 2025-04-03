package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum cuen implements eyge {
    CONVERSATION_TOOLSTONE_STATE_UNSPECIFIED(0),
    HIDE(1),
    SHOW(2),
    UNRECOGNIZED(-1);

    private final int f;

    cuen(int i) {
        this.f = i;
    }

    public static cuen b(int i) {
        if (i == 0) {
            return CONVERSATION_TOOLSTONE_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return HIDE;
        }
        if (i != 2) {
            return null;
        }
        return SHOW;
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
