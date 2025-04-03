package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum aven implements eyge {
    UNKNOWN(0),
    CREATED(1),
    REPLIED_BY_USER(2),
    UNRECOGNIZED(-1);

    private final int f;

    aven(int i) {
        this.f = i;
    }

    public static aven b(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return CREATED;
        }
        if (i != 2) {
            return null;
        }
        return REPLIED_BY_USER;
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
