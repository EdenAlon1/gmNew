package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public enum cmrx implements eyge {
    UNKNOWN(0),
    REACTION_BAR(1),
    CUSTOM_REACTION_PICKER(2),
    DITTO_REACTION_BAR(3),
    REACTION_SUMMARY(4),
    EMOTIFY_CREATION(5),
    EMOTIFY_PICKER_SELF_OWNED(6),
    EMOTIFY_PICKER_AUTO_SAVED(7),
    DOUBLE_TAP_TO_REACT(8),
    MEDIA_VIEWER_REACTION_PICKER(9),
    UNRECOGNIZED(-1);

    private final int m;

    cmrx(int i) {
        this.m = i;
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.m;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
