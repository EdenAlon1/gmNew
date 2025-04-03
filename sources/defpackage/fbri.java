package defpackage;

import androidx.car.app.navigation.model.Maneuver;

/* compiled from: PG */
/* loaded from: classes6.dex */
public enum fbri implements eyge {
    UNKNOWN_SUGGESTION_TYPE(0),
    FULL_MESSAGE(1),
    SHORT_MESSAGE(2),
    LOCATION(3),
    PAYMENT(4),
    GIF(5),
    CONTACT(6),
    ASSISTANT_QUERY(7),
    SPAM(8),
    RECENT_IMAGE(9),
    CONTEXT(10),
    REMINDER(11),
    EMOTION(12),
    DUO_CALL(13),
    FEEDBACK(14),
    SCRIPTED_REPLY(15),
    EMOJI(16),
    CATEGORY_TEXT(17),
    CATEGORY_ACTION(18),
    CATEGORY_EMOTIVE(19),
    CATEGORY_BERT(37),
    SENSITIVE_IMAGE(20),
    COPY_OTP(21),
    CALENDAR(22),
    SILENT(23),
    WEB(24),
    BUSINESS_MESSAGE(25),
    NUDGE(26),
    EXPIRATION_SENTINEL(27),
    SAVE_BIRTHDAY(28),
    STARRING(29),
    SMARTER_REPLY(30),
    REPHRASE(31),
    SCREEN_EFFECTS(32),
    BARD(33),
    BARD_LOCATION_REQUEST(34),
    SELFIE_GIF(35),
    CREATE_PHOTOMOJI(36),
    OPEN_MAGIC_COMPOSE(38),
    RECORD_VOICE_MESSAGE(39),
    UNRECOGNIZED(-1);

    private final int Q;

    fbri(int i) {
        this.Q = i;
    }

    public static fbri b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_SUGGESTION_TYPE;
            case 1:
                return FULL_MESSAGE;
            case 2:
                return SHORT_MESSAGE;
            case 3:
                return LOCATION;
            case 4:
                return PAYMENT;
            case 5:
                return GIF;
            case 6:
                return CONTACT;
            case 7:
                return ASSISTANT_QUERY;
            case 8:
                return SPAM;
            case 9:
                return RECENT_IMAGE;
            case 10:
                return CONTEXT;
            case 11:
                return REMINDER;
            case 12:
                return EMOTION;
            case 13:
                return DUO_CALL;
            case 14:
                return FEEDBACK;
            case 15:
                return SCRIPTED_REPLY;
            case 16:
                return EMOJI;
            case 17:
                return CATEGORY_TEXT;
            case 18:
                return CATEGORY_ACTION;
            case 19:
                return CATEGORY_EMOTIVE;
            case 20:
                return SENSITIVE_IMAGE;
            case 21:
                return COPY_OTP;
            case 22:
                return CALENDAR;
            case 23:
                return SILENT;
            case 24:
                return WEB;
            case 25:
                return BUSINESS_MESSAGE;
            case 26:
                return NUDGE;
            case 27:
                return EXPIRATION_SENTINEL;
            case 28:
                return SAVE_BIRTHDAY;
            case 29:
                return STARRING;
            case 30:
                return SMARTER_REPLY;
            case 31:
                return REPHRASE;
            case 32:
                return SCREEN_EFFECTS;
            case 33:
                return BARD;
            case 34:
                return BARD_LOCATION_REQUEST;
            case 35:
                return SELFIE_GIF;
            case 36:
                return CREATE_PHOTOMOJI;
            case 37:
                return CATEGORY_BERT;
            case 38:
                return OPEN_MAGIC_COMPOSE;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                return RECORD_VOICE_MESSAGE;
            default:
                return null;
        }
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.Q;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
