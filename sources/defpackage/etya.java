package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etya extends eyfy implements eyht {
    public static final etya a;
    private static volatile eyhz d;
    public int b;
    public etyc c;

    static {
        etya etyaVar = new etya();
        a = etyaVar;
        eyfy.registerDefaultInstance(etya.class, etyaVar);
    }

    private etya() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new etya();
        }
        if (ordinal == 4) {
            return new etxz();
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
        synchronized (etya.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
