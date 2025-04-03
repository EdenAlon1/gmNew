package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eyae implements eyge {
    FONT_SIZE_UNSPECIFIED(0),
    SMALL(1),
    LARGE(2);

    private final int e;

    eyae(int i) {
        this.e = i;
    }

    public static eyae b(int i) {
        if (i == 0) {
            return FONT_SIZE_UNSPECIFIED;
        }
        if (i == 1) {
            return SMALL;
        }
        if (i != 2) {
            return null;
        }
        return LARGE;
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
