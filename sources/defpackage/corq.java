package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public enum corq implements eyge {
    WORK_TYPE_UNKNOWN(0),
    WORK_TYPE_VERIFY_UNSTABLE_SUBSCRIPTION(1),
    WORK_TYPE_VERIFY_SIM_REMOVAL(2),
    WORK_TYPE_UPDATE_PHONE_SIMS_STATE(3),
    UNRECOGNIZED(-1);

    private final int g;

    corq(int i) {
        this.g = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
