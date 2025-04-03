package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqkz extends eyfy implements eyht {
    public static final eqkz a;
    private static volatile eyhz f;
    public int b;
    public long c;
    public boolean d;
    public boolean e;

    static {
        eqkz eqkzVar = new eqkz();
        a = eqkzVar;
        eyfy.registerDefaultInstance(eqkz.class, eqkzVar);
    }

    private eqkz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new eqkz();
        }
        if (ordinal == 4) {
            return new eqky();
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
        synchronized (eqkz.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
