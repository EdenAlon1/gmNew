package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqgg extends eyfy implements eyht {
    public static final eqgg a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        eqgg eqggVar = new eqgg();
        a = eqggVar;
        eyfy.registerDefaultInstance(eqgg.class, eqggVar);
    }

    private eqgg() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"c", "b", eqfu.class, eqge.class, eqfw.class, eqfy.class, eqgc.class});
        }
        if (ordinal == 3) {
            return new eqgg();
        }
        if (ordinal == 4) {
            return new eqgf();
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
        synchronized (eqgg.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
