package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public enum capu implements eyge {
    UNKNOWN(0),
    NONE(1),
    ONE_ON_ONE_ENCRYPTION(2),
    GROUP_ENCRYPTION(3);

    public final int e;

    capu(int i) {
        this.e = i;
    }

    public static capu b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return NONE;
        }
        if (i == 2) {
            return ONE_ON_ONE_ENCRYPTION;
        }
        if (i != 3) {
            return null;
        }
        return GROUP_ENCRYPTION;
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
