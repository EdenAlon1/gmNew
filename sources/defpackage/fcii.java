package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcii extends eyfy implements eyht {
    public static final fcii a;
    private static volatile eyhz d;
    public int b;
    public fceo c;

    static {
        fcii fciiVar = new fcii();
        a = fciiVar;
        eyfy.registerDefaultInstance(fcii.class, fciiVar);
    }

    private fcii() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0001", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new fcii();
        }
        if (ordinal == 4) {
            return new fcih();
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
        synchronized (fcii.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
