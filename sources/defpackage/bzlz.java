package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public enum bzlz implements eyge {
    UNKNOWN(0),
    VERIFICATION_CODES_LOADING(1),
    VERIFICATION_CODES_LOADED(2),
    VERIFIED(3),
    ERROR_WRONG_VERIFICATION_CODE_SELECTED(4),
    ERROR_USER_CANCELED_VERIFICATION(5),
    ERROR_TIME_OUT(6),
    ERROR_UKEY2(7),
    EMOJI_CODES_DOWNLOADED(8),
    EMOJI_CODES_DOWNLOAD_FAILED(9),
    ERROR_NOT_ME(10),
    ERROR_USER_CANCELED_VERIFICATION_FROM_DITTO(11),
    UNRECOGNIZED(-1);

    private final int o;

    bzlz(int i) {
        this.o = i;
    }

    public static bzlz b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return VERIFICATION_CODES_LOADING;
            case 2:
                return VERIFICATION_CODES_LOADED;
            case 3:
                return VERIFIED;
            case 4:
                return ERROR_WRONG_VERIFICATION_CODE_SELECTED;
            case 5:
                return ERROR_USER_CANCELED_VERIFICATION;
            case 6:
                return ERROR_TIME_OUT;
            case 7:
                return ERROR_UKEY2;
            case 8:
                return EMOJI_CODES_DOWNLOADED;
            case 9:
                return EMOJI_CODES_DOWNLOAD_FAILED;
            case 10:
                return ERROR_NOT_ME;
            case 11:
                return ERROR_USER_CANCELED_VERIFICATION_FROM_DITTO;
            default:
                return null;
        }
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.o;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
