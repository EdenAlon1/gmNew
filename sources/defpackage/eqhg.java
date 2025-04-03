package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqhg extends eyfy implements eyht {
    public static final eqhg a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    static {
        eqhg eqhgVar = new eqhg();
        a = eqhgVar;
        eyfy.registerDefaultInstance(eqhg.class, eqhgVar);
    }

    private eqhg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"b", "c", eqhe.a, "d", "e"});
        }
        if (ordinal == 3) {
            return new eqhg();
        }
        if (ordinal == 4) {
            return new eqhf();
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
        synchronized (eqhg.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
