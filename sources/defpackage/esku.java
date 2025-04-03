package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esku extends eyfy implements eyht {
    public static final esku a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        esku eskuVar = new esku();
        a = eskuVar;
        eyfy.registerDefaultInstance(esku.class, eskuVar);
    }

    private esku() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0006\u0001\u0000\u000b\u0010\u0006\u0000\u0000\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000", new Object[]{"c", "b", eslh.class, eslk.class, eslh.class, eslk.class, eslc.class, esle.class});
        }
        if (ordinal == 3) {
            return new esku();
        }
        if (ordinal == 4) {
            return new esks();
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
        synchronized (esku.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
