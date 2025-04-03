package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esjl extends eyfy implements eyht {
    public static final esjl a;
    private static volatile eyhz f;
    public Object c;
    public int e;
    public int b = 0;
    public String d = "";

    static {
        esjl esjlVar = new esjl();
        a = esjlVar;
        eyfy.registerDefaultInstance(esjl.class, esjlVar);
    }

    private esjl() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"c", "b", "d", "e", esjt.class, esio.class, esjd.class});
        }
        if (ordinal == 3) {
            return new esjl();
        }
        if (ordinal == 4) {
            return new esjk();
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
        synchronized (esjl.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
