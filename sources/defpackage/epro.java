package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epro extends eyfy implements eyht {
    public static final epro a;
    private static volatile eyhz d;
    public int b;
    public int c;

    static {
        epro eproVar = new epro();
        a = eproVar;
        eyfy.registerDefaultInstance(epro.class, eproVar);
    }

    private epro() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", eprn.a});
        }
        if (ordinal == 3) {
            return new epro();
        }
        if (ordinal == 4) {
            return new eprm();
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
        synchronized (epro.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
