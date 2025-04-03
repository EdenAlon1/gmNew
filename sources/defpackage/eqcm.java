package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqcm extends eyfy implements eyht {
    public static final eqcm a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        eqcm eqcmVar = new eqcm();
        a = eqcmVar;
        eyfy.registerDefaultInstance(eqcm.class, eqcmVar);
    }

    private eqcm() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"c", "b", eqck.class, eqcs.class, eqcv.class});
        }
        if (ordinal == 3) {
            return new eqcm();
        }
        if (ordinal == 4) {
            return new eqcl();
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
        synchronized (eqcm.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
