package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eplu implements eyge {
    CARRIER_SERVICES_EVENT_SOURCE_UNKNOWN(0),
    CARRIER_SERVICES_EVENT_SOURCE_VOICE(1),
    CARRIER_SERVICES_EVENT_SOURCE_RCS(2),
    CARRIER_SERVICES_EVENT_SOURCE_COMMON(3);

    public final int e;

    eplu(int i) {
        this.e = i;
    }

    public static eplu b(int i) {
        if (i == 0) {
            return CARRIER_SERVICES_EVENT_SOURCE_UNKNOWN;
        }
        if (i == 1) {
            return CARRIER_SERVICES_EVENT_SOURCE_VOICE;
        }
        if (i == 2) {
            return CARRIER_SERVICES_EVENT_SOURCE_RCS;
        }
        if (i != 3) {
            return null;
        }
        return CARRIER_SERVICES_EVENT_SOURCE_COMMON;
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
