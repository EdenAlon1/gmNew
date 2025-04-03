package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum adcp implements eyge {
    UNKNOWN(0),
    GROUP_CREATED(1),
    GROUP_RENAMED_GLOBAL(2),
    PARTICIPANT_JOINED(3),
    PARTICIPANT_LEFT(4),
    SELF_LEFT(5),
    UNRECOGNIZED(-1);

    private final int i;

    adcp(int i) {
        this.i = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.i;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
