package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum csmu implements eyge {
    SUBSCRIPTION_TYPE_UNSPECIFIED(0),
    DEFAULT_SYSTEM_SUBSCRIPTION(1),
    ALL_ACTIVE_SUBSCRIPTIONS(2),
    SPECIFIED_SUBSCRIPTION(3);

    public final int e;

    csmu(int i) {
        this.e = i;
    }

    public static csmu b(int i) {
        if (i == 0) {
            return SUBSCRIPTION_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return DEFAULT_SYSTEM_SUBSCRIPTION;
        }
        if (i == 2) {
            return ALL_ACTIVE_SUBSCRIPTIONS;
        }
        if (i != 3) {
            return null;
        }
        return SPECIFIED_SUBSCRIPTION;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
