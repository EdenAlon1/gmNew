package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eswj implements eyge {
    BOX_RESET_EVENT_TYPE_UNSPECIFIED(0),
    RESET_ALL_RESOURCES(1),
    RECOVER_ALL_RESOURCES(2),
    UNRECOGNIZED(-1);

    private final int f;

    eswj(int i) {
        this.f = i;
    }

    public static eswj b(int i) {
        if (i == 0) {
            return BOX_RESET_EVENT_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return RESET_ALL_RESOURCES;
        }
        if (i != 2) {
            return null;
        }
        return RECOVER_ALL_RESOURCES;
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
