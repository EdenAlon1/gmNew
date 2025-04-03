package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum esgx implements eyge {
    TONE_UNSPECIFIED(0),
    TONE_FORMAL(4),
    TONE_CONCISE(6),
    TONE_SHAKESPEARE(8),
    TONE_CHILL(9),
    TONE_REPHRASE(10),
    TONE_RHYMES(11),
    TONE_EXCITED(12),
    UNRECOGNIZED(-1);

    private final int k;

    esgx(int i) {
        this.k = i;
    }

    public static esgx b(int i) {
        if (i == 0) {
            return TONE_UNSPECIFIED;
        }
        if (i == 4) {
            return TONE_FORMAL;
        }
        if (i == 6) {
            return TONE_CONCISE;
        }
        switch (i) {
            case 8:
                return TONE_SHAKESPEARE;
            case 9:
                return TONE_CHILL;
            case 10:
                return TONE_REPHRASE;
            case 11:
                return TONE_RHYMES;
            case 12:
                return TONE_EXCITED;
            default:
                return null;
        }
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.k;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
