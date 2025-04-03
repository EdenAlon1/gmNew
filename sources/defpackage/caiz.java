package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caiz extends eyfy implements eyht {
    public static final caiz a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public eyee d = eyee.b;
    public cajl e;

    static {
        caiz caizVar = new caiz();
        a = caizVar;
        eyfy.registerDefaultInstance(caiz.class, caizVar);
    }

    private caiz() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002ည\u0000\u0003ဉ\u0001", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new caiz();
        }
        if (ordinal == 4) {
            return new caiy();
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
        synchronized (caiz.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
