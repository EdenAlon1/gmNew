package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqai extends eyfy implements eyht {
    public static final eqai a;
    private static volatile eyhz g;
    public int b;
    public eqad c;
    public epzq d;
    public int e;
    public int f;

    static {
        eqai eqaiVar = new eqai();
        a = eqaiVar;
        eyfy.registerDefaultInstance(eqai.class, eqaiVar);
    }

    private eqai() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002\u0004င\u0003", new Object[]{"b", "c", "d", "e", eqag.a, "f"});
        }
        if (ordinal == 3) {
            return new eqai();
        }
        if (ordinal == 4) {
            return new eqah();
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
        synchronized (eqai.class) {
            eyhzVar = g;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                g = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
