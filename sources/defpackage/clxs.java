package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public enum clxs implements eyge {
    FI_MULTI_SYNC_STATUS_UNSPECIFIED(0),
    FI_MULTI_SYNC_STATUS_ENABLED(1),
    FI_MULTI_SYNC_STATUS_DISABLED(2),
    UNRECOGNIZED(-1);

    public static final eygf e = new eygf() { // from class: clxr
        @Override // defpackage.eygf
        public final /* synthetic */ eyge a(int i) {
            if (i == 0) {
                return clxs.FI_MULTI_SYNC_STATUS_UNSPECIFIED;
            }
            if (i == 1) {
                return clxs.FI_MULTI_SYNC_STATUS_ENABLED;
            }
            if (i != 2) {
                return null;
            }
            return clxs.FI_MULTI_SYNC_STATUS_DISABLED;
        }
    };
    private final int g;

    clxs(int i) {
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
