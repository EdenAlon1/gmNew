package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum fbrg implements eyge {
    UNKNOWN_SUGGESTION_SOURCE(0),
    HOBBES_CHAT_ON_DEVICE(1),
    PUMPKIN_GRAMMAR(2),
    MULTI_TASK(3),
    REWRITER(4),
    STICKY_PROVIDER(5),
    NEWS_DETECTOR(6),
    REGEXP(7),
    POD_IMAGE_CLASSIFIER(8),
    CONVERSATION_STARTER(9),
    ASSISTANT(10),
    STARRING_PROVIDER(11),
    SOURCE_HUMAN_LABELING(12),
    MEDIAPIPE_TEXT_CLASSIFIER(13),
    UNRECOGNIZED(-1);

    private final int q;

    fbrg(int i) {
        this.q = i;
    }

    public static fbrg b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_SUGGESTION_SOURCE;
            case 1:
                return HOBBES_CHAT_ON_DEVICE;
            case 2:
                return PUMPKIN_GRAMMAR;
            case 3:
                return MULTI_TASK;
            case 4:
                return REWRITER;
            case 5:
                return STICKY_PROVIDER;
            case 6:
                return NEWS_DETECTOR;
            case 7:
                return REGEXP;
            case 8:
                return POD_IMAGE_CLASSIFIER;
            case 9:
                return CONVERSATION_STARTER;
            case 10:
                return ASSISTANT;
            case 11:
                return STARRING_PROVIDER;
            case 12:
                return SOURCE_HUMAN_LABELING;
            case 13:
                return MEDIAPIPE_TEXT_CLASSIFIER;
            default:
                return null;
        }
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.q;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
