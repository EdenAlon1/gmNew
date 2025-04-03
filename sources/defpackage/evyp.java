package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evyp extends eyfy implements eyht {
    public static final evyp a;
    private static volatile eyhz d;
    public int b;
    public int c;

    static {
        evyp evypVar = new evyp();
        a = evypVar;
        eyfy.registerDefaultInstance(evyp.class, evypVar);
    }

    private evyp() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", evsx.a});
        }
        if (ordinal == 3) {
            return new evyp();
        }
        if (ordinal == 4) {
            return new evyo();
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
        synchronized (evyp.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
