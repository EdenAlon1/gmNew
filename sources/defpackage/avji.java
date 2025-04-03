package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum avji implements eyge {
    NOT_SET(0),
    HIDE(1),
    SHOW(2),
    UNRECOGNIZED(-1);

    private final int f;

    avji(int i) {
        this.f = i;
    }

    public static avji b(int i) {
        if (i == 0) {
            return NOT_SET;
        }
        if (i == 1) {
            return HIDE;
        }
        if (i != 2) {
            return null;
        }
        return SHOW;
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
