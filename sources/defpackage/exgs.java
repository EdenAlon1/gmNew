package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exgs extends eyfy implements eyht {
    public static final exgs a;
    private static volatile eyhz f;
    public int b;
    public int c;
    public String d = "";
    public int e;

    static {
        exgs exgsVar = new exgs();
        a = exgsVar;
        eyfy.registerDefaultInstance(exgs.class, exgsVar);
    }

    private exgs() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002᠌\u0000\u0003ဈ\u0001\u0004᠌\u0002", new Object[]{"b", "c", fapo.a, "d", "e", fapq.a});
        }
        if (ordinal == 3) {
            return new exgs();
        }
        if (ordinal == 4) {
            return new exgr();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = f;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (exgs.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
