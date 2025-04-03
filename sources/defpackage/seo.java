package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum seo implements eyge {
    INTENT_UNDEFINED(0),
    INTENT_OPEN_APP(1),
    INTENT_CALL_ON_PHONE_NUMBER(10),
    INTENT_CALL_CONTACT_ON_PHONE(12),
    INTENT_NAVIGATE_TO_ADDRESS(11),
    INTENT_FIND_IN_MAPS(13),
    INTENT_CHECK_RESTAURANT_MENU(20),
    INTENT_CHECK_RESTAURANT_RATING(21),
    INTENT_BOOK_RESTAURANT_TABLE(22),
    INTENT_CHECK_RESTAURANT_RECOMMENDED_DISHES(23),
    INTENT_CHECK_RESTAURANT_INFO(24),
    INTENT_FIND_RESTAURANTS_NEARBY(25),
    INTENT_FIND_MOVIE_SHOWTIME(30),
    INTENT_BUY_MOVIE_TICKET(31),
    INTENT_CHECK_MOVIE_RATING(32),
    INTENT_CHECK_MOVIE_CAST(33),
    INTENT_CHECK_MOVIE_REVIEWS(34),
    INTENT_CHECK_MOVIE_OVERVIEW(35),
    INTENT_WATCH_MOVIE_TRAILER(36),
    INTENT_CHECK_CALENDAR(40),
    INTENT_ADD_EVENT_INTO_CALENDAR(41),
    INTENT_SPORT_CHECK_LAST_GAME_SCORE(50),
    INTENT_SPORT_CHECK_NEXT_MATCH_TIMELINE(51),
    INTENT_SPORT_CHECK_STANDING(52),
    INTENT_SPORT_FIND_NEWS(53),
    INTENT_SHARE_CONTACT(60),
    INTENT_SHARE_MY_LOCATION(61),
    INTENT_BOOK_CHECK_OVERVIEW(70),
    INTENT_BOOK_CHECK_REVIEWS(71),
    INTENT_BOOK_PURCHASE(72),
    INTENT_SHOPPING_LIST_SAVE_ITEM(80),
    INTENT_SET_REMINDER(90),
    UNRECOGNIZED(-1);

    private final int I;

    seo(int i) {
        this.I = i;
    }

    public static seo b(int i) {
        if (i == 0) {
            return INTENT_UNDEFINED;
        }
        if (i == 1) {
            return INTENT_OPEN_APP;
        }
        if (i == 40) {
            return INTENT_CHECK_CALENDAR;
        }
        if (i == 41) {
            return INTENT_ADD_EVENT_INTO_CALENDAR;
        }
        if (i == 60) {
            return INTENT_SHARE_CONTACT;
        }
        if (i == 61) {
            return INTENT_SHARE_MY_LOCATION;
        }
        if (i == 80) {
            return INTENT_SHOPPING_LIST_SAVE_ITEM;
        }
        if (i == 90) {
            return INTENT_SET_REMINDER;
        }
        switch (i) {
            case 10:
                return INTENT_CALL_ON_PHONE_NUMBER;
            case 11:
                return INTENT_NAVIGATE_TO_ADDRESS;
            case 12:
                return INTENT_CALL_CONTACT_ON_PHONE;
            case 13:
                return INTENT_FIND_IN_MAPS;
            default:
                switch (i) {
                    case 20:
                        return INTENT_CHECK_RESTAURANT_MENU;
                    case 21:
                        return INTENT_CHECK_RESTAURANT_RATING;
                    case 22:
                        return INTENT_BOOK_RESTAURANT_TABLE;
                    case 23:
                        return INTENT_CHECK_RESTAURANT_RECOMMENDED_DISHES;
                    case 24:
                        return INTENT_CHECK_RESTAURANT_INFO;
                    case 25:
                        return INTENT_FIND_RESTAURANTS_NEARBY;
                    default:
                        switch (i) {
                            case 30:
                                return INTENT_FIND_MOVIE_SHOWTIME;
                            case 31:
                                return INTENT_BUY_MOVIE_TICKET;
                            case 32:
                                return INTENT_CHECK_MOVIE_RATING;
                            case 33:
                                return INTENT_CHECK_MOVIE_CAST;
                            case 34:
                                return INTENT_CHECK_MOVIE_REVIEWS;
                            case 35:
                                return INTENT_CHECK_MOVIE_OVERVIEW;
                            case 36:
                                return INTENT_WATCH_MOVIE_TRAILER;
                            default:
                                switch (i) {
                                    case 50:
                                        return INTENT_SPORT_CHECK_LAST_GAME_SCORE;
                                    case 51:
                                        return INTENT_SPORT_CHECK_NEXT_MATCH_TIMELINE;
                                    case 52:
                                        return INTENT_SPORT_CHECK_STANDING;
                                    case 53:
                                        return INTENT_SPORT_FIND_NEWS;
                                    default:
                                        switch (i) {
                                            case 70:
                                                return INTENT_BOOK_CHECK_OVERVIEW;
                                            case 71:
                                                return INTENT_BOOK_CHECK_REVIEWS;
                                            case 72:
                                                return INTENT_BOOK_PURCHASE;
                                            default:
                                                return null;
                                        }
                                }
                        }
                }
        }
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.I;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
