package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public enum clxx implements eyge {
    UI_TYPE_UNKNOWN(0),
    BOTTOMSHEET(1),
    BANNER(2),
    OOBE(3),
    SETTINGS_DIALOG(4),
    UNRECOGNIZED(-1);

    private final int h;

    clxx(int i) {
        this.h = i;
    }

    public static clxx b(int i) {
        if (i == 0) {
            return UI_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return BOTTOMSHEET;
        }
        if (i == 2) {
            return BANNER;
        }
        if (i == 3) {
            return OOBE;
        }
        if (i != 4) {
            return null;
        }
        return SETTINGS_DIALOG;
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
