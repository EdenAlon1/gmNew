package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqio extends eyfy implements eyht {
    public static final eqio a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        eqio eqioVar = new eqio();
        a = eqioVar;
        eyfy.registerDefaultInstance(eqio.class, eqioVar);
    }

    private eqio() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"c", "b", eqif.class, eqij.class, eqin.class, eqih.class});
        }
        if (ordinal == 3) {
            return new eqio();
        }
        if (ordinal == 4) {
            return new eqid();
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
        synchronized (eqio.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
