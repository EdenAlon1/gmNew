package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcbp extends eyfy implements eyht {
    public static final fcbp a;
    private static volatile eyhz g;
    public int b;
    public fcfq c;
    public fcdu d;
    public fcfi e;
    public fcek f;

    static {
        fcbp fcbpVar = new fcbp();
        a = fcbpVar;
        eyfy.registerDefaultInstance(fcbp.class, fcbpVar);
    }

    private fcbp() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (ordinal == 3) {
            return new fcbp();
        }
        if (ordinal == 4) {
            return new fcbo();
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
        synchronized (fcbp.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
