package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public enum eoox implements eyge {
    UNKNOWN_HANDLED_BY(0),
    HANDLED_BY_CARRIER_APP(1),
    NOT_HANDLED_BY_CARRIER_APP(2);

    public final int d;

    eoox(int i) {
        this.d = i;
    }

    public static eoox b(int i) {
        if (i == 0) {
            return UNKNOWN_HANDLED_BY;
        }
        if (i == 1) {
            return HANDLED_BY_CARRIER_APP;
        }
        if (i != 2) {
            return null;
        }
        return NOT_HANDLED_BY_CARRIER_APP;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
