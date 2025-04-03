package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcee extends eyfy implements eyht {
    public static final eygj a = new fcec();
    public static final fcee b;
    private static volatile eyhz d;
    public eygi c = emptyIntList();

    static {
        fcee fceeVar = new fcee();
        b = fceeVar;
        eyfy.registerDefaultInstance(fcee.class, fceeVar);
    }

    private fcee() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"c"});
        }
        if (ordinal == 3) {
            return new fcee();
        }
        if (ordinal == 4) {
            return new fced();
        }
        if (ordinal == 5) {
            return b;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fcee.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(b);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
