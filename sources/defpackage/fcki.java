package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcki extends eyfy implements eyht {
    public static final fcki a;
    private static volatile eyhz e;
    public String b = "";
    public eyja c;
    public long d;
    private int f;

    static {
        fcki fckiVar = new fcki();
        a = fckiVar;
        eyfy.registerDefaultInstance(fcki.class, fckiVar);
    }

    private fcki() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u0002", new Object[]{"f", "b", "c", "d"});
        }
        if (ordinal == 3) {
            return new fcki();
        }
        if (ordinal == 4) {
            return new fckh();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = e;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (fcki.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
