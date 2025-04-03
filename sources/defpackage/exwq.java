package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exwq extends eyfy implements eyht {
    public static final exwq a;
    private static volatile eyhz c;
    public String b = "";
    private int d;

    static {
        exwq exwqVar = new exwq();
        a = exwqVar;
        eyfy.registerDefaultInstance(exwq.class, exwqVar);
    }

    private exwq() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "b"});
        }
        if (ordinal == 3) {
            return new exwq();
        }
        if (ordinal == 4) {
            return new exwp();
        }
        if (ordinal == 5) {
            return a;
        }
        if (ordinal != 6) {
            throw null;
        }
        eyhz eyhzVar2 = c;
        if (eyhzVar2 != null) {
            return eyhzVar2;
        }
        synchronized (exwq.class) {
            eyhzVar = c;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                c = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
