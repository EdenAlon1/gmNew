package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum fbcx implements eyge {
    UNKNOWN_SPAM_VERDICT_ENFORCEMENT_ACTION(0),
    SHOW_WARNING(1),
    MOVE_TO_SPAM_FOLDER(2),
    DO_NOTHING(3),
    SKIPPED(4),
    ALLOW(5),
    UNRECOGNIZED(-1);

    private final int i;

    fbcx(int i) {
        this.i = i;
    }

    public static fbcx b(int i) {
        if (i == 0) {
            return UNKNOWN_SPAM_VERDICT_ENFORCEMENT_ACTION;
        }
        if (i == 1) {
            return SHOW_WARNING;
        }
        if (i == 2) {
            return MOVE_TO_SPAM_FOLDER;
        }
        if (i == 3) {
            return DO_NOTHING;
        }
        if (i == 4) {
            return SKIPPED;
        }
        if (i != 5) {
            return null;
        }
        return ALLOW;
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
