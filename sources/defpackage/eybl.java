package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eybl implements eyge {
    PLACEMENT_UNSPECIFIED(0),
    ABOVE(1),
    BELOW(2);

    private final int e;

    eybl(int i) {
        this.e = i;
    }

    public static eybl b(int i) {
        if (i == 0) {
            return PLACEMENT_UNSPECIFIED;
        }
        if (i == 1) {
            return ABOVE;
        }
        if (i != 2) {
            return null;
        }
        return BELOW;
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
