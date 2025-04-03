package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum exyt implements eyge {
    DASHER_DEVICE_FILTER_UNSPECIFIED(0),
    BLOCK_WHEN_DASHER_ON_DEVICE(1);

    private final int d;

    exyt(int i) {
        this.d = i;
    }

    public static exyt b(int i) {
        if (i == 0) {
            return DASHER_DEVICE_FILTER_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return BLOCK_WHEN_DASHER_ON_DEVICE;
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
