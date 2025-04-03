package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public enum clze implements eyge {
    UI_VARIANT_UNKNOWN(0),
    PROMO_BOTTOMSHEET(1),
    INPUT_BOTTOMSHEET(2),
    INPUT_FULLSCREEN(3),
    PROMO_BANNER(4),
    UNRECOGNIZED(-1);

    private final int h;

    clze(int i) {
        this.h = i;
    }

    public static clze b(int i) {
        if (i == 0) {
            return UI_VARIANT_UNKNOWN;
        }
        if (i == 1) {
            return PROMO_BOTTOMSHEET;
        }
        if (i == 2) {
            return INPUT_BOTTOMSHEET;
        }
        if (i == 3) {
            return INPUT_FULLSCREEN;
        }
        if (i != 4) {
            return null;
        }
        return PROMO_BANNER;
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
