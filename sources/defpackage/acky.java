package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum acky implements eyge {
    NOT_PAIRED(0),
    PAIRING(1),
    PAIRED(2),
    REMOVE_PAIRING(3);

    public final int e;

    acky(int i) {
        this.e = i;
    }

    public static acky b(int i) {
        if (i == 0) {
            return NOT_PAIRED;
        }
        if (i == 1) {
            return PAIRING;
        }
        if (i == 2) {
            return PAIRED;
        }
        if (i != 3) {
            return null;
        }
        return REMOVE_PAIRING;
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
