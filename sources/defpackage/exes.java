package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exes extends eyfy implements eyht {
    public static final exes a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        exes exesVar = new exes();
        a = exesVar;
        eyfy.registerDefaultInstance(exes.class, exesVar);
    }

    private exes() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"c", "b", exey.class});
        }
        if (ordinal == 3) {
            return new exes();
        }
        if (ordinal == 4) {
            return new exer();
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
        synchronized (exes.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
