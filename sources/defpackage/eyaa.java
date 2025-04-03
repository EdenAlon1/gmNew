package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eyaa implements eyge {
    ALIGNMENT_UNSPECIFIED(0),
    TRAILING(1),
    CENTER(2);

    private final int e;

    eyaa(int i) {
        this.e = i;
    }

    public static eyaa b(int i) {
        if (i == 0) {
            return ALIGNMENT_UNSPECIFIED;
        }
        if (i == 1) {
            return TRAILING;
        }
        if (i != 2) {
            return null;
        }
        return CENTER;
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
