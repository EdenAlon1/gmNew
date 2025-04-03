package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eswy extends eyfy implements eyht {
    public static final eswy a;
    private static volatile eyhz e;
    public int b;
    public etau c;
    public eszz d;

    static {
        eswy eswyVar = new eswy();
        a = eswyVar;
        eyfy.registerDefaultInstance(eswy.class, eswyVar);
    }

    private eswy() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001ϧ\u0002\u0000\u0000\u0000\u0001ဉ\u0001ϧဉ\u0000", new Object[]{"b", "d", "c"});
        }
        if (ordinal == 3) {
            return new eswy();
        }
        if (ordinal == 4) {
            return new eswx();
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
        synchronized (eswy.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
