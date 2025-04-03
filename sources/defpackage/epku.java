package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epku extends eyfy implements eyht {
    public static final epku a;
    private static volatile eyhz g;
    public int b;
    public erav c;
    public int d;
    public int e;
    public int f;

    static {
        epku epkuVar = new epku();
        a = epkuVar;
        eyfy.registerDefaultInstance(epku.class, epkuVar);
    }

    private epku() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            eygg eyggVar = eohf.a;
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", eohi.a, "e", eyggVar, "f", eyggVar});
        }
        if (ordinal == 3) {
            return new epku();
        }
        if (ordinal == 4) {
            return new epkt();
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
        synchronized (epku.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
