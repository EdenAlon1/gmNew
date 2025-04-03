package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public enum cmip implements eyge {
    TOGGLE_STATE_UNSPECIFIED(0),
    TOGGLE_STATE_ENABLED(1),
    TOGGLE_STATE_USER_DISABLED(2),
    TOGGLE_STATE_AUTOMATICALLY_DISABLED(3);

    public final int e;

    cmip(int i) {
        this.e = i;
    }

    public static cmip b(int i) {
        if (i == 0) {
            return TOGGLE_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return TOGGLE_STATE_ENABLED;
        }
        if (i == 2) {
            return TOGGLE_STATE_USER_DISABLED;
        }
        if (i != 3) {
            return null;
        }
        return TOGGLE_STATE_AUTOMATICALLY_DISABLED;
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
