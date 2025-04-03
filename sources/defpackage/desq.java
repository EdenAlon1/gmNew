package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum desq implements eyge {
    MULTI_DEVICE_INTEGRATION_STATUS_UNSPECIFIED(0),
    INVALID_REQUEST(1),
    NOT_AVAILABLE(2),
    INTEGRATED(3),
    NOT_INTEGRATED(4),
    TYCHO_NOT_ACTIVATED(5);

    private final int h;

    desq(int i) {
        this.h = i;
    }

    public static desq b(int i) {
        if (i == 0) {
            return MULTI_DEVICE_INTEGRATION_STATUS_UNSPECIFIED;
        }
        if (i == 1) {
            return INVALID_REQUEST;
        }
        if (i == 2) {
            return NOT_AVAILABLE;
        }
        if (i == 3) {
            return INTEGRATED;
        }
        if (i == 4) {
            return NOT_INTEGRATED;
        }
        if (i != 5) {
            return null;
        }
        return TYCHO_NOT_ACTIVATED;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
