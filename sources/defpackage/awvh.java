package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum awvh implements eyge {
    UNKNOWN_TYPE(0),
    SUBJECT_UPDATE(1),
    REMOVE_PARTICIPANT_BY_ALL(2),
    REMOVE_PARTICIPANT_BY_ADMIN(3),
    ICON_UPDATE(4);

    public final int f;

    awvh(int i) {
        this.f = i;
    }

    public static awvh b(int i) {
        if (i == 0) {
            return UNKNOWN_TYPE;
        }
        if (i == 1) {
            return SUBJECT_UPDATE;
        }
        if (i == 2) {
            return REMOVE_PARTICIPANT_BY_ALL;
        }
        if (i == 3) {
            return REMOVE_PARTICIPANT_BY_ADMIN;
        }
        if (i != 4) {
            return null;
        }
        return ICON_UPDATE;
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
