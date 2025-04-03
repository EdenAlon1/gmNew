package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etvw extends eyfy implements eyht {
    public static final etvw a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public etwg d;
    public etyu e;

    static {
        etvw etvwVar = new etvw();
        a = etvwVar;
        eyfy.registerDefaultInstance(etvw.class, etvwVar);
    }

    private etvw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new etvw();
        }
        if (ordinal == 4) {
            return new etvv();
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
        synchronized (etvw.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
