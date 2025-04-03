package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum fchz implements eyge {
    UNKNOWN_GROUP_ICON_MODIFICATION_POLICY(0),
    NO_GROUP_ICON_MODIFICATION_ALLOWED(1),
    GROUP_ICON_MODIFICATION_ALLOWED(2),
    UNRECOGNIZED(-1);

    private final int f;

    fchz(int i) {
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
