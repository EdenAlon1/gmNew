package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exti extends eyfy implements eyht {
    public static final exti a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        exti extiVar = new exti();
        a = extiVar;
        eyfy.registerDefaultInstance(exti.class, extiVar);
    }

    private exti() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0001\u0000\u0003\u0004\u0002\u0000\u0000\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"c", "b", extd.class, exth.class});
        }
        if (ordinal == 3) {
            return new exti();
        }
        if (ordinal == 4) {
            return new extb();
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
        synchronized (exti.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
