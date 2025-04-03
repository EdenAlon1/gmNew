package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqoe extends eyfy implements eyht {
    public static final eqoe a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        eqoe eqoeVar = new eqoe();
        a = eqoeVar;
        eyfy.registerDefaultInstance(eqoe.class, eqoeVar);
    }

    private eqoe() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            eygg eyggVar = eppm.a;
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"b", "c", eyggVar, "d", eyggVar, "e", eyggVar});
        }
        if (ordinal == 3) {
            return new eqoe();
        }
        if (ordinal == 4) {
            return new eqod();
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
        synchronized (eqoe.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
