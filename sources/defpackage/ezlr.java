package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezlr extends eyfy implements eyht {
    public static final ezlr a;
    private static volatile eyhz c;
    public int b;

    static {
        ezlr ezlrVar = new ezlr();
        a = ezlrVar;
        eyfy.registerDefaultInstance(ezlr.class, ezlrVar);
    }

    private ezlr() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"b"});
        }
        if (ordinal == 3) {
            return new ezlr();
        }
        if (ordinal == 4) {
            return new ezlq();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = c;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (ezlr.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
