package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum esjm implements eyge {
    PART_TYPE_UNKNOWN(0),
    TEXT(1),
    IMAGE(2),
    VIDEO(3),
    AUDIO(4),
    ATTACHMENT(5),
    LOCATION(6),
    RICH_CARD(7),
    RCS_LOCATION(8),
    UNRECOGNIZED(-1);

    private final int l;

    esjm(int i) {
        this.l = i;
    }

    public static esjm b(int i) {
        switch (i) {
            case 0:
                return PART_TYPE_UNKNOWN;
            case 1:
                return TEXT;
            case 2:
                return IMAGE;
            case 3:
                return VIDEO;
            case 4:
                return AUDIO;
            case 5:
                return ATTACHMENT;
            case 6:
                return LOCATION;
            case 7:
                return RICH_CARD;
            case 8:
                return RCS_LOCATION;
            default:
                return null;
        }
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
