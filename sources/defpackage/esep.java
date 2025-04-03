package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esep extends eyfy implements eyht {
    public static final esep a;
    private static volatile eyhz f;
    public boolean b;
    public long c;
    public boolean d;
    public boolean e;

    static {
        esep esepVar = new esep();
        a = esepVar;
        eyfy.registerDefaultInstance(esep.class, esepVar);
    }

    private esep() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0002\u0003\u0007\u0004\u0007", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new esep();
        }
        if (ordinal == 4) {
            return new eseo();
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
        synchronized (esep.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
