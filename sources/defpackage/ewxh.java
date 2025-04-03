package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum ewxh {
    UNSPECIFIED(0),
    YEAR(1),
    MONTH(2),
    WEEK(3),
    DAY_OF_WEEK(4),
    DAY_OF_MONTH(5),
    HOUR(6),
    MINUTE(7),
    SECOND(8),
    MERIDIEM(9),
    ZONE_OFFSET(10),
    DST_OFFSET(11);

    public static final enhk m;
    private final int o;

    static {
        enhd enhdVar = new enhd();
        for (ewxh ewxhVar : values()) {
            enhdVar.k(Integer.valueOf(ewxhVar.o), ewxhVar);
        }
        m = enhdVar.c();
    }

    ewxh(int i) {
        this.o = i;
    }
}
