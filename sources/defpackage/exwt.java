package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exwt extends eyfy implements eyht {
    public static final exwt a;
    private static volatile eyhz f;
    public int b;
    public String c = "";
    public int d;
    public int e;

    static {
        exwt exwtVar = new exwt();
        a = exwtVar;
        eyfy.registerDefaultInstance(exwt.class, exwtVar);
    }

    private exwt() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (ordinal == 3) {
            return new exwt();
        }
        if (ordinal == 4) {
            return new exws();
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
        synchronized (exwt.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
