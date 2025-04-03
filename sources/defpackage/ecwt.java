package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecwt extends eyfy implements eyht {
    public static final ecwt a;
    private static volatile eyhz e;
    public int b;
    public int c;
    public int d;

    static {
        ecwt ecwtVar = new ecwt();
        a = ecwtVar;
        eyfy.registerDefaultInstance(ecwt.class, ecwtVar);
    }

    private ecwt() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new ecwt();
        }
        if (ordinal == 4) {
            return new ecwq();
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
        synchronized (ecwt.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
