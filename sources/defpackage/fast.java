package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum fast implements eyge {
    GROUP_OPERATION_UNSPECIFIED(0),
    CREATE_GROUP(1),
    ADD_GROUP_USERS(2),
    KICK_GROUP_USERS(3),
    GROUP_PROFILE_UPDATED(4),
    GET_GROUP_IDS(5),
    GET_GROUP_INFOS(6),
    CHANGE_GROUP_INFO(7),
    GET_GROUP_INFO(8),
    UNRECOGNIZED(-1);

    private final int l;

    fast(int i) {
        this.l = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.l;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
