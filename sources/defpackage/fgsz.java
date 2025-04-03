package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum fgsz implements eyge {
    ACCESS_NETWORK_TYPE_UNSPECIFIED(0),
    ETHERNET(1),
    MOBILE(2),
    WIFI(3),
    SATELLITE(4),
    UNRECOGNIZED(-1);

    private final int h;

    fgsz(int i) {
        this.h = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
