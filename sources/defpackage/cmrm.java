package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public enum cmrm implements eyge {
    REACTION_ACTION_UNSPECIFIED(0),
    ADD_REACTION(1),
    REMOVE_REACTION(2),
    REPLACE_REACTION(3),
    UNRECOGNIZED(-1);

    private final int g;

    cmrm(int i) {
        this.g = i;
    }

    public static cmrm b(int i) {
        if (i == 0) {
            return REACTION_ACTION_UNSPECIFIED;
        }
        if (i == 1) {
            return ADD_REACTION;
        }
        if (i == 2) {
            return REMOVE_REACTION;
        }
        if (i != 3) {
            return null;
        }
        return REPLACE_REACTION;
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
