package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eyav implements eyge {
    PULSE_ANIMATION_TYPE_UNSPECIFIED(0),
    PULSE_WITH_INNER_CIRCLE(1),
    PULSE(2);

    private final int e;

    eyav(int i) {
        this.e = i;
    }

    public static eyav b(int i) {
        if (i == 0) {
            return PULSE_ANIMATION_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return PULSE_WITH_INNER_CIRCLE;
        }
        if (i != 2) {
            return null;
        }
        return PULSE;
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
