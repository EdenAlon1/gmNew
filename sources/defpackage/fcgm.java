package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcgm extends eyfy implements eyht {
    public static final fcgm a;
    private static volatile eyhz d;
    public fcho b;
    public long c;
    private int e;

    static {
        fcgm fcgmVar = new fcgm();
        a = fcgmVar;
        eyfy.registerDefaultInstance(fcgm.class, fcgmVar);
    }

    private fcgm() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0001\u0003\u0002", new Object[]{"e", "b", "c"});
        }
        if (ordinal == 3) {
            return new fcgm();
        }
        if (ordinal == 4) {
            return new fcgl();
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
        synchronized (fcgm.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
