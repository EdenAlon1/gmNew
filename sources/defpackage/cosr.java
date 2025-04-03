package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cosr extends eyfy implements eyht {
    public static final cosr a;
    private static volatile eyhz e;
    public int b;
    public String c = "";
    public String d = "";

    static {
        cosr cosrVar = new cosr();
        a = cosrVar;
        eyfy.registerDefaultInstance(cosr.class, cosrVar);
    }

    private cosr() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"b", "c", "d"});
        }
        if (ordinal == 3) {
            return new cosr();
        }
        if (ordinal == 4) {
            return new cosq();
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
        synchronized (cosr.class) {
            eyhzVar = e;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                e = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
