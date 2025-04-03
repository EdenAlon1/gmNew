package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eojj extends eyfy implements eyht {
    public static final eojj a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        eojj eojjVar = new eojj();
        a = eojjVar;
        eyfy.registerDefaultInstance(eojj.class, eojjVar);
    }

    private eojj() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u000e\u0001\u0000\u0001\u000e\u000e\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000", new Object[]{"c", "b", eptp.class, eppp.class, epsn.class, epsy.class, eqap.class, eqam.class, eqar.class, epte.class, epta.class, eqlq.class, eqlt.class, eqlj.class, eqat.class, epth.class});
        }
        if (ordinal == 3) {
            return new eojj();
        }
        if (ordinal == 4) {
            return new eoji();
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
        synchronized (eojj.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
