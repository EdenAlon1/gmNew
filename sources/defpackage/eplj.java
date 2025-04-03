package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eplj implements eyge {
    UNKNOWN_SIGNAL_STRENGTH(0),
    SIGNAL_STRENGTH_NONE_OR_UNKNOWN(5),
    SIGNAL_STRENGTH_POOR(1),
    SIGNAL_STRENGTH_MODERATE(2),
    SIGNAL_STRENGTH_GOOD(3),
    SIGNAL_STRENGTH_GREAT(4);

    public final int g;

    eplj(int i) {
        this.g = i;
    }

    public static eplj b(int i) {
        if (i == 0) {
            return UNKNOWN_SIGNAL_STRENGTH;
        }
        if (i == 1) {
            return SIGNAL_STRENGTH_POOR;
        }
        if (i == 2) {
            return SIGNAL_STRENGTH_MODERATE;
        }
        if (i == 3) {
            return SIGNAL_STRENGTH_GOOD;
        }
        if (i == 4) {
            return SIGNAL_STRENGTH_GREAT;
        }
        if (i != 5) {
            return null;
        }
        return SIGNAL_STRENGTH_NONE_OR_UNKNOWN;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
