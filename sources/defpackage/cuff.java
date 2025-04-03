package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum cuff implements eyge {
    SUBSCRIPTION_ACTION_TYPE_UNSPECIFIED(0),
    SUBSCRIBE(1),
    UNSUBSCRIBE(2),
    UNRECOGNIZED(-1);

    private final int f;

    cuff(int i) {
        this.f = i;
    }

    public static cuff b(int i) {
        if (i == 0) {
            return SUBSCRIPTION_ACTION_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return SUBSCRIBE;
        }
        if (i != 2) {
            return null;
        }
        return UNSUBSCRIBE;
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
