package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum awyd implements eyge {
    RECOVERY_STRATEGY_UNSPECIFIED(0),
    RECOVERY_STRATEGY_NONE(1),
    RECOVERY_STRATEGY_REFRESH_REGISTRATION(2),
    RECOVERY_STRATEGY_REPROVISION(3),
    RECOVERY_STRATEGY_RECREATE_GROUP(4),
    RECOVERY_STRATEGY_INVALIDATE_CAPABILITIES_CACHE(5);

    public final int g;

    awyd(int i) {
        this.g = i;
    }

    public static awyd b(int i) {
        if (i == 0) {
            return RECOVERY_STRATEGY_UNSPECIFIED;
        }
        if (i == 1) {
            return RECOVERY_STRATEGY_NONE;
        }
        if (i == 2) {
            return RECOVERY_STRATEGY_REFRESH_REGISTRATION;
        }
        if (i == 3) {
            return RECOVERY_STRATEGY_REPROVISION;
        }
        if (i == 4) {
            return RECOVERY_STRATEGY_RECREATE_GROUP;
        }
        if (i != 5) {
            return null;
        }
        return RECOVERY_STRATEGY_INVALIDATE_CAPABILITIES_CACHE;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
