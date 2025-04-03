package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezuk extends eyfy implements eyht {
    public static final ezuk a;
    private static volatile eyhz f;
    public int b;
    public int c = 0;
    public Object d;
    public long e;

    static {
        ezuk ezukVar = new ezuk();
        a = ezukVar;
        eyfy.registerDefaultInstance(ezuk.class, ezukVar);
    }

    private ezuk() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0004\u0001\u0001\u0001\r\u0004\u0000\u0000\u0000\u0001ဃ\u0000\u0002;\u0000\n;\u0000\r;\u0000", new Object[]{"d", "c", "b", "e"});
        }
        if (ordinal == 3) {
            return new ezuk();
        }
        if (ordinal == 4) {
            return new ezuj();
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
        synchronized (ezuk.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
