package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqyg extends eyfy implements eyht {
    public static final eqyg a;
    private static volatile eyhz g;
    public int b;
    public int c;
    public String d = "";
    public int e;
    public int f;

    static {
        eqyg eqygVar = new eqyg();
        a = eqygVar;
        eyfy.registerDefaultInstance(eqyg.class, eqygVar);
    }

    private eqyg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003င\u0002\u0004᠌\u0004", new Object[]{"b", "c", "d", "e", "f", eqyf.a});
        }
        if (ordinal == 3) {
            return new eqyg();
        }
        if (ordinal == 4) {
            return new eqye();
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
        synchronized (eqyg.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
