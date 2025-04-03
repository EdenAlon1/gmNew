package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum derk implements eyge {
    UNKNOWN(0),
    DEMO(1),
    ESP(2),
    UNRECOGNIZED(-1);

    private final int f;

    derk(int i) {
        this.f = i;
    }

    public static derk b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return DEMO;
        }
        if (i != 2) {
            return null;
        }
        return ESP;
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
