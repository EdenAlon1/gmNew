package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoms extends eyfy implements eyht {
    public static final eoms a;
    private static volatile eyhz g;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    static {
        eoms eomsVar = new eoms();
        a = eomsVar;
        eyfy.registerDefaultInstance(eoms.class, eomsVar);
    }

    private eoms() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0004᠌\u0003\u0005᠌\u0004", new Object[]{"b", "c", eomo.a, "d", "e", eomq.a, "f", eomr.a});
        }
        if (ordinal == 3) {
            return new eoms();
        }
        if (ordinal == 4) {
            return new eomp();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = g;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eoms.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
