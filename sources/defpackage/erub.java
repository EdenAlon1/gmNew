package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum erub implements eyge {
    DEFAULT(0),
    ANDROMEDA(1),
    UNRECOGNIZED(-1);

    private final int e;

    erub(int i) {
        this.e = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
