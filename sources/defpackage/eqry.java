package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqry extends eyfy implements eyht {
    public static final eqry a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        eqry eqryVar = new eqry();
        a = eqryVar;
        eyfy.registerDefaultInstance(eqry.class, eqryVar);
    }

    private eqry() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"c", "b", eqru.class});
        }
        if (ordinal == 3) {
            return new eqry();
        }
        if (ordinal == 4) {
            return new eqrx();
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
        synchronized (eqry.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
