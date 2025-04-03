package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcdk extends eyfy implements eyht {
    public static final fcdk a;
    private static volatile eyhz e;
    public int b;
    public fcfo c;
    public int d;

    static {
        fcdk fcdkVar = new fcdk();
        a = fcdkVar;
        eyfy.registerDefaultInstance(fcdk.class, fcdkVar);
    }

    private fcdk() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0004\f", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new fcdk();
        }
        if (ordinal == 4) {
            return new fcdj();
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
        synchronized (fcdk.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
