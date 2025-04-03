package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcds extends eyfy implements eyht {
    public static final fcds a;
    private static volatile eyhz f;
    public int b;
    public fcfq c;
    public fcdu d;
    public eyee e = eyee.b;

    static {
        fcds fcdsVar = new fcds();
        a = fcdsVar;
        eyfy.registerDefaultInstance(fcds.class, fcdsVar);
    }

    private fcds() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0003\b\u0003\u0000\u0000\u0000\u0003ဉ\u0000\u0004ဉ\u0001\b\n", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new fcds();
        }
        if (ordinal == 4) {
            return new fcdr();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fcds.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
