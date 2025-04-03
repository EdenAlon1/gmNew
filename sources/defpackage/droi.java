package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum droi implements eyge {
    CAMERA_FACING_UNKNOWN(0),
    BACK(1),
    FRONT(2),
    UNRECOGNIZED(-1);

    private final int f;

    droi(int i) {
        this.f = i;
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
