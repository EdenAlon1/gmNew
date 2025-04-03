package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum ewxk {
    UNKNOWN(-1),
    YEAR(0),
    MONTH(1),
    WEEK(2),
    DAY(3),
    HOUR(4),
    MINUTE(5),
    SECOND(6);

    private static final enhk j;
    public final int i;

    static {
        enhd enhdVar = new enhd();
        for (ewxk ewxkVar : values()) {
            enhdVar.k(Integer.valueOf(ewxkVar.i), ewxkVar);
        }
        j = enhdVar.c();
    }

    ewxk(int i) {
        this.i = i;
    }

    public static ewxk a(int i) {
        enhk enhkVar = j;
        Integer valueOf = Integer.valueOf(i);
        emxf.d(enhkVar.containsKey(valueOf), "Unknown datetime granularity value: %s", i);
        return (ewxk) enhkVar.get(valueOf);
    }
}
