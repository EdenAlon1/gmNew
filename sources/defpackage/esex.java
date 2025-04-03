package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esex extends eyfy implements eyht {
    public static final esex a;
    private static volatile eyhz e;
    public int b;
    public int c;
    public int d;

    static {
        esex esexVar = new esex();
        a = esexVar;
        eyfy.registerDefaultInstance(esex.class, esexVar);
    }

    private esex() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0000\u0001\u0006\u0003\u0000\u0000\u0000\u0001\f\u0005\f\u0006\f", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new esex();
        }
        if (ordinal == 4) {
            return new esew();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (esex.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
