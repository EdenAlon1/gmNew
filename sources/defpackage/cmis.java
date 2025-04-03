package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public enum cmis implements eyge {
    PER_SIM_TOGGLE_STATE_UNSPECIFIED(0),
    PER_SIM_TOGGLE_STATE_ENABLED(1),
    PER_SIM_TOGGLE_STATE_DISABLED(2),
    PER_SIM_TOGGLE_STATE_AUTOMATICALLY_DISABLED(3),
    PER_SIM_TOGGLE_STATE_PROVISIONING_RULE_DISABLED(4);

    public static final eygf f = new eygf() { // from class: cmiq
        @Override // defpackage.eygf
        public final /* synthetic */ eyge a(int i) {
            return cmis.b(i);
        }
    };
    public final int g;

    cmis(int i) {
        this.g = i;
    }

    public static cmis b(int i) {
        if (i == 0) {
            return PER_SIM_TOGGLE_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return PER_SIM_TOGGLE_STATE_ENABLED;
        }
        if (i == 2) {
            return PER_SIM_TOGGLE_STATE_DISABLED;
        }
        if (i == 3) {
            return PER_SIM_TOGGLE_STATE_AUTOMATICALLY_DISABLED;
        }
        if (i != 4) {
            return null;
        }
        return PER_SIM_TOGGLE_STATE_PROVISIONING_RULE_DISABLED;
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
