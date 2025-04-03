package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum axcl implements eyge {
    CONVERSATION_CLASSIFICATION_TYPE_UNSPECIFIED(0),
    CONVERSATION_CLASSIFICATION_TYPE_BIRTHDAY(1),
    CONVERSATION_CLASSIFICATION_TYPE_SAVE_BIRTHDAY(2),
    CONVERSATION_CLASSIFICATION_TYPE_MOBILE_BERT_SCAM(3),
    CONVERSATION_CLASSIFICATION_TYPE_PENPAL_SCAM(4),
    UNRECOGNIZED(-1);

    private final int h;

    axcl(int i) {
        this.h = i;
    }

    public static axcl b(int i) {
        if (i == 0) {
            return CONVERSATION_CLASSIFICATION_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return CONVERSATION_CLASSIFICATION_TYPE_BIRTHDAY;
        }
        if (i == 2) {
            return CONVERSATION_CLASSIFICATION_TYPE_SAVE_BIRTHDAY;
        }
        if (i == 3) {
            return CONVERSATION_CLASSIFICATION_TYPE_MOBILE_BERT_SCAM;
        }
        if (i != 4) {
            return null;
        }
        return CONVERSATION_CLASSIFICATION_TYPE_PENPAL_SCAM;
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
