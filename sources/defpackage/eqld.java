package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqld extends eyfy implements eyht {
    public static final eqld a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public int d;
    public long e;

    static {
        eqld eqldVar = new eqld();
        a = eqldVar;
        eyfy.registerDefaultInstance(eqld.class, eqldVar);
    }

    private eqld() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဂ\u0002", new Object[]{"b", "c", eqlb.a, "d", eqlc.a, "e"});
        }
        if (ordinal == 3) {
            return new eqld();
        }
        if (ordinal == 4) {
            return new eqla();
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
        synchronized (eqld.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
