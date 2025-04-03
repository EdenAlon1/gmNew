package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum fabw implements eyge {
    ACTION_UNSPECIFIED(0),
    OPEN_APP(1),
    OPEN_WEBSITE(2),
    CALL_ON_PHONE_NUMBER(3),
    NAVIGATE_TO_ADDRESS(4),
    CHECK_MENU(5),
    CHECK_RATING(6),
    CHECK_REVIEWS(7),
    RESERVE(8),
    LISTEN(9),
    WATCH(10),
    FIND_MOVIE_SHOWTIMES(11),
    WATCH_TRAILER(12),
    DELIVERY(13);

    public final int o;

    fabw(int i) {
        this.o = i;
    }

    public static fabw b(int i) {
        switch (i) {
            case 0:
                return ACTION_UNSPECIFIED;
            case 1:
                return OPEN_APP;
            case 2:
                return OPEN_WEBSITE;
            case 3:
                return CALL_ON_PHONE_NUMBER;
            case 4:
                return NAVIGATE_TO_ADDRESS;
            case 5:
                return CHECK_MENU;
            case 6:
                return CHECK_RATING;
            case 7:
                return CHECK_REVIEWS;
            case 8:
                return RESERVE;
            case 9:
                return LISTEN;
            case 10:
                return WATCH;
            case 11:
                return FIND_MOVIE_SHOWTIMES;
            case 12:
                return WATCH_TRAILER;
            case 13:
                return DELIVERY;
            default:
                return null;
        }
    }

    @Override // defpackage.eyge
    public final int a() {
        return this.o;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.o);
    }
}
