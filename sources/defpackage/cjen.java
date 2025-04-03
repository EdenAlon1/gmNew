package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjen extends eyfy implements eyht {
    public static final cjen a;
    private static volatile eyhz k;
    public int b;
    public int d;
    public boolean e;
    public cjeh f;
    public int j;
    public eyhm c = eyhm.a;
    public eyhm h = eyhm.a;
    public String g = "";
    public boolean i = true;

    static {
        cjen cjenVar = new cjen();
        a = cjenVar;
        eyfy.registerDefaultInstance(cjen.class, cjenVar);
    }

    private cjen() {
    }

    public final eyhm a() {
        eyhm eyhmVar = this.c;
        if (!eyhmVar.b) {
            this.c = eyhmVar.a();
        }
        return this.c;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\b\u0000\u0001\u0002\t\b\u0002\u0000\u0000\u00022\u0003င\u0000\u0004ဇ\u0001\u0005ဉ\u0002\u0006ဈ\u0003\u00072\bဇ\u0004\tင\u0005", new Object[]{"b", "c", cjem.a, "d", "e", "f", "g", "h", cjel.a, "i", "j"});
        }
        if (ordinal == 3) {
            return new cjen();
        }
        if (ordinal == 4) {
            return new cjek();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = k;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (cjen.class) {
            eyhzVar = k;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                k = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
