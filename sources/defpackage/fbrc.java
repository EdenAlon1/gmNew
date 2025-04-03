package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum fbrc implements eyge {
    UNKNOWN_CLASSIFICATION_TYPE(0),
    NUDGE_CLASSIFICATION(1),
    REACTION_CLASSIFICATION(2),
    SAVE_BIRTHDAY_CLASSIFICATION(3),
    MOBILE_BERT_CLASSIFICATION(4),
    UNRECOGNIZED(-1);

    private final int h;

    fbrc(int i) {
        this.h = i;
    }

    public static fbrc b(int i) {
        if (i == 0) {
            return UNKNOWN_CLASSIFICATION_TYPE;
        }
        if (i == 1) {
            return NUDGE_CLASSIFICATION;
        }
        if (i == 2) {
            return REACTION_CLASSIFICATION;
        }
        if (i == 3) {
            return SAVE_BIRTHDAY_CLASSIFICATION;
        }
        if (i != 4) {
            return null;
        }
        return MOBILE_BERT_CLASSIFICATION;
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
