package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcbm extends eyfy implements eyht {
    public static final fcbm a;
    private static volatile eyhz d;
    public int b;
    public String c = "";

    static {
        fcbm fcbmVar = new fcbm();
        a = fcbmVar;
        eyfy.registerDefaultInstance(fcbm.class, fcbmVar);
    }

    private fcbm() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"b", "c"});
        }
        if (ordinal == 3) {
            return new fcbm();
        }
        if (ordinal == 4) {
            return new fcbl();
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
        synchronized (fcbm.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
