package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyyf extends eyfy implements eyht {
    public static final eyyf a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        eyyf eyyfVar = new eyyf();
        a = eyyfVar;
        eyfy.registerDefaultInstance(eyyf.class, eyyfVar);
    }

    private eyyf() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"c", "b", eyxz.class, eyxs.class, eyxq.class, eyyd.class});
        }
        if (ordinal == 3) {
            return new eyyf();
        }
        if (ordinal == 4) {
            return new eyye();
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
        synchronized (eyyf.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
