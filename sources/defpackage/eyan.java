package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyan extends eyfy implements eyht {
    public static final eyan a;
    private static volatile eyhz g;
    public int b;
    public fauw c;
    public int d;
    public exzp e;
    public exzp f;

    static {
        eyan eyanVar = new eyan();
        a = eyanVar;
        eyfy.registerDefaultInstance(eyan.class, eyanVar);
    }

    private eyan() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"b", "c", "d", exzm.a, "e", "f"});
        }
        if (ordinal == 3) {
            return new eyan();
        }
        if (ordinal == 4) {
            return new eyam();
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
        synchronized (eyan.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
