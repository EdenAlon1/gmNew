package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evwy extends eyfy implements eyht {
    public static final evwy a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        evwy evwyVar = new evwy();
        a = evwyVar;
        eyfy.registerDefaultInstance(evwy.class, evwyVar);
    }

    private evwy() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"c", "b", evzf.class, evwf.class, evya.class});
        }
        if (ordinal == 3) {
            return new evwy();
        }
        if (ordinal == 4) {
            return new evwx();
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
        synchronized (evwy.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
