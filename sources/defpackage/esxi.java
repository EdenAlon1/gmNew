package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum esxi implements eyge {
    FEATURE_TYPE_UNSPECIFIED(0),
    FEATURE_TYPE_MULTI_DEVICE(1),
    FEATURE_TYPE_BACKUP_AND_RESTORE(2),
    UNRECOGNIZED(-1);

    private final int f;

    esxi(int i) {
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
