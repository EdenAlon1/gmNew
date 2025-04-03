package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum evsl implements eyge {
    ANDROID_PERMISSION_STATE_UNSPECIFIED(0),
    ANDROID_PERMISSION_STATE_AUTHORIZED(1),
    ANDROID_PERMISSION_STATE_DENIED(2),
    UNRECOGNIZED(-1);

    private final int f;

    evsl(int i) {
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
