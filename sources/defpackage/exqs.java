package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exqs extends eyfy implements eyht {
    public static final exqs a;
    private static volatile eyhz f;
    public int b;
    public String c = "";
    public String d = "";
    public int e;

    static {
        exqs exqsVar = new exqs();
        a = exqsVar;
        eyfy.registerDefaultInstance(exqs.class, exqsVar);
    }

    private exqs() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002", new Object[]{"b", "c", "d", "e", exqq.a});
        }
        if (ordinal == 3) {
            return new exqs();
        }
        if (ordinal == 4) {
            return new exqp();
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
        synchronized (exqs.class) {
            eyhzVar = f;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                f = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
