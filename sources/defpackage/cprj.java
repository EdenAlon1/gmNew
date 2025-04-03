package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cprj {
    private final csjk a;

    public cprj(csjk csjkVar) {
        this.a = csjkVar;
    }

    public final int a() {
        enip h = ((csmz) this.a.a()).h();
        if (h.isEmpty()) {
            return 2;
        }
        if (h.contains(csmy.CELLULAR)) {
            return 3;
        }
        if (h.contains(csmy.WIFI)) {
            return 4;
        }
        return h.contains(csmy.ETHERNET) ? 5 : 1;
    }
}
