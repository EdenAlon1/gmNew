package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqxo extends eyfy implements eyht {
    public static final eqxo a;
    private static volatile eyhz g;
    public int b;
    public int c;
    public long d;
    public eqpc e;
    public int f;

    static {
        eqxo eqxoVar = new eqxo();
        a = eqxoVar;
        eyfy.registerDefaultInstance(eqxo.class, eqxoVar);
    }

    private eqxo() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0004᠌\u0003", new Object[]{"b", "c", eqwr.a, "d", "e", "f", eqxs.a});
        }
        if (ordinal == 3) {
            return new eqxo();
        }
        if (ordinal == 4) {
            return new eqxn();
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
        synchronized (eqxo.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
