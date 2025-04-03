package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eycd implements eyge {
    THEME_UNKNOWN(0),
    THEME_LIGHT(1),
    THEME_DARK(2);

    public final int d;

    eycd(int i) {
        this.d = i;
    }

    public static eycd b(int i) {
        if (i == 0) {
            return THEME_UNKNOWN;
        }
        if (i == 1) {
            return THEME_LIGHT;
        }
        if (i != 2) {
            return null;
        }
        return THEME_DARK;
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
