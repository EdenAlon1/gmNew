package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqde extends eyfy implements eyht {
    public static final eqde a;
    private static volatile eyhz d;
    public int b;
    public int c;

    static {
        eqde eqdeVar = new eqde();
        a = eqdeVar;
        eyfy.registerDefaultInstance(eqde.class, eqdeVar);
    }

    private eqde() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", eqdd.a});
        }
        if (ordinal == 3) {
            return new eqde();
        }
        if (ordinal == 4) {
            return new eqdc();
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
        synchronized (eqde.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
