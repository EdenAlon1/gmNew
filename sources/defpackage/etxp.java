package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etxp extends eyfy implements eyht {
    public static final etxp a;
    private static volatile eyhz d;
    public int b;
    public etxr c;

    static {
        etxp etxpVar = new etxp();
        a = etxpVar;
        eyfy.registerDefaultInstance(etxp.class, etxpVar);
    }

    private etxp() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new etxp();
        }
        if (ordinal == 4) {
            return new etxo();
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
        synchronized (etxp.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
