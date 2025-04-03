package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum ewae implements eyge {
    DASHER_DEVICE_FILTER_UNKNOWN(0),
    BLOCK_WHEN_DASHER_ON_DEVICE(1);

    public final int c;

    ewae(int i) {
        this.c = i;
    }

    public static ewae b(int i) {
        if (i == 0) {
            return DASHER_DEVICE_FILTER_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return BLOCK_WHEN_DASHER_ON_DEVICE;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.c);
    }
}
