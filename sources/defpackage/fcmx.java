package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcmx extends eyfy implements eyht {
    public static final fcmx a;
    private static volatile eyhz d;
    public int b = 0;
    public Object c;

    static {
        fcmx fcmxVar = new fcmx();
        a = fcmxVar;
        eyfy.registerDefaultInstance(fcmx.class, fcmxVar);
    }

    private fcmx() {
    }

    @Override // defpackage.eyfy
    protected final Object dynamicMethod(eyfx eyfxVar, Object obj, Object obj2) {
        eyhz eyhzVar;
        int ordinal = eyfxVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return newMessageInfo(a, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000", new Object[]{"c", "b", fcnf.class, fcnf.class, fcmu.class, fcnb.class, fcnd.class, fcnh.class, fcms.class, fcmz.class, fcmq.class});
        }
        if (ordinal == 3) {
            return new fcmx();
        }
        if (ordinal == 4) {
            return new fcmw();
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
        synchronized (fcmx.class) {
            eyhzVar = d;
            if (eyhzVar == null) {
                eyhzVar = new eyfr(a);
                d = eyhzVar;
            }
        }
        return eyhzVar;
    }
}
