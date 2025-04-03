package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class desr extends eyfy implements eyht {
    public static final desr a;
    private static volatile eyhz c;
    public int b;
    private int d;

    static {
        desr desrVar = new desr();
        a = desrVar;
        eyfy.registerDefaultInstance(desr.class, desrVar);
    }

    private desr() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"d", "b", desp.a});
        }
        if (ordinal == 3) {
            return new desr();
        }
        if (ordinal == 4) {
            return new deso();
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
        synchronized (desr.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
