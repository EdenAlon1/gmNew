package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcfv extends eyfy implements eyht {
    public static final fcfv a;
    private static volatile eyhz d;
    public eyee b = eyee.b;
    public int c;

    static {
        fcfv fcfvVar = new fcfv();
        a = fcfvVar;
        eyfy.registerDefaultInstance(fcfv.class, fcfvVar);
    }

    private fcfv() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\u0004", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new fcfv();
        }
        if (ordinal == 4) {
            return new fcfu();
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
        synchronized (fcfv.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
