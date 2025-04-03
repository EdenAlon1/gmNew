package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum esia implements eyge {
    STATUS_UNKNOWN_MMS_GROUP_UPGRADE_STATUS(0),
    STATUS_NOT_ELIGIBLE_BECAUSE_INACTIVE(1),
    STATUS_NOT_ELIGIBLE_NOT_EVERYONE_RCS(2),
    STATUS_NOT_ELIGIBLE_WAITING_FOR_OUTDATED_GM_CLIENT(3),
    STATUS_ELIGIBLE_FOR_UPGRADE_BUT_NOT_ACTIVE_UPGRADER(4),
    STATUS_UPGRADE_STARTED(5),
    STATUS_RCS_GROUP_CREATION_FAILED(6),
    STATUS_RCS_GROUP_CREATION_SUCCEEDED(7),
    STATUS_UPGRADE_FAILED(8),
    STATUS_UPGRADE_COMPLETE(9),
    UNRECOGNIZED(-1);

    private final int m;

    esia(int i) {
        this.m = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.m;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
