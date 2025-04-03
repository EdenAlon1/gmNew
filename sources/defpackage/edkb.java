package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class edkb {
    public a[] addressComponents;
    public String businessStatus;
    public Boolean curbsidePickup;
    public d currentOpeningHours;
    public Boolean delivery;
    public Boolean dineIn;
    public b editorialSummary;
    public String formattedAddress;
    public c geometry;
    private String icon;
    public String iconBackgroundColor;
    public String iconMaskBaseUri;
    public String internationalPhoneNumber;
    public String name;
    public d openingHours;
    public e[] photos;
    public String placeId;
    public f plusCode;
    public Integer priceLevel;
    public Double rating;
    public Boolean reservable;
    public d[] secondaryOpeningHours;
    public Boolean servesBeer;
    public Boolean servesBreakfast;
    private Boolean servesBrunch;
    public Boolean servesDinner;
    public Boolean servesLunch;
    public Boolean servesVegetarianFood;
    public Boolean servesWine;
    public Boolean takeout;
    private String[] types;
    public Integer userRatingsTotal;
    public Integer utcOffset;
    public String website;
    public Boolean wheelchairAccessibleEntrance;

    /* compiled from: PG */
    class a {
        public String longName;
        public String shortName;
        public String[] types;

        a() {
        }
    }

    /* compiled from: PG */
    class b {
        public String language;
        public String overview;

        b() {
        }
    }

    /* compiled from: PG */
    class c {
        public a location;
        public b viewport;

        /* compiled from: PG */
        class a {
            public Double lat;
            public Double lng;

            a() {
            }
        }

        /* compiled from: PG */
        class b {
            public a northeast;
            public a southwest;

            b() {
            }
        }

        c() {
        }
    }

    /* compiled from: PG */
    class d {
        public a[] periods;
        public b[] specialDays;
        public String type;
        public String[] weekdayText;

        /* compiled from: PG */
        class a {
            public c close;
            public c open;

            a() {
            }
        }

        /* compiled from: PG */
        class b {
            public String date;
            public Boolean exceptionalHours;

            b() {
            }
        }

        /* compiled from: PG */
        class c {
            public String date;
            public Integer day;
            public String time;
            public Boolean truncated;

            c() {
            }
        }

        d() {
        }
    }

    /* compiled from: PG */
    class e {
        public Integer height;
        public String[] htmlAttributions;
        public String photoReference;
        public Integer width;

        e() {
        }
    }

    /* compiled from: PG */
    class f {
        public String compoundCode;
        public String globalCode;

        f() {
        }
    }

    edkb() {
    }

    final engw a() {
        String[] strArr = this.types;
        if (strArr != null) {
            return engw.p(strArr);
        }
        int i = engw.d;
        return enou.a;
    }
}
