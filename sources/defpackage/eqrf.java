package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqrf extends eyfy implements eyht {
    public static final eqrf a;
    private static volatile eyhz f;
    public int b;
    public int c = 0;
    public Object d;
    public boolean e;

    static {
        eqrf eqrfVar = new eqrf();
        a = eqrfVar;
        eyfy.registerDefaultInstance(eqrf.class, eqrfVar);
    }

    private eqrf() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"d", "c", "b", "e", eqre.class, eqrc.class});
        }
        if (ordinal == 3) {
            return new eqrf();
        }
        if (ordinal == 4) {
            return new eqqz();
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
        synchronized (eqrf.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
