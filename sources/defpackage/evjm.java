package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evjm extends eyfy implements eyht {
    public static final evjm a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        evjm evjmVar = new evjm();
        a = evjmVar;
        eyfy.registerDefaultInstance(evjm.class, evjmVar);
    }

    private evjm() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u00015\u0000\u00023\u0000\u0003<\u0000", new Object[]{"c", "b", evjg.class});
        }
        if (ordinal == 3) {
            return new evjm();
        }
        if (ordinal == 4) {
            return new evjl();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (evjm.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
