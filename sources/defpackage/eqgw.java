package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqgw extends eyfy implements eyht {
    public static final eqgw a;
    private static volatile eyhz d;
    public int b;
    public long c;

    static {
        eqgw eqgwVar = new eqgw();
        a = eqgwVar;
        eyfy.registerDefaultInstance(eqgw.class, eqgwVar);
    }

    private eqgw() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new eqgw();
        }
        if (ordinal == 4) {
            return new eqgv();
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
        synchronized (eqgw.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
