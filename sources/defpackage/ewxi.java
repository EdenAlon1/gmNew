package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum ewxi {
    UNSPECIFIED(0),
    ABSOLUTE(1),
    RELATIVE(2);

    public static final enhk d;
    private final int f;

    static {
        enhd enhdVar = new enhd();
        for (ewxi ewxiVar : values()) {
            enhdVar.k(Integer.valueOf(ewxiVar.f), ewxiVar);
        }
        d = enhdVar.c();
    }

    ewxi(int i) {
        this.f = i;
    }
}
