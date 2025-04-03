package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqiu extends eyfy implements eyht {
    public static final eqiu a;
    private static volatile eyhz b;

    static {
        eqiu eqiuVar = new eqiu();
        a = eqiuVar;
        eyfy.registerDefaultInstance(eqiu.class, eqiuVar);
    }

    private eqiu() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0000", null);
        }
        if (ordinal == 3) {
            return new eqiu();
        }
        if (ordinal == 4) {
            return new eqit();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = b;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eqiu.class) {
            eyhzVar = b;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                b = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
