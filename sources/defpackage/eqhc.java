package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqhc extends eyfy implements eyht {
    public static final eqhc a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        eqhc eqhcVar = new eqhc();
        a = eqhcVar;
        eyfy.registerDefaultInstance(eqhc.class, eqhcVar);
    }

    private eqhc() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000", new Object[]{"c", "b", eqje.class, eqio.class, eqjr.class, eqhq.class, eqha.class, eqjt.class, eqix.class, eqjb.class, eqic.class});
        }
        if (ordinal == 3) {
            return new eqhc();
        }
        if (ordinal == 4) {
            return new eqhb();
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
        synchronized (eqhc.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
