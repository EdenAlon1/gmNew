package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezcd extends eyfy implements eyht {
    public static final ezcd a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        ezcd ezcdVar = new ezcd();
        a = ezcdVar;
        eyfy.registerDefaultInstance(ezcd.class, ezcdVar);
    }

    private ezcd() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"c", "b", ezad.class, ezcb.class, eyzl.class});
        }
        if (ordinal == 3) {
            return new ezcd();
        }
        if (ordinal == 4) {
            return new ezcc();
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
        synchronized (ezcd.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
