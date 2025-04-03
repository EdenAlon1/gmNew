package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtev extends eyfy implements eyht {
    public static final dtev a;
    private static volatile eyhz d;
    public dtez b;
    public dtex c;
    private int e;

    static {
        dtev dtevVar = new dtev();
        a = dtevVar;
        eyfy.registerDefaultInstance(dtev.class, dtevVar);
    }

    private dtev() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"e", "b", "c"});
        }
        if (ordinal == 3) {
            return new dtev();
        }
        if (ordinal == 4) {
            return new dteu();
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
        synchronized (dtev.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
