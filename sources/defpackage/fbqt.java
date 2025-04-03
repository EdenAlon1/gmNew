package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum fbqt implements eyge {
    UNSPECIFIED(0),
    OTP(1),
    LINK_ANNOTATION(2),
    LINK_PREVIEW_ANNOTATION(3),
    ASSISTANT_ANNOTATION(4),
    CONTACT_ANNOTATION(5),
    ADDRESS_ANNOTATION(6),
    WEBREF_ANNOTATION(7),
    SIMPLE_ANNOTATION(8),
    MONEY_ANNOTATION(9),
    DATETIME_ANNOTATION(10),
    TIMELIKE(11),
    NUDGE_ANNOTATION(12),
    YOUTUBE_ANNOTATION(13),
    MAP_LINK_ANNOTATION(14),
    EMAIL_ANNOTATION(15),
    PHONE_ANNOTATION(16),
    UX_COMPONENT_ANNOTATION(17),
    UNRECOGNIZED(-1);

    private final int u;

    fbqt(int i) {
        this.u = i;
    }

    public static fbqt b(int i) {
        switch (i) {
            case 0:
                return UNSPECIFIED;
            case 1:
                return OTP;
            case 2:
                return LINK_ANNOTATION;
            case 3:
                return LINK_PREVIEW_ANNOTATION;
            case 4:
                return ASSISTANT_ANNOTATION;
            case 5:
                return CONTACT_ANNOTATION;
            case 6:
                return ADDRESS_ANNOTATION;
            case 7:
                return WEBREF_ANNOTATION;
            case 8:
                return SIMPLE_ANNOTATION;
            case 9:
                return MONEY_ANNOTATION;
            case 10:
                return DATETIME_ANNOTATION;
            case 11:
                return TIMELIKE;
            case 12:
                return NUDGE_ANNOTATION;
            case 13:
                return YOUTUBE_ANNOTATION;
            case 14:
                return MAP_LINK_ANNOTATION;
            case 15:
                return EMAIL_ANNOTATION;
            case 16:
                return PHONE_ANNOTATION;
            case 17:
                return UX_COMPONENT_ANNOTATION;
            default:
                return null;
        }
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.u;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
