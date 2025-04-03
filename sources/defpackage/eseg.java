package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eseg extends eyfy implements eyht {
    public static final eygj a = new esed();
    public static final eseg b;
    private static volatile eyhz d;
    public eygi c = emptyIntList();

    static {
        eseg esegVar = new eseg();
        b = esegVar;
        eyfy.registerDefaultInstance(eseg.class, esegVar);
    }

    private eseg() {
        emptyIntList();
        eyee eyeeVar = eyee.b;
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(b, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"c"});
        }
        if (ordinal == 3) {
            return new eseg();
        }
        if (ordinal == 4) {
            return new esef();
        }
        if (ordinal == 5) {
            return b;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = d;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (eseg.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(b);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
